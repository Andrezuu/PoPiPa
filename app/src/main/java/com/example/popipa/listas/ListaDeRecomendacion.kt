package com.example.popipa.listas

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesAcaiBowl
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesBatidoDeProteinas
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesDesayunoContinental
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesHuevosBenedictinos
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesMuesliconNueces
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesOmletteDeChampiñones
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesPanquequesArandanos
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesTostadasConAguacate
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesTostadasFrancesas
import com.example.popipa.listas.listasdeingredientesporcategoria.Desayunos.IngredientesYogurConFrutas

class ListaDeRecomendacion {
    companion object {
    val listaTiposDeDesayuno = listOf<TipoDePlato>(
        TipoDePlato(
            "Tostadas con Aguacate",
            "Tostadas con aguacate fresco y huevos pochados.",
            "tostadasconaguacate",
            "15 min",
            1,
            Megusta = false,
            IngredientesTostadasConAguacate.listTostadasConAguacate
        ),
        TipoDePlato(
            "Omelette de Champiñones",
            "Omelette relleno de champiñones y queso.",
            "omelettedechampiñones",
            "20 min",
            2,
            Megusta = false,
            IngredientesOmletteDeChampiñones.listaOmeletteChampiñones
        ),
        TipoDePlato(
            "Panqueques de Arándanos",
            "Panqueques esponjosos con arándanos frescos.",
            "",
            "25 min",
            1,
            Megusta = false,
            IngredientesPanquequesArandanos.listaPanquequesArandanos
        ),
        TipoDePlato(
            "Yogur con Frutas",
            "Yogur con mezcla de frutas frescas y granola.",
            "yogurconfrutas",
            "10 min",
            1,
            Megusta = false,
            IngredientesYogurConFrutas.listaYogurConFrutas
        ),
        TipoDePlato(
            "Desayuno Continental",
            "Desayuno continental con croissants, jamón y queso.",
            "desayunocontinental",
            "15 min",
            2,
            Megusta = false,
            IngredientesDesayunoContinental.listaDesayunoContinental
        ),
        TipoDePlato(
            "Tostadas Francesas",
            "Tostadas francesas con sirope de arce y frutas.",
            "tostadasfrancesas",
            "20 min",
            2,
            Megusta = false,
            IngredientesTostadasFrancesas.listaTostadasFrancesas

        ),
        TipoDePlato(
            "Batido de Proteínas",
            "Batido de proteínas con plátano y espinacas.",
            "batidodeproteinas",
            "10 min",
            2,
            Megusta = false,
            IngredientesBatidoDeProteinas.listaBatidosProteina
        ),
        TipoDePlato(
            "Muesli con Nueces",
            "Muesli con nueces, miel y yogur.",
            "muesliconnueces",
            "15 min",
            2,
            Megusta = false,
            IngredientesMuesliconNueces.listaMuesliNueces
        ),
        TipoDePlato(
            "Huevos Benedictinos",
            "Huevos benedictinos con salsa holandesa.",
            "huevosbenedivtinos",
            "20 min",
            2,
            Megusta = false,
            IngredientesHuevosBenedictinos.listaHuevosBenedictinos
        ),
        TipoDePlato(
            "Acai Bowl",
            "Bol de acai con granola y frutas tropicales.",
            "acaibowl",
            "10 min",
            1,
            Megusta = false,
            IngredientesAcaiBowl.listaAcaiBowl
        )
    )
    }
}