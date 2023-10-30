package com.example.popipa

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.TipoDePlatoAdapter
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityTuMeGustaBinding
import com.example.popipa.listas.ListaDeRecomendacion

class ActivityTuMeGusta : AppCompatActivity() {

    private val context: Context = this
    private val tipoDePlatoAdapter by lazy { TipoDePlatoAdapter() }
    private lateinit var binding: ActivityTuMeGustaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTuMeGustaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonVolver.setOnClickListener {
            onVolverButtonClicked(binding.botonVolver)
        }

        iniciarRecetaRecyclerView()
    }


    fun onVolverButtonClicked(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }

    private fun iniciarRecetaRecyclerView() {
        val recetas = ListaDeRecomendacion.listaTiposDeDesayuno
        val recetaMenus = mutableListOf<TipoDePlato>()
        for (receta in recetas) {
            val meGusta = receta.meGusta
            if (meGusta) {
                val tituloReceta = receta.titulo
                val descripcion = receta.descripcion
                val imagenCategoria = receta.imagen
                val tiempo = receta.tiempoDePreparacion
                val dificultad = receta.dificultad
                val listaIngredientes = receta.listIngrediente
                val listaPasos = receta.listPasos
                val recetaMenu = TipoDePlato(
                    tituloReceta,
                    descripcion,
                    imagenCategoria,
                    tiempo,
                    dificultad,
                    meGusta,
                    listaIngredientes,
                    listaPasos
                )
                recetaMenus.add(recetaMenu)
            }
        }

        tipoDePlatoAdapter.addRecetaMenus(recetaMenus)
        binding.recyclerReceta.apply {
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

            adapter = tipoDePlatoAdapter
        }
    }
}
