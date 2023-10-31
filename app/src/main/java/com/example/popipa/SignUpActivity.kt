package com.example.popipa

import android.R
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.MainMenuActivity.Companion.APELLIDO_KEY
import com.example.popipa.MainMenuActivity.Companion.EMAIL_KEY
import com.example.popipa.MainMenuActivity.Companion.NOMBRE_KEY
import com.example.popipa.databinding.ActivitySignInBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var preference: SharedPreferences
    private val context: Context = this

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
                binding.editApellidos.text.toString(),
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
                    //TODO mandar usuario para guardar info
                    val editor = preference.edit()
                    editor.putString(NOMBRE_KEY, nombres)
                    editor.putString(APELLIDO_KEY, apellidos)
                    editor.putString(EMAIL_KEY, email)
                    editor.apply()

                    val intent = Intent(context, LogInActivity::class.java)
                    startActivity(intent)
                }
            }
    }

}
