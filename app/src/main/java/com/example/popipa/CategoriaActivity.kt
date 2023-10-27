package com.example.popipa

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.MainMenuActivity.Companion.CLAVE_CATEGORIA
import com.example.popipa.adapter.TipoDePlatoAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityCategoriaBinding


class CategoriaActivity : AppCompatActivity() {

    private val context: Context = this
    private val tipoDePlatoAdapter by lazy { TipoDePlatoAdapter() }
    private lateinit var binding: ActivityCategoriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val categoriaActual = intent.getSerializableExtra(CLAVE_CATEGORIA) as CategoriaTipoDePlato
        binding.tituloCategoria.text = categoriaActual.titulo
        iniciarRecetaMenuRecyclerView(categoriaActual.listPlato)

        binding.botonVolver.setOnClickListener {
            onVolverButtonClicked(binding.botonVolver)
        }

        tipoDePlatoAdapter.onRecetaClick = { recetaPressed ->
            val intent = Intent(context, RecetasCategoriaActivity::class.java)
            intent.putExtra(MainMenuActivity.CLAVE_RECETA, recetaPressed)
            intent.putExtra(MainMenuActivity.CLAVE_TITULO_CATEGORIA, binding.tituloCategoria.text)
            startActivity(intent)
        }


    }

    fun iniciarRecetaMenuRecyclerView(recetas: List<TipoDePlato>) {

        val tipoDePlatos = mutableListOf<TipoDePlato>()
        for (receta in recetas) {
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
            tipoDePlatos.add(recetaMenu)
        }

        tipoDePlatoAdapter.addRecetaMenus(tipoDePlatos)

        binding.recyclerRecetaCategoria.apply {
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

    fun onVolverButtonClicked(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }
}