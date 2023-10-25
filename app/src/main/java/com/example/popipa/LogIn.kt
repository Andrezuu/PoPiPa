package com.example.popipa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class LogIn : AppCompatActivity()  {

    //private lateinit var binding:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding =
        setContentView(R.layout.activity_log_in)
    }
    private lateinit var binding: LogIn
    private lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth
//    auth = Firebase.auth
//
//
//
//
//
//
//    auth.createUserWithEmailAndPassword(email, password)
//    .addOnCompleteListener(this) { task ->
//        if (task.isSuccessful) {
//            // Sign in success, update UI with the signed-in user's information
//            Log.d(TAG, "createUserWithEmail:success")
//            val user = auth.currentUser
//            updateUI(user)
//        } else {
//            // If sign in fails, display a message to the user.
//            Log.w(TAG, "createUserWithEmail:failure", task.exception)
//            Toast.makeText(
//                baseContext,
//                "Authentication failed.",
//                Toast.LENGTH_SHORT,
//            ).show()
//            updateUI(null)
//        }
//    }

    fun clickCrearCuenta(email:String,contraseña: String){
        auth.createUserWithEmailAndPassword(email,contraseña)
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){
                    val user = auth.currentUser
                } else {

                }
            }
    }

}
