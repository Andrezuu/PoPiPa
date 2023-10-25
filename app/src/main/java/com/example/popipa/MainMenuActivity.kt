package com.example.popipa

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.CategoriaMenuAdapter
import com.example.popipa.dataClasses.CategoriaMenu
import com.example.popipa.databinding.ActivityCategoriaRecyclerViewBinding
import com.example.popipa.listas.ListaCategoriasMenu

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriaRecyclerViewBinding
    private val categoriaMenuAdapter by lazy { CategoriaMenuAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriaRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarCategoriaRecyclerView()
    }

    fun iniciarCategoriaRecyclerView() {
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
        categoriaMenuAdapter.addCategorias(categoriaMenus)

        binding.recycler.apply {
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
}