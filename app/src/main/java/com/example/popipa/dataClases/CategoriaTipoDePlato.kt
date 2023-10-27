package com.example.popipa.dataClases

import java.io.Serializable

data class CategoriaTipoDePlato(
    val titulo: String,
    val imagen: Int,
    val listPlato: List<TipoDePlato>
) : Serializable
