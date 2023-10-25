package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesBanguetteDeQuesoYHierbas
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesBollosDeCanela
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesChapataArtesanal
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesFocacciaItaliana
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanDeAjo
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanDeCenteno
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanDeMoldeIntegral
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanDePita
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanDePlatano
import com.example.popipa.listas.listasdeingredientesporcategoria.Pan.IngredientesPanIntegral

class ListasPan {
    companion object {
        val listaPan = listOf<TipoDePlato>(
            TipoDePlato(
                "Baguette de Queso y Hierbas",
                "Baguette recién horneado con queso derretido y hierbas aromáticas. Un pan delicioso y reconfortante para disfrutar en cualquier momento.",
                "baguettedequesoyhierbas",
                "20 min",
                1,
                false,
                IngredientesBanguetteDeQuesoYHierbas.listaBaguetteQuesoHierbas
            ),
            TipoDePlato(
                "Pan de Ajo",
                "Pan de ajo recién horneado con mantequilla de ajo y perejil. Un acompañamiento clásico y sabroso para muchas comidas.",
                "pandeajo",
                "15 min",
                1,
                false,
                IngredientesPanDeAjo.listaPanDeAjo
            ),
            TipoDePlato(
                "Pan Integral",
                "Pan integral casero con semillas de chía, lino y avena. Una opción saludable y llena de fibra para el día a día.",
                "panintegral",
                "30 min",
                2,
                false,
                IngredientesPanIntegral.listaPanIntegral
            ),
            TipoDePlato(
                "Bollos de Canela",
                "Bollos de canela glaseados y esponjosos. Un dulce panecillo perfecto para el desayuno o la merienda.",
                "bollosdecanela",
                "25 min",
                2,
                false,
                IngredientesBollosDeCanela.listaBollosCanela
            ),
            TipoDePlato(
                "Pan de Pita",
                "Pan de pita fresco y esponjoso para rellenar con tus ingredientes favoritos. Ideal para bocadillos y comidas ligeras.",
                "pandepita",
                "20 min",
                2,
                false,
                IngredientesPanDePita.listaPreparacionPanDePita
            ),
            TipoDePlato(
                "Focaccia Italiana",
                "Focaccia de estilo italiano con aceite de oliva, romero y sal marina. Un pan plano y delicioso para compartir en la mesa.",
                "focacciaitaliana",
                "30 min",
                2,
                false,
                IngredientesFocacciaItaliana.listaFocacciaItaliana
            ),
            TipoDePlato(
                "Pan de Plátano",
                "Pan de plátano húmedo y repleto de trozos de plátano maduro. Un postre con sabor a frutas y textura suave.",
                "pandeplatano",
                "45 min",
                2,
                false,
                IngredientesPanDePlatano.listaPanDePlatano
            ),
            TipoDePlato(
                "Pan de Centeno",
                "Pan de centeno oscuro y denso con una corteza crujiente. Un pan robusto y lleno de sabor para acompañar comidas saladas.",
                "pandecenteno",
                "40 min",
                2,
                false,
                IngredientesPanDeCenteno.listaPanDeCenteno
            ),
            TipoDePlato(
                "Chapata Artesanal",
                "Chapata artesanal con aceite de oliva, sal marina y una miga ligera. Un pan rústico y auténtico que te transporta a Italia.",
                "chapataartesanal",
                "35 min",
                2,
                false,
                IngredientesChapataArtesanal.listaChapataArtesanal
            ),
            TipoDePlato(
                "Pan de Molde Integral",
                "Pan de molde integral con semillas de girasol y calabaza. Perfecto para bocadillos y sándwiches saludables.",
                "pandemoldeintegral",
                "30 min",
                1,
                false,
                IngredientesPanDeMoldeIntegral.listaPanDeMoldeIntegral
            )
        )
    }

}