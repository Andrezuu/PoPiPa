package com.example.popipa.listas

import com.example.popipa.R
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.listas.ListasDeCategorias.ListaAlmuerzos
import com.example.popipa.listas.ListasDeCategorias.ListaCenas
import com.example.popipa.listas.ListasDeCategorias.ListaCocteles
import com.example.popipa.listas.ListasDeCategorias.ListaDesayunos
import com.example.popipa.listas.ListasDeCategorias.ListaHallowen
import com.example.popipa.listas.ListasDeCategorias.ListaNavidad
import com.example.popipa.listas.ListasDeCategorias.ListaPasteles
import com.example.popipa.listas.ListasDeCategorias.ListaUniversitario
import com.example.popipa.listas.ListasDeCategorias.ListasGalletas
import com.example.popipa.listas.ListasDeCategorias.ListasPan

class ListaCategoriasMenu {
    companion object {
        val listCategory = listOf<CategoriaTipoDePlato>(
            CategoriaTipoDePlato(
                "Desayunos",
                R.drawable.pasteles,
                ListaDesayunos.listaTiposDeDesayuno
            ),
            CategoriaTipoDePlato(
                "Almuerzos",
                R.drawable.almuerzo,
                ListaAlmuerzos.listaAlmuerzos
            ),
            CategoriaTipoDePlato(
                "Cenas",
                R.drawable.cenas,
                ListaCenas.listaCenas
            ),
            CategoriaTipoDePlato(
                "Universitaria",
                R.drawable.universitaria,
                ListaUniversitario.listaComidaUniversitarios
            ),
            CategoriaTipoDePlato(
                "Pasteles",
                R.drawable.pasteles,
                ListaPasteles.listaPasteles
            ),
            CategoriaTipoDePlato(
                "Galletas",
                R.drawable.galletas,
                ListasGalletas.listaGalletas
            ),
            CategoriaTipoDePlato(
                "Cocteles",
                R.drawable.cocteles,
                ListaCocteles.listaCocteles
            ),
            CategoriaTipoDePlato(
                "Halloween",
                R.drawable.halloween,
                ListaHallowen.listaHalloween
            ),
            CategoriaTipoDePlato(
                "Navidad",
                R.drawable.navidad,
                ListaNavidad.listaNavidad
            ),
            CategoriaTipoDePlato(
                "Pan",
                R.drawable.pan,
                ListasPan.listaPan
            )
        )
    }
}