package com.example.popipa

import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.RecetaMenuAdapter
import com.example.popipa.adapter.RecetasUsuarioAdapter
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.databinding.ActivityRecetasUsuarioBinding
import com.example.popipa.listas.ListaDeRecomendacion

class RecetasUsuario : AppCompatActivity() {

    private lateinit var binding:ActivityRecetasUsuarioBinding
    private val recetaMenuAdapter by lazy { RecetasUsuarioAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarRecetasUsuarioRecyclerView()
    }
    fun onVolverButtonClicked2(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun iniciarRecetasUsuarioRecyclerView(){
        val recetaMenus = mutableListOf<RecetaMenu>()

        val recetas = ListaDeRecomendacion.listaTiposDeDesayuno

        for (receta in recetas) {
            val tituloReceta = receta.titulo
            val descripcion = receta.descripcion
            val tiempo = receta.tiempoDePreparacion
            val dificultad = receta.dificultad
            val imagenCategoria = receta.imagen

            val recetaMenu =
                RecetaMenu(tituloReceta, descripcion, tiempo, dificultad, imagenCategoria)
            recetaMenus.add(recetaMenu)
        }


        recetaMenuAdapter.addRecetaUsuarioMenu(recetaMenus)
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