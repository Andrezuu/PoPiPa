package com.example.popipa

import android.R
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.MainMenuActivity.Companion.DIFICULTAD_KEY
import com.example.popipa.databinding.ActivityDescripcionDificultadYmasRecetaBinding
import java.io.ByteArrayOutputStream

class Descripcion_Dificultad__YMas_Receta : AppCompatActivity() {

    private lateinit var binding: ActivityDescripcionDificultadYmasRecetaBinding
    private lateinit var sharedPreferences: SharedPreferences
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

    fun bitmapToString(bitmap: Bitmap): String {
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
        val byteArray = byteArrayOutputStream.toByteArray()
        return Base64.encodeToString(byteArray, Base64.DEFAULT)
    }

    fun stringToBitmap(encodedString: String): Bitmap? {
        val decodedBytes = Base64.decode(encodedString, Base64.DEFAULT)
        return BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
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
}