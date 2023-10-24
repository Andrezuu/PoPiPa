package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaPasteles {
    companion object {
        val listaPasteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Pastel de Chocolate",
                "Delicioso pastel de chocolate esponjoso con ganache de chocolate. Perfecto para satisfacer tu antojo de chocolate.",
                R.drawable.pastel_chocolate,
                "45 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pastel de Vainilla",
                "Pastel de vainilla con capas de crema de vainilla y fresas frescas. Un postre clásico que agrada a todos los paladares.",
                R.drawable.pastel_vainilla,
                "60 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Tarta de Manzana",
                "Tarta de manzana con una base de hojaldre crujiente y relleno de manzanas caramelizadas. Un postre reconfortante y delicioso.",
                R.drawable.tarta_manzana,
                "50 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Cheesecake de Fresa",
                "Cheesecake de fresa con una base de galletas y una capa de puré de fresas frescas. Un postre suave y frutal que encanta a todos.",
                R.drawable.cheesecake_fresa,
                "35 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Tiramisú",
                "Tiramisú clásico con capas de bizcochos empapados en café y crema de mascarpone. Un postre italiano que deleita a los amantes del café.",
                R.drawable.tiramisu,
                "40 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Cupcakes de Limón",
                "Cupcakes esponjosos con sabor a limón y glaseado de crema de limón. Un postre individual refrescante y delicioso.",
                R.drawable.cupcakes_limón,
                "30 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Mousse de Chocolate",
                "Mousse de chocolate sedoso y decadente. Un postre ligero y elegante para los amantes del chocolate.",
                R.drawable.mousse_chocolate,
                "25 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Galletas Caseras",
                "Galletas caseras con chispas de chocolate. Un regalo para cualquier momento del día.",
                R.drawable.galletas_caseras,
                "20 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Tarta de Queso Clásica",
                "Tarta de queso clásica con una base de galletas y un relleno suave y cremoso. Un postre que nunca pasa de moda.",
                R.drawable.tarta_queso_clasica,
                "40 min",
                Dificultad.MEDIO
            ),
            TipoDePlato(
                "Brownies de Nuez",
                "Brownies de chocolate con nueces crujientes. Un postre indulgente y reconfortante para los amantes del chocolate.",
                R.drawable.brownies_nuez,
                "30 min",
                Dificultad.MEDIO
            )
        )
    }

}