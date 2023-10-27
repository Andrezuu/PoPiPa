package com.example.popipa.listas

import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.R
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesAjiGallina
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesAsado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesBudin
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesCausaLimeña
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesCevicheCamarones
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesCevichePescado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesCevichePulpo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesEmpanadasArgentinas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesEnchiladasRojas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesFlanNapolitano
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesFugazzeta
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesLomoSaltado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesMedialunas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPascualina
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPastaAlfredo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPicarones
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPolloDisco
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPozoleRojo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesPozoleVerde
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesRavioles
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesRisottoHongos
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTacosCarnitas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTacosPastor
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTacosSuadero
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTamalesElote
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTamalesOaxaqueños
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.IngredientesTostadasTinga
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosAjiGallina
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosAsado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosBudin
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosCausaLimeña
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosCevicheCamarones
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosCevichePescado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosCevichePulpo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosEmpanadasArgentinas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosEnchiladasRojas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosFlanNapolitano
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosFugazzeta
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosLomoSaltado
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosMedialunas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPascualina
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPastaAlfredo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPicarones
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPolloDisco
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPozoleRojo
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosPozoleVerde
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosRavioles
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosRisottoHongos
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTacosCarnitas
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTacosPastor
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTacosSuadero
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTamalesElote
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTamalesOaxaqueños
import com.example.popipa.listas.ListaDeIngredientesDeRecomendacion.PasosTostadasTinga
class ListaDeRecomendacion {
    companion object {
    val listaTiposDeDesayuno = listOf<TipoDePlato>(

        TipoDePlato("Ceviche de pescado", "Ceviche peruano de pescado con limón, ají y choclo.", R.drawable.ceviche, "45 min", 3, Megusta = false, IngredientesCevichePescado.listaCeviche,PasosCevichePescado.pasosDePreparacionCeviche),

        TipoDePlato("Tacos al pastor", "Tacos al pastor con carne marinada, piña, cilantro y tortillas de maíz.", R.drawable.tacos_al_pastor, "30 min", 2, Megusta = false, IngredientesTacosPastor.listaTacosPastor,PasosTacosPastor.pasosDePreparacionTacosPastor),

        TipoDePlato("Pozole rojo", "Pozole rojo con carne de cerdo, maíz, chile y vegetales.", R.drawable.pozole, "90 min", 3, Megusta = false, IngredientesPozoleRojo.listaPozole,PasosPozoleRojo.pasosDePreparacionPozole),

        TipoDePlato("Tamales oaxaqueños", "Tamales de masa con relleno de pollo envueltos en hoja de plátano.", R.drawable.tamales, "120 min", 3, Megusta = false, IngredientesTamalesOaxaqueños.listaTamales,PasosTamalesOaxaqueños.pasosDePreparacionTamales),

        TipoDePlato("Flan napolitano", "Flan de vainilla con caramelo líquido.", R.drawable.flan, "50 min", 3, Megusta = false, IngredientesFlanNapolitano.listaFlan,PasosFlanNapolitano.pasosDePreparacionFlan),

        TipoDePlato("Ceviche de camarones", "Ceviche con camarones, jugo de limón, ají amarillo y choclo.", R.drawable.ceviche_camarones, "30 min", 3, Megusta = false, IngredientesCevicheCamarones.listaCevicheCamarones,PasosCevicheCamarones.pasosDePreparacionCevicheDeCamarones),

        TipoDePlato("Lomo saltado", "Lomo saltado de res con tomate, cebolla y papas fritas.", R.drawable.lomo_saltado, "45 min", 2, Megusta = false, IngredientesLomoSaltado.listaLomoSaltado,PasosLomoSaltado.pasosDePreparacionLomoSaltado),

        TipoDePlato("Ají de gallina", "Ají de gallina con trozos de pollo, ají amarillo y arroz.", R.drawable.aji_gallina, "60 min", 3, Megusta = false, IngredientesAjiGallina.listaAjiDeGallina,PasosAjiGallina.pasosDePreparacionAjiDeGallina),

        TipoDePlato("Causa limeña", "Causa limeña de papa amarilla con pollo y salsa de ají.", R.drawable.causa_limena, "90 min", 3, Megusta = false, IngredientesCausaLimeña.listaCausaLimena,PasosCausaLimeña.pasosDePreparacionCausaLimena),

        TipoDePlato("Picarones", "Picarones peruanos con miel de chancaca.", R.drawable.picarones, "45 min", 3, Megusta = false, IngredientesPicarones.listaPicarones,PasosPicarones.pasosDePreparacionPicarones),

        TipoDePlato("Risotto de hongos", "Risotto cremoso con variedad de hongos", R.drawable.risotto, "30 min", 3, false,IngredientesRisottoHongos.listaRisotto,PasosRisottoHongos.pasosDePreparacionRisotto),

        TipoDePlato("Tacos de carnitas", "Tortillas de maíz con carnitas y salsa verde", R.drawable.tacos_carnitas, "25 min", 2, false,IngredientesTacosCarnitas.listaCarnitas,PasosTacosCarnitas.pasosDePreparacionCarnitas),

        TipoDePlato("Tostadas de tinga", "Tostadas con tinga de pollo y frijoles refritos", R.drawable.tostadas, "20 min", 2,false, IngredientesTostadasTinga.listaTinga,PasosTostadasTinga.pasosDePreparacionTinga),

        TipoDePlato("Pozole verde", "Pozole con pollo en salsa verde de tomatillo", R.drawable.pozole_verde, "60 min", 3, false,IngredientesPozoleVerde.listaPozoleVerde,PasosPozoleVerde.pasosDePreparacionPozoleVerde),

        TipoDePlato("Enchiladas rojas", "Enchiladas rojas de pollo con queso", R.drawable.enchiladas, "40 min", 3,false, IngredientesEnchiladasRojas.listaEnchiladas,PasosEnchiladasRojas.pasosDePreparacionEnchiladas),

        TipoDePlato("Tamales de elote", "Tamales de masa con granos de elote", R.drawable.tamales_elote, "90 min", 4, false,IngredientesTamalesElote.listaTamalesDeElote,PasosTamalesElote.pasosDePreparacionTamalesDeElote),

        TipoDePlato("Ceviche de pulpo", "Ceviche de pulpo con jugo de limón", R.drawable.ceviche_pulpo, "30 min", 3, false,IngredientesCevichePulpo.listaCevichePulpo,PasosCevichePulpo.pasosDePreparacionCevicheDePulpo),

        TipoDePlato("Tacos de suadero", "Tacos de suadero con cebolla y cilantro", R.drawable.tacos_suadero, "25 min", 2,false, IngredientesTacosSuadero.listaSuadero,PasosTacosSuadero.pasosDePreparacionSuadero),

        TipoDePlato("Empanadas argentinas", "Empanadas fritas de carne con chimichurri", R.drawable.empanadas, "45 min", 3,false, IngredientesEmpanadasArgentinas.listaEmpanadas,PasosEmpanadasArgentinas.pasosDePreparacionEmpanadas),

        TipoDePlato("Asado argentino", "Bife de chorizo, morcilla, chorizo y chimichurri", R.drawable.asado, "60 min", 4,false, IngredientesAsado.listaAsado,PasosAsado.pasosDePreparacionAsado),

        TipoDePlato("Pasta Alfredo", "Pasta en salsa Alfredo con pollo y champiñones", R.drawable.pasta_alfredo, "30 min", 3,false, IngredientesPastaAlfredo.listaAlfredo,PasosPastaAlfredo.pasosDePreparacionFettuccineAlfredo),

        TipoDePlato("Ravioles de ricota", "Ravioles rellenos de ricota y salsa de tomate", R.drawable.ravioles, "25 min", 2,false, IngredientesRavioles.listaRavioles,PasosRavioles.pasosDePreparacionRavioles),

        TipoDePlato("Budín de pan", "Budín horneado de pan con pasas y canela", R.drawable.budin, "60 min", 2, false,IngredientesBudin.listaBudin,PasosBudin.pasosDePreparacionBudinDePan),

        TipoDePlato(" medialunas", "Medialunas dulces con grasa y azúcar", R.drawable.medialunas, "40 min", 4,false, IngredientesMedialunas.listaMediaLuna,PasosMedialunas.pasosDePreparacionMediaLuna),

        TipoDePlato("Fugazzeta", "Pizza con cebolla, mozzarella y aceitunas", R.drawable.fugazzeta, "30 min", 2, false,IngredientesFugazzeta.listaFugazzeta,PasosFugazzeta.pasosDePreparacionFugazzeta),

        TipoDePlato("Pollo al disco", "Pollo a la parrilla con papas y ensalada", R.drawable.pollo_disco, "45 min", 3,false, IngredientesPolloDisco.listaPolloDisco,PasosPolloDisco.pasosDePreparacionPolloDisco),

        TipoDePlato("Pascualina", "Tarta de hojaldre con verdura y jamón", R.drawable.pascualina, "60 min", 4, false,IngredientesPascualina.listaPascualina,PasosPascualina.pasosDePreparacionPascualina)
    )
    }
}