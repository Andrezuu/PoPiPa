package com.example.popipa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popipa.adapter.TipoDePlatoAdapter
import com.example.popipa.dataClases.CategoriaTipoDePlato
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityTuMeGustaBinding
import com.example.popipa.listas.ListaCategoriasMenu
import com.example.popipa.listas.ListaDeRecomendacion
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ActivityTuMeGusta : AppCompatActivity() {

    private val context: Context = this
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityTuMeGustaBinding
    private val tipoDePlatoAdapter by lazy { TipoDePlatoAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityTuMeGustaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getMeGustaPlatos()
        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getMeGustaPlatos():List<TipoDePlato>{
        val platosJson = sharedPreferences.getString(MainMenuActivity.JSON_RECETAS_ME_GUSTA, "")

        if (platosJson != null) {
            val gson = Gson()
            return gson.fromJson(platosJson, object : TypeToken<List<TipoDePlato>>() {}.type)
        }

        return emptyList()
    }


}