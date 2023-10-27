package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ItemTipoPlatoBinding

class TipoDePlatoAdapter : RecyclerView.Adapter<TipoDePlatoAdapter.TipoDePlatoAdapterViewHolder>() {

    var onRecetaClick: ((TipoDePlato) -> Unit)? = null
    private var context: Context? = null
    private val listaTipoDePlatos = mutableListOf<TipoDePlato>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipoDePlatoAdapter.TipoDePlatoAdapterViewHolder {
        context = parent.context
        return TipoDePlatoAdapterViewHolder(
            ItemTipoPlatoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: TipoDePlatoAdapter.TipoDePlatoAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaTipoDePlatos[position])
        holder.itemView.setOnClickListener {
            onRecetaClick?.invoke(listaTipoDePlatos[position])
        }
    }

    override fun getItemCount(): Int = listaTipoDePlatos.size

    inner class TipoDePlatoAdapterViewHolder(private val binding: ItemTipoPlatoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: TipoDePlato) {
            val color = when (data.dificultad) {
                1 -> R.color.green
                2 -> R.color.yellow
                3 -> R.color.red
                else -> R.color.red
            }

            binding.textViewRecetaMenuNombre.text = data.titulo
            binding.textViewRecetaMenuDescripcion.text = data.descripcion
            binding.imageViewRecetaMenu.setImageResource(data.imagen)
            binding.textViewRecetaTiempoMenu.text = data.tiempoDePreparacion
            context?.let {
                binding.dificultad.setBackgroundColor(
                    ContextCompat.getColor(
                        it,
                        color
                    )
                )
            }
        }
    }

    fun addRecetaMenus(newListaDePlatos: List<TipoDePlato>) {
        listaTipoDePlatos.clear()
        listaTipoDePlatos.addAll(newListaDePlatos)
    }
}