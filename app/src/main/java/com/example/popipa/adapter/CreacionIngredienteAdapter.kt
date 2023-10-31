package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.databinding.ItemIngredienteCreacionBinding

class CreacionIngredienteAdapter :
    RecyclerView.Adapter<CreacionIngredienteAdapter.CreacionIngredienteAdapterViewHolder>() {

    private var context: Context? = null
    private var listaIngredientes = mutableListOf<Ingrediente>()

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CreacionIngredienteAdapter.CreacionIngredienteAdapterViewHolder {
        context = parent.context
        return CreacionIngredienteAdapterViewHolder(
            ItemIngredienteCreacionBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CreacionIngredienteAdapter.CreacionIngredienteAdapterViewHolder, position: Int
    ) {
        holder.binding(listaIngredientes[position])
    }

    override fun getItemCount(): Int = listaIngredientes.size


    inner class CreacionIngredienteAdapterViewHolder(private val binding: ItemIngredienteCreacionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nombreEditText = binding.nombreIngrediente
        val cantidadEditText = binding.cantidadRequerida

        fun binding(data: Ingrediente) {
            nombreEditText.setText(data.nombre)
            cantidadEditText.setText(data.cantidad)

        }

    }

    fun addIngredientes(newListaIngredientes: List<Ingrediente>) {
        listaIngredientes.clear()
        listaIngredientes.addAll(newListaIngredientes)
        notifyDataSetChanged()
    }
}