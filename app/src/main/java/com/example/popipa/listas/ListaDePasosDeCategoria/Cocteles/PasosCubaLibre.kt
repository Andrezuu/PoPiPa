package com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles

import com.example.popipa.R
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparación

class PasosCubaLibre {
    companion object {
        val pasosDePreparacionCubaLibre = listOf(
            PasoDePreparación(
                1,
                "Llena un vaso alto con hielo.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Vierte el ron blanco sobre el hielo.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Completa con Coca-Cola, dejando un poco de espacio en la parte superior del vaso.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Remueve suavemente para mezclar los ingredientes.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                5,
                "Decora con una rodaja de limón.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                6,
                "¡Disfruta tu Cuba Libre!",
                R.drawable.pasteles
            )
        )
    }

}