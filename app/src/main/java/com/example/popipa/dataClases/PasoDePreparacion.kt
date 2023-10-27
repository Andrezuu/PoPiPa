package com.example.popipa.dataClases

import java.io.Serializable

data class PasoDePreparacion(
    val numero: Int, //ojo
    val descripcion: String,
    val viewpaso: Int
) : Serializable
