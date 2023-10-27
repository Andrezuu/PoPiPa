package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion

class PasosTacosPastor {
    companion object {
        val pasosDePreparacionTacosPastor = listOf(
            PasoDePreparacion(
                1,
                "Marinar la carne: En un tazón, mezcla la carne de cerdo con el achiote, sal y pimienta. Asegúrate de que la carne esté bien cubierta con la marinada y refrigérala durante al menos 2 horas o toda la noche.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                2,
                "Asar la carne: En una parrilla caliente o en un comal, cocina la carne de cerdo marinada hasta que esté dorada y cocida.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                3,
                "Preparar las tortillas: Calienta las tortillas de maíz en un comal o sartén hasta que estén calientes y flexibles.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                4,
                "Armar los tacos: Coloca la carne asada en el centro de cada tortilla, agrega trozos de piña, cebolla picada y cilantro fresco al gusto.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                5,
                "Servir: Acompaña los tacos al pastor con salsa de tomate y limones en cuartos. ¡Disfruta!",
                R.drawable.pasteles
            )
        )
    }

}