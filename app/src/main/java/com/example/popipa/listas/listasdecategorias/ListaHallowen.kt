package com.example.popipa.listas.listasdecategorias

import com.example.popipa.R
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesCerebrosDeGelatina
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesCupcakesDeCalabazas
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesDedosDeBruja
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesEscobasDeBrujas
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesGalletasDeMurcielago
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesOjosSangrantes
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesPizzaSDeMomias
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesSangriaDeHalloween
import com.example.popipa.listas.listasdeingredientesporcategoria.Hallowen.IngredientesSopaDeCalabazas

class ListaHallowen {
    companion object {
        val listaHalloween = listOf<TipoDePlato>(
            TipoDePlato(
                "Galletas de Murciélago",
                "Galletas de mantequilla decoradas como murciélagos con chocolate y confites. El postre perfecto para Halloween.",
                R.drawable.cocteles,
                "30 min",
                1,
                false,
                IngredientesGalletasDeMurcielago.listaGalletasMurcielago
            ),
            TipoDePlato(
                "Cupcakes de Calabaza",
                "Cupcakes de calabaza con crema de queso y decoraciones espeluznantes. Un postre festivo para Halloween.",
                R.drawable.cocteles,
                "20 min",
                2,
                false,
                IngredientesCupcakesDeCalabazas.listaCupcakesDeCalabaza
            ),
            TipoDePlato(
                "Sangría de Halloween",
                "Sangría roja con frutas frescas y un toque de licor. La bebida ideal para una fiesta de Halloween.",
                R.drawable.cocteles,
                "15 min",
                1,
                false,
                IngredientesSangriaDeHalloween.listaSangriaHalloween
            ),
            TipoDePlato(
                "Dedos de Bruja",
                "Palitos salados con forma de dedos de bruja. Un aperitivo espeluznante para Halloween.",
                R.drawable.cocteles,
                "25 min",
                2,
                false,
                IngredientesDedosDeBruja.listaDedosDeBruja
            ),
            TipoDePlato(
                "Sopa de Calabaza",
                "Sopa cremosa de calabaza con crujientes semillas de calabaza. Una opción reconfortante para Halloween.",
                R.drawable.cocteles,
                "30 min",
                2,
                false,
                IngredientesSopaDeCalabazas.listaSopaCalabaza
            ),
            TipoDePlato(
                "Pizza de Momias",
                "Pizzas individuales con forma de momias hechas con masa, salsa de tomate y aceitunas negras. Un platillo divertido para Halloween.",
                R.drawable.cocteles,
                "20 min",
                1,
                false,
                IngredientesPizzaSDeMomias.listaPizzaMomias
            ),
            TipoDePlato(
                "Cerebros de Gelatina",
                "Gelatina en forma de cerebros con sabor a frutas. Un postre inquietante para Halloween.",
                R.drawable.cocteles,
                "15 min",
                1,
                false,
                IngredientesCerebrosDeGelatina.listaCerebrosGelatina
            ),
            TipoDePlato(
                "Escobas de Bruja",
                "Escobas saladas hechas con pretzels y queso. Un aperitivo creativo para Halloween.",
                R.drawable.cocteles,
                "25 min",
                2,
                false,
                IngredientesEscobasDeBrujas.listaEscobasBruja
            ),
            TipoDePlato(
                "Ojos Sangrantes",
                "Huevos rellenos decorados como ojos sangrantes con aceitunas y salsa de tomate.",
                R.drawable.cocteles,
                "25 min",
                1,
                false,
                IngredientesOjosSangrantes.listaGalletasOjosSangrantes
            )
        )
    }

}