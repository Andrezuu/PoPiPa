package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosTacosSuadero {
    companion object {
        val pasosDePreparacionSuadero = listOf(
            PasoDePreparación(
                1,
                "Freír la carne: Calienta aceite vegetal en una sartén grande. Fría las tiras de carne de suadero hasta que estén doradas y crujientes.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Preparar las tortillas: Calienta las tortillas de maíz en un comal o sartén hasta que estén calientes y flexibles.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Armar los tacos: Coloca la carne de suadero en el centro de cada tortilla. Agrega cebolla picada, cilantro fresco y salsa de tu elección al gusto.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Servir: Exprime jugo de limón sobre los tacos y sazona con sal al gusto. Sirve los tacos de suadero calientes.",
                R.drawable.pasteles
            )
        )
    }


}