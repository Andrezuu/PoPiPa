package com.example.popipa

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.dataClases.Usuario
import com.example.popipa.databinding.ActivitySignInBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var auth: FirebaseAuth
    val context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.crearCuenta.setOnClickListener {
            clickCrearCuenta(
                binding.editGmail.text.toString(),
                binding.editPassword.text.toString(),
                binding.editNombres.text.toString(),
                binding.editApellidos.text.toString()

            )
        }

        binding.volverLogin.setOnClickListener {
            val intent = Intent(context, LogInActivity::class.java)
            startActivity(intent)
        }
    }

    fun clickCrearCuenta(email: String, contrasena: String, nombres: String, apellidos: String) {
        auth.createUserWithEmailAndPassword(email, contrasena)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    val newUser: Usuario = Usuario(nombres, apellidos, email, contrasena)
                    //TODO mandar usuario para guardar info
                    val intent = Intent(context, LogInActivity::class.java)
                    startActivity(intent)
                }
            }
    }


}