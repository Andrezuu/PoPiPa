package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaAlmuerzos {
    companion object {
        val listaAlmuerzos = listOf<TipoDePlato>(
            TipoDePlato(
                "Pollo a la Parrilla",
                "Delicioso pollo a la parrilla con marinada de hierbas y limón. Acompañado de verduras asadas, una comida ligera y sabrosa para el almuerzo.",
                R.drawable.almuerzo_pollo_parrilla,
                "30 min",
                1,
                false
            ),
            TipoDePlato(
                "Ensalada César",
                "Ensalada clásica César con lechuga romana, aderezo especial, crutones y queso parmesano. Una opción fresca y satisfactoria para el almuerzo.",
                R.drawable.almuerzo_ensalada_cesar,
                "20 min",
                1,
                false
            ),
            TipoDePlato(
                "Sándwich de Pavo",
                "Sándwich relleno de pavo, aguacate, tocino y condimentos. Ideal para un almuerzo rápido y delicioso.",
                R.drawable.almuerzo_sandwich_pavo,
                "15 min",
                1,
                false
            ),
            TipoDePlato(
                "Pasta Primavera",
                "Pasta con una mezcla de verduras de temporada y salsa de ajo y aceite de oliva. Un plato de pasta ligero y repleto de sabor.",
                R.drawable.almuerzo_pasta_primavera,
                "25 min",
                2,
                false
            ),
            TipoDePlato(
                "Sopa de Lentejas",
                "Sopa de lentejas con verduras, tomates y especias. Una opción reconfortante y saludable para el almuerzo.",
                R.drawable.almuerzo_sopa_lentejas,
                "30 min",
                2,
                false
            ),
            TipoDePlato(
                "Burritos de Pollo",
                "Burritos rellenos de pollo marinado, arroz, frijoles y guarniciones. Una comida rápida y deliciosa para el almuerzo.",
                R.drawable.almuerzo_burritos_pollo,
                "20 min",
                2,
                false
            ),
            TipoDePlato(
                "Poke Bowl",
                "Poke Bowl con pescado crudo, arroz, aguacate y verduras frescas. Una opción saludable y exquisita para el almuerzo.",
                R.drawable.almuerzo_poke_bowl,
                "20 min",
                2,
                false
            ),
            TipoDePlato(
                "Hamburguesa Vegetariana",
                "Hamburguesa vegetariana a base de garbanzos, espinacas y condimentos. Ideal para un almuerzo sin carne pero lleno de sabor.",
                R.drawable.almuerzo_hamburguesa_vegetariana,
                "25 min",
                2,
                false
            ),
            TipoDePlato(
                "Pollo al Curry",
                "Pollo al curry con arroz basmati y verduras. Una comida con un toque exótico para el almuerzo.",
                R.drawable.almuerzo_pollo_curry,
                "30 min",
                2,
                false
            ),
            TipoDePlato(
                "Tacos de Carne",
                "Tacos de carne asada con tortillas de maíz y guarniciones. Una opción sabrosa para disfrutar del almuerzo al estilo mexicano.",
                R.drawable.almuerzo_tacos_carne,
                "25 min",
                2,
                false
            )
        )
    }
}