package com.example.popipa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.popipa.dataClases.Ingrediente

class SpinnerIngredienteAdapter(context:Context, ingredientes:List<Ingrediente>):
    ArrayAdapter<Ingrediente>(context,0,ingredientes) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val ingrediente = getItem(position)
        val view = LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_item, parent, false)
        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = ingrediente?.nombre
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return getView(position, convertView, parent)
    }

}