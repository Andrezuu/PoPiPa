package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListasPan {
    companion object {
        val listaPan = listOf<TipoDePlato>(
            TipoDePlato(
                "Baguette de Queso y Hierbas",
                "Baguette recién horneado con queso derretido y hierbas aromáticas. Un pan delicioso y reconfortante para disfrutar en cualquier momento.",
                R.drawable.pan_baguette_queso_hierbas,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pan de Ajo",
                "Pan de ajo recién horneado con mantequilla de ajo y perejil. Un acompañamiento clásico y sabroso para muchas comidas.",
                R.drawable.pan_ajo,
                "15 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pan Integral",
                "Pan integral casero con semillas de chía, lino y avena. Una opción saludable y llena de fibra para el día a día.",
                R.drawable.pan_integral,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Bollos de Canela",
                "Bollos de canela glaseados y esponjosos. Un dulce panecillo perfecto para el desayuno o la merienda.",
                R.drawable.pan_bollos_canela,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Pan de Pita",
                "Pan de pita fresco y esponjoso para rellenar con tus ingredientes favoritos. Ideal para bocadillos y comidas ligeras.",
                R.drawable.pan_pita,
                "20 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Focaccia Italiana",
                "Focaccia de estilo italiano con aceite de oliva, romero y sal marina. Un pan plano y delicioso para compartir en la mesa.",
                R.drawable.pan_focaccia_italiana,
                "30 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Pan de Plátano",
                "Pan de plátano húmedo y repleto de trozos de plátano maduro. Un postre con sabor a frutas y textura suave.",
                R.drawable.pan_platano,
                "45 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Pan de Centeno",
                "Pan de centeno oscuro y denso con una corteza crujiente. Un pan robusto y lleno de sabor para acompañar comidas saladas.",
                R.drawable.pan_centeno,
                "40 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Chapata Artesanal",
                "Chapata artesanal con aceite de oliva, sal marina y una miga ligera. Un pan rústico y auténtico que te transporta a Italia.",
                R.drawable.pan_chapata_artesanal,
                "35 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Pan de Molde Integral",
                "Pan de molde integral con semillas de girasol y calabaza. Perfecto para bocadillos y sándwiches saludables.",
                R.drawable.pan_molde_integral,
                "30 min",
                Dificultad.FACIL
            )
        )
    }

}