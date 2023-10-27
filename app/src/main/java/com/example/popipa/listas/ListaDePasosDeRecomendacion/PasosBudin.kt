package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosBudin {
    companion object {
        val pasosDePreparacionBudinDePan = listOf(
            PasoDePreparación(
                1,
                "Remojar el pan: En un tazón grande, remoje 4 rebanadas de pan sin corteza en 2 tazas de leche durante unos minutos hasta que el pan esté suave.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Preparar la mezcla: En otro recipiente, mezcle 1 taza de azúcar, 4 huevos, 1 cucharadita de vainilla, 1/2 taza de pasas, 1 cucharadita de canela en polvo y 2 cucharadas de mantequilla derretida.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Mezclar todo: Agregue la mezcla de azúcar y huevos al pan remojado en leche y mezcle bien hasta obtener una mezcla homogénea.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Hornear el budín: Vierta la mezcla en un molde apto para horno y hornee a 180°C (350°F) durante aproximadamente 45-50 minutos o hasta que esté dorado y firme al tacto.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                5,
                "Enfriar y servir: Deje enfriar el budín de pan antes de cortarlo en porciones. ¡Sirva su budín de pan casero y disfrute!",
                R.drawable.pasteles
            )
        )
    }

}