package com.example.popipa.adapter

import android.view.ViewGroup
import android.content.Context
import android.text.Editable
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.databinding.ItemCreacionPasoBinding

class CreacionPasoAdapter (private val listaPasosPlato:List<PasoDePreparacion>): RecyclerView.Adapter<CreacionPasoAdapter.CreacionPasoAdapterViewHolder>() {

    private var context:Context?  =null
    //private var listaPasosPlato = mutableListOf<PasoDePreparacion>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CreacionPasoAdapter.CreacionPasoAdapterViewHolder {
        context = parent.context
        return CreacionPasoAdapterViewHolder(
            ItemCreacionPasoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CreacionPasoAdapter.CreacionPasoAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaPasosPlato[position])
    }
    override fun getItemCount(): Int = listaPasosPlato.size


    inner class CreacionPasoAdapterViewHolder(private val binding: ItemCreacionPasoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nombreEditText = binding.descripcionPaso
        val cantidadEditText = binding.numeroPaso

        fun binding(data:PasoDePreparacion) {
            nombreEditText.setText(data.descripcion)
            cantidadEditText.setText("Paso ${data.numero.toString()}")
        }

    }
}