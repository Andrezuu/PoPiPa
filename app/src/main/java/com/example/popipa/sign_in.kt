package com.example.popipa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    private lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth



    fun clickCrearCuenta(email:String,contraseña: String){
        auth.createUserWithEmailAndPassword(email,contraseña)
            .addOnCanceledListener (this){ task ->
                if(task.isSuccesful){
                    val user = auth.currentUser
                } else {

                }
            }
    }
}