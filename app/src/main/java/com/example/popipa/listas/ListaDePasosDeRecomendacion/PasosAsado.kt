package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion

class PasosAsado {
    companion object {
        val pasosDePreparacionAsado = listOf(
            PasoDePreparacion(
                1,
                "Preparar la carne: Lave y sazone 1 kg de carne de res en trozos con 2 cucharaditas de sal y 1 cucharadita de pimienta.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                2,
                "Preparar la marinada: En un tazón, mezcle 4 dientes de ajo picados, 1 cebolla picada, 1 pimiento rojo en tiras, 1 pimiento verde en tiras y 2 cucharadas de aceite de oliva.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                3,
                "Marinar la carne: Vierta la marinada sobre la carne sazonada y asegúrese de que la carne esté bien cubierta. Deje marinar durante al menos 2 horas en el refrigerador.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                4,
                "Preparar la parrilla: Prepare el carbón para la parrilla y asegúrese de que esté bien caliente antes de colocar la carne.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                5,
                "Asar la carne: Coloque la carne marinada en la parrilla caliente y cocine a la parrilla hasta que esté dorada por fuera y cocida al punto deseado por dentro.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                6,
                "Servir el asado: Sirva el asado en un plato, decórelo con rodajas de limón y sírvalo con sus acompañamientos favoritos. ¡Disfrute de su delicioso asado!",
                R.drawable.pasteles
            )
        )
    }

}