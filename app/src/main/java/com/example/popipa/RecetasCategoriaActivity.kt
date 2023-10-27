package com.example.popipa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.popipa.MainMenuActivity.Companion.CLAVE_RECETA
import com.example.popipa.adapter.IngredienteAdapter
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityRecetasCategoriaBinding


class RecetasCategoriaActivity : AppCompatActivity() {
    private val context: Context = this
    private val ingredienteAdapter by lazy { IngredienteAdapter() }
    private lateinit var binding: ActivityRecetasCategoriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasCategoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recetaActual = intent.getSerializableExtra(CLAVE_RECETA) as TipoDePlato
        iniciarIngredientesRecyclerView(recetaActual.listIngrediente)
        binding.botonVolver.setOnClickListener {
            onVolverButtonClicked(binding.botonVolver)
        }
    }

    fun onVolverButtonClicked(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
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
    }

}