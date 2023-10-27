package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosCevichePescado {
    companion object {
        val pasosDePreparacionCeviche = listOf(
            PasoDePreparación(
                1,
                "Marinar el pescado: En un tazón grande, combine 300 gramos de filete de pescado cortado en cubos con el jugo exprimido de 8 limones. Deje marinar el pescado en el jugo de limón durante aproximadamente 15-20 minutos hasta que el pescado cambie de color y esté cocido en el ácido.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Agregar los ingredientes: Agregue 1/2 cebolla morada en rodajas finas, 1 ají limo picado en rodajas finas, 1/2 taza de cilantro fresco picado, 2 dientes de ajo picados finamente, 1 cucharadita de jengibre rallado, sal y pimienta al gusto. Mezcle bien.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Servir el ceviche: Sirva el ceviche en platos individuales, decorado con rodajas de camote y choclo cocidos. ¡Disfrute de su fresco y delicioso ceviche!",
                R.drawable.pasteles
            )
        )
    }

}