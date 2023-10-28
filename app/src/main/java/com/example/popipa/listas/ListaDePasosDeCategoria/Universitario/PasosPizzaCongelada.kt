package com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario

import com.example.popipa.R
import com.example.popipa.dataClases.PasoDePreparacion

class PasosPizzaCongelada {
    companion object {
        val pasosDePreparacionPizzaCongelada = listOf(
            PasoDePreparacion(
                1,
                "Precalentar el horno: Precaliente su horno a la temperatura recomendada en las instrucciones del paquete de la pizza congelada. Por lo general, se recomienda precalentar a 200-220°C (390-430°F).",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                2,
                "Preparar la pizza: Retire la pizza congelada del empaque y colóquela en una bandeja o directamente en la rejilla del horno, siguiendo las instrucciones del paquete.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                3,
                "Hornear la pizza: Hornee la pizza en el horno precalentado según las instrucciones del paquete. El tiempo de cocción puede variar según el tamaño y el tipo de pizza, pero generalmente toma de 10 a 15 minutos.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                4,
                "Comprobar la cocción: Verifique la pizza para asegurarse de que la masa esté dorada y crujiente, y que el queso esté derretido y burbujeante.",
                R.drawable.pasteles
            ),
            PasoDePreparacion(
                5,
                "Servir: Retire la pizza del horno con cuidado y córtela en porciones. Sirva caliente y disfrute de su pizza congelada recién horneada.",
                R.drawable.pasteles
            )
        )
    }


}