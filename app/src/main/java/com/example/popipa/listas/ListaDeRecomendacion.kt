package com.example.popipa.listas

import com.example.popipa.dataClases.TipoDePlato

class ListaDeRecomendacion {
    companion object {
    val listaTiposDeDesayuno = listOf<TipoDePlato>(
        TipoDePlato(
            "Tostadas con Aguacate",
            "Tostadas con aguacate fresco y huevos pochados.",
            R.drawable.desayuno_tostadas_aguacate,
            "15 min",
            Dificultad.FACIL
        ),
        TipoDePlato(
            "Omelette de Champiñones",
            "Omelette relleno de champiñones y queso.",
            R.drawable.desayuno_omelette_champinones,
            "20 min",
            Dificultad.MEDIO
        ),
        TipoDePlato(
            "Panqueques de Arándanos",
            "Panqueques esponjosos con arándanos frescos.",
            R.drawable.desayuno_panqueques_arandanos,
            "25 min",
            Dificultad.FACIL
        ),
        TipoDePlato(
            "Yogur con Frutas",
            "Yogur con mezcla de frutas frescas y granola.",
            R.drawable.desayuno_yogur_frutas,
            "10 min",
            Dificultad.FACIL
        ),
        TipoDePlato(
            "Desayuno Continental",
            "Desayuno continental con croissants, jamón y queso.",
            R.drawable.desayuno_continental,
            "15 min",
            Dificultad.MEDIO
        ),
        TipoDePlato(
            "Tostadas Francesas",
            "Tostadas francesas con sirope de arce y frutas.",
            R.drawable.desayuno_tostadas_francesas,
            "20 min",
            Dificultad.MEDIO
        ),
        TipoDePlato(
            "Batido de Proteínas",
            "Batido de proteínas con plátano y espinacas.",
            R.drawable.desayuno_batido_proteinas,
            "10 min",
            Dificultad.FACIL
        ),
        TipoDePlato(
            "Muesli con Nueces",
            "Muesli con nueces, miel y yogur.",
            R.drawable.desayuno_muesli_nueces,
            "15 min",
            Dificultad.MEDIO
        ),
        TipoDePlato(
            "Huevos Benedictinos",
            "Huevos benedictinos con salsa holandesa.",
            R.drawable.desayuno_huevos_benedictinos,
            "20 min",
            Dificultad.MEDIO
        ),
        TipoDePlato(
            "Acai Bowl",
            "Bol de acai con granola y frutas tropicales.",
            R.drawable.desayuno_acai_bowl,
            "10 min",
            Dificultad.FACIL
        )
    )
    }
}