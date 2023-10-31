package com.example.popipa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.MainMenuActivity.Companion.JSON_RECETAS_USUARIO
import com.example.popipa.adapter.RecetasUsuarioAdapter
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityRecetasUsuarioBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecetasUsuario : AppCompatActivity() {
    private var recetasUsuario = mutableListOf<TipoDePlato>()
    private val context = this
    private val gson = Gson()
    private lateinit var binding: ActivityRecetasUsuarioBinding
    private lateinit var sharedPreferences: SharedPreferences
    private val recetaMenuAdapter by lazy { RecetasUsuarioAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)

        val jsonList = sharedPreferences.getString(JSON_RECETAS_USUARIO, "")
        val listType = object : TypeToken<List<TipoDePlato>>() {}.type

        if (jsonList != "") {
            val newList = gson.fromJson<List<TipoDePlato>>(jsonList, listType)
            recetasUsuario.addAll(newList)
        }


        if (recetasUsuario.isEmpty()) {
            Toast.makeText(context, "Agrega una receta!", Toast.LENGTH_SHORT).show()
        } else {
            iniciarRecetasUsuarioRecyclerView()
        }

        recetaMenuAdapter.onRecetaClick = { recetaPressed ->
            val intent = Intent(context, RecetasCategoriaActivity::class.java)
            intent.putExtra(MainMenuActivity.CLAVE_RECETA, recetaPressed)
            intent.putExtra(MainMenuActivity.CLAVE_TITULO_CATEGORIA, "Mis Recetas")
            startActivity(intent)
        }

        recetaMenuAdapter.onDeleteClick = { position ->
            recetasUsuario.removeAt(position)
            manageJson()
            iniciarRecetasUsuarioRecyclerView()
        }
    }

    //Funciones para cambiar de pantalla
    fun onVolverButtonClicked2(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }

    fun onCrearRecetaButtonClicked3(view: View) {
        val intent = Intent(context, AgregacionRecetas::class.java)
        intent.putExtra(AgregacionRecetas.CLAVE_PANTALLA_ANTERIOR, 2)
        startActivity(intent)
    }

    fun manageJson() {
        val gson = Gson()
        val newJsonList = gson.toJson(recetasUsuario)

        val editor = sharedPreferences.edit()
        editor.putString(JSON_RECETAS_USUARIO, newJsonList)
        editor.apply()

    }

    fun iniciarRecetasUsuarioRecyclerView() {


        val changeRecetas = mutableListOf<TipoDePlato>()
        for (receta in recetasUsuario) {
            val tituloReceta = receta.titulo
            val descripcion = receta.descripcion
            val imagenCategoria = receta.imagen
            val tiempo = receta.tiempoDePreparacion
            val dificultad = receta.dificultad
            val meGusta = receta.meGusta
            val listaIngredientes = receta.listIngrediente
            val listaPasos = receta.listPasos
            val recetaMenu =
                TipoDePlato(
                    tituloReceta,
                    descripcion,
                    imagenCategoria,
                    tiempo,
                    dificultad,
                    meGusta,
                    listaIngredientes,
                    listaPasos
                )
            changeRecetas.add(recetaMenu)
        }


        recetaMenuAdapter.addRecetaUsuarioMenu(changeRecetas)
        binding.recyclerTusRecetas.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.bottom = 50
                }
            })

            adapter = recetaMenuAdapter

        }
    }
}