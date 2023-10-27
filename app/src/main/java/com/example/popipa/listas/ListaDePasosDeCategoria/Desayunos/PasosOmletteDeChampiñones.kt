package com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos

import com.example.popipa.R
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparación


class PasosOmletteDeChampiñones {
    companion object {
        val pasosDePreparacionOmeletteChampinones = listOf(
            PasoDePreparación(
                1,
                "En un tazón, bate los huevos hasta que estén bien mezclados. Agrega sal y pimienta negra molida al gusto.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                2,
                "En una sartén antiadherente, calienta el aceite de oliva a fuego medio. Agrega la cebolla picada y los champiñones en láminas. Sofríelos hasta que estén tiernos y dorados.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                3,
                "Vierte los huevos batidos sobre los champiñones y la cebolla en la sartén. Cocina a fuego medio-bajo sin revolver durante unos minutos hasta que los huevos estén cocidos en la parte inferior.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                4,
                "Si lo deseas, espolvorea queso rallado sobre la mitad del omelette. Dobla la otra mitad sobre el queso y cocina por unos minutos adicionales hasta que el queso se derrita.",
                R.drawable.pasteles
            ),
            PasoDePreparación(
                5,
                "Espolvorea perejil picado por encima si lo deseas, y luego sirve el omelette con champiñones caliente.",
                R.drawable.pasteles
            )
        )
    }

}