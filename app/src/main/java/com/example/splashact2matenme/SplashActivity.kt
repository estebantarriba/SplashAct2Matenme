package com.example.splashact2matenme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mostrarBienvenida() //llamo funcion
    }
    fun mostrarBienvenida() {
        object : CountDownTimer(6000, 1000) { //declaras reloj
            override fun onTick(millisUntilFinished: Long) { //esto es el proceso en lo que funciona
                //accion
            }

            override fun onFinish() {//despues de contar
                val Intent = Intent(applicationContext, MainActivity::class.java) //te manda a otra actividad
                startActivity(Intent)
                finish()//termina la actividad actual
            }


        }.start()

    }
}
