package com.example.popipa.dataClases

data class Receta(
    val tipoDePlato: TipoDePlato,
    val ingredientes: List<Ingrediente>,
    val pasosDePreparacion: List<PasoDePreparacion>
)
