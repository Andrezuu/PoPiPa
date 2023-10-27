package com.example.popipa.dataClases

import java.io.Serializable

data class RecetaMenu(
    val nombre: String,
    val descripcion: String,
    val tiempo: String,
    val dificultad: Int, //1 facil verde, 2 medio amarillo, dificil rojo
    val image: Int
) : Serializable
//TODO Creo que ya no es necesaria?