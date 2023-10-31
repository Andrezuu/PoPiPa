package com.example.popipa

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.TipoDePlatoAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityTuMeGustaBinding
import com.example.popipa.listas.ListaCategoriasMenu
import com.example.popipa.listas.ListaDeRecomendacion

class ActivityTuMeGusta : AppCompatActivity() {

    private val context: Context = this
    private lateinit var binding: ActivityTuMeGustaBinding
    private val tipoDePlatoAdapter by lazy { TipoDePlatoAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityTuMeGustaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }

        iniciarRecetaMenuRecyclerView()
    }


    fun iniciarRecetaMenuRecyclerView() {

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

        tipoDePlatoAdapter.addRecetaMenus(recetaMenus)
        binding.recyclerReceta.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
                    outRect.bottom = 50
                }
            })

            adapter = tipoDePlatoAdapter
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
}