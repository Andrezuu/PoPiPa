package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesBurritosDePollo
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesEnsaladaCesar
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesHamburguesaVegetariana
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesPastaPrimavera
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesPokeBowl
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesPolloALaParrilla
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesPolloAlCurry
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesSandwichDePavo
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesSopaDeLentejas
import com.example.popipa.listas.listasdeingredientesporcategoria.Almuerzos.IngredientesTacosDeCarne
import com.example.popipa.R

class ListaAlmuerzos {
    companion object {
        val listaAlmuerzos = listOf<TipoDePlato>(
            TipoDePlato(
                "Pollo a la Parrilla",
                "Delicioso pollo a la parrilla con marinada de hierbas y limón. Acompañado de verduras asadas, una comida ligera y sabrosa para el almuerzo.",
                R.drawable.pasteles,
                "30 min",
                1,
                false,
                IngredientesPolloALaParrilla.listaPolloParrilla
            ),
            TipoDePlato(
                "Ensalada César",
                "Ensalada clásica César con lechuga romana, aderezo especial, crutones y queso parmesano. Una opción fresca y satisfactoria para el almuerzo.",
                R.drawable.pasteles,
                "20 min",
                1,
                false,
                IngredientesEnsaladaCesar.listaEnsaladaCesar
            ),
            TipoDePlato(
                "Sándwich de Pavo",
                "Sándwich relleno de pavo, aguacate, tocino y condimentos. Ideal para un almuerzo rápido y delicioso.",
                R.drawable.pasteles,
                "15 min",
                1,
                false,
                IngredientesSandwichDePavo.listaSandwichPavo
            ),
            TipoDePlato(
                "Pasta Primavera",
                "Pasta con una mezcla de verduras de temporada y salsa de ajo y aceite de oliva. Un plato de pasta ligero y repleto de sabor.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredientesPastaPrimavera.listaPastaPrimavera
            ),
            TipoDePlato(
                "Sopa de Lentejas",
                "Sopa de lentejas con verduras, tomates y especias. Una opción reconfortante y saludable para el almuerzo.",
                R.drawable.pasteles,
                "30 min",
                2,
                false,
                IngredientesSopaDeLentejas.listaSopaLentejas
            ),
            TipoDePlato(
                "Burritos de Pollo",
                "Burritos rellenos de pollo marinado, arroz, frijoles y guarniciones. Una comida rápida y deliciosa para el almuerzo.",
                R.drawable.pasteles,
                "20 min",
                2,
                false,
                IngredientesBurritosDePollo.listaBurritosDePollo
            ),
            TipoDePlato(
                "Poke Bowl",
                "Poke Bowl con pescado crudo, arroz, aguacate y verduras frescas. Una opción saludable y exquisita para el almuerzo.",
                R.drawable.pasteles,
                "20 min",
                2,
                false,
                IngredientesPokeBowl.listaPokeBowl
            ),
            TipoDePlato(
                "Hamburguesa Vegetariana",
                "Hamburguesa vegetariana a base de garbanzos, espinacas y condimentos. Ideal para un almuerzo sin carne pero lleno de sabor.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredientesHamburguesaVegetariana.listaHamburguesaVegetariana
            ),
            TipoDePlato(
                "Pollo al Curry",
                "Pollo al curry con arroz basmati y verduras. Una comida con un toque exótico para el almuerzo.",
                R.drawable.pasteles,
                "30 min",
                2,
                false,
                IngredientesPolloAlCurry.listaPolloAlCurry
            ),
            TipoDePlato(
                "Tacos de Carne",
                "Tacos de carne asada con tortillas de maíz y guarniciones. Una opción sabrosa para disfrutar del almuerzo al estilo mexicano.",
                R.drawable.pasteles,
                "25 min",
                2,
                false,
                IngredientesTacosDeCarne.listaTacosCarne
            )
        )
    }
}