package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
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
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosAcaiBowl
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosBatidoDeProteinas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosDesayunoContinental
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosHuevosBenedictinos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosMuesliconNueces
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosOmletteDeChampiñones
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosPanquequesArandanos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosTostadasConAguacate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosTostadasFrancesas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Desayunos.PasosYogurConFrutas

class ListaDesayunos {
    companion object {
        val listaTiposDeDesayuno = listOf<TipoDePlato>(
            TipoDePlato(
                "Tostadas con Aguacate",
                "Deliciosas tostadas de aguacate fresco acompañadas de huevos pochados. Una combinación perfecta para empezar el día con energía y sabor.",
                R.drawable.tostada_aguacate,
                "15 min",
                1,
                false,
                IngredientesTostadasConAguacate.listTostadasConAguacate,
                PasosTostadasConAguacate.pasosDePreparacionTostadasConAguacate
            ),
            TipoDePlato(
                "Omelette de Champiñones",
                "Omelette relleno de champiñones salteados y queso derretido. Un desayuno abundante y delicioso para satisfacer tu apetito matutino.",
                R.drawable.omelette_champinones,
                "20 min",
                2,
                false,
                IngredientesOmletteDeChampiñones.listaOmeletteChampiñones,
                PasosOmletteDeChampiñones.pasosDePreparacionOmeletteChampinones
            ),
            TipoDePlato(
                "Panqueques de Arándanos",
                "Panqueques esponjosos con arándanos frescos y sirope de arce. Una opción dulce y reconfortante para comenzar el día.",
                R.drawable.panqueques_arandanos,
                "25 min",
                1,
                false,
                IngredientesPanquequesArandanos.listaPanquequesArandanos,
                PasosPanquequesArandanos.pasosDePreparacionPanquequesArandanos
            ),
            TipoDePlato(
                "Yogur con Frutas",
                "Yogur natural con una mezcla refrescante de frutas frescas y crujiente granola. Una elección saludable y rápida para las mañanas ocupadas.",
                R.drawable.yogurt_con_frutas,
                "10 min",
                1,
                false,
                IngredientesYogurConFrutas.listaYogurConFrutas,
                PasosYogurConFrutas.pasosDePreparacionYogurConFrutas
            ),
            TipoDePlato(
                "Desayuno Continental",
                "Desayuno continental con croissants recién horneados, jamón, queso y una variedad de mermeladas. Un desayuno al estilo europeo para disfrutar con calma.",
                R.drawable.desayuno_continental,
                "15 min",
                2,
                false,
                IngredientesDesayunoContinental.listaDesayunoContinental,
                PasosDesayunoContinental.pasosDePreparacionDesayunoContinental
            ),
            TipoDePlato(
                "Tostadas Francesas",
                "Tostadas francesas bañadas en sirope de arce y decoradas con frutas frescas. Una opción indulgente y deliciosa para ocasiones especiales.",
                R.drawable.tostada_francesa,
                "20 min",
                2,
                false,
                IngredientesTostadasFrancesas.listaTostadasFrancesas,
                PasosTostadasFrancesas.pasosDePreparacionTostadasFrancesas
            ),
            TipoDePlato(
                "Batido de Proteínas",
                "Batido de proteínas con plátano, espinacas y proteína en polvo. Ideal para los amantes del fitness y las mañanas activas.",
                R.drawable.batido_de_proteinas,
                "10 min",
                2,
                false,
                IngredientesBatidoDeProteinas.listaBatidosProteina,
                PasosBatidoDeProteinas.pasosDePreparacionBatidoProteina
            ),
            TipoDePlato(
                "Muesli con Nueces",
                "Muesli mezclado con nueces, miel y yogur cremoso. Una opción nutritiva y saciante para quienes buscan un desayuno saludable.",
                R.drawable.muesli_con_nueces,
                "15 min",
                2,
                false,
                IngredientesMuesliconNueces.listaMuesliNueces,
                PasosMuesliconNueces.pasosDePreparacionMuesliNueces
            ),
            TipoDePlato(
                "Huevos Benedictinos",
                "Huevos Benedictinos servidos sobre muffins ingleses y cubiertos con salsa holandesa. Un desayuno sofisticado y sabroso.",
                R.drawable.huevos_benedictinos,
                "20 min",
                2,
                false,
                IngredientesHuevosBenedictinos.listaHuevosBenedictinos,
                PasosHuevosBenedictinos.pasosDePreparacionHuevosBenedictinos
            ),
            TipoDePlato(
                "Acai Bowl",
                "Bol de acai con granola, plátano, fresas y coco rallado. Un desayuno tropical y lleno de antioxidantes.",
                R.drawable.acai_bowl,
                "10 min",
                2,
                false,
                IngredientesAcaiBowl.listaAcaiBowl,
                PasosAcaiBowl.pasosDePreparacionAcaiBowl
            )
        )
    }

}