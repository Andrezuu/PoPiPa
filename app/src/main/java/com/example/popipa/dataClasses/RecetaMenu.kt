package com.example.popipa.dataClasses

data class RecetaMenu(
    val nombre: String,
    val descripcion: String,
    val tiempo: String,
    val dificultad: Int, //1 facil verde, 2 medio amarillo, dificil rojo
    val image: Int

)
