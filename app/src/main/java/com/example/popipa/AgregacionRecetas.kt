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

    private val listaPasosPlato = mutableListOf<PasoDePreparacion>()
    private val ingredientesDisponibles = mutableListOf<Ingrediente>()
    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ::abrirGaleria
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgregacionRecetasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerPasoCreacion.adapter = pasoPlatoAdapter
        itemCreacionPasoBinding = ItemCreacionPasoBinding.inflate(layoutInflater)

        //abrir la galeria para cambiar la foto del paso de la receta
        itemCreacionPasoBinding.imagenPaso.setOnClickListener {
            onImagenNuevoPasoClicked(itemCreacionPasoBinding.imagenPaso)
        }
    }
    // Funciones para cambiar de pantallas
    fun onVolverButtonClickedFromAgregarRe(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun onHechoButtonClickedFromAgregarRe(view: View){
        val intent = Intent(this, Descripcion_Dificultad__YMas_Receta::class.java)
        startActivity(intent)
    }

    fun abrirGaleria(result: ActivityResult) {
        if (result.resultCode == RESULT_OK) {
            // Guardar informacion en tipo URI de la imagen seleccionada
            val imageUri = result.data?.data
            // Convertir la imagen a un bitmap, con un let  debido al tipaje
            val bitmapImage = BitmapFactory.decodeStream(imageUri?.let {
                contentResolver.openInputStream(
                    it
                )
            })
            //reescalar la imagen para luego cargarla a la aplicacion
            val resizedBitmapImage = Bitmap.createScaledBitmap(bitmapImage, 800, 800, true)
            itemCreacionPasoBinding.imagenPaso.setImageBitmap(resizedBitmapImage)
        }
    }

    fun onImagenNuevoPasoClicked(view: View) {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        galeriaLauncher.launch(intent)
        itemCreacionPasoBinding = ItemCreacionPasoBinding.inflate(layoutInflater)
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
    private var indicePasoReceta = 1
    private val recetaPasos = mutableListOf<PasoDePreparacion>()
    fun iniciarPasoRecetaRecyclerView(view: View) {
        val nuevoPaso = PasoDePreparacion(indicePasoReceta, "", indicePasoReceta)
        //recetaPasos.add(nuevoPaso)
        pasoPlatoAdapter.addPasoReceta(nuevoPaso)
        indicePasoReceta++
        binding.recyclerPasoCreacion.adapter?.notifyItemInserted(pasoPlatoAdapter.itemCount-1)

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
}