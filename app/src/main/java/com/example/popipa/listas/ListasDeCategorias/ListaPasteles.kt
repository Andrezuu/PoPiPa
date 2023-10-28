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
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosBrowniesDeChocolates
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosCheesecakeDeFresa
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosCupcakesDeLimon
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosMousseDeChocolate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosPastelDeChocolate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosPastelDeVainilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosPastelDeZanahoria
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosTartaDeManzana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosTartaDeQuesoClasica
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pasteles.PasosTiramisu

class ListaPasteles {
    companion object {
        val listaPasteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Pastel de Chocolate",
                "Delicioso pastel de chocolate esponjoso con ganache de chocolate. Perfecto para satisfacer tu antojo de chocolate.",
                R.drawable.pastel_de_chocolate,
                "45 min",
                1,
                false,
                IngredientesPastelDeChocolate.listaPastelChocolate,
                PasosPastelDeChocolate.pasosDePreparacionPastelDeChocolate
            ),
            TipoDePlato(
                "Pastel de Vainilla",
                "Pastel de vainilla con capas de crema de vainilla y fresas frescas. Un postre clásico que agrada a todos los paladares.",
                R.drawable.pastel_de_de_vainilla,
                "60 min",
                2,
                false,
                IngredientesPastelDeVainilla.listaPastelVainilla,
                PasosPastelDeVainilla.pasosDePreparacionPastelDeVainilla
            ),
            TipoDePlato(
                "Tarta de Manzana",
                "Tarta de manzana con una base de hojaldre crujiente y relleno de manzanas caramelizadas. Un postre reconfortante y delicioso.",
                R.drawable.tarta_de_manzana,
                "50 min",
                2,
                false,
                IngredientesTartaDeManzana.listaTartaManzana,
                PasosTartaDeManzana.pasosDePreparacionTartaDeManzana

            ),
            TipoDePlato(
                "Cheesecake de Fresa",
                "Cheesecake de fresa con una base de galletas y una capa de puré de fresas frescas. Un postre suave y frutal que encanta a todos.",
                R.drawable.cheesecake_de_fresas,
                "35 min",
                2,
                false,
                IngredientesCheesecakeDeFresa.listaCheesecakeFresa,
                PasosCheesecakeDeFresa.pasosDePreparacionCheesecakeDeFresa
            ),
            TipoDePlato(
                "Tiramisú",
                "Tiramisú clásico con capas de bizcochos empapados en café y crema de mascarpone. Un postre italiano que deleita a los amantes del café.",
                R.drawable.tiramisu,
                "40 min",
                2,
                false,
                IngredientesTiramisu.listaTiramisu,
                PasosTiramisu.pasosDePreparacionTiramisu
            ),
            TipoDePlato(
                "Cupcakes de Limón",
                "Cupcakes esponjosos con sabor a limón y glaseado de crema de limón. Un postre individual refrescante y delicioso.",
                R.drawable.cupcakes_de_limon,
                "30 min",
                2,
                false,
                IngredientesCupcakesDeLimon.listaCupcakesDelimon,
                PasosCupcakesDeLimon.pasosDePreparacionCupcakesDeLimonyArándanos
            ),
            TipoDePlato(
                "Mousse de Chocolate",
                "Mousse de chocolate sedoso y decadente. Un postre ligero y elegante para los amantes del chocolate.",
                R.drawable.mousse_de_chocolate,
                "25 min",
                2,
                false,
                IngredientesMousseDeChocolate.listaMousseChocolate,
                PasosMousseDeChocolate.pasosDePreparacionMousseDeChocolate
            ),
            TipoDePlato(
                "Pastel de Zanahoria",
                "Pastel de zanahoria con nueces y crema de queso. Un postre clásico con un toque saludable.",
                R.drawable.pastel_de_zanahoria,
                "50 min",
                2,
                false,
                IngredientesPastelDeZanahoria.listaPastelZanahoria,
                PasosPastelDeZanahoria.pasosDePreparacionPastelDeZanahoria
            ),
            TipoDePlato(
                "Tarta de Queso Clásica",
                "Tarta de queso clásica con una base de galletas y un relleno suave y cremoso. Un postre que nunca pasa de moda.",
                R.drawable.tarta_de_queso_clasica,
                "40 min",
                2,
                false,
                IngredientesTartaDeQuesoClasica.listaTartaQuesoClasica,
                PasosTartaDeQuesoClasica.pasosDePreparacionTartaDeQuesoClasica
            ),
            TipoDePlato(
                "Brownies de Nuez",
                "Brownies de chocolate con nueces crujientes. Un postre indulgente y reconfortante para los amantes del chocolate.",
                R.drawable.brownies_de_nuez,
                "30 min",
                2,
                false,
                IngredientesBrowniesDeChocolates.listaBrowniesChocolate,
                PasosBrowniesDeChocolates.pasosDePreparacionBrowniesDeChocolate
            )
        )
    }

}