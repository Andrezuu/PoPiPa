package com.example.popipa.listas.listasdeingredientesporcategoria.Universitario

import com.example.popipa.dataClases.Ingrediente

class IngredientesPizzaCongelada {
    companion object {
        val listaPizzaCongelada = listOf<Ingrediente>(
            Ingrediente(
                "Pizza congelada",
                "1 unidad"
            ),
            Ingrediente(
                "Horno precalentado",
                "Seguir las instrucciones del paquete"
            )
        )
    }

}