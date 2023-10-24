package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaDesayunos {
    companion object {
        val listaTiposDeDesayuno = listOf<TipoDePlato>(
            TipoDePlato(
                "Tostadas con Aguacate",
                "Deliciosas tostadas de aguacate fresco acompañadas de huevos pochados. Una combinación perfecta para empezar el día con energía y sabor.",
                R.drawable.desayuno_tostadas_aguacate,
                "15 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Omelette de Champiñones",
                "Omelette relleno de champiñones salteados y queso derretido. Un desayuno abundante y delicioso para satisfacer tu apetito matutino.",
                R.drawable.desayuno_omelette_champinones,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Panqueques de Arándanos",
                "Panqueques esponjosos con arándanos frescos y sirope de arce. Una opción dulce y reconfortante para comenzar el día.",
                R.drawable.desayuno_panqueques_arandanos,
                "25 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Yogur con Frutas",
                "Yogur natural con una mezcla refrescante de frutas frescas y crujiente granola. Una elección saludable y rápida para las mañanas ocupadas.",
                R.drawable.desayuno_yogur_frutas,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Desayuno Continental",
                "Desayuno continental con croissants recién horneados, jamón, queso y una variedad de mermeladas. Un desayuno al estilo europeo para disfrutar con calma.",
                R.drawable.desayuno_continental,
                "15 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Tostadas Francesas",
                "Tostadas francesas bañadas en sirope de arce y decoradas con frutas frescas. Una opción indulgente y deliciosa para ocasiones especiales.",
                R.drawable.desayuno_tostadas_francesas,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Batido de Proteínas",
                "Batido de proteínas con plátano, espinacas y proteína en polvo. Ideal para los amantes del fitness y las mañanas activas.",
                R.drawable.desayuno_batido_proteinas,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Muesli con Nueces",
                "Muesli mezclado con nueces, miel y yogur cremoso. Una opción nutritiva y saciante para quienes buscan un desayuno saludable.",
                R.drawable.desayuno_muesli_nueces,
                "15 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Huevos Benedictinos",
                "Huevos Benedictinos servidos sobre muffins ingleses y cubiertos con salsa holandesa. Un desayuno sofisticado y sabroso.",
                R.drawable.desayuno_huevos_benedictinos,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Acai Bowl",
                "Bol de acai con granola, plátano, fresas y coco rallado. Un desayuno tropical y lleno de antioxidantes.",
                R.drawable.desayuno_acai_bowl,
                "10 min",
                Dificultad.FACIL
            )
        )
    }

}