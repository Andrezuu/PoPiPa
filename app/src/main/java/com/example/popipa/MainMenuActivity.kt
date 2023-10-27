package com.example.popipa

import android.content.Context
import android.content.Intent
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

    private val context: Context = this
    private val categoriaMenuAdapter by lazy { CategoriaMenuAdapter() }
    private val recetaMenuAdapter by lazy { RecetaMenuAdapter() }
    private lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarCategoriaMenuRecyclerView()
        iniciarRecetaMenuRecyclerView()

        //ir a la pantalla del perfil de usuario
        binding.buttonPerfil.setOnClickListener {
            onPerfilButtonClicked(binding.buttonPerfil)
        }

        categoriaMenuAdapter.setOnClickListener(object : CategoriaMenuAdapter.OnClickListener {
            //permite que los items del recyclerView sean clickeables. Mandando a la respectiva categoria
            override fun onClick(position: Int, model: CategoriaTipoDePlato) {
                val categoriaPressed: CategoriaTipoDePlato =
                    ListaCategoriasMenu.listCategory[position]
                val intent = Intent(context, CategoriaActivity::class.java)
                intent.putExtra(CLAVE_CATEGORIA, categoriaPressed)
                startActivity(intent)
            }
        })

    }
    //Entrar en otras pantallas de la barra de abajo
    fun onPerfilButtonClicked(view: View) {
        val intent: Intent = Intent(context, PerfilUsuarioActivity::class.java)
        startActivity(intent)
    }
    fun onRecetasUsuarioClicked(view: View){
        val intent:Intent = Intent(this,RecetasUsuario::class.java)
        startActivity(intent)
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
            val tituloReceta = receta.titulo
            val descripcion = receta.descripcion
            val tiempo = receta.tiempoDePreparacion
            val dificultad = receta.dificultad
            val imagenCategoria = receta.imagen

            val recetaMenu =
                RecetaMenu(tituloReceta, descripcion, tiempo, dificultad, imagenCategoria)
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

    companion object {
        val CLAVE_CATEGORIA = "CLAVE_CATEGORIA"
    }
}

