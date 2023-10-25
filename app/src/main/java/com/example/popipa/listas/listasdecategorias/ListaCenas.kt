package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredienteTofuSalteado
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesCurryDeGarbanzos
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesEnsaladaCaprese
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesHamburguesaDePavo
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesPastaconPesto
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesPizzaMargarita
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesSalmonALaParrilla
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesSopaDeTomate
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesTacosDePescado
import com.example.popipa.listas.listasdeingredientesporcategoria.Cenas.IngredientesWrapDePollo

class ListaCenas {
    companion object {
        val listaCenas = listOf<TipoDePlato>(
            TipoDePlato(
                "Salmón a la Parrilla",
                "Filete de salmón a la parrilla con limón y eneldo. Acompañado de espárragos asados, una cena saludable y deliciosa.",
                "salmonalaparrilla",
                "25 min",
                1,
                false,
                IngredientesSalmonALaParrilla.listaSalmonParrilla
            ),
            TipoDePlato(
                "Ensalada Caprese",
                "Ensalada Caprese con tomate, mozzarella y albahaca fresca. Aderezada con aceite de oliva y vinagre balsámico, una opción ligera y refrescante para la cena.",
                "ensaladacaprese",
                "15 min",
                1,
                false,
                IngredientesEnsaladaCaprese.listaEnsaladaCaprese
            ),
            TipoDePlato(
                "Wrap de Pollo",
                "Wrap relleno de pollo a la parrilla, lechuga, tomate y salsa de yogur. Ideal para una cena rápida y sabrosa.",
                "wrapdepollo",
                "20 min",
                1,
                false,
                IngredientesWrapDePollo.listaWrapPollo
            ),
            TipoDePlato(
                "Pasta con Pesto",
                "Pasta con salsa de pesto de albahaca, piñones y queso parmesano. Una opción fácil y deliciosa para una cena reconfortante.",
                "pastaconpesto",
                "20 min",
                2,
                false,
                IngredientesPastaconPesto.listaPastaConPesto
            ),
            TipoDePlato(
                "Sopa de Tomate",
                "Sopa de tomate casera con tomates maduros, cebolla y albahaca. Una elección cálida y reconfortante para la cena.",
                "sopadetomate",
                "30 min",
                2,
                false,
                IngredientesSopaDeTomate.listaSopaTomate
            ),
            TipoDePlato(
                "Tofu Salteado",
                "Tofu salteado con vegetales y salsa de soja. Una cena vegetariana llena de sabor y proteínas.",
                "tofusalteado",
                "25 min",
                2,
                false,
                IngredienteTofuSalteado.listaTofuSalteado
            ),
            TipoDePlato(
                "Pizza Margarita",
                "Pizza Margarita con tomate, mozzarella y albahaca fresca. Una cena clásica y deliciosa para compartir.",
                "pizzamargarita",
                "20 min",
                2,
                false,
                IngredientesPizzaMargarita.listaPizzaMargarita
            ),
            TipoDePlato(
                "Hamburguesa de Pavo",
                "Hamburguesa de pavo con aguacate, lechuga y tomate. Una opción más saludable para disfrutar de una cena estilo hamburguesa.",
                "hamburguesadepavo",
                "25 min",
                2,
                false,
                IngredientesHamburguesaDePavo.listaHamburguesaPavo
            ),
            TipoDePlato(
                "Curry de Garbanzos",
                "Curry de garbanzos con arroz basmati. Una cena vegetariana llena de sabor y especias.",
                "currydegarbanzos",
                "30 min",
                2,
                false,
                IngredientesCurryDeGarbanzos.listaCurryGarbanzos
            ),
            TipoDePlato(
                "Tacos de Pescado",
                "Tacos de pescado a la parrilla con tortillas de maíz y salsa fresca. Una opción sabrosa para una cena al estilo mexicano.",
                "tacosdepercado",
                "25 min",
                2,
                false,
                IngredientesTacosDePescado.listaTacosDePescado
            )
        )
    }

}