package com.example.vistaprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.example.vistaprincipal.recetas.Pastelito
import com.example.vistaprincipal.recetas.Picaron
import com.example.vistaprincipal.recetas.Suspiro

class SeleccionPostrePeru : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_postre_peru)

        val botonVolver = findViewById<ImageView>(R.id.volver)
        botonVolver.setOnClickListener{
            val lanzar1 = Intent(this, SeleccionPaises::class.java)
            startActivity(lanzar1)
        }

        val botonSuspiro = findViewById<ImageButton>(R.id.imSuspiro)
        botonSuspiro.setOnClickListener{
            val lanzar2 = Intent(this, Suspiro::class.java)
            startActivity(lanzar2)
        }

        val botonPicaron = findViewById<ImageButton>(R.id.imPicaron)
        botonPicaron.setOnClickListener{
            val lanzar3 = Intent(this, Picaron::class.java)
            startActivity(lanzar3)
        }

    }
}