package com.example.popipa

import android.R
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Base64
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.core.content.edit
import androidx.core.graphics.drawable.toBitmap
import com.example.popipa.MainMenuActivity.Companion.APELLIDO_KEY
import com.example.popipa.MainMenuActivity.Companion.EMAIL_KEY
import com.example.popipa.MainMenuActivity.Companion.EXPERIENCIA_KEY
import com.example.popipa.MainMenuActivity.Companion.IMAGE_STRING_KEY
import com.example.popipa.MainMenuActivity.Companion.NOMBRE_KEY
import com.example.popipa.databinding.ActivityPerfilUsuarioBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import java.io.ByteArrayOutputStream
import kotlin.properties.Delegates


class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilUsuarioBinding
    private lateinit var sharedPreferences: SharedPreferences
    private val context: Context = this

    //Funcion lambda que crea una instacia para recibir una imagen
    //Para luego setearla como foto de perfil
    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { image ->
        binding.fotoPerfil.setImageURI(image)
    }

    var spinnerSelected = "opciones"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)

        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        cargarSharedPreferences()

        //abrir la galeria para cambiar la foto de perfil
        binding.fotoPerfil.setOnClickListener {
            galeriaLauncher.launch("image/*")

        }

        binding.guardar.setOnClickListener {
            guardarSharedPreferences()
        }

        binding.botonVolver.setOnClickListener {
            val intent = Intent(context, MainMenuActivity::class.java)
            startActivity(intent)
        }
        binding.botonSignOut.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        val nombreUsuario = sharedPreferences.getString(NOMBRE_KEY, "")
        val apellidoUsuario = sharedPreferences.getString(APELLIDO_KEY, "")
        val emailUsuario = sharedPreferences.getString(EMAIL_KEY, "")
        val experiencia = sharedPreferences.getString(EXPERIENCIA_KEY,"")

        //TODO poner los datos del usuario actual en la pantalla de usuario
        binding.usuarioApellidos.text = apellidoUsuario
        binding.usuarioEmail.text = emailUsuario
        binding.usuarioNombres.text = nombreUsuario
        binding.textoExperiencia.text = experiencia

        initSpinner()
        manageSpinner()
    }

    fun enableDarkMode(){
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
        delegate.applyDayNight()

    }

    fun disableDarkMode(){
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
        delegate.applyDayNight()
    }


    fun guardarSharedPreferences() {


        val imageSelected = binding.fotoPerfil.drawable.toBitmap()
        val editor = sharedPreferences.edit()

        val imageString: String = bitmapToString(imageSelected)

        editor.putString(IMAGE_STRING_KEY, imageString)
        editor.apply()

        binding.fotoPerfil.setImageBitmap(imageSelected)
        Toast.makeText(context, "Foto guardada!", Toast.LENGTH_SHORT).show()

    }

    fun cargarSharedPreferences() {

        val imagenGuardadaString = sharedPreferences.getString(IMAGE_STRING_KEY, "")

        //se lo pone con let porque  ImagenGuardadaString podria estar null
        val imagenGuardada = imagenGuardadaString?.let { stringToBitmap(it) }

        binding.fotoPerfil.setImageBitmap(imagenGuardada)
    }

    fun bitmapToString(bitmap: Bitmap): String {

        //crea un objeto para que se puede escribir data en binario en byteArrays
        val byteArrayOutputStream = ByteArrayOutputStream()

        //comprime un bitmap a png con el 100% de calidad
        //y lo guarda en el OutputStream que se creo anteriormente
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)

        //convierte los datos escritos a un byteArray
        val byteArray = byteArrayOutputStream.toByteArray()

        //Convierte el byteArray a un String de Base 64
        //Los String Base64 se usa para representar datos binarios
        return Base64.encodeToString(byteArray, Base64.DEFAULT)
    }

    fun stringToBitmap(encodedString: String): Bitmap? {

        //Convierte un String base 64 a un byteArray
        val decodedBytes = Base64.decode(encodedString, Base64.DEFAULT)

        //Convierte el byteArray a un bitmap
        return BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
    }

    fun initSpinner() {
        val dataList = mutableListOf<String>()
        dataList.add("Basico")
        dataList.add("Junnior Chef")
        dataList.add("Chef")

        val adapter = ArrayAdapter(
            this,
            R.layout.simple_spinner_item,
            dataList
        )
        binding.spiner.adapter = adapter
        binding.spiner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                //binding.guardarExperiencia.text = dataList[position]
                spinnerSelected = dataList[position]
                Toast.makeText(this@PerfilUsuarioActivity, "Mi Chef...", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }


    fun manageSpinner() {
        binding.guardarexp.setOnClickListener {
            val editor = sharedPreferences.edit()
            val savedData = spinnerSelected
            editor.putString("experiencia",savedData)
            editor.apply()
            val experiencia = sharedPreferences.getString("experiencia","")
            binding.textoExperiencia.text = experiencia
            editor.apply()
        }
    }
}