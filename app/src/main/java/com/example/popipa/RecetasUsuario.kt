package com.example.popipa

import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.RecetasUsuarioAdapter
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityRecetasUsuarioBinding
import com.example.popipa.listas.ListasDeCategorias.ListaAlmuerzos

class RecetasUsuario : AppCompatActivity() {
    private var recetasUsuario = mutableListOf<TipoDePlato>()
    private val context = this
    private lateinit var binding: ActivityRecetasUsuarioBinding
    private val recetaMenuAdapter by lazy { RecetasUsuarioAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recetasUsuario = ListaAlmuerzos.listaAlmuerzos.toMutableList()
        iniciarRecetasUsuarioRecyclerView()

        recetaMenuAdapter.onDeleteClick = { position ->
            recetasUsuario.removeAt(position)
            iniciarRecetasUsuarioRecyclerView()
        }
    }

    fun onVolverButtonClicked2(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
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