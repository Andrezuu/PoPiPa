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
import com.example.popipa.MainMenuActivity.Companion.CLAVE_RECETA
import com.example.popipa.MainMenuActivity.Companion.CLAVE_TITULO_CATEGORIA
import com.example.popipa.adapter.IngredienteAdapter
import com.example.popipa.adapter.PasoAdapter
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityRecetasCategoriaBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class RecetasCategoriaActivity : AppCompatActivity() {
    private val context: Context = this
    private lateinit var sharedPreferences: SharedPreferences
    private val listatMeGusta = mutableListOf<TipoDePlato>()
    private val ingredienteAdapter by lazy { IngredienteAdapter() }
    private val pasoAdapter by lazy { PasoAdapter() }
    private lateinit var binding: ActivityRecetasCategoriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasCategoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        val recetaActual = intent.getSerializableExtra(CLAVE_RECETA) as TipoDePlato
        val nombreCategoria = intent.getSerializableExtra(CLAVE_TITULO_CATEGORIA) as String

        binding.nombreCategoria.text = nombreCategoria
        binding.nombreReceta.text = recetaActual.titulo

        val actMegusta = getMeGustaPlatos()
        listatMeGusta.addAll(actMegusta)

        iniciarIngredientesRecyclerView(recetaActual.listIngrediente)
        iniciarPasosRecyclerView(recetaActual.listPasos)

        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }

        binding.botonLike.setOnClickListener {
            if (recetaActual.meGusta) {
                recetaActual.meGusta = false
                deleteElemento(recetaActual.titulo)
                Toast.makeText(context, "Borrada de me gusta", Toast.LENGTH_SHORT).show()

            } else {
                recetaActual.meGusta = true
                listatMeGusta.add(recetaActual)
                manageGson()
                Toast.makeText(context, "Agregada a me gusta", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun iniciarIngredientesRecyclerView(newIngredientes: List<Ingrediente>) {
        val ingredientes = mutableListOf<Ingrediente>()
        for (ingrediente in newIngredientes) {
            val nombreIngrediente = ingrediente.nombre
            val cantidadIngrediente = ingrediente.cantidad

            val newIngrediente = Ingrediente(nombreIngrediente, cantidadIngrediente)
            ingredientes.add(newIngrediente)
        }

        ingredienteAdapter.addIngredientes(ingredientes)

        binding.recyclerIngredientes.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
                ) {
                    outRect.right = 50
                }
            })

            adapter = ingredienteAdapter
        }
    }

    fun iniciarPasosRecyclerView(newPasos: List<PasoDePreparacion>) {
        val pasos = mutableListOf<PasoDePreparacion>()

        for (paso in newPasos) {
            val numeroPaso = paso.numero
            val descripcionPaso = paso.descripcion
            val imagenPaso = paso.viewpaso

            val newPaso = PasoDePreparacion(numeroPaso, descripcionPaso, imagenPaso)

            pasos.add(newPaso)
        }

        pasoAdapter.addPasos(pasos)
        binding.recyclerPasos.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
                ) {
                    outRect.bottom = 50
                }
            })

            adapter = pasoAdapter
        }
    }


    private fun manageGson() {
        val gson = Gson()
        val platosJson = gson.toJson(listatMeGusta)
        val editor = sharedPreferences.edit()
        editor.putString(MainMenuActivity.JSON_RECETAS_ME_GUSTA, platosJson)
        editor.apply()
    }

    private fun getMeGustaPlatos(): MutableList<TipoDePlato> {
        val platosJson = sharedPreferences.getString(MainMenuActivity.JSON_RECETAS_ME_GUSTA, "")

        if (platosJson != "") {
            val gson = Gson()
            return gson.fromJson(platosJson, object : TypeToken<List<TipoDePlato>>() {}.type)
        } else {
            return mutableListOf<TipoDePlato>()
        }
    }

    private fun deleteElemento(nombreReceta: String) {
        val toRemove = listatMeGusta.indexOfFirst {
            nombreReceta == it.titulo
        }
        listatMeGusta.removeAt(toRemove)
        manageGson()
    }


}