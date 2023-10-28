package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion

class PasosPozoleVerde {
    companion object {
        val pasosDePreparacionPozoleVerde = listOf(
            PasoDePreparacion(
                1,
                "Cocinar el pollo: Cocina y desmenuza 500 gramos de pollo. Reserva el pollo cocido.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                2,
                "Preparar el maíz: Cocina 2 tazas de maíz pozolero (nixtamal) hasta que estén tiernas. Si lo deseas, puedes utilizar maíz enlatado previamente cocido.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                3,
                "Hacer el caldo: Combina el caldo de pollo, lechuga, rábanos, cebolla, ajo, salsa verde y el maíz cocido en una olla grande. Cocina a fuego lento hasta que los sabores se mezclen.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                4,
                "Servir: Sirve el pozole verde caliente, acompañado de tostadas de maíz, crema agria y pollo desmenuzado.",
                R.drawable.pasteles
            )
        )
    }

}