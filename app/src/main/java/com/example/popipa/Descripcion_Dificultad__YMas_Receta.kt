package com.example.popipa

import android.R
import android.app.Instrumentation.ActivityResult
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.graphics.drawable.toBitmap
import com.example.popipa.databinding.ActivityDescripcionDificultadYmasRecetaBinding
import java.io.ByteArrayOutputStream

class Descripcion_Dificultad__YMas_Receta : AppCompatActivity() {

    lateinit var binding: ActivityDescripcionDificultadYmasRecetaBinding
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
        initSpiner()

        binding.fotoPlato.setOnClickListener {
            galeriaLauncher.launch("image/*")

        }
    }

    //Funcion para cambiar de pantalla
    fun onFinalizarButtonClicked(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
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

    fun savePaso() {
        val imageSelected = binding.fotoPlato.drawable.toBitmap()
        val imageString: String = bitmapToString(imageSelected)
        //falta colocar el resto del codigo para guardar la imagen y el resto de datos

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
}