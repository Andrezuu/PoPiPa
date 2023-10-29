package com.example.popipa

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.databinding.ActivityPerfilUsuarioBinding


class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilUsuarioBinding
    private val context: Context = this
    private val galeriaLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ::abrirGaleria
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //abrir la galeria para cambiar la foto de perfil
        binding.fotoPerfil.setOnClickListener {
            onImagenPerfilButtonClicked(binding.fotoPerfil)
        }

        binding.botonVolver.setOnClickListener {
            onVolverButtonClicked(binding.botonVolver)
        }
        val sharedPreferences = getSharedPreferences("MiAppPrefs", Context.MODE_PRIVATE)
        val nombreUsuario = sharedPreferences.getString("nombre", "")
        val apellidoUsuario = sharedPreferences.getString("apellido","")
        val emailUsuario = sharedPreferences.getString("email","")
        val contraseña = sharedPreferences.getString("contraseña","")

        //TODO poner los datos del usuario actual en la pantalla de usuario
        binding.usuarioApellidos.text = apellidoUsuario
        binding.usuarioEmail.text = emailUsuario
        binding.usuarioNombres.text = nombreUsuario

    }

    fun abrirGaleria(result: ActivityResult) {
        if (result.resultCode == RESULT_OK) {
            // Guardar informacion en tipo URI de la imagen seleccionada
            val imageUri = result.data?.data
            // Convertir la imagen a un bitmap, con un let  debido al tipaje
            val bitmapImage = BitmapFactory.decodeStream(imageUri?.let {
                contentResolver.openInputStream(
                    it
                )
            })
            //reescalar la imagen para luego cargarla a la aplicacion
            val resizedBitmapImage = Bitmap.createScaledBitmap(bitmapImage, 800, 800, true)
            binding.fotoPerfil.setImageBitmap(resizedBitmapImage)
        }
    }

    fun onImagenPerfilButtonClicked(view: View) {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        galeriaLauncher.launch(intent)

    }

    fun onVolverButtonClicked(view: View) {
        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }


}