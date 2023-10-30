package com.example.popipa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popipa.databinding.ActivityInicioBinding
import android.os.Handler

class InicioActivity : AppCompatActivity() {

    private lateinit var binding:ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Aca se modifica cuanto tiempo estara la pantalla para cambiar
        // a la otra pantalla
        val tiempoEspera=500 //0.5 segundos

        Handler().postDelayed({
            val intent= Intent(this,LogInActivity::class.java)
            startActivity(intent)
            finish()
        },tiempoEspera.toLong())
    }
}