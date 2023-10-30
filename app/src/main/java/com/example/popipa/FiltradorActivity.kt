package com.example.popipa

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.popipa.MainMenuActivity.Companion.CLAVE_CATEGORIA
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityFiltradorBinding
import com.example.popipa.listas.ListaCategoriasMenu

class FiltradorActivity : AppCompatActivity() {

    private val context: Context = this
    private lateinit var binding: ActivityFiltradorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFiltradorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }
        val botones = arrayOf(
            binding.selecAlmuerzos,
            binding.selecCenas,
            binding.selecCocteles,
            binding.selecDesayunos,
            binding.selecEstudiante,
            binding.selecGalletas,
            binding.selecHalloween,
            binding.selecNavidad,
            binding.selecPan,
            binding.selecPasteles
        )
        val botonesSeleccionado = botones.associateWith { false }.toMutableMap()

        for (boton in botones) {
            var isSalmon = false
            boton.setOnClickListener {
                if (!isSalmon) {
                    boton.setBackgroundColor(ContextCompat.getColor(context, R.color.salmon))
                } else {

                    boton.setBackgroundColor(ContextCompat.getColor(context, R.color.gray2))
                }
                isSalmon = !isSalmon
                botonesSeleccionado[boton] = isSalmon
            }
        }

        binding.goFiltrar.setOnClickListener {
            //filtrar que botones fueron clikeados
            val botonesPressed = botonesSeleccionado.filter { it.value }

            //juntar las categorias seleccionadas en una lista de categorias
            val categoriasFiltradas = botonesPressed.flatMap { boton ->
                ListaCategoriasMenu.listCategory.filter { categoria ->
                    boton.key.text.toString() == categoria.titulo
                }
            }

            //juntar todas los tipos de plato (receta) de las categorias filtradas en una lista de lista de platos

            val recetasFiltradas = mutableListOf<List<TipoDePlato>>()

            categoriasFiltradas.forEach { categoria ->
                recetasFiltradas.add(categoria.listPlato)
            }

            //crear una nueva categoria resultados, se le asigna cualquier imagen
            //y se le hace un flatten a recetasFiltradas
            //esto para que la lista de listas de platos sea una sola lista de platos
            val resultadoFiltrado = CategoriaTipoDePlato(
                "Resultados",
                R.drawable.medialunas, //la imagen no se utiliza
                recetasFiltradas.flatten()
            )
            val intent = Intent(context, CategoriaActivity::class.java)
            intent.putExtra(CLAVE_CATEGORIA, resultadoFiltrado)
            startActivity(intent)

        }
    }

}
