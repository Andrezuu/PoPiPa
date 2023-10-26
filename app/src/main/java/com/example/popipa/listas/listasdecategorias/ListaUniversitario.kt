package com.example.popipa.listas.listasdecategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesArrozFritoConVegetales
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesBurritoDeDesayuno
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesEnsaladaDePollo
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesFideosInstantaneos
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesHamburguesaConPapasFritas
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesPastaInstantanea
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesPizzaCongelada
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesSandwichDeJamonYQueso
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesTacosRapidos
import com.example.popipa.listas.listasdeingredientesporcategoria.Universitario.IngredientesTostadasConAguacate

class ListaUniversitario {
    companion object {
        val listaComidaUniversitarios = listOf<TipoDePlato>(
            TipoDePlato(
                "Sándwich de Jamón y Queso",
                "Un sándwich clásico con jamón, queso y condimentos. Listo en 5 minutos.",
                R.drawable.universitaria,
                "5 min",
                2,
                false,
                IngredientesSandwichDeJamonYQueso.listaSandwichJamonQueso
            ),
            TipoDePlato(
                "Ensalada de Pollo",
                "Ensalada fresca con pollo a la parrilla, lechuga y aderezo de tu elección. Preparada en 10 minutos.",
                R.drawable.universitaria,
                "10 min",
                1,
                false,
                IngredientesEnsaladaDePollo.listaEnsaladaDePollo
            ),
            TipoDePlato(
                "Pasta Instantánea",
                "Pasta instantánea con salsa de tomate y queso. Listo en 5 minutos.",
                R.drawable.universitaria,
                "5 min",
                1,
                false,
                IngredientesPastaInstantanea.listaPreparacionPastaInstantanea
            ),
            TipoDePlato(
                "Tacos Rápidos",
                "Tacos sencillos con carne molida, tortillas y guarniciones. Preparados en 15 minutos.",
                R.drawable.universitaria,
                "15 min",
                1,
                false,
                IngredientesTacosRapidos.listaPreparacionTacosRapido
            ),
            TipoDePlato(
                "Hamburguesa con Papas Fritas",
                "Hamburguesa clásica con papas fritas. Lista en 20 minutos.",
                R.drawable.universitaria,
                "20 min",
                1,
                false,
                IngredientesHamburguesaConPapasFritas.listaHamburguesaConPapasFritas
            ),
            TipoDePlato(
                "Arroz Frito con Vegetales",
                "Arroz frito con una mezcla de vegetales y salsa de soja. Preparado en 10 minutos.",
                R.drawable.universitaria,
                "10 min",
                1,
                false,
                IngredientesArrozFritoConVegetales.listaArrozFritoVegetales
            ),
            TipoDePlato(
                "Pizza Congelada",
                "Pizza congelada para hornear en el microondas o el horno. Lista en 5 minutos.",
                R.drawable.universitaria,
                "5 min",
                1,
                false,
                IngredientesPizzaCongelada.listaPizzaCongelada
            ),
            TipoDePlato(
                "Fideos Instantáneos",
                "Fideos instantáneos con caldo y verduras. Listos en 3 minutos.",
                R.drawable.universitaria,
                "3 min",
                1,
                false,
                IngredientesFideosInstantaneos.listaFideosInstantaneos
            ),
            TipoDePlato(
                "Burrito de Desayuno",
                "Burrito con huevos revueltos, tocino y queso. Preparado en 10 minutos.",
                R.drawable.universitaria,
                "10 min",
                1,
                false,
                IngredientesBurritoDeDesayuno.listaBurritosDesayuno
            ),
            TipoDePlato(
                "Tostadas con Aguacate",
                "Tostadas de aguacate con huevos pochados. Una opción saludable lista en 15 minutos.",
                R.drawable.universitaria,
                "15 min",
                1,
                false,
                IngredientesTostadasConAguacate.listaTostadasConAguacate
            )
        )
    }
}