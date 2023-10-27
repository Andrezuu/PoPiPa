package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion

class PasosPozoleRojo {
    companion object {
        val pasosDePreparacionPozole = listOf(
            PasoDePreparacion(
                1,
                "Preparar el maíz: Cocina 500 gramos de maíz pozolero hasta que esté tierno. Si lo deseas, puedes utilizar maíz enlatado previamente cocido.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                2,
                "Cocinar la carne: Cocina y desmenuza 400 gramos de pierna de cerdo. Reserva la carne cocida.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                3,
                "Hacer el caldo: En una olla grande, combina el maíz cocido, la carne de cerdo desmenuzada, 1 cebolla picada, 2 dientes de ajo picados, 4 chiles guajillos molidos y 1 cucharadita de orégano. Cocina a fuego lento hasta que todos los sabores se mezclen.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                4,
                "Servir: Sirve el pozole caliente y acompáñalo con rábanos, lechuga, limón, salsa picante y sal al gusto.",
                R.drawable.pasteles
            )
        )
    }

}