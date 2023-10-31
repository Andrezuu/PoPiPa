package com.example.popipa

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import androidx.appcompat.app.AppCompatActivity
import com.example.popipa.databinding.ActivityLogInBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class LogInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogInBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.crearCuenta.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.iniciarSesion.setOnClickListener {
            loginUser(binding.editGmail.text.toString(), binding.editPassword.text.toString())
        }
        val passwordEditText = binding.editPassword
        val eyeButton = binding.eyeContrasenaLogIn
        var isPasswordVisible=false
        binding.eyeContrasenaLogIn.setOnClickListener{
            isPasswordVisible = !isPasswordVisible
            if(isPasswordVisible){
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                eyeButton.setImageResource(R.drawable.eye)
            }else{
                passwordEditText.inputType=InputType.TYPE_TEXT_VARIATION_PASSWORD
                eyeButton.setImageResource(R.drawable.eye)
            }
            passwordEditText.setSelection(passwordEditText.text.length)
        }
    }

    fun loginUser(email: String, password: String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener { task ->
                if(task.isSuccessful){
                    val intent = Intent(this, MainMenuActivity::class.java)
                    startActivity(intent)
                }
            }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
            finish() // Opcional: Cierra la actividad actual si el usuario ya inició sesión.
        }
    }
}
