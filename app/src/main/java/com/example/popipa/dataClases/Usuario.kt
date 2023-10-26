package com.example.popipa.dataClases

import java.io.Serializable

data class Usuario(
    val nombres: String,
    val apellidos: String,
    val email: String,
    private val password: String
) : Serializable
