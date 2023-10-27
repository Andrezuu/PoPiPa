package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosMedialunas {
    companion object {
        val pasosDePreparacionMediaLuna = listOf(
            PasoDePreparación(
                1,
                "Rellenar la masa: Extiende la masa para empanadas y coloca sobre ella lonchas de jamón y queso suizo, rodajas finas de tomate, y hojas de lechuga.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Doblar la masa: Doble la masa por la mitad, cubriendo los ingredientes, formando así una media luna.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Sellar y hornear: Selle los bordes de la media luna presionando con un tenedor. Hornee hasta que la masa esté dorada y crujiente.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Servir con aderezos: Sirva las medias lunas con 2 cucharadas de mayonesa y 2 cucharaditas de mostaza. ¡Listo para disfrutar!",
                R.drawable.pasteles
            )
        )
    }

}