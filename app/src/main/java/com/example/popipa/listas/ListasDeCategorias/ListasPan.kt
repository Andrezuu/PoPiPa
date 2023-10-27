package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesBanguetteDeQuesoYHierbas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesBollosDeCanela
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesChapataArtesanal
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesFocacciaItaliana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanDeAjo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanDeCenteno
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanDeMoldeIntegral
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanDePita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanDePlatano
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.IngredientesPanIntegral
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosBanguetteDeQuesoYHierbas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosBollosDeCanela
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosChapataArtesanal
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosFocacciaItaliana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanDeAjo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanDeCenteno
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanDeMoldeIntegral
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanDePita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanDePlatano
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Pan.PasosPanIntegral

class ListasPan {
    companion object {
        val listaPan = listOf<TipoDePlato>(
            TipoDePlato(
                "Baguette de Queso y Hierbas",
                "Baguette recién horneado con queso derretido y hierbas aromáticas. Un pan delicioso y reconfortante para disfrutar en cualquier momento.",
                R.drawable.navidad,
                "20 min",
                1,
                false,
                IngredientesBanguetteDeQuesoYHierbas.listaBaguetteQuesoHierbas,
                PasosBanguetteDeQuesoYHierbas.pasosDePreparacionBaguetteQuesoHierbas
            ),
            TipoDePlato(
                "Pan de Ajo",
                "Pan de ajo recién horneado con mantequilla de ajo y perejil. Un acompañamiento clásico y sabroso para muchas comidas.",
                R.drawable.navidad,
                "15 min",
                1,
                false,
                IngredientesPanDeAjo.listaPanDeAjo,
                PasosPanDeAjo.pasosDePreparacionPanDeAjo
            ),
            TipoDePlato(
                "Pan Integral",
                "Pan integral casero con semillas de chía, lino y avena. Una opción saludable y llena de fibra para el día a día.",
                R.drawable.navidad,
                "30 min",
                2,
                false,
                IngredientesPanIntegral.listaPanIntegral,
                PasosPanIntegral.pasosDePreparacionPanIntegral
            ),
            TipoDePlato(
                "Bollos de Canela",
                "Bollos de canela glaseados y esponjosos. Un dulce panecillo perfecto para el desayuno o la merienda.",
                R.drawable.navidad,
                "25 min",
                2,
                false,
                IngredientesBollosDeCanela.listaBollosCanela,
                PasosBollosDeCanela.pasosDePreparacionBollosCanela
            ),
            TipoDePlato(
                "Pan de Pita",
                "Pan de pita fresco y esponjoso para rellenar con tus ingredientes favoritos. Ideal para bocadillos y comidas ligeras.",
                R.drawable.navidad,
                "20 min",
                2,
                false,
                IngredientesPanDePita.listaPreparacionPanDePita,
                PasosPanDePita.pasosDePreparacionPanDePita
            ),
            TipoDePlato(
                "Focaccia Italiana",
                "Focaccia de estilo italiano con aceite de oliva, romero y sal marina. Un pan plano y delicioso para compartir en la mesa.",
                R.drawable.navidad,
                "30 min",
                2,
                false,
                IngredientesFocacciaItaliana.listaFocacciaItaliana,
                PasosFocacciaItaliana.pasosDePreparacionFocacciaItaliana
            ),
            TipoDePlato(
                "Pan de Plátano",
                "Pan de plátano húmedo y repleto de trozos de plátano maduro. Un postre con sabor a frutas y textura suave.",
                R.drawable.navidad,
                "45 min",
                2,
                false,
                IngredientesPanDePlatano.listaPanDePlatano,
                PasosPanDePlatano.pasosDePreparacionPanDePlatano
            ),
            TipoDePlato(
                "Pan de Centeno",
                "Pan de centeno oscuro y denso con una corteza crujiente. Un pan robusto y lleno de sabor para acompañar comidas saladas.",
                R.drawable.navidad,
                "40 min",
                2,
                false,
                IngredientesPanDeCenteno.listaPanDeCenteno,
                PasosPanDeCenteno.pasosDePreparacionPanDeCenteno
            ),
            TipoDePlato(
                "Chapata Artesanal",
                "Chapata artesanal con aceite de oliva, sal marina y una miga ligera. Un pan rústico y auténtico que te transporta a Italia.",
                R.drawable.navidad,
                "35 min",
                2,
                false,
                IngredientesChapataArtesanal.listaChapataArtesanal,
                PasosChapataArtesanal.pasosDePreparacionChapataArtesanal
            ),
            TipoDePlato(
                "Pan de Molde Integral",
                "Pan de molde integral con semillas de girasol y calabaza. Perfecto para bocadillos y sándwiches saludables.",
                R.drawable.navidad,
                "30 min",
                1,
                false,
                IngredientesPanDeMoldeIntegral.listaPanDeMoldeIntegral,
                PasosPanDeMoldeIntegral.pasosDePreparacionPanDeMoldeIntegral
            )
        )
    }

}