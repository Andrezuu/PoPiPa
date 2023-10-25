package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClasses.CategoriaMenu
import com.example.popipa.databinding.ItemCategoriaMenuBinding

class CategoriaMenuAdapter :
    RecyclerView.Adapter<CategoriaMenuAdapter.CategoriaMenuAdapterViewHolder>() {

    private var context: Context? = null
    private val listaCategoriaMenus = mutableListOf<CategoriaMenu>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriaMenuAdapter.CategoriaMenuAdapterViewHolder {
        context = parent.context
        return CategoriaMenuAdapterViewHolder(
            ItemCategoriaMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CategoriaMenuAdapter.CategoriaMenuAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaCategoriaMenus[position])
    }

    override fun getItemCount(): Int = listaCategoriaMenus.size

    inner class CategoriaMenuAdapterViewHolder(private val binding: ItemCategoriaMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun binding(data: CategoriaMenu) {
            binding.imageViewCategoriaMenu.setImageResource(data.image)
            binding.textViewCategoriaMenuNombre.text = data.nombre
        }
    }

    fun addCategoriaMenus(newCategoriaMenus: List<CategoriaMenu>) {
        listaCategoriaMenus.clear()
        listaCategoriaMenus.addAll(newCategoriaMenus)
    }

}