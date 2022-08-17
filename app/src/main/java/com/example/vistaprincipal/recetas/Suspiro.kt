package com.example.vistaprincipal.recetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.vistaprincipal.R
import com.example.vistaprincipal.SeleccionPostreArg
import com.example.vistaprincipal.SeleccionPostrePeru

class Suspiro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suspiro)

        val botonVolver = findViewById<ImageView>(R.id.volver3)
        botonVolver.setOnClickListener{
            val lanzar1 = Intent(this, SeleccionPostrePeru::class.java)
            startActivity(lanzar1)
        }

    }
}