package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesCoctelFetsivo
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesEnsaladaFestiva
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesGalletasDeJengibre
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesGuisantesDeLaSuerte
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesJamonGlaseado
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesPastelDeFrutas
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesPavoRelleno
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesSalsaDeArandanos
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesSopaDePavo
import com.example.popipa.listas.listasdeingredientesporcategoria.Navidad.IngredientesTrufasDeChocolate

class ListaNavidad {
    companion object {
        val listaNavidad = listOf<TipoDePlato>(
            TipoDePlato(
                "Pavo Relleno",
                "Pavo asado relleno de hierbas y especias, servido con una variedad de guarniciones. Un plato tradicional para la cena de Navidad.",
                "pavorelleno",
                "180 min",
                2,
                false,
                IngredientesPavoRelleno.listaPavoRelleno

            ),
            TipoDePlato(
                "Sopa de Pavo",
                "Sopa de pavo casera con verduras y fideos. Una forma deliciosa de aprovechar los restos de pavo de la cena de Navidad.",
                "sopadepavo",
                "45 min",
                1,
                false,
                IngredientesSopaDePavo.listaSopaPavo
            ),
            TipoDePlato(
                "Ensalada Festiva",
                "Ensalada festiva con manzanas, nueces y aderezo de arándanos. El complemento perfecto para la cena de Navidad.",
                "ensaladafestiva",
                "20 min",
                1,
                false,
                IngredientesEnsaladaFestiva.listaEnsaladaFestiva
            ),
            TipoDePlato(
                "Jamón Glaseado",
                "Jamón glaseado con piña y clavos de olor. Una opción clásica y sabrosa para la cena navideña.",
                "jamonglaseado",
                "120 min",
                1,
                false,
                IngredientesJamonGlaseado.listaJamonGlaseado
            ),
            TipoDePlato(
                "Galletas de Jengibre",
                "Galletas de jengibre decoradas con glaseado. Un postre tradicional de Navidad para compartir con familiares y amigos.",
                "galletasdejengibre",
                "45 min",
                1,
                false,
                IngredientesGalletasDeJengibre.listaGalletasDeJengibre
            ),
            TipoDePlato(
                "Salsa de Arándanos",
                "Salsa casera de arándanos con un toque de naranja. Acompañamiento esencial para el pavo y otros platos de Navidad.",
                "salsadearandanos",
                "20 min",
                1,
                false,
                IngredientesSalsaDeArandanos.listaSalsaArandanos
            ),
            TipoDePlato(
                "Pastel de Frutas",
                "Pastel de frutas navideño con una mezcla de frutas secas y nueces. Un postre clásico que no puede faltar en la mesa de Navidad.",
                "pasteldefrutas",
                "180 min",
                2,
                false,
                IngredientesPastelDeFrutas.listaPastelFrutas
            ),
            TipoDePlato(
                "Coctel Festivo",
                "Coctel festivo de champán con frutas. Una bebida burbujeante para brindar en la celebración de Navidad.",
                "coctelfestivo",
                "10 min",
                1,
                false,
                IngredientesCoctelFetsivo.listaCoctelFestivoNavidad
            ),
            TipoDePlato(
                "Trufas de Chocolate",
                "Trufas de chocolate caseras con coberturas variadas. Un regalo dulce y elegante para la temporada navideña.",
                "trufasdechocolate",
                "60 min",
                2,
                false,
                IngredientesTrufasDeChocolate.listaTrufasDeChocolate
            ),
            TipoDePlato(
                "Guisantes de la Suerte",
                "Un plato de guisantes tiernos y sabrosos, una deliciosa tradición de la suerte.",
                "guisantesdelasuerte",
                "20 min",
                1,
                false,
                IngredientesGuisantesDeLaSuerte.listaGuisantesSuerte
            )
        )
    }
}