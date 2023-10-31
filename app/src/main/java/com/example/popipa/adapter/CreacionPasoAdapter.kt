package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.databinding.ItemCreacionPasoBinding

class CreacionPasoAdapter :
    RecyclerView.Adapter<CreacionPasoAdapter.CreacionPasoAdapterViewHolder>() {

    private var context: Context? = null
    private val listaPasosPlato = mutableListOf<PasoDePreparacion>()

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
        val descripcionEditText = binding.descripcionPaso

        fun binding(data: PasoDePreparacion) {
            descripcionEditText.setText(data.descripcion)
            binding.numeroPaso.text = ("Paso ${data.numero}")
            binding.imagenPaso.setImageResource(R.drawable.add_imagen)
        }

    }

    fun addPasos(newListaPasos: List<PasoDePreparacion>) {
        listaPasosPlato.clear()
        listaPasosPlato.addAll(newListaPasos)
    }
}