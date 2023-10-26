package com.example.popipa.listas.listasdecategorias

import com.example.popipa.R
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

class ListaDesayunos {
    companion object {
        val listaTiposDeDesayuno = listOf<TipoDePlato>(
            TipoDePlato(
                "Tostadas con Aguacate",
                "Deliciosas tostadas de aguacate fresco acompañadas de huevos pochados. Una combinación perfecta para empezar el día con energía y sabor.",
                R.drawable.cocteles,
                "15 min",
                1,
                false,
                IngredientesTostadasConAguacate.listTostadasConAguacate
            ),
            TipoDePlato(
                "Omelette de Champiñones",
                "Omelette relleno de champiñones salteados y queso derretido. Un desayuno abundante y delicioso para satisfacer tu apetito matutino.",
                R.drawable.cocteles,
                "20 min",
                2,
                false,
                IngredientesOmletteDeChampiñones.listaOmeletteChampiñones
            ),
            TipoDePlato(
                "Panqueques de Arándanos",
                "Panqueques esponjosos con arándanos frescos y sirope de arce. Una opción dulce y reconfortante para comenzar el día.",
                R.drawable.cocteles,
                "25 min",
                1,
                false,
                IngredientesPanquequesArandanos.listaPanquequesArandanos
            ),
            TipoDePlato(
                "Yogur con Frutas",
                "Yogur natural con una mezcla refrescante de frutas frescas y crujiente granola. Una elección saludable y rápida para las mañanas ocupadas.",
                R.drawable.cocteles,
                "10 min",
                1,
                false,
                IngredientesYogurConFrutas.listaYogurConFrutas
            ),
            TipoDePlato(
                "Desayuno Continental",
                "Desayuno continental con croissants recién horneados, jamón, queso y una variedad de mermeladas. Un desayuno al estilo europeo para disfrutar con calma.",
                R.drawable.cocteles,
                "15 min",
                2,
                false,
                IngredientesDesayunoContinental.listaDesayunoContinental
            ),
            TipoDePlato(
                "Tostadas Francesas",
                "Tostadas francesas bañadas en sirope de arce y decoradas con frutas frescas. Una opción indulgente y deliciosa para ocasiones especiales.",
                R.drawable.cocteles,
                "20 min",
                2,
                false,
                IngredientesTostadasFrancesas.listaTostadasFrancesas
            ),
            TipoDePlato(
                "Batido de Proteínas",
                "Batido de proteínas con plátano, espinacas y proteína en polvo. Ideal para los amantes del fitness y las mañanas activas.",
                R.drawable.cocteles,
                "10 min",
                2,
                false,
                IngredientesBatidoDeProteinas.listaBatidosProteina
            ),
            TipoDePlato(
                "Muesli con Nueces",
                "Muesli mezclado con nueces, miel y yogur cremoso. Una opción nutritiva y saciante para quienes buscan un desayuno saludable.",
                R.drawable.cocteles,
                "15 min",
                2,
                false,
                IngredientesMuesliconNueces.listaMuesliNueces
            ),
            TipoDePlato(
                "Huevos Benedictinos",
                "Huevos Benedictinos servidos sobre muffins ingleses y cubiertos con salsa holandesa. Un desayuno sofisticado y sabroso.",
                R.drawable.cocteles,
                "20 min",
                2,
                false,
                IngredientesHuevosBenedictinos.listaHuevosBenedictinos
            ),
            TipoDePlato(
                "Acai Bowl",
                "Bol de acai con granola, plátano, fresas y coco rallado. Un desayuno tropical y lleno de antioxidantes.",
                R.drawable.cocteles,
                "10 min",
                2,
                false,
                IngredientesAcaiBowl.listaAcaiBowl
            )
        )
    }

}