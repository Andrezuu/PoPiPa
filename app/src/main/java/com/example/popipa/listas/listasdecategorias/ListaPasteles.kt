package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesBrowniesDeChocolates
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesCheesecakeDeFresa
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesCupcakesDeLimon
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesMousseDeChocolate
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesPastelDeChocolate
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesPastelDeVainilla
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesPastelDeZanahoria
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesTartaDeManzana
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesTartaDeQuesoClasica
import com.example.popipa.listas.listasdeingredientesporcategoria.Pasteles.IngredientesTiramisu

class ListaPasteles {
    companion object {
        val listaPasteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Pastel de Chocolate",
                "Delicioso pastel de chocolate esponjoso con ganache de chocolate. Perfecto para satisfacer tu antojo de chocolate.",
                "pasteldechocolate",
                "45 min",
                1,
                false,
                IngredientesPastelDeChocolate.listaPastelChocolate
            ),
            TipoDePlato(
                "Pastel de Vainilla",
                "Pastel de vainilla con capas de crema de vainilla y fresas frescas. Un postre clásico que agrada a todos los paladares.",
                "pasteldevainilla",
                "60 min",
                2,
                false,
                IngredientesPastelDeVainilla.listaPastelVainilla
            ),
            TipoDePlato(
                "Tarta de Manzana",
                "Tarta de manzana con una base de hojaldre crujiente y relleno de manzanas caramelizadas. Un postre reconfortante y delicioso.",
                "tartademanzana",
                "50 min",
                2,
                false,
                IngredientesTartaDeManzana.listaTartaManzana

            ),
            TipoDePlato(
                "Cheesecake de Fresa",
                "Cheesecake de fresa con una base de galletas y una capa de puré de fresas frescas. Un postre suave y frutal que encanta a todos.",
                "cheessecakedefresa",
                "35 min",
                2,
                false,
                IngredientesCheesecakeDeFresa.listaCheesecakeFresa
            ),
            TipoDePlato(
                "Tiramisú",
                "Tiramisú clásico con capas de bizcochos empapados en café y crema de mascarpone. Un postre italiano que deleita a los amantes del café.",
                "tiramisu",
                "40 min",
                2,
                false,
                IngredientesTiramisu.listaTiramisu
            ),
            TipoDePlato(
                "Cupcakes de Limón",
                "Cupcakes esponjosos con sabor a limón y glaseado de crema de limón. Un postre individual refrescante y delicioso.",
                "cupcakesdelimon",
                "30 min",
                2,
                false,
                IngredientesCupcakesDeLimon.listaCupcakesDelimon
            ),
            TipoDePlato(
                "Mousse de Chocolate",
                "Mousse de chocolate sedoso y decadente. Un postre ligero y elegante para los amantes del chocolate.",
                "moussedechocolate",
                "25 min",
                2,
                false,
                IngredientesMousseDeChocolate.listaMousseChocolate
            ),
            TipoDePlato(
                "Pastel de Zanahoria",
                "Pastel de zanahoria con nueces y crema de queso. Un postre clásico con un toque saludable.",
                "pasteldezanahoria",
                "50 min",
                2,
                false,
                IngredientesPastelDeZanahoria.listaPastelZanahoria
            ),
            TipoDePlato(
                "Tarta de Queso Clásica",
                "Tarta de queso clásica con una base de galletas y un relleno suave y cremoso. Un postre que nunca pasa de moda.",
                "tartadequesoclasica",
                "40 min",
                2,
                false,
                IngredientesTartaDeQuesoClasica.listaTartaQuesoClasica
            ),
            TipoDePlato(
                "Brownies de Nuez",
                "Brownies de chocolate con nueces crujientes. Un postre indulgente y reconfortante para los amantes del chocolate.",
                "browniesdenuez",
                "30 min",
                2,
                false,
                IngredientesBrowniesDeChocolates.listaBrowniesChocolate
            )
        )
    }

}