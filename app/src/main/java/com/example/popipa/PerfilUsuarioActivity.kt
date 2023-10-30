package com.example.popipa

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import com.example.popipa.databinding.ActivityPerfilUsuarioBinding
import java.io.ByteArrayOutputStream


class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilUsuarioBinding
    private val context: Context = this

    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { image ->
        binding.fotoPerfil.setImageURI(image)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()

        //abrir la galeria para cambiar la foto de perfil
        binding.fotoPerfil.setOnClickListener {
            galeriaLauncher.launch("image/*")

        }

        binding.guardar.setOnClickListener {
            saveData()
        }

        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }


        val sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        val nombreUsuario = sharedPreferences.getString("nombre", "")
        val apellidoUsuario = sharedPreferences.getString("apellido", "")
        val emailUsuario = sharedPreferences.getString("email", "")

        val contrasena = sharedPreferences.getString("contraseña", "")

        //TODO poner los datos del usuario actual en la pantalla de usuario
        binding.usuarioApellidos.text = apellidoUsuario
        binding.usuarioEmail.text = emailUsuario
        binding.usuarioNombres.text = nombreUsuario


    }

    fun saveData() {


        val imageSelected = binding.fotoPerfil.drawable.toBitmap()
        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()


        val imageString: String = bitmapToString(imageSelected)

        editor.putString("STRING_KEY", imageString)
        editor.apply()

        binding.fotoPerfil.setImageBitmap(imageSelected)
        //binding.prueba2.text = imageString
        Toast.makeText(context, "Foto guardada!", Toast.LENGTH_SHORT).show()


    }

    fun loadData() {

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val imagenGuardadaString = sharedPreferences.getString("STRING_KEY", "")

        val imagenGuardada = imagenGuardadaString?.let { stringToBitmap(it) }

        binding.fotoPerfil.setImageBitmap(imagenGuardada)
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

//    fun initSpinner() {
//        val dataList = mutableListOf<String>()
//        dataList.add("Basico")
//        dataList.add("Junnior Chef")
//        dataList.add("Chef")
//
//        val adapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_spinner_item,
//            dataList
//        )
//
//        binding.spiner.adapter = adapter
//        binding.spiner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
//                //binding.guardarExperiencia.text = dataList[position]
//                spinnerSelected = dataList[position]
//                Toast.makeText(this@PerfilUsuarioActivity, "Chef?", Toast.LENGTH_LONG).show()
//            }
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//            }
//
//        }
//    }


//    fun managePreferences() {
//        preference = PreferenceManager.getDefaultSharedPreferences(this)
//        binding.botonGuardarExperiencia.setOnClickListener {
//            val editor = preference.edit()
//            var savedData = spinnerSelected
//            editor.putString("experiencia",savedData)
//            editor.apply()
//            val experiencia = preference.getString("experiencia","F")
//            binding.textGuardarExperiencia.text = experiencia
//            editor.apply()
//        }
//    }
}