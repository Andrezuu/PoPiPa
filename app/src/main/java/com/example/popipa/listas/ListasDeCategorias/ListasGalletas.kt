package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeAlmendra
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeAvenaYMiel
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeAvenaYNueces
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeAvenaYPasas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeAzucar
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeChocolate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeJengibre
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeLimon
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeMantequilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Galletas.IngredientesGalletasDeMantequillaDeMani

class ListasGalletas {
    companion object {
        val listaGalletas = listOf<TipoDePlato>(
            TipoDePlato(
                "Galletas de Chocolate",
                "Galletas crujientes de chocolate con trozos de chocolate derretido en cada bocado. Un placer irresistible para los amantes del chocolate.",
                R.drawable.navidad,
                "30 min",
                1,
                false,
                IngredientesGalletasDeChocolate.listaGalletasChocolate
            ),
            TipoDePlato(
                "Galletas de Avena y Pasas",
                "Galletas suaves de avena con pasas jugosas. Una merienda saludable y deliciosa para disfrutar en cualquier momento del día.",
                R.drawable.navidad,
                "20 min",
                1,
                false,
                IngredientesGalletasDeAvenaYPasas.listaGalletasAvenaPasas
            ),
            TipoDePlato(
                "Galletas de Mantequilla",
                "Galletas de mantequilla con una textura que se deshace en la boca. Perfectas para acompañar un café o té.",
                R.drawable.navidad,
                "15 min",
                1,
                false,
                IngredientesGalletasDeMantequilla.listaGalletasMantequilla
            ),
            TipoDePlato(
                "Galletas de Almendra",
                "Galletas crujientes de almendra con un delicado sabor a almendras tostadas. Un manjar para los amantes de las almendras.",
                R.drawable.navidad,
                "25 min",
                1,
                false,
                IngredientesGalletasDeAlmendra.listaGalletasAlmendra
            ),
            TipoDePlato(
                "Galletas de Avena y Miel",
                "Galletas de avena endulzadas con miel y con un toque de canela. Una opción reconfortante y saludable para la merienda.",
                R.drawable.navidad,
                "30 min",
                1,
                false,
                IngredientesGalletasDeAvenaYMiel.listaGalletasAvenaMiel
            ),
            TipoDePlato(
                "Galletas de Mantequilla de Maní",
                "Galletas suaves de mantequilla de maní con un corazón de chocolate. Irresistibles para los amantes del maní y el chocolate.",
                R.drawable.navidad,
                "20 min",
                1,
                false,
                IngredientesGalletasDeMantequillaDeMani.listaGalletasMantequillaMani
            ),
            TipoDePlato(
                "Galletas de Azúcar",
                "Galletas de azúcar decoradas con glaseado colorido. Perfectas para celebraciones y eventos especiales.",
                R.drawable.navidad,
                "30 min",
                1,
                false,
                IngredientesGalletasDeAzucar.listaGalletasAzucar
            ),
            TipoDePlato(
                "Galletas de Limón",
                "Galletas de limón con un toque refrescante y espolvoreadas con azúcar en polvo. Ideales para disfrutar con una taza de té.",
                R.drawable.navidad,
                "25 min",
                1,
                false,
                IngredientesGalletasDeLimon.listaGalletasLimón
            ),
            TipoDePlato(
                "Galletas de Avena y Nueces",
                "Galletas de avena con trozos de nueces crujientes. Una opción saludable y llena de sabor para tus meriendas.",
                R.drawable.navidad,
                "20 min",
                1,
                false,
                IngredientesGalletasDeAvenaYNueces.listaGalletasAvenaNueces
            ),
            TipoDePlato(
                "Galletas de Jengibre",
                "Galletas de jengibre con forma de personas y decoradas con glaseado. Clásicas en la temporada navideña.",
                R.drawable.navidad,
                "35 min",
                2,
                false,
                IngredientesGalletasDeJengibre.listaGalletasJengibre
            )
        )
    }

}