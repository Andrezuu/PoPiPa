package com.example.popipa.listas

import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.listas.listasdecategorias.ListaAlmuerzos
import com.example.popipa.listas.listasdecategorias.ListaCenas
import com.example.popipa.listas.listasdecategorias.ListaCocteles
import com.example.popipa.listas.listasdecategorias.ListaDesayunos
import com.example.popipa.listas.listasdecategorias.ListaHallowen
import com.example.popipa.listas.listasdecategorias.ListaNavidad
import com.example.popipa.listas.listasdecategorias.ListaPasteles
import com.example.popipa.listas.listasdecategorias.ListaUniversitario
import com.example.popipa.listas.listasdecategorias.ListasGalletas
import com.example.popipa.listas.listasdecategorias.ListasPan

class ListaCategoriasMenu {
    companion object {
        val listCategory = listOf<CategoriaTipoDePlato>(
            CategoriaTipoDePlato(
                "Desayunos",
                "desayunos",
                ListaDesayunos.listaTiposDeDesayuno
            ),
            CategoriaTipoDePlato(
                "Almuerzos",
                "almuerzos",
                ListaAlmuerzos.listaAlmuerzos
            ),
            CategoriaTipoDePlato(
                "Cenas",
                "cenas",
                ListaCenas.listaCenas
            ),
            CategoriaTipoDePlato(
                "Universitaria",
                "universitaria",
                ListaUniversitario.listaComidaUniversitarios
            ),
            CategoriaTipoDePlato(
                "Pasteles",
                "pasteles",
                ListaPasteles.listaPasteles
            ),
            CategoriaTipoDePlato(
                "Galletas",
                "galletas",
                ListasGalletas.listaGalletas
            ),
            CategoriaTipoDePlato(
                "Cocteles",
                "cocteles",
                ListaCocteles.listaCocteles
            ),
            CategoriaTipoDePlato(
                "Halloween",
                "halloween",
                ListaHallowen.listaHalloween
            ),
            CategoriaTipoDePlato(
                "Navidad",
                "navidad",
                ListaNavidad.listaNavidad
            ),
            CategoriaTipoDePlato(
                "Pan",
                "pan",
                ListasPan.listaPan
            )
        )
    }
}