package com.example.popipa.listas.listasdecategorias

import com.example.popipa.dataClases.TipoDePlato

class ListaCocteles {
    companion object {
        val listaCocteles = listOf<TipoDePlato>(
            TipoDePlato(
                "Margarita",
                "Cóctel Margarita con tequila, licor de naranja y jugo de limón. El equilibrio perfecto entre dulce y ácido.",
                R.drawable.coctel_margarita,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Mojito",
                "Refrescante Mojito con ron, lima, menta y soda. Ideal para disfrutar en un día soleado.",
                R.drawable.coctel_mojito,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Piña Colada",
                "Piña Colada cremosa con ron, piña y crema de coco. Un cóctel tropical y delicioso para relajarte.",
                R.drawable.coctel_pina_colada,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Daiquiri de Fresa",
                "Daiquiri de fresa con ron, fresas frescas y jugo de limón. Un cóctel afrutado y dulce.",
                R.drawable.coctel_daiquiri_fresa,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Negroni",
                "Cóctel Negroni con ginebra, vermut y Campari. Una bebida intensa y ligeramente amarga.",
                R.drawable.coctel_negroni,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Caipirinha",
                "Caipirinha brasileña con cachaça, lima y azúcar. Un cóctel cítrico y refrescante.",
                R.drawable.coctel_caipirinha,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Mint Julep",
                "Mint Julep con bourbon, azúcar y hojas de menta. Un cóctel clásico y refrescante.",
                R.drawable.coctel_mint_julep,
                "10 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Cuba Libre",
                "Cuba Libre con ron, cola y limón. Un cóctel simple y delicioso para los amantes del ron.",
                R.drawable.coctel_cuba_libre,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Cosmopolitan",
                "Cóctel Cosmopolitan con vodka, licor de naranja y jugo de arándano. Una bebida sofisticada y llena de sabor.",
                R.drawable.coctel_cosmopolitan,
                "5 min",
                Dificultad.FACIL
            ),
            TipoDePlato(
                "Pisco Sour",
                "Pisco Sour peruano con pisco, limón, azúcar y clara de huevo. Una bebida única y refrescante.",
                R.drawable.coctel_pisco_sour,
                "5 min",
                Dificultad.FACIL
            )
        )
    }

}