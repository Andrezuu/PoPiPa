package com.example.popipa


import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CreacionIngredienteAdapter
import com.example.popipa.adapter.CreacionPasoAdapter
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.databinding.ActivityAgregacionRecetasBinding
import com.example.popipa.databinding.ItemCreacionPasoBinding

class AgregacionRecetas : AppCompatActivity() {

    private lateinit var binding: ActivityAgregacionRecetasBinding
    private lateinit var itemCreacionPasoBinding: ItemCreacionPasoBinding

    private val context: Context = this
    private val listaDeIngredientes = mutableListOf<Ingrediente>()
    private val listaDePasos = mutableListOf<PasoDePreparacion>()

    private val creacionPasoAdapter by lazy { CreacionPasoAdapter() }
    private val creacionIngredienteAdapter by lazy { CreacionIngredienteAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgregacionRecetasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ingredienteVacio = Ingrediente("", "")
        var numeroPaso = 1

        listaDePasos.add(PasoDePreparacion(numeroPaso, "", 0))
        listaDeIngredientes.add(ingredienteVacio)

        iniciarIngredientesRecyclerView()
        iniciarPasosRecyclerView()

        var lastIngrediente = listaDeIngredientes.last()
        var lastPaso = listaDePasos.last()

        binding.botonVolver3.setOnClickListener {
            val pantallaOrigen = intent.getIntExtra(CLAVE_PANTALLA_ANTERIOR, 0)
            when (pantallaOrigen) {
                1 -> {
                    val intent = Intent(this, MainMenuActivity::class.java)
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(this, RecetasUsuario::class.java)
                    startActivity(intent)
                }
            }
        }

        binding.botonAddIngredientes.setOnClickListener {
            if (lastIngrediente.nombre.isEmpty() || lastIngrediente.cantidad.isEmpty()) {
                Toast.makeText(context, "Completa el ingrediente anterior!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                listaDeIngredientes.add(ingredienteVacio)
                iniciarIngredientesRecyclerView()
                lastIngrediente = listaDeIngredientes.last()
            }
        }

        binding.botonGuardarIngredientes.setOnClickListener {
            val ingredienteActual = binding.recyclerIngredientes.findViewHolderForAdapterPosition(
                listaDeIngredientes.size - 1
            ) as? CreacionIngredienteAdapter.CreacionIngredienteAdapterViewHolder

            if (ingredienteActual?.nombreEditText?.text?.isEmpty() == true || ingredienteActual?.cantidadEditText?.text?.isEmpty() == true) {
                Toast.makeText(context, "Completa los datos!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Ingrediente guardado!", Toast.LENGTH_SHORT).show()
                val newIngrediente = Ingrediente(
                    ingredienteActual?.nombreEditText?.text.toString(),
                    ingredienteActual?.cantidadEditText?.text.toString()
                )
                listaDeIngredientes[listaDeIngredientes.size - 1] = newIngrediente

                lastIngrediente = listaDeIngredientes.last()
            }


        }

        binding.botonAddPasos.setOnClickListener {
            if (lastPaso.descripcion.isEmpty()) {
                Toast.makeText(context, "Completa el paso anterior!", Toast.LENGTH_SHORT).show()
            } else {
                listaDePasos.add(PasoDePreparacion(numeroPaso, "", 0))

                iniciarPasosRecyclerView()

                lastPaso = listaDePasos.last()
            }
        }

        binding.botonGuardarPasos.setOnClickListener {
            val pasoActual = binding.recyclerPasoCreacion.findViewHolderForAdapterPosition(
                listaDePasos.size - 1
            ) as? CreacionPasoAdapter.CreacionPasoAdapterViewHolder

            if (pasoActual?.descripcionEditText?.text?.isEmpty() == true) {
                Toast.makeText(context, "Completa los datos!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Paso guardado!", Toast.LENGTH_SHORT).show()

                val newPaso = PasoDePreparacion(
                    numeroPaso,
                    pasoActual?.descripcionEditText?.text.toString(),
                    R.drawable.add_imagen

                )
                listaDePasos[listaDePasos.size - 1] = newPaso
                iniciarPasosRecyclerView()

                lastPaso = listaDePasos.last()
                numeroPaso++
            }


        }

        binding.botonHecho.setOnClickListener {
            val isIncomplete = listaDeIngredientes.isEmpty() || listaDePasos.isEmpty() || binding.tituloReceta.text.isEmpty() || binding.tituloCategoria.text.isEmpty()
            if(isIncomplete) {
                Toast.makeText(context, "Completa los datos!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(context, Descripcion_Dificultad__YMas_Receta::class.java)
                startActivity(intent)
            }

        }
    }


    fun iniciarIngredientesRecyclerView() {
        val ingredientes = mutableListOf<Ingrediente>()
        for (ingrediente in listaDeIngredientes) {
            val nombreIngrediente = ingrediente.nombre
            val cantidadIngrediente = ingrediente.cantidad

            val newIngrediente = Ingrediente(nombreIngrediente, cantidadIngrediente)
            ingredientes.add(newIngrediente)
        }

        creacionIngredienteAdapter.addIngredientes(ingredientes)

        binding.recyclerIngredientes.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
                ) {
                    outRect.bottom = 25
                }
            })

            adapter = creacionIngredienteAdapter
        }
    }

    fun iniciarPasosRecyclerView() {
        val pasos = mutableListOf<PasoDePreparacion>()

        for (paso in listaDePasos) {
            val numeroPaso = paso.numero
            val descripcionPaso = paso.descripcion
            val imagenPaso = paso.viewpaso

            val newPaso = PasoDePreparacion(numeroPaso, descripcionPaso, imagenPaso)

            pasos.add(newPaso)
        }

        creacionPasoAdapter.addPasos(pasos)
        binding.recyclerPasoCreacion.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
                ) {
                    outRect.bottom = 40
                }
            })

            adapter = creacionPasoAdapter
        }
    }

    companion object {
        val CLAVE_PANTALLA_ANTERIOR = "CLAVE_PANTALLA_ANTERIOR"
    }
}

