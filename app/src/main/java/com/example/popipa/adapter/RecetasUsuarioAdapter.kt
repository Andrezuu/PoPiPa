package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ItemRecetaUsuarioBinding

class RecetasUsuarioAdapter :
    RecyclerView.Adapter<RecetasUsuarioAdapter.RecetasUsuarioAdapterViewHolder>() {

    var onDeleteClick: ((Int) -> Unit)? = null
    var onRecetaClick: ((TipoDePlato) -> Unit)? = null
    private var context: Context? = null
    private var listaRecetasUsuario = mutableListOf<TipoDePlato>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecetasUsuarioAdapter.RecetasUsuarioAdapterViewHolder {
        context = parent.context
        return RecetasUsuarioAdapterViewHolder(
            ItemRecetaUsuarioBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: RecetasUsuarioAdapter.RecetasUsuarioAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaRecetasUsuario[position])
        holder.itemView.setOnClickListener {
            onRecetaClick?.invoke(listaRecetasUsuario[position])
        }

    }

    override fun getItemCount(): Int = listaRecetasUsuario.size


    inner class RecetasUsuarioAdapterViewHolder(val binding: ItemRecetaUsuarioBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: TipoDePlato) {


            binding.recetaTitulo.text = data.titulo
            binding.recetaDescripcion.text = data.descripcion
            binding.imagenPlato.setImageResource(R.drawable.add_imagen)
            binding.buttonDelete.setOnClickListener {
                onDeleteClick?.invoke(position)
            }
        }
    }

    fun addRecetaUsuarioMenu(newRecetaUsuarios: List<TipoDePlato>) {
        listaRecetasUsuario.clear()
        listaRecetasUsuario.addAll(newRecetaUsuarios)
    }

}