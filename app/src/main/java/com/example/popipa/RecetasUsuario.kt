package com.example.popipa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.popipa.databinding.ActivityRecetasUsuarioBinding

class RecetasUsuario : AppCompatActivity() {

    private lateinit var binding:ActivityRecetasUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecetasUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onVolverButtonClicked2(view: View) {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}