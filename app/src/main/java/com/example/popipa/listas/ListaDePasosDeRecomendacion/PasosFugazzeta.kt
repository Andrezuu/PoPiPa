package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosFugazzeta {
    companion object {
        val pasosDePreparacionFugazzeta = listOf(
            PasoDePreparación(
                1,
                "Preparar la base: Extienda la masa de pizza en una fuente para horno y reserve.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Preparar las cebollas: En una sartén, caliente 2 cucharadas de aceite de oliva y saltee las cebollas en rodajas finas hasta que estén doradas y caramelizadas. Sazone con sal y pimienta al gusto.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Armar la fugazzeta: Distribuya las cebollas caramelizadas sobre la masa de pizza. Luego, espolvoree 200 gramos de queso mozzarella rallado y 50 gramos de queso parmesano rallado. Agregue 1/2 taza de aceitunas verdes picadas y 1 cucharadita de orégano seco.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Hornear: Hornee la fugazzeta a 180°C (350°F) durante unos 20-25 minutos o hasta que la masa esté dorada y el queso esté derretido y burbujeante.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                5,
                "Servir: Corte la fugazzeta en porciones y sírvala caliente. ¡Disfrute de esta deliciosa pizza de cebolla y queso!",
                R.drawable.pasteles
            )
        )
    }

}