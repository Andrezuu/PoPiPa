package com.example.popipa.dataClases

import java.io.Serializable

data class TipoDePlato(
    val titulo: String,
    val descripcion: String,
    val imagen: Int,
    val tiempoDePreparacion: String,
    val dificultad: Int, //1 facil , 2 media,3 dificil
    var Megusta: Boolean,
    val listIngrediente: List<Ingrediente>
    //val listPasos: List<PasoDePreparacion>
) : Serializable
