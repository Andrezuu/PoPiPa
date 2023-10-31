package com.example.popipa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Rect
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CategoriaMenuAdapter
import com.example.popipa.adapter.TipoDePlatoAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityMainMenuBinding
import com.example.popipa.listas.ListaCategoriasMenu
import com.example.popipa.listas.ListaDeRecomendacion

class MainMenuActivity : AppCompatActivity() {

    private val context: Context = this
    private val categoriaMenuAdapter by lazy { CategoriaMenuAdapter() }
    private val tipoDePlatoAdapter by lazy { TipoDePlatoAdapter() }
    private lateinit var binding: ActivityMainMenuBinding

    private lateinit var preference: SharedPreferences
    lateinit var  experiencia :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preference = PreferenceManager.getDefaultSharedPreferences(this)
        experiencia = preference.getString("experiencia","") ?: "Chef"


        iniciarCategoriaMenuRecyclerView()
        iniciarRecetaMenuRecyclerView()



        //Entrar en otras pantallas de la barra de abajo
        binding.buttonMisRecetas.setOnClickListener {
            intent = Intent(context, RecetasUsuario::class.java)
            startActivity(intent)
        }

        binding.buttonBuscar.setOnClickListener {
            intent = Intent(context, FiltradorActivity::class.java)
            startActivity(intent)
        }
        binding.buttonAgregar.setOnClickListener{
            intent = Intent(context, AgregacionRecetas::class.java)
            intent.putExtra(CLAVE_PANTALLA_MAIN_MENU, 1)
            startActivity(intent)
        }

        binding.buttonPerfil.setOnClickListener {
            intent = Intent(context, PerfilUsuarioActivity::class.java)
            startActivity(intent)
        }


        binding.buttonMeGusta.setOnClickListener {
            val tiposDePlatoConMeGusta = ListaCategoriasMenu.listCategory
                .flatMap { it.listPlato }
                .filter { it.meGusta }

            val recetaMenus = tiposDePlatoConMeGusta.map { receta ->
                TipoDePlato(
                    receta.titulo,
                    receta.descripcion,
                    receta.imagen,
                    receta.tiempoDePreparacion,
                    receta.dificultad,
                    receta.meGusta,
                    receta.listIngrediente,
                    receta.listPasos
                )
            }
            val resultadoFiltrado = CategoriaTipoDePlato(
                "Tus Gustos Mi Chef",
                R.drawable.medialunas,
                recetaMenus
            )

            val intent = Intent(context, CategoriaActivity::class.java)
            intent.putExtra(MainMenuActivity.CLAVE_CATEGORIA, resultadoFiltrado)
            startActivity(intent)
        }

        categoriaMenuAdapter.onCategoriaClick = { categoriaPressed ->
            val intent = Intent(context, CategoriaActivity::class.java)
            intent.putExtra(CLAVE_CATEGORIA, categoriaPressed)
            startActivity(intent)

        }

        tipoDePlatoAdapter.onRecetaClick = { recetaPressed ->
            val intent = Intent(context, RecetasCategoriaActivity::class.java)
            intent.putExtra(CLAVE_RECETA, recetaPressed)
            intent.putExtra(CLAVE_TITULO_CATEGORIA, "Para Ti")
            startActivity(intent)

        }

    }

    //Entrar en otras pantallas de la barra de abajo
    fun onPerfilButtonClicked(view: View) {
        val intent: Intent = Intent(this, PerfilUsuarioActivity::class.java)
        startActivity(intent)
    }

    fun onRecetasUsuarioClicked(view: View) {
        val intent: Intent = Intent(this, RecetasUsuario::class.java)
        startActivity(intent)
    }

    fun onAgregacionRecetasClicked(view: View) {
        val intent: Intent = Intent(this, AgregacionRecetas::class.java)
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


    //Recuperar datos de SharedPreferences en otro Activity

    fun funexperiencia(experiencia1: String): Int {
        return when (experiencia1) {
            "Basico" -> 1
            "Junnior Chef" -> 2
            else -> 3
        }
    }

    fun iniciarRecetaMenuRecyclerView() {

        val recetas = ListaDeRecomendacion.listaTiposDeDesayuno
        val recetaMenus = mutableListOf<TipoDePlato>()
        for (receta in recetas) {

            val dificultad = receta.dificultad

            if (funexperiencia(experiencia) >= dificultad) {
            val tituloReceta = receta.titulo
            val descripcion = receta.descripcion
            val imagenCategoria = receta.imagen
            val tiempo = receta.tiempoDePreparacion
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
            recetaMenus.add(recetaMenu)
            }
        }

        tipoDePlatoAdapter.addRecetaMenus(recetaMenus)
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

            adapter = tipoDePlatoAdapter
        }
    }

    //KEYS PARA SHARED PREFERENCES E INTENTS
    companion object {
        val CLAVE_CATEGORIA = "CLAVE_CATEGORIA"
        val CLAVE_RECETA = "CLAVE_RECETA"
        val CLAVE_TITULO_CATEGORIA = "CLAVE_TITULO_CATEGORIA"
        val IMAGE_STRING_KEY = "IMAGE_STRING_KEY"
        val NOMBRE_KEY = "NOMBRE_KEY"
        val APELLIDO_KEY = "APELLIDO_KEY"
        val EMAIL_KEY = "EMAIL_KEY"
        val CLAVE_PANTALLA_MAIN_MENU = "CLAVE_PANTALLA_MAIN_MENU"
    }
}

