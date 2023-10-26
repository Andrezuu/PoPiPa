package com.example.popipa.adapter

import android.annotation.SuppressLint
import android.content.Context
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

        @SuppressLint("ResourceAsColor")
        fun binding(data: RecetaMenu) {
            var color = R.color.red
            if (data.dificultad == 1) {
                color = R.color.green
            } else if (data.dificultad == 2) {
                color = R.color.yellow
            } else if (data.dificultad == 3) {
                color = R.color.red
            }

            binding.imageViewRecetaMenu.setImageResource(data.image)
            binding.textViewRecetaMenuNombre.text = data.nombre
            binding.textViewRecetaMenuDescripcion.text = data.descripcion
            binding.textViewRecetaTiempoMenu.text = data.tiempo
            binding.dificultad.setBackgroundColor(color)


        }
    }

    fun addRecetaMenus(newRecetaMenus: List<RecetaMenu>) {
        listaRecetaMenus.clear()
        listaRecetaMenus.addAll(newRecetaMenus)
    }
}