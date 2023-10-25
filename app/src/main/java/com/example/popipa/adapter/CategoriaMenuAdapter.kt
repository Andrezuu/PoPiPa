package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClasses.CategoriaMenu
import com.example.popipa.databinding.ItemCategoriaMenuBinding


class CategoriaMenuAdapter :
    RecyclerView.Adapter<CategoriaMenuAdapter.CategoriaAdapterViewHolder>() {

    private var context: Context? = null
    private val listaCategoriaMenus = mutableListOf<CategoriaMenu>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriaMenuAdapter.CategoriaAdapterViewHolder {
        context = parent.context
        return CategoriaAdapterViewHolder(
            ItemCategoriaMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CategoriaMenuAdapter.CategoriaAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaCategoriaMenus[position])
    }

    override fun getItemCount(): Int = listaCategoriaMenus.size

    inner class CategoriaAdapterViewHolder(private val binding: ItemCategoriaMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun binding(data: CategoriaMenu) {
            binding.imageViewCategoria.setImageResource(data.image)
            binding.textViewCategoriaNombre.text = data.nombre
        }
    }

    fun addCategorias(newCategoriaMenus: List<CategoriaMenu>) {
        listaCategoriaMenus.clear()
        listaCategoriaMenus.addAll(newCategoriaMenus)
    }

}