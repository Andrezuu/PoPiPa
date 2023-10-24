package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaUniversitario {
    companion object {
        val listaComidaUniversitarios = listOf<TipoDePlato>(
            TipoDePlato(
                "Sándwich de Jamón y Queso",
                "Un sándwich clásico con jamón, queso y condimentos. Listo en 5 minutos.",
                R.drawable.universitario_sandwich_jamon_queso,
                "5 min",
                2,
                Megusta = false
            ),
            TipoDePlato(
                "Ensalada de Pollo",
                "Ensalada fresca con pollo a la parrilla, lechuga y aderezo de tu elección. Preparada en 10 minutos.",
                R.drawable.universitario_ensalada_pollo,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pasta Instantánea",
                "Pasta instantánea con salsa de tomate y queso. Listo en 5 minutos.",
                R.drawable.universitario_pasta_instantanea,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Tacos Rápidos",
                "Tacos sencillos con carne molida, tortillas y guarniciones. Preparados en 15 minutos.",
                R.drawable.universitario_tacos_rapidos,
                "15 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Hamburguesa con Papas Fritas",
                "Hamburguesa clásica con papas fritas. Lista en 20 minutos.",
                R.drawable.universitario_hamburguesa_papas_fritas,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Arroz Frito con Vegetales",
                "Arroz frito con una mezcla de vegetales y salsa de soja. Preparado en 10 minutos.",
                R.drawable.universitario_arroz_frito_vegetales,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pizza Congelada",
                "Pizza congelada para hornear en el microondas o el horno. Lista en 5 minutos.",
                R.drawable.universitario_pizza_congelada,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Fideos Instantáneos",
                "Fideos instantáneos con caldo y verduras. Listos en 3 minutos.",
                R.drawable.universitario_fideos_instantaneos,
                "3 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Burrito de Desayuno",
                "Burrito con huevos revueltos, tocino y queso. Preparado en 10 minutos.",
                R.drawable.universitario_burrito_desayuno,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Tostadas con Aguacate",
                "Tostadas de aguacate con huevos pochados. Una opción saludable lista en 15 minutos.",
                R.drawable.universitario_tostadas_aguacate,
                "15 min",
                Dificultad.FACIL
            )
        )
    }

}