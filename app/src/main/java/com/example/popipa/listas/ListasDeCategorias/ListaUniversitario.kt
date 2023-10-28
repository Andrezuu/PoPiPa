package com.example.popipa.listas.ListasDeCategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesArrozFritoConVegetales
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesBurritoDeDesayuno
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesEnsaladaDePollo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesFideosInstantaneos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesHamburguesaConPapasFritas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesPastaInstantanea
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesPizzaCongelada
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesSandwichDeJamonYQueso
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesTacosRapidos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.IngredientesTostadasConAguacate
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosArrozFritoConVegetales
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosBurritoDeDesayuno
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosEnsaladaDePollo
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosFideosInstantaneos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosHamburguesaConPapasFritas
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosPastaInstantanea
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosPizzaCongelada
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosSandwichDeJamonYQueso
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosTacosRapidos
import com.example.popipa.listas.ListasdeIngredientesPorCategoria.Universitario.PasosTostadasConAguacate

class ListaUniversitario {
    companion object {
        val listaComidaUniversitarios = listOf<TipoDePlato>(
            TipoDePlato(
                "Sándwich de Jamón y Queso",
                "Un sándwich clásico con jamón, queso y condimentos. Listo en 5 minutos.",
                R.drawable.sandwich_de_jamon_y_queso,
                "5 min",
                2,
                false,
                IngredientesSandwichDeJamonYQueso.listaSandwichJamonQueso,
                PasosSandwichDeJamonYQueso.pasosDePreparacionSandwichJamonQueso
            ),
            TipoDePlato(
                "Ensalada de Pollo",
                "Ensalada fresca con pollo a la parrilla, lechuga y aderezo de tu elección. Preparada en 10 minutos.",
                R.drawable.ensalada_de_pollo,
                "10 min",
                1,
                false,
                IngredientesEnsaladaDePollo.listaEnsaladaDePollo,
                PasosEnsaladaDePollo.pasosDePreparacionEnsaladaPolloCesar
            ),
            TipoDePlato(
                "Pasta Instantánea",
                "Pasta instantánea con salsa de tomate y queso. Listo en 5 minutos.",
                R.drawable.pasta_instantanea,
                "5 min",
                1,
                false,
                IngredientesPastaInstantanea.listaPreparacionPastaInstantanea,
                PasosPastaInstantanea.pasosDePreparacionPastaInstantanea
            ),
            TipoDePlato(
                "Tacos Rápidos",
                "Tacos sencillos con carne molida, tortillas y guarniciones. Preparados en 15 minutos.",
                R.drawable.tacos_rapido,
                "15 min",
                1,
                false,
                IngredientesTacosRapidos.listaPreparacionTacosRapido,
                PasosTacosRapidos.pasosDePreparacionTacosRapido
            ),
            TipoDePlato(
                "Hamburguesa con Papas Fritas",
                "Hamburguesa clásica con papas fritas. Lista en 20 minutos.",
                R.drawable.hamburguesa_con_papas_fritas,
                "20 min",
                1,
                false,
                IngredientesHamburguesaConPapasFritas.listaHamburguesaConPapasFritas,
                PasosHamburguesaConPapasFritas.pasosDePreparacionHamburguesaConPapasFritas
            ),
            TipoDePlato(
                "Arroz Frito con Vegetales",
                "Arroz frito con una mezcla de vegetales y salsa de soja. Preparado en 10 minutos.",
                R.drawable.arroz_frito_con_vegetales,
                "10 min",
                1,
                false,
                IngredientesArrozFritoConVegetales.listaArrozFritoVegetales,
                PasosArrozFritoConVegetales.pasosDePreparacionArrozFritoVegetales
            ),
            TipoDePlato(
                "Pizza Congelada",
                "Pizza congelada para hornear en el microondas o el horno. Lista en 5 minutos.",
                R.drawable.pizza_congelada,
                "5 min",
                1,
                false,
                IngredientesPizzaCongelada.listaPizzaCongelada,
                PasosPizzaCongelada.pasosDePreparacionPizzaCongelada
            ),
            TipoDePlato(
                "Fideos Instantáneos",
                "Fideos instantáneos con caldo y verduras. Listos en 3 minutos.",
                R.drawable.fideos_instantaneos,
                "3 min",
                1,
                false,
                IngredientesFideosInstantaneos.listaFideosInstantaneos,
                PasosFideosInstantaneos.pasosDePreparacionFideosInstantaneos
            ),
            TipoDePlato(
                "Burrito de Desayuno",
                "Burrito con huevos revueltos, tocino y queso. Preparado en 10 minutos.",
                R.drawable.burrito_de_desayuno,
                "10 min",
                1,
                false,
                IngredientesBurritoDeDesayuno.listaBurritosDesayuno,
                PasosBurritoDeDesayuno.pasosDePreparacionBurritosDesayuno
            ),
            TipoDePlato(
                "Tostadas con Aguacate",
                "Tostadas de aguacate con huevos pochados. Una opción saludable lista en 15 minutos.",
                R.drawable.tostada_aguacate,
                "15 min",
                1,
                false,
                IngredientesTostadasConAguacate.listaTostadasConAguacate,
                PasosTostadasConAguacate.pasosDePreparacionTostadasConAguacate
            )
        )
    }
}