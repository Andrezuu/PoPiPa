package com.example.popipa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.databinding.ActivityPerfilUsuarioBinding


class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO poner los datos del usuario actual en la pantalla de usuario
    }
}