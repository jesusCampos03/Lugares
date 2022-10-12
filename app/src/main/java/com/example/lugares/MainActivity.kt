package com.example.lugares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.lugares.databinding.ActivityMainBinding
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlin.math.log

class MainActivity : AppCompatActivity() {
   private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)}
      //  firebaseApp.initializeApp(this)
     //   auth = firebase.auth
    // binding.btLogin.setOnClickListener(){
    //    hacerlogin();
    }
//binging.btRegister.setOnClickListTener(){
  //  hacerlogin();
//}

private fun hacerRegister (){
//    var email = binding.etmail.text.tostring()
//    var clave = binding.eclave.text.tostring()

    auth.createUserWihthEmailAndPassword(email,clave)
        .addOnCompletelistener(this){ Task ->
            if (task.isSuccessdul){
                log.d("creando Usuario","registrando")
                val user = auth.currentUser
                if (user !=null){
                    actualiza(user)
                }
                }else{
                    Log.d("crando usuario","fallo")
                    toast.maketext(baseContext,"fallo",toast.LENGTH_LONG).SHOW()

            }
        }

}

