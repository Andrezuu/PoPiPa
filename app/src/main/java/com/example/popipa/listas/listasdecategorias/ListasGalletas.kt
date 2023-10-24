package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListasGalletas {
    companion object {
        val listaGalletas = listOf<TipoDePlato>(
            TipoDePlato(
                "Galletas de Chocolate",
                "Galletas crujientes de chocolate con trozos de chocolate derretido en cada bocado. Un placer irresistible para los amantes del chocolate.",
                R.drawable.galletas_chocolate,
                "30 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Galletas de Avena y Pasas",
                "Galletas suaves de avena con pasas jugosas. Una merienda saludable y deliciosa para disfrutar en cualquier momento del día.",
                R.drawable.galletas_avena_pasas,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Galletas de Mantequilla",
                "Galletas de mantequilla con una textura que se deshace en la boca. Perfectas para acompañar un café o té.",
                R.drawable.galletas_mantequilla,
                "15 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Galletas de Almendra",
                "Galletas crujientes de almendra con un delicado sabor a almendras tostadas. Un manjar para los amantes de las almendras.",
                R.drawable.galletas_almendra,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas de Avena y Miel",
                "Galletas de avena endulzadas con miel y con un toque de canela. Una opción reconfortante y saludable para la merienda.",
                R.drawable.galletas_avena_miel,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas de Mantequilla de Maní",
                "Galletas suaves de mantequilla de maní con un corazón de chocolate. Irresistibles para los amantes del maní y el chocolate.",
                R.drawable.galletas_mantequilla_mani,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas de Azúcar",
                "Galletas de azúcar decoradas con glaseado colorido. Perfectas para celebraciones y eventos especiales.",
                R.drawable.galletas_azucar,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas de Limón",
                "Galletas de limón con un toque refrescante y espolvoreadas con azúcar en polvo. Ideales para disfrutar con una taza de té.",
                R.drawable.galletas_limon,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas de Avena y Nueces",
                "Galletas de avena con trozos de nueces crujientes. Una opción saludable y llena de sabor para tus meriendas.",
                R.drawable.galletas_avena_nueces,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Galletas de Jengibre",
                "Galletas de jengibre con forma de personas y decoradas con glaseado. Clásicas en la temporada navideña.",
                R.drawable.galletas_jengibre,
                "35 min",
                Dificultad.MEDIO
            )
        )
    }

}