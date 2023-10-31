package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.R
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesBurritosDePollo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesEnsaladaCesar
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesHamburguesaVegetariana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesPastaPrimavera
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesPokeBowl
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesPolloALaParrilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesPolloAlCurry
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesSandwichDePavo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesSopaDeLentejas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.IngredientesTacosDeCarne
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosBurritosDePollo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosEnsaladaCesar
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosHamburguesaVegetariana
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosPastaPrimavera
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosPokeBowl
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosPolloALaParrilla
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosPolloAlCurry
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosSandwichDePavo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosSopaDeLentejas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Almuerzos.PasosTacosDeCarne

class ListaAlmuerzos {
    companion object {
        val listaAlmuerzos = listOf<TipoDePlato>(
            TipoDePlato(
                "Pollo a la Parrilla",
                "Delicioso pollo a la parrilla con marinada de hierbas y limón. Acompañado de verduras asadas, una comida ligera y sabrosa para el almuerzo.",
                R.drawable.pollo_a_la_parrilla,
                "30 min",
                1,
                true,
                IngredientesPolloALaParrilla.listaPolloParrilla,
                PasosPolloALaParrilla.pasosDePreparacionPolloParrilla
            ),
            TipoDePlato(
                "Ensalada César",
                "Ensalada clásica César con lechuga romana, aderezo especial, crutones y queso parmesano. Una opción fresca y satisfactoria para el almuerzo.",
                R.drawable.ensalada_cesar,
                "20 min",
                1,
                false,
                IngredientesEnsaladaCesar.listaEnsaladaCesar,
                PasosEnsaladaCesar.pasosDePreparacionEnsaladaCesar
            ),
            TipoDePlato(
                "Sándwich de Pavo",
                "Sándwich relleno de pavo, aguacate, tocino y condimentos. Ideal para un almuerzo rápido y delicioso.",
                R.drawable.sandwich_de_pavo,
                "15 min",
                1,
                true,
                IngredientesSandwichDePavo.listaSandwichPavo,
                PasosSandwichDePavo.pasosDePreparacionSandwichPavo
            ),
            TipoDePlato(
                "Pasta Primavera",
                "Pasta con una mezcla de verduras de temporada y salsa de ajo y aceite de oliva. Un plato de pasta ligero y repleto de sabor.",
                R.drawable.pasta_primavera,
                "25 min",
                2,
                false,
                IngredientesPastaPrimavera.listaPastaPrimavera,
                PasosPastaPrimavera.pasosDePreparacionPastaPrimavera
            ),
            TipoDePlato(
                "Sopa de Lentejas",
                "Sopa de lentejas con verduras, tomates y especias. Una opción reconfortante y saludable para el almuerzo.",
                R.drawable.sopa_de_lentajas,
                "30 min",
                2,
                false,
                IngredientesSopaDeLentejas.listaSopaLentejas,
                PasosSopaDeLentejas.pasosDePreparacionSopaLentejas
            ),
            TipoDePlato(
                "Burritos de Pollo",
                "Burritos rellenos de pollo marinado, arroz, frijoles y guarniciones. Una comida rápida y deliciosa para el almuerzo.",
                R.drawable.burritos_de_pollo,
                "20 min",
                2,
                true,
                IngredientesBurritosDePollo.listaBurritosDePollo,
                PasosBurritosDePollo.pasosDePreparacionBurritosDePollo
            ),
            TipoDePlato(
                "Poke Bowl",
                "Poke Bowl con pescado crudo, arroz, aguacate y verduras frescas. Una opción saludable y exquisita para el almuerzo.",
                R.drawable.poke_bowl,
                "20 min",
                2,
                false,
                IngredientesPokeBowl.listaPokeBowl,
                PasosPokeBowl.pasosDePreparaciónPokeBowl
            ),
            TipoDePlato(
                "Hamburguesa Vegetariana",
                "Hamburguesa vegetariana a base de garbanzos, espinacas y condimentos. Ideal para un almuerzo sin carne pero lleno de sabor.",
                R.drawable.hamburguesa_vegetariana,
                "25 min",
                1,
                false,
                IngredientesHamburguesaVegetariana.listaHamburguesaVegetariana,
                PasosHamburguesaVegetariana.pasosDePreparacionHamburguesaVegetariana
            ),
            TipoDePlato(
                "Pollo al Curry",
                "Pollo al curry con arroz basmati y verduras. Una comida con un toque exótico para el almuerzo.",
                R.drawable.pollo_al_curry,
                "30 min",
                2,
                true,
                IngredientesPolloAlCurry.listaPolloAlCurry,
                PasosPolloAlCurry.pasosDePreparacionPolloAlCurry
            ),
            TipoDePlato(
                "Tacos de Carne",
                "Tacos de carne asada con tortillas de maíz y guarniciones. Una opción sabrosa para disfrutar del almuerzo al estilo mexicano.",
                R.drawable.tacos_de_carne,
                "25 min",
                1,
                true,
                IngredientesTacosDeCarne.listaTacosCarne,
                PasosTacosDeCarne.pasosDePreparacionTacosCarne
            )
        )
    }
}