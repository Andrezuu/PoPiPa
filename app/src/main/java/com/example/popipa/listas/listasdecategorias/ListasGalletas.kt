package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeAlmendra
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeAvenaYMiel
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeAvenaYNueces
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeAvenaYPasas
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeAzucar
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeChocolate
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeJengibre
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeLimon
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeMantequilla
import com.example.popipa.listas.listasdeingredientesporcategoria.Galletas.IngredientesGalletasDeMantequillaDeMani

class ListasGalletas {
    companion object {
        val listaGalletas = listOf<TipoDePlato>(
            TipoDePlato(
                "Galletas de Chocolate",
                "Galletas crujientes de chocolate con trozos de chocolate derretido en cada bocado. Un placer irresistible para los amantes del chocolate.",
                "galletasdechocolate",
                "30 min",
                1,
                false,
                IngredientesGalletasDeChocolate.listaGalletasChocolate
            ),
            TipoDePlato(
                "Galletas de Avena y Pasas",
                "Galletas suaves de avena con pasas jugosas. Una merienda saludable y deliciosa para disfrutar en cualquier momento del día.",
                "galletasdeavenaypasas",
                "20 min",
                1,
                false,
                IngredientesGalletasDeAvenaYPasas.listaGalletasAvenaPasas
            ),
            TipoDePlato(
                "Galletas de Mantequilla",
                "Galletas de mantequilla con una textura que se deshace en la boca. Perfectas para acompañar un café o té.",
                "galletasdemantequilla",
                "15 min",
                1,
                false,
                IngredientesGalletasDeMantequilla.listaGalletasMantequilla
            ),
            TipoDePlato(
                "Galletas de Almendra",
                "Galletas crujientes de almendra con un delicado sabor a almendras tostadas. Un manjar para los amantes de las almendras.",
                "galletasdealmendra",
                "25 min",
                1,
                false,
                IngredientesGalletasDeAlmendra.listaGalletasAlmendra
            ),
            TipoDePlato(
                "Galletas de Avena y Miel",
                "Galletas de avena endulzadas con miel y con un toque de canela. Una opción reconfortante y saludable para la merienda.",
                "galletasdeavenaymiel",
                "30 min",
                1,
                false,
                IngredientesGalletasDeAvenaYMiel.listaGalletasAvenaMiel
            ),
            TipoDePlato(
                "Galletas de Mantequilla de Maní",
                "Galletas suaves de mantequilla de maní con un corazón de chocolate. Irresistibles para los amantes del maní y el chocolate.",
                "mantequillademani",
                "20 min",
                1,
                false,
                IngredientesGalletasDeMantequillaDeMani.listaGalletasMantequillaMani
            ),
            TipoDePlato(
                "Galletas de Azúcar",
                "Galletas de azúcar decoradas con glaseado colorido. Perfectas para celebraciones y eventos especiales.",
                "galletasdeazucar",
                "30 min",
                1,
                false,
                IngredientesGalletasDeAzucar.listaGalletasAzucar
            ),
            TipoDePlato(
                "Galletas de Limón",
                "Galletas de limón con un toque refrescante y espolvoreadas con azúcar en polvo. Ideales para disfrutar con una taza de té.",
                "galletasdelimon",
                "25 min",
                1,
                false,
                IngredientesGalletasDeLimon.listaGalletasLimón
            ),
            TipoDePlato(
                "Galletas de Avena y Nueces",
                "Galletas de avena con trozos de nueces crujientes. Una opción saludable y llena de sabor para tus meriendas.",
                "galletasdeavenaynueces",
                "20 min",
                1,
                false,
                IngredientesGalletasDeAvenaYNueces.listaGalletasAvenaNueces
            ),
            TipoDePlato(
                "Galletas de Jengibre",
                "Galletas de jengibre con forma de personas y decoradas con glaseado. Clásicas en la temporada navideña.",
                "galletasdejengibre",
                "35 min",
                2,
                false,
                IngredientesGalletasDeJengibre.listaGalletasJengibre
            )
        )
    }

}