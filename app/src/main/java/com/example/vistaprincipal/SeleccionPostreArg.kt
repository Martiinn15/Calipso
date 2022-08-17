package com.example.vistaprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.vistaprincipal.recetas.Chocotorta
import com.example.vistaprincipal.recetas.Pastelito
import kotlinx.android.synthetic.main.activity_seleccion_postre_arg.*

class SeleccionPostreArg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_postre_arg)

        val botonVolver = findViewById<ImageView>(R.id.imVolver)
        botonVolver.setOnClickListener{
            val lanzar1 = Intent(this, SeleccionPaises::class.java)
            startActivity(lanzar1)
        }

        val botonChoco = findViewById<ImageView>(R.id.imChocotorta)
        botonChoco.setOnClickListener{
            val lanzar2 = Intent(this, Chocotorta::class.java)
            startActivity(lanzar2)
        }

        val botonPastelito = findViewById<ImageView>(R.id.imPastelitos)
        botonPastelito.setOnClickListener{
            val lanzar3 = Intent(this, Pastelito::class.java)
            startActivity(lanzar3)
        }

    }
}