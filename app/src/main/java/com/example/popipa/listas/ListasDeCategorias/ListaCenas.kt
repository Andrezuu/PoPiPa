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
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosCurryDeGarbanzos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosEnsaladaCaprese
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosHamburguesaDePavo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosPastaconPesto
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosPizzaMargarita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosSalmonALaParrilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosSopaDeTomate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosTacosDePescado
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosTofuSalteado
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cenas.PasosWrapDePollo

class ListaCenas {
    companion object {
        val listaCenas = listOf<TipoDePlato>(
            TipoDePlato(
                "Salmón a la Parrilla",
                "Filete de salmón a la parrilla con limón y eneldo. Acompañado de espárragos asados, una cena saludable y deliciosa.",
                R.drawable.salmon_a_la_parrilla,
                "25 min",
                1,
                false,
                IngredientesSalmonALaParrilla.listaSalmonParrilla,
                PasosSalmonALaParrilla.pasosDePreparacionSalmonParrilla
            ),
            TipoDePlato(
                "Ensalada Caprese",
                "Ensalada Caprese con tomate, mozzarella y albahaca fresca. Aderezada con aceite de oliva y vinagre balsámico, una opción ligera y refrescante para la cena.",
                R.drawable.ensalada_crepese,
                "15 min",
                1,
                false,
                IngredientesEnsaladaCaprese.listaEnsaladaCaprese,
                PasosEnsaladaCaprese.pasosDePreparacionEnsaladaCaprese
            ),
            TipoDePlato(
                "Wrap de Pollo",
                "Wrap relleno de pollo a la parrilla, lechuga, tomate y salsa de yogur. Ideal para una cena rápida y sabrosa.",
                R.drawable.wrap_de_polllo,
                "20 min",
                1,
                false,
                IngredientesWrapDePollo.listaWrapPollo,
                PasosWrapDePollo.pasosDePreparacionWrapPollo
            ),
            TipoDePlato(
                "Pasta con Pesto",
                "Pasta con salsa de pesto de albahaca, piñones y queso parmesano. Una opción fácil y deliciosa para una cena reconfortante.",
                R.drawable.pasta_con_pesto,
                "20 min",
                2,
                false,
                IngredientesPastaconPesto.listaPastaConPesto,
                PasosPastaconPesto.pasosDePreparacionPastaConPesto
            ),
            TipoDePlato(
                "Sopa de Tomate",
                "Sopa de tomate casera con tomates maduros, cebolla y albahaca. Una elección cálida y reconfortante para la cena.",
                R.drawable.sopa_de_tomate,
                "30 min",
                2,
                false,
                IngredientesSopaDeTomate.listaSopaTomate,
                PasosSopaDeTomate.pasosDePreparacionSopaTomate
            ),
            TipoDePlato(
                "Tofu Salteado",
                "Tofu salteado con vegetales y salsa de soja. Una cena vegetariana llena de sabor y proteínas.",
                R.drawable.tofu_salteado,
                "25 min",
                2,
                false,
                IngredienteTofuSalteado.listaTofuSalteado,
                PasosTofuSalteado.pasosDePreparacionTofuSalteado
            ),
            TipoDePlato(
                "Pizza Margarita",
                "Pizza Margarita con tomate, mozzarella y albahaca fresca. Una cena clásica y deliciosa para compartir.",
                R.drawable.pizza_margarita,
                "20 min",
                2,
                false,
                IngredientesPizzaMargarita.listaPizzaMargarita,
                PasosPizzaMargarita.pasosDePreparacionPizzaMargarita
            ),
            TipoDePlato(
                "Hamburguesa de Pavo",
                "Hamburguesa de pavo con aguacate, lechuga y tomate. Una opción más saludable para disfrutar de una cena estilo hamburguesa.",
                R.drawable.hamburguesa_de_pavo,
                "25 min",
                2,
                false,
                IngredientesHamburguesaDePavo.listaHamburguesaPavo,
                PasosHamburguesaDePavo.pasosDePreparacionHamburguesaPavo
            ),
            TipoDePlato(
                "Curry de Garbanzos",
                "Curry de garbanzos con arroz basmati. Una cena vegetariana llena de sabor y especias.",
                R.drawable.curry_de_garbanzos,
                "30 min",
                2,
                false,
                IngredientesCurryDeGarbanzos.listaCurryGarbanzos,
                PasosCurryDeGarbanzos.pasosDePreparacionCurryGarbanzos
            ),
            TipoDePlato(
                "Tacos de Pescado",
                "Tacos de pescado a la parrilla con tortillas de maíz y salsa fresca. Una opción sabrosa para una cena al estilo mexicano.",
                R.drawable.tacos_de_pescado,
                "25 min",
                2,
                false,
                IngredientesTacosDePescado.listaTacosDePescado,
                PasosTacosDePescado.pasosDePreparacionTacosDePescado
            )
        )
    }

}