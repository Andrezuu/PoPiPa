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
import com.example.popipa.databinding.ActivityAgregacionRecetasBinding
import com.example.popipa.databinding.ItemCreacionPasoBinding

class AgregacionRecetas : AppCompatActivity() {

    private lateinit var binding: ActivityAgregacionRecetasBinding
    private lateinit var itemCreacionPasoBinding: ItemCreacionPasoBinding
    private val pasoPlatoAdapter by lazy { CreacionPasoAdapter() }
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
        binding.recyclerPasoCreacion.adapter = pasoPlatoAdapter
        //setContentView(itemCreacionPasoBinding.root)

        itemCreacionPasoBinding.imagenPaso.setOnClickListener {
            galeriaLauncher.launch("image/*")

        }
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
    var indicePasoReceta = 0
    private val recetaPasos = mutableListOf<PasoDePreparacion>()
    fun iniciarPasoRecetaRecyclerView(view: View) {
        val nuevoPaso = PasoDePreparacion(indicePasoReceta, itemCreacionPasoBinding.descripcionPaso.text.toString(), 1)
        recetaPasos.add(nuevoPaso)
        indicePasoReceta++
        pasoPlatoAdapter.addPasoReceta(recetaPasos)
        itemCreacionPasoBinding.descripcionPaso.text.clear()
        binding.recyclerPasoCreacion.adapter?.notifyItemInserted(pasoPlatoAdapter.itemCount-1)
        /*
        binding.recyclerPasoCreacion.apply {
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

            adapter = pasoPlatoAdapter
        }*/
        if (binding.recyclerPasoCreacion.layoutManager == null) {
            binding.recyclerPasoCreacion.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            binding.recyclerPasoCreacion.addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.bottom = 50
                }
            })
            binding.recyclerPasoCreacion.adapter = pasoPlatoAdapter
        }
    }
    fun onAgregarPasos(view: View) {
        val nuevoItem = layoutInflater.inflate(R.layout.item_creacion_paso, null)
        val botonImagen = nuevoItem.findViewById<ImageButton>(R.id.imagen_paso)
        botonImagen.setOnClickListener { /* Aquí puedes manejar el evento de imagen */ }

        // Agregar el nuevo item a la lista de pasos
        val linearLayout = findViewById<LinearLayout>(R.id.probar)
        linearLayout.addView(nuevoItem)
    }
    companion object {
        val CLAVE_PANTALLA_ANTERIOR = "CLAVE_PANTALLA_ANTERIOR"
    }
}
