package com.example.popipa

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CategoriaMenuAdapter
import com.example.popipa.adapter.RecetaMenuAdapter
import com.example.popipa.dataClases.CategoriaMenu
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainMenuBinding
    private val categoriaMenuAdapter by lazy { CategoriaMenuAdapter() }
    private val recetaMenuAdapter by lazy { RecetaMenuAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarCategoriaMenuRecyclerView()
        iniciarRecetaMenuRecyclerView()
    }

    fun iniciarCategoriaMenuRecyclerView() {
        val categoriaMenus = mutableListOf<CategoriaMenu>()
        val categoriaMenu = CategoriaMenu(R.drawable.desayunos, "Cocteles")
        val categoriaMenu1 = CategoriaMenu(R.drawable.desayunos, "Estudiante")
        val categoriaMenu2 = CategoriaMenu(R.drawable.pasteles, "Helado")
        val categoriaMenu3 = CategoriaMenu(R.drawable.pasteles, "Pizza")
        val categoriaMenu4 = CategoriaMenu(R.drawable.pasteles, "Te")

        categoriaMenus.add(categoriaMenu)
        categoriaMenus.add(categoriaMenu1)
        categoriaMenus.add(categoriaMenu2)
        categoriaMenus.add(categoriaMenu3)
        categoriaMenus.add(categoriaMenu4)
        categoriaMenuAdapter.addCategoriaMenus(categoriaMenus)

        binding.recyclerCategoriaMenu.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

            //funcion anonima que separe los items del categoriaRecyclerview
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.right = 50
                }
            })
            adapter = categoriaMenuAdapter
        }
    }

    fun iniciarRecetaMenuRecyclerView() {
        val recetaMenus = mutableListOf<RecetaMenu>()
        val recetaMenu = RecetaMenu(
            "Pasta a la Carbonara",
            "Es un plato muy popular en la cocina italiana y ha ganado adeptos en todo el mundo debido a su simplicidad y sabor reconfortante.",
            "25min",
            1,
            R.drawable.desayunos
        )
        val recetaMenu1 = RecetaMenu(
            "Ensalada César",
            "Una deliciosa ensalada con lechuga romana, aderezo especial, crutones y queso parmesano.",
            "15min",
            2,
            R.drawable.desayunos
        )

        val recetaMenu2 = RecetaMenu(
            "Sushi Variado",
            "Un surtido de sushi fresco que incluye nigiri, makis y sashimi con salsa de soja y jengibre.",
            "30min",
            3,
            R.drawable.desayunos
        )

        val recetaMenu3 = RecetaMenu(
            "Tacos al Pastor",
            "Tacos de cerdo marinado con achiote, piña y cebolla, servidos en tortillas de maíz.",
            "20min",
            4,
            R.drawable.desayunos
        )

        val recetaMenu4 = RecetaMenu(
            "Hamburguesa Clásica",
            "Una jugosa hamburguesa con lechuga, tomate, cebolla, queso y salsa especial en un pan suave.",
            "25min",
            5,
            R.drawable.desayunos
        )
        recetaMenus.add(recetaMenu)
        recetaMenus.add(recetaMenu1)
        recetaMenus.add(recetaMenu2)
        recetaMenus.add(recetaMenu3)
        recetaMenus.add(recetaMenu4)
        recetaMenuAdapter.addRecetaMenus(recetaMenus)
        binding.recyclerRecetaMenu.apply {
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
}