package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaCenas {
    companion object {
        val listaCenas = listOf<TipoDePlato>(
            TipoDePlato(
                "Salmón a la Parrilla",
                "Filete de salmón a la parrilla con limón y eneldo. Acompañado de espárragos asados, una cena saludable y deliciosa.",
                R.drawable.cena_salmon_parrilla,
                "25 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Ensalada Caprese",
                "Ensalada Caprese con tomate, mozzarella y albahaca fresca. Aderezada con aceite de oliva y vinagre balsámico, una opción ligera y refrescante para la cena.",
                R.drawable.cena_ensalada_caprese,
                "15 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Wrap de Pollo",
                "Wrap relleno de pollo a la parrilla, lechuga, tomate y salsa de yogur. Ideal para una cena rápida y sabrosa.",
                R.drawable.cena_wrap_pollo,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pasta con Pesto",
                "Pasta con salsa de pesto de albahaca, piñones y queso parmesano. Una opción fácil y deliciosa para una cena reconfortante.",
                R.drawable.cena_pasta_pesto,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Sopa de Tomate",
                "Sopa de tomate casera con tomates maduros, cebolla y albahaca. Una elección cálida y reconfortante para la cena.",
                R.drawable.cena_sopa_tomate,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Tofu Salteado",
                "Tofu salteado con vegetales y salsa de soja. Una cena vegetariana llena de sabor y proteínas.",
                R.drawable.cena_tofu_salteado,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Pizza Margarita",
                "Pizza Margarita con tomate, mozzarella y albahaca fresca. Una cena clásica y deliciosa para compartir.",
                R.drawable.cena_pizza_margarita,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Hamburguesa de Pavo",
                "Hamburguesa de pavo con aguacate, lechuga y tomate. Una opción más saludable para disfrutar de una cena estilo hamburguesa.",
                R.drawable.cena_hamburguesa_pavo,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Curry de Garbanzos",
                "Curry de garbanzos con arroz basmati. Una cena vegetariana llena de sabor y especias.",
                R.drawable.cena_curry_garbanzos,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Tacos de Pescado",
                "Tacos de pescado a la parrilla con tortillas de maíz y salsa fresca. Una opción sabrosa para una cena al estilo mexicano.",
                R.drawable.cena_tacos_pescado,
                "25 min",
                Dificultad.MEDIO
            )
        )
    }

}