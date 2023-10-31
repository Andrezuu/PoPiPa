package com.example.popipa


import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CreacionPasoAdapter
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityAgregacionRecetasBinding
import com.example.popipa.databinding.ItemCreacionPasoBinding

class AgregacionRecetas : AppCompatActivity() {

    private lateinit var binding: ActivityAgregacionRecetasBinding
    private lateinit var itemCreacionPasoBinding: ItemCreacionPasoBinding

    private val listaDeRecetas = mutableListOf<TipoDePlato>()
    private val listaDePasos = mutableListOf<PasoDePreparacion>()
    private val contenidoEditText = mutableListOf<String>()
    //private val pasoPlatoAdapter by lazy { CreacionPasoAdapter(listaDePasos) }
    private val ingredientesDisponibles = mutableListOf<Ingrediente>()

    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { image ->
        itemCreacionPasoBinding.imagenPaso.setImageURI(image)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgregacionRecetasBinding.inflate(layoutInflater)
        itemCreacionPasoBinding = ItemCreacionPasoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        itemCreacionPasoBinding.imagenPaso.setOnClickListener {
            galeriaLauncher.launch("image/*")
        }

        binding.botonAddPasos.setOnClickListener{
            val descripcionPaso = itemCreacionPasoBinding.descripcionPaso.text.toString()
            val numeroPaso=listaDePasos.size+1
            if(descripcionPaso.isEmpty()){
                val nuevoPaso = PasoDePreparacion(numeroPaso,descripcionPaso, R.drawable.asado)
                listaDePasos.add(nuevoPaso)
                contenidoEditText.add(descripcionPaso)
                iniciarPasosRecyclerView()
                itemCreacionPasoBinding.descripcionPaso.text.clear()
                itemCreacionPasoBinding.imagenPaso.setImageResource(R.drawable.asado)
                itemCreacionPasoBinding.imagenPaso.requestLayout()
                //pasoPlatoAdapter.notifyDataSetChanged()
                //pasoPlatoAdapter.notifyItemInserted(listaDePasos.size-1)
            }else{
                Toast.makeText(this, "Ingrese la descripción del paso.", Toast.LENGTH_SHORT).show()
            }

        }
        /*binding.agregarIngrediente.setOnClickListener {

            if (lastIngrediente.nombre.isEmpty() || lastIngrediente.cantidad.isEmpty()) {
                Toast.makeText(context, "Completa el ingrediente anterior!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                listaIngredientesUsuario.add(ingredienteVacio)
                iniciarIngredientesRecyclerView()
                lastIngrediente = listaIngredientesUsuario.last()
            }

        }

        binding.guardarIngrediente.setOnClickListener {
            val viewHolder = binding.recyclerIngredientes.findViewHolderForAdapterPosition(
                listaIngredientesUsuario.size - 1
            ) as? IngredienteCreacionAdapter.IngredienteAdapterViewHolder

            if (viewHolder?.nombreEditText?.text?.isEmpty() == true || viewHolder?.cantidadEditText?.text?.isEmpty() == true) {
                Toast.makeText(context, "Completa los datos!", Toast.LENGTH_SHORT).show()
            }

            val newIngrediente = Ingrediente(
                viewHolder?.nombreEditText?.text.toString(),
                viewHolder?.cantidadEditText?.text.toString()
            )
            listaIngredientesUsuario[listaIngredientesUsuario.size - 1] = newIngrediente
            iniciarIngredientesRecyclerView()
            lastIngrediente = listaIngredientesUsuario.last()
        }*/
    }

    // Funciones para cambiar de pantallas
    fun onVolverButtonClickedFromAgregarRe(view: View) {
        val pantallaOrigen = intent.getIntExtra(CLAVE_PANTALLA_ANTERIOR,0)
        when (pantallaOrigen){
            1 -> {
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent)
            }
            2 -> {
                val intent = Intent(this, RecetasUsuario::class.java)
                startActivity(intent)
            }
        }
        finish()
    }
    fun onHechoButtonClickedFromAgregarRe(view: View){
        val intent = Intent(this, Descripcion_Dificultad__YMas_Receta::class.java)
        startActivity(intent)
    }

    fun onAgregarIngrediente(view: View) {
        val nombreIngredientePlato = binding.nombreIngrediente.text.toString()
        val cantidadRequeridaPlato = binding.cantidadRequerida.text.toString()
        if (nombreIngredientePlato.isNotEmpty() && cantidadRequeridaPlato.isNotEmpty()) {
            val nuevoIngrediente = Ingrediente(nombreIngredientePlato, cantidadRequeridaPlato)
            ingredientesDisponibles.add(nuevoIngrediente)

            binding.nombreIngrediente.text.clear()
            binding.cantidadRequerida.text.clear()
        } else {
            Toast.makeText(this, "Ingrese nombre y cantidad por favor", Toast.LENGTH_SHORT).show()
        }
    }

    private fun iniciarPasosRecyclerView() {
        // Configura el RecyclerView para mostrar la lista de pasos
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerPasoCreacion.layoutManager = layoutManager

        val pasoAdapter = CreacionPasoAdapter(listaDePasos)
        binding.recyclerPasoCreacion.adapter = pasoAdapter
    }

    companion object {
        val CLAVE_PANTALLA_ANTERIOR = "CLAVE_PANTALLA_ANTERIOR"
    }
}
