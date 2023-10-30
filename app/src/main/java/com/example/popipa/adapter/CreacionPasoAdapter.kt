package com.example.popipa.adapter

import android.view.ViewGroup
import android.content.Context
import android.text.Editable
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.databinding.ItemCreacionPasoBinding

class CreacionPasoAdapter : RecyclerView.Adapter<CreacionPasoAdapter.CreacionPasoAdapterViewHolder>() {

    private var context:Context?  =null
    private var listaPasosPlato = mutableListOf<PasoDePreparacion>()

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
        fun binding(data: PasoDePreparacion) {
            binding.descripcionPaso.text= Editable.Factory.getInstance().newEditable(data.descripcion)
            binding.numeroPaso.text= "Paso ${listaPasosPlato.size}"
            //binding.descripcionPaso.setText(data.descripcion)
            /*binding.descripcionPaso.text = "algo se"
            binding.imagenPlato.setImageResource(data.image)
            binding.recetaTitulo.text = data.nombre
            binding.recetaDescripcion.text = data.descripcion*/
        }
    }
    fun addPasoReceta(newPaso:List<PasoDePreparacion>){
            listaPasosPlato.clear()
            listaPasosPlato.addAll(newPaso)
            notifyDataSetChanged()

    }
    fun addPasoReceta2(paso: PasoDePreparacion) {
        listaPasosPlato.add(paso)
        notifyItemInserted(listaPasosPlato.size - 1)
    }
}