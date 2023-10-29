package com.example.popipa


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.popipa.adapter.IngredienteAdapter
import com.example.popipa.adapter.SpinnerIngredienteAdapter
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.databinding.ActivityAgregacionRecetasBinding

class AgregacionRecetas : AppCompatActivity() {

    private lateinit var binding:ActivityAgregacionRecetasBinding
    private val ingredientesDisponibles = mutableListOf<Ingrediente>()
    private val ingredienteSeleccionado= mutableListOf<Ingrediente>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgregacionRecetasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ingredientesDisponibles.add(Ingrediente("Ingrediente 1", "100g"))
        ingredientesDisponibles.add(Ingrediente("Ingrediente 2", "200g"))
        ingredientesDisponibles.add(Ingrediente("Ingrediente 3", "150g"))
        ingredientesDisponibles.add(Ingrediente("Otro Ingrediente", "250g"))

        val adapter = SpinnerIngredienteAdapter(this,ingredientesDisponibles)
        binding.spinnerIngredientes.adapter=adapter
        binding.botonAddIngredientes.setOnClickListener{
            val seleccion = binding.spinnerIngredientes.selectedItem as Ingrediente
            ingredienteSeleccionado.add(seleccion)
            Toast.makeText(this, "Ingrediente ${seleccion.nombre} añadido: ", Toast.LENGTH_SHORT).show()
        }
    }
    fun onVolverButtonClickedFromAgregarRe(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}