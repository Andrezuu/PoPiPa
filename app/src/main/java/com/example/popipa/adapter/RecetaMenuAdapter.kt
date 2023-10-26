package com.example.popipa.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.R
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.databinding.ItemRecetaMenuBinding

class RecetaMenuAdapter : RecyclerView.Adapter<RecetaMenuAdapter.RecetaMenuAdapterViewHolder>() {

    private var context: Context? = null
    private val listaRecetaMenus = mutableListOf<RecetaMenu>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecetaMenuAdapter.RecetaMenuAdapterViewHolder {
        context = parent.context
        return RecetaMenuAdapterViewHolder(
            ItemRecetaMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: RecetaMenuAdapter.RecetaMenuAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaRecetaMenus[position])
    }

    override fun getItemCount(): Int = listaRecetaMenus.size

    inner class RecetaMenuAdapterViewHolder(private val binding: ItemRecetaMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: RecetaMenu) {
            val color: Int = when {
                data.dificultad == 1 -> R.color.green
                data.dificultad == 2 -> R.color.yellow
                data.dificultad == 3 -> R.color.red
                else -> R.color.green
            }

            binding.imageViewRecetaMenu.setImageResource(data.image)
            binding.textViewRecetaMenuNombre.text = data.nombre
            binding.textViewRecetaMenuDescripcion.text = data.descripcion
            binding.textViewRecetaTiempoMenu.text = data.tiempo
            binding.dificultad.setBackgroundColor(Color.parseColor("#F8981D"))
        }
    }

    fun addRecetaMenus(newRecetaMenus: List<RecetaMenu>) {
        listaRecetaMenus.clear()
        listaRecetaMenus.addAll(newRecetaMenus)
    }
}