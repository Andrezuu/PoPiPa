package com.example.popipa

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CategoriaMenuAdapter
import com.example.popipa.adapter.RecetaMenuAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.databinding.ActivityMainMenuBinding
import com.example.popipa.listas.ListaCategoriasMenu
import com.example.popipa.listas.ListaDeRecomendacion

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainMenuBinding
    private val categoriaMenuAdapter by lazy { CategoriaMenuAdapter() }
    private val recetaMenuAdapter by lazy { RecetaMenuAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarCategoriaMenuRecyclerView()
        iniciarRecetaMenuRecyclerView()
    }

    fun iniciarCategoriaMenuRecyclerView() {

        val categoriaMenus = mutableListOf<CategoriaTipoDePlato>()
        val categorias = ListaCategoriasMenu.listCategory
        for (categoria in categorias) {
            val titulo = categoria.titulo
            val imagen = categoria.imagen
            val list = categoria.listPlato

            val categoriaMenu = CategoriaTipoDePlato(titulo, imagen, list)
            categoriaMenus.add(categoriaMenu)
        }


        categoriaMenuAdapter.addCategoriaMenus(categoriaMenus)

        binding.recyclerCategoriaMenu.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

            //funcion anonima que separe los items del categoriaRecyclerview
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.right = 50
                }
            })
            adapter = categoriaMenuAdapter
        }
    }

    fun iniciarRecetaMenuRecyclerView() {

        val recetaMenus = mutableListOf<RecetaMenu>()

        val recetas = ListaDeRecomendacion.listaTiposDeDesayuno

        for (receta in recetas) {
            val tituloReceta= receta.titulo
            val descripcion = receta.descripcion
            val tiempo = receta.tiempoDePreparacion
            val dificultad = receta.dificultad
            val imagenCategoria = receta.imagen

            val recetaMenu = RecetaMenu(tituloReceta, descripcion,tiempo,dificultad,imagenCategoria)
            recetaMenus.add(recetaMenu)
        }


        recetaMenuAdapter.addRecetaMenus(recetaMenus)
        binding.recyclerRecetaMenu.apply {
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