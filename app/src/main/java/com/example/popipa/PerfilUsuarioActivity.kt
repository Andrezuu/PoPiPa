package com.example.popipa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.MainMenuActivity.Companion.CLAVE_USUARIO
import com.example.popipa.dataClases.Usuario
import com.example.popipa.databinding.ActivityUsuarioBinding


class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currUser = intent.getSerializableExtra(CLAVE_USUARIO) as Usuario
        //TODO poner los datos del usuario actual en la pantalla de usuario
    }
}