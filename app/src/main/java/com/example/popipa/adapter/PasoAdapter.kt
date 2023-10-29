package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.databinding.ItemPasoBinding

class PasoAdapter : RecyclerView.Adapter<PasoAdapter.PasoAdapterViewHolder>() {

    private var context: Context? = null
    private val listaPasos = mutableListOf<PasoDePreparacion>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PasoAdapter.PasoAdapterViewHolder {
        context = parent.context
        return PasoAdapterViewHolder(
            ItemPasoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    }

    override fun onBindViewHolder(holder: PasoAdapter.PasoAdapterViewHolder, position: Int) {
        holder.binding(listaPasos[position])
    }

    override fun getItemCount(): Int = listaPasos.size

    inner class PasoAdapterViewHolder(private val binding: ItemPasoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun binding(data: PasoDePreparacion) {
            val numeroPaso = "Paso " + data.numero.toString()
            binding.numeroPaso.text = numeroPaso
            binding.descripcionPaso.text = data.descripcion
            binding.imagenPaso.setImageResource(R.drawable.corazon_me_gusta)
        }

    }

    fun addPasos(newListaPasos: List<PasoDePreparacion>) {
        listaPasos.clear()
        listaPasos.addAll(newListaPasos)
    }
}