package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClases.RecetaMenu
import com.example.popipa.databinding.ItemRecetaUsuarioBinding

class RecetasUsuarioAdapter: RecyclerView.Adapter<RecetasUsuarioAdapter.RecetasUsuarioAdapterViewHolder>(){

    private var onClickListener:OnClickListener? = null
    private var context:Context?  =null
    private var listaRecetasUsuario = mutableListOf<RecetaMenu>()


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
    }
    override fun getItemCount(): Int = listaRecetasUsuario.size


    inner class RecetasUsuarioAdapterViewHolder(private val binding: ItemRecetaUsuarioBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: RecetaMenu) {
           /* val color = when (data.dificultad) {
                1 -> R.color.green
                2 -> R.color.yellow
                3 -> R.color.red
                else -> R.color.red
            }*/

            binding.imagenPlato.setImageResource(data.image)
            binding.recetaTitulo.text = data.nombre
            binding.recetaDescripcion.text = data.descripcion
        }
    }

    fun addRecetaUsuarioMenu(newRecetaMenus: List<RecetaMenu>) {
        listaRecetasUsuario.clear()
        listaRecetasUsuario.addAll(newRecetaMenus)
    }

}