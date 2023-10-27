package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.databinding.ItemIngredienteBinding
import com.example.popipa.databinding.ItemRecetaMenuBinding


class IngredienteAdapter : RecyclerView.Adapter<IngredienteAdapter.IngredienteAdapterViewHolder>() {

    private var context: Context? = null
    private val listaIngredientes = mutableListOf<Ingrediente>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IngredienteAdapter.IngredienteAdapterViewHolder {
        context = parent.context
        return IngredienteAdapterViewHolder(
            ItemIngredienteBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IngredienteAdapter.IngredienteAdapterViewHolder, position: Int) {
        holder.binding(listaIngredientes[position])
    }

    override fun getItemCount(): Int = listaIngredientes.size

    inner class IngredienteAdapterViewHolder(private val binding: ItemIngredienteBinding): RecyclerView.ViewHolder(binding.root) {
        fun binding(data: Ingrediente) {
            binding.ingredienteNombre.text = data.nombre
            binding.ingredienteCantidad.text = data.cantidad
        }
    }

    fun addIngredientes(newListaIngredientes: List<Ingrediente>) {
        listaIngredientes.clear()
        listaIngredientes.addAll(newListaIngredientes)
    }

}

