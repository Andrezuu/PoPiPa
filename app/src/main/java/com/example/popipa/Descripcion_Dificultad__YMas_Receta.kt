package com.example.popipa

import android.R
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Base64
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import com.example.popipa.MainMenuActivity.Companion.DIFICULTAD_KEY
import com.example.popipa.MainMenuActivity.Companion.INGREDIENTES_CREACION_KEY
import com.example.popipa.MainMenuActivity.Companion.JSON_RECETAS_USUARIO
import com.example.popipa.MainMenuActivity.Companion.NOMBRE_CREACION_KEY
import com.example.popipa.MainMenuActivity.Companion.PASOS_CREACION_KEY
import com.example.popipa.dataClases.Ingrediente
import com.example.popipa.dataClases.PasoDePreparacion
import com.example.popipa.dataClases.TipoDePlato
import com.example.popipa.databinding.ActivityDescripcionDificultadYmasRecetaBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.ByteArrayOutputStream

class Descripcion_Dificultad__YMas_Receta : AppCompatActivity() {

    private lateinit var binding: ActivityDescripcionDificultadYmasRecetaBinding
    private lateinit var sharedPreferences: SharedPreferences

    private val gson = Gson()
    private val recetasUsuario = mutableListOf<TipoDePlato>()

    var spinnerSelected = ""
    val context: Context = this

    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { image ->
        binding.fotoPlato.setImageURI(image)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescripcionDificultadYmasRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        initSpiner()
        manageSpinner()

        val jsonList = sharedPreferences.getString(JSON_RECETAS_USUARIO, "")
        val listType = object : TypeToken<List<TipoDePlato>>() {}.type

        if (jsonList != "") {
            val newList = gson.fromJson<List<TipoDePlato>>(jsonList, listType)
            recetasUsuario.addAll(newList)
        }

        binding.fotoPlato.setOnClickListener {
            galeriaLauncher.launch("image/*")

        }

        binding.buttonFinalizar.setOnClickListener {
            val isIncomplete = spinnerSelected.isEmpty() || (binding.fotoPlato.drawable == null)
                    || binding.duracionEdit.text.isEmpty() || binding.descripcionEdit.text.isEmpty()

            if (isIncomplete) {
                Toast.makeText(context, "Completa los datos!", Toast.LENGTH_SHORT).show()
            } else {
                guardarSharedPreferences()
            }
        }
    }

    fun guardarSharedPreferences() {

        val nombreNuevo = intent.getSerializableExtra(NOMBRE_CREACION_KEY) as String
        val descripcionNuevo = binding.descripcionEdit.text.toString()
        val tiempoNuevo = binding.duracionEdit.text.toString()
        val dificultadNuevo = when (spinnerSelected) {
            "Fácil" -> 1
            "Medio" -> 2
            "Difícil" -> 3
            else -> 2
        }

        val ingredienteArray =
            intent.getSerializableExtra(INGREDIENTES_CREACION_KEY) as Array<Ingrediente>
        val pasoArray = intent.getSerializableExtra(PASOS_CREACION_KEY) as Array<PasoDePreparacion>

        val imagenBitmap = binding.fotoPlato.drawable.toBitmap()


        val ingredientesNuevos = ingredienteArray.toList()
        val pasosNuevos = pasoArray.toList()


        val newReceta = TipoDePlato(
            nombreNuevo,
            descripcionNuevo,
            bitmapToString(imagenBitmap),
            tiempoNuevo,
            dificultadNuevo,
            false,
            ingredientesNuevos,
            pasosNuevos
        )
        recetasUsuario.add(newReceta)
        manageJson()
        val intent = Intent(context, RecetasUsuario::class.java)
        startActivity(intent)

    }

    fun manageJson() {
        val newJsonList = gson.toJson(recetasUsuario)

        val editor = sharedPreferences.edit()
        editor.putString(JSON_RECETAS_USUARIO, newJsonList)
        editor.apply()

    }

    fun initSpiner() {
        val dataList = mutableListOf<String>()
        dataList.add("Fácil")
        dataList.add("Medio")
        dataList.add("Difícil")
        val adapter = ArrayAdapter(
            this,
            R.layout.simple_spinner_item,
            dataList
        )
        binding.spinnerDificultad.adapter = adapter
        binding.spinnerDificultad.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                binding.textViewSelectedSpinner.text = dataList[position]
                spinnerSelected = dataList[position]
                Toast.makeText(
                    this@Descripcion_Dificultad__YMas_Receta,
                    "Seleccionaste $spinnerSelected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }

    fun manageSpinner() {
        binding.guardarDificultad.setOnClickListener {
            val editor = sharedPreferences.edit()
            val savedData = spinnerSelected
            editor.putString(DIFICULTAD_KEY, savedData)
            editor.apply()
            val experiencia = sharedPreferences.getString(DIFICULTAD_KEY, "")
            binding.textViewSelectedSpinner.text = experiencia
            editor.apply()
        }
    }

    fun bitmapToString(bitmap: Bitmap): String {

        val byteArrayOutputStream = ByteArrayOutputStream()

        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)

        val byteArray = byteArrayOutputStream.toByteArray()

        return Base64.encodeToString(byteArray, Base64.DEFAULT)
    }


}