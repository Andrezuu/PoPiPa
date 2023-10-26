package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesBrowniesDeChocolates
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesCheesecakeDeFresa
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesCupcakesDeLimon
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesMousseDeChocolate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesPastelDeChocolate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesPastelDeVainilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesPastelDeZanahoria
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesTartaDeManzana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesTartaDeQuesoClasica
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.IngredientesTiramisu

class ListaPasteles {
    companion object {
        val listaPasteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Pastel de Chocolate",
                "Delicioso pastel de chocolate esponjoso con ganache de chocolate. Perfecto para satisfacer tu antojo de chocolate.",
                R.drawable.navidad,
                "45 min",
                1,
                false,
                IngredientesPastelDeChocolate.listaPastelChocolate
            ),
            TipoDePlato(
                "Pastel de Vainilla",
                "Pastel de vainilla con capas de crema de vainilla y fresas frescas. Un postre clásico que agrada a todos los paladares.",
                R.drawable.navidad,
                "60 min",
                2,
                false,
                IngredientesPastelDeVainilla.listaPastelVainilla
            ),
            TipoDePlato(
                "Tarta de Manzana",
                "Tarta de manzana con una base de hojaldre crujiente y relleno de manzanas caramelizadas. Un postre reconfortante y delicioso.",
                R.drawable.navidad,
                "50 min",
                2,
                false,
                IngredientesTartaDeManzana.listaTartaManzana

            ),
            TipoDePlato(
                "Cheesecake de Fresa",
                "Cheesecake de fresa con una base de galletas y una capa de puré de fresas frescas. Un postre suave y frutal que encanta a todos.",
                R.drawable.navidad,
                "35 min",
                2,
                false,
                IngredientesCheesecakeDeFresa.listaCheesecakeFresa
            ),
            TipoDePlato(
                "Tiramisú",
                "Tiramisú clásico con capas de bizcochos empapados en café y crema de mascarpone. Un postre italiano que deleita a los amantes del café.",
                R.drawable.navidad,
                "40 min",
                2,
                false,
                IngredientesTiramisu.listaTiramisu
            ),
            TipoDePlato(
                "Cupcakes de Limón",
                "Cupcakes esponjosos con sabor a limón y glaseado de crema de limón. Un postre individual refrescante y delicioso.",
                R.drawable.navidad,
                "30 min",
                2,
                false,
                IngredientesCupcakesDeLimon.listaCupcakesDelimon
            ),
            TipoDePlato(
                "Mousse de Chocolate",
                "Mousse de chocolate sedoso y decadente. Un postre ligero y elegante para los amantes del chocolate.",
                R.drawable.navidad,
                "25 min",
                2,
                false,
                IngredientesMousseDeChocolate.listaMousseChocolate
            ),
            TipoDePlato(
                "Pastel de Zanahoria",
                "Pastel de zanahoria con nueces y crema de queso. Un postre clásico con un toque saludable.",
                R.drawable.navidad,
                "50 min",
                2,
                false,
                IngredientesPastelDeZanahoria.listaPastelZanahoria
            ),
            TipoDePlato(
                "Tarta de Queso Clásica",
                "Tarta de queso clásica con una base de galletas y un relleno suave y cremoso. Un postre que nunca pasa de moda.",
                R.drawable.navidad,
                "40 min",
                2,
                false,
                IngredientesTartaDeQuesoClasica.listaTartaQuesoClasica
            ),
            TipoDePlato(
                "Brownies de Nuez",
                "Brownies de chocolate con nueces crujientes. Un postre indulgente y reconfortante para los amantes del chocolate.",
                R.drawable.navidad,
                "30 min",
                2,
                false,
                IngredientesBrowniesDeChocolates.listaBrowniesChocolate
            )
        )
    }

}