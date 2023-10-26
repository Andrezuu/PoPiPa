package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.R
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredienteTofuSalteado
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesCurryDeGarbanzos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesEnsaladaCaprese
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesHamburguesaDePavo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesPastaconPesto
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesPizzaMargarita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesSalmonALaParrilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesSopaDeTomate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesTacosDePescado
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.IngredientesWrapDePollo

class ListaCenas {
    companion object {
        val listaCenas = listOf<TipoDePlato>(
            TipoDePlato(
                "Salmón a la Parrilla",
                "Filete de salmón a la parrilla con limón y eneldo. Acompañado de espárragos asados, una cena saludable y deliciosa.",
                R.drawable.pasteles,
                "25 min",
                1,
                false,
                IngredientesSalmonALaParrilla.listaSalmonParrilla
            ),
            TipoDePlato(
                "Ensalada Caprese",
                "Ensalada Caprese con tomate, mozzarella y albahaca fresca. Aderezada con aceite de oliva y vinagre balsámico, una opción ligera y refrescante para la cena.",
                R.drawable.pasteles,
                "15 min",
                1,
                false,
                IngredientesEnsaladaCaprese.listaEnsaladaCaprese
            ),
            TipoDePlato(
                "Wrap de Pollo",
                "Wrap relleno de pollo a la parrilla, lechuga, tomate y salsa de yogur. Ideal para una cena rápida y sabrosa.",
                R.drawable.pasteles,
                "20 min",
                1,
                false,
                IngredientesWrapDePollo.listaWrapPollo
            ),
            TipoDePlato(
                "Pasta con Pesto",
                "Pasta con salsa de pesto de albahaca, piñones y queso parmesano. Una opción fácil y deliciosa para una cena reconfortante.",
                R.drawable.pasteles,
                "20 min",
                2,
                false,
                IngredientesPastaconPesto.listaPastaConPesto
            ),
            TipoDePlato(
                "Sopa de Tomate",
                "Sopa de tomate casera con tomates maduros, cebolla y albahaca. Una elección cálida y reconfortante para la cena.",
                R.drawable.pasteles,
                "30 min",
                2,
                false,
                IngredientesSopaDeTomate.listaSopaTomate
            ),
            TipoDePlato(
                "Tofu Salteado",
                "Tofu salteado con vegetales y salsa de soja. Una cena vegetariana llena de sabor y proteínas.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredienteTofuSalteado.listaTofuSalteado
            ),
            TipoDePlato(
                "Pizza Margarita",
                "Pizza Margarita con tomate, mozzarella y albahaca fresca. Una cena clásica y deliciosa para compartir.",
                R.drawable.pasteles,
                "20 min",
                2,
                false,
                IngredientesPizzaMargarita.listaPizzaMargarita
            ),
            TipoDePlato(
                "Hamburguesa de Pavo",
                "Hamburguesa de pavo con aguacate, lechuga y tomate. Una opción más saludable para disfrutar de una cena estilo hamburguesa.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredientesHamburguesaDePavo.listaHamburguesaPavo
            ),
            TipoDePlato(
                "Curry de Garbanzos",
                "Curry de garbanzos con arroz basmati. Una cena vegetariana llena de sabor y especias.",
                R.drawable.pasteles,
                "30 min",
                2,
                false,
                IngredientesCurryDeGarbanzos.listaCurryGarbanzos
            ),
            TipoDePlato(
                "Tacos de Pescado",
                "Tacos de pescado a la parrilla con tortillas de maíz y salsa fresca. Una opción sabrosa para una cena al estilo mexicano.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredientesTacosDePescado.listaTacosDePescado
            )
        )
    }

}