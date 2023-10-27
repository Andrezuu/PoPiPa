package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosPolloDisco {
    companion object {
        val pasosDePreparacionPolloDisco = listOf(
            PasoDePreparación(
                1,
                "Saltear el pollo: En una sartén grande tipo disco, calienta 2 cucharadas de aceite de oliva. Agrega 4 muslos de pollo deshuesados y en trozos y cocínalos hasta que estén dorados y cocidos por completo.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Añadir los vegetales: Agrega 1 pimiento rojo, 1 pimiento verde, 1 cebolla, 3 dientes de ajo y 2 tomates en cubos a la sartén. Cocina hasta que los vegetales estén tiernos.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Sazonar: Agrega 1 cucharadita de comino molido, 1 cucharadita de paprika, sal y pimienta al gusto. Mezcla bien para que los sabores se integren.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Servir: Sirve el pollo a la disco caliente y disfruta de esta deliciosa preparación.",
                R.drawable.pasteles
            )
        )
    }

}