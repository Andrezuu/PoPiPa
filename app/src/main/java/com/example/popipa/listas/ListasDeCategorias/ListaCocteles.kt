package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.R
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesCaipinha
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesCosmopolitan
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesCubaLibre
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesDaiquiriDeFresa
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesMargarita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesMintJulep
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesMojito
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesNegroni
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesPiscoSour
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.IngredientesPiñaColada
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosCaipinha
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosCosmopolitan
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosCubaLibre
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosDaiquiriDeFresa
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosMargarita
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosMintJulep
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosMojito
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosNegroni
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosPiscoSour
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Cocteles.PasosPiñaColada

class ListaCocteles {
    companion object {
        val listaCocteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Margarita",
                "Cóctel Margarita con tequila, licor de naranja y jugo de limón. El equilibrio perfecto entre dulce y ácido.",
                R.drawable.margarita,
                "10 min",
                1,
                Megusta = false,
                IngredientesMargarita.listaMargarita,
                PasosMargarita.pasosDePreparacionMargarita
            ),
            TipoDePlato(
                "Mojito",
                "Refrescante Mojito con ron, lima, menta y soda. Ideal para disfrutar en un día soleado.",
                R.drawable.mojito,
                "5 min",
                1,
                Megusta = false,
                IngredientesMojito.listaMojito,
                PasosMojito.pasosDePreparacionMojito
            ),
            TipoDePlato(
                "Piña Colada",
                "Piña Colada cremosa con ron, piña y crema de coco. Un cóctel tropical y delicioso para relajarte.",
                R.drawable.pina_colada,
                "10 min",
                1,
                Megusta = false,
                IngredientesPiñaColada.listaPinaColada,
                PasosPiñaColada.pasosDePreparacionPinaColada

            ),
            TipoDePlato(
                "Daiquiri de Fresa",
                "Daiquiri de fresa con ron, fresas frescas y jugo de limón. Un cóctel afrutado y dulce.",
                R.drawable.daiquiri_de_fresa,
                "5 min",
                1,
                Megusta = false,
                IngredientesDaiquiriDeFresa.listaDaiquiriFresa,
                PasosDaiquiriDeFresa.pasosDePreparacionDaiquiriFresa
            ),
            TipoDePlato(
                "Negroni",
                "Cóctel Negroni con ginebra, vermut y Campari. Una bebida intensa y ligeramente amarga.",
                R.drawable.negroni,
                "5 min",
                1,
                Megusta = false,
                IngredientesNegroni.listaNegroni,
                PasosNegroni.pasosDePreparacionNegroni
            ),
            TipoDePlato(
                "Caipirinha",
                "Caipirinha brasileña con cachaça, lima y azúcar. Un cóctel cítrico y refrescante.",
                R.drawable.caipinha,
                "5 min",
                1,
                Megusta = false,
                IngredientesCaipinha.listaCaipirinha,
                PasosCaipinha.pasosDePreparacionCaipirinha
            ),
            TipoDePlato(
                "Mint Julep",
                "Mint Julep con bourbon, azúcar y hojas de menta. Un cóctel clásico y refrescante.",
                R.drawable.mint_julep,
                "10 min",
                1,
                Megusta = false,
                IngredientesMintJulep.listaMintJulep,
                PasosMintJulep.pasosDePreparacionMintJulep
            ),
            TipoDePlato(
                "Cuba Libre",
                "Cuba Libre con ron, cola y limón. Un cóctel simple y delicioso para los amantes del ron.",
                R.drawable.cuba_libre,
                "5 min",
                1,
                Megusta = false,
                IngredientesCubaLibre.listaCubaLibre,
                PasosCubaLibre.pasosDePreparacionCubaLibre
            ),
            TipoDePlato(
                "Cosmopolitan",
                "Cóctel Cosmopolitan con vodka, licor de naranja y jugo de arándano. Una bebida sofisticada y llena de sabor.",
                R.drawable.cosmopolita,
                "5 min",
                1,
                Megusta = false,
                IngredientesCosmopolitan.listaCosmopolitan,
                PasosCosmopolitan.pasosDePreparacionCosmopolitan
            ),
            TipoDePlato(
                "Pisco Sour",
                "Pisco Sour peruano con pisco, limón, azúcar y clara de huevo. Una bebida única y refrescante.",
                R.drawable.pisco_sour,
                "5 min",
                1,
                Megusta = false,
                IngredientesPiscoSour.listaPiscoSour,
                PasosPiscoSour.pasosDePreparacionPiscoSour
            )
        )
    }

}