package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesCaipinha
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesCosmopolitan
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesCubaLibre
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesDaiquiriDeFresa
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesMargarita
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesMintJulep
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesMojito
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesNegroni
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesPiscoSour
import com.example.popipa.listas.listasdeingredientesporcategoria.Cocteles.IngredientesPiñaColada
import com.example.popipa.R
class ListaCocteles {
    companion object {
        val listaCocteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Margarita",
                "Cóctel Margarita con tequila, licor de naranja y jugo de limón. El equilibrio perfecto entre dulce y ácido.",
                R.drawable.cocteles,
                "10 min",
                1,
                Megusta = false,
                IngredientesMargarita.listaMargarita
            ),
            TipoDePlato(
                "Mojito",
                "Refrescante Mojito con ron, lima, menta y soda. Ideal para disfrutar en un día soleado.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesMojito.listaMojito
            ),
            TipoDePlato(
                "Piña Colada",
                "Piña Colada cremosa con ron, piña y crema de coco. Un cóctel tropical y delicioso para relajarte.",
                R.drawable.cocteles,
                "10 min",
                1,
                Megusta = false,
                IngredientesPiñaColada.listaPinaColada
            ),
            TipoDePlato(
                "Daiquiri de Fresa",
                "Daiquiri de fresa con ron, fresas frescas y jugo de limón. Un cóctel afrutado y dulce.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesDaiquiriDeFresa.listaDaiquiriFresa
            ),
            TipoDePlato(
                "Negroni",
                "Cóctel Negroni con ginebra, vermut y Campari. Una bebida intensa y ligeramente amarga.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesNegroni.listaNegroni
            ),
            TipoDePlato(
                "Caipirinha",
                "Caipirinha brasileña con cachaça, lima y azúcar. Un cóctel cítrico y refrescante.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesCaipinha.listaCaipirinha
            ),
            TipoDePlato(
                "Mint Julep",
                "Mint Julep con bourbon, azúcar y hojas de menta. Un cóctel clásico y refrescante.",
                R.drawable.cocteles,
                "10 min",
                1,
                Megusta = false,
                IngredientesMintJulep.listaMintJulep
            ),
            TipoDePlato(
                "Cuba Libre",
                "Cuba Libre con ron, cola y limón. Un cóctel simple y delicioso para los amantes del ron.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesCubaLibre.listaCubaLibre
            ),
            TipoDePlato(
                "Cosmopolitan",
                "Cóctel Cosmopolitan con vodka, licor de naranja y jugo de arándano. Una bebida sofisticada y llena de sabor.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesCosmopolitan.listaCosmopolitan
            ),
            TipoDePlato(
                "Pisco Sour",
                "Pisco Sour peruano con pisco, limón, azúcar y clara de huevo. Una bebida única y refrescante.",
                R.drawable.cocteles,
                "5 min",
                1,
                Megusta = false,
                IngredientesPiscoSour.listaPiscoSour
            )
        )
    }

}