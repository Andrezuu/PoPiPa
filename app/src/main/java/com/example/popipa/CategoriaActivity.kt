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
import com.example.popipa.adapter.RecetaMenuAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityCategoriaBinding


class CategoriaActivity : AppCompatActivity() {

    private val context: Context = this
    private val recetaMenuAdapter by lazy { RecetaMenuAdapter() }
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

    }

    fun iniciarRecetaMenuRecyclerView(recetas: List<TipoDePlato>) {

        val recetaMenus = mutableListOf<RecetaMenu>()
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

            adapter = recetaMenuAdapter
        }

    }

    fun onVolverButtonClicked(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }
}