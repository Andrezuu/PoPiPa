package com.example.popipa.listas.ListaDeIngredientesDeRecomendacion

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparación

class PasosRavioles {
    companion object {
        val pasosDePreparacionRavioles = listOf(
            PasoDePreparación(
                1,
                "Cocinar los ravioles: Cocina 250 gramos de ravioles según las instrucciones del paquete hasta que estén al dente. Luego, escúrrelos y reserva.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "Preparar la salsa: En una sartén, calienta 2 cucharadas de aceite de oliva y saltea 2 dientes de ajo picados hasta que estén fragantes. Luego, agrega 1 taza de salsa de tomate y caliéntala.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Combinar los ravioles y la salsa: Mezcla los ravioles cocidos con la salsa de tomate caliente. Revuelve bien para cubrir los ravioles con la salsa.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Servir: Sirve los ravioles en platos individuales, espolvoreados con 1/2 taza de queso parmesano rallado y unas hojas de albahaca fresca. Añade sal y pimienta al gusto.",
                R.drawable.pasteles
            )
        )
    }

}