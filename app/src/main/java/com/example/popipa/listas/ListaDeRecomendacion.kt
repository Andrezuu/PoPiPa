package com.example.popipa.listas

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.R
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesAcaiBowl
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesBatidoDeProteinas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesDesayunoContinental
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesHuevosBenedictinos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesMuesliconNueces
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesOmletteDeChampiñones
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesPanquequesArandanos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesTostadasConAguacate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesTostadasFrancesas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.IngredientesYogurConFrutas

class ListaDeRecomendacion {
    companion object {
    val listaTiposDeDesayuno = listOf<TipoDePlato>(
        TipoDePlato(
            "Tostadas con Aguacate",
            "Tostadas con aguacate fresco y huevos pochados.",
            R.drawable.pasteles,
            "15 min",
            1,
            Megusta = false,
            IngredientesTostadasConAguacate.listTostadasConAguacate
        ),
        TipoDePlato(
            "Omelette de Champiñones",
            "Omelette relleno de champiñones y queso.",
            R.drawable.pasteles,
            "20 min",
            2,
            Megusta = false,
            IngredientesOmletteDeChampiñones.listaOmeletteChampiñones
        ),
        TipoDePlato(
            "Panqueques de Arándanos",
            "Panqueques esponjosos con arándanos frescos.",
            R.drawable.pasteles,
            "25 min",
            1,
            Megusta = false,
            IngredientesPanquequesArandanos.listaPanquequesArandanos
        ),
        TipoDePlato(
            "Yogur con Frutas",
            "Yogur con mezcla de frutas frescas y granola.",
            R.drawable.pasteles,
            "10 min",
            1,
            Megusta = false,
            IngredientesYogurConFrutas.listaYogurConFrutas
        ),
        TipoDePlato(
            "Desayuno Continental",
            "Desayuno continental con croissants, jamón y queso.",
            R.drawable.pasteles,
            "15 min",
            2,
            Megusta = false,
            IngredientesDesayunoContinental.listaDesayunoContinental
        ),
        TipoDePlato(
            "Tostadas Francesas",
            "Tostadas francesas con sirope de arce y frutas.",
            R.drawable.pasteles,
            "20 min",
            2,
            Megusta = false,
            IngredientesTostadasFrancesas.listaTostadasFrancesas

        ),
        TipoDePlato(
            "Batido de Proteínas",
            "Batido de proteínas con plátano y espinacas.",
            R.drawable.pasteles,
            "10 min",
            2,
            Megusta = false,
            IngredientesBatidoDeProteinas.listaBatidosProteina
        ),
        TipoDePlato(
            "Muesli con Nueces",
            "Muesli con nueces, miel y yogur.",
            R.drawable.pasteles,
            "15 min",
            2,
            Megusta = false,
            IngredientesMuesliconNueces.listaMuesliNueces
        ),
        TipoDePlato(
            "Huevos Benedictinos",
            "Huevos benedictinos con salsa holandesa.",
            R.drawable.pasteles,
            "20 min",
            2,
            Megusta = false,
            IngredientesHuevosBenedictinos.listaHuevosBenedictinos
        ),
        TipoDePlato(
            "Acai Bowl",
            "Bol de acai con granola y frutas tropicales.",
            R.drawable.pasteles,
            "10 min",
            1,
            Megusta = false,
            IngredientesAcaiBowl.listaAcaiBowl
        )
    )
    }
}