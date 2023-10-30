package com.example.popipa

import android.R
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.popipa.databinding.ActivityDescripcionDificultadYmasRecetaBinding

class Descripcion_Dificultad__YMas_Receta : AppCompatActivity() {

    lateinit var binding:ActivityDescripcionDificultadYmasRecetaBinding
    var spinnerSelected = ""
    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescripcionDificultadYmasRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSpiner()
    }
    //Funcion para cambiar de pantalla
    fun onFinalizarButtonClicked(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun initSpiner(){
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
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                binding.textViewSelectedSpinner.text = dataList[position]
                spinnerSelected = dataList[position]
                Toast.makeText(this@Descripcion_Dificultad__YMas_Receta,"Seleccionaste $spinnerSelected", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }
}