package com.example.vistaprincipal.recetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.vistaprincipal.R
import com.example.vistaprincipal.SeleccionPaises
import com.example.vistaprincipal.SeleccionPostreArg

class Chocotorta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chocotorta)

        val botonVolver = findViewById<ImageView>(R.id.volver)
        botonVolver.setOnClickListener{
            val lanzar1 = Intent(this, SeleccionPostreArg::class.java)
            startActivity(lanzar1)
        }

    }
}