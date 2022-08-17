package com.example.vistaprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class SeleccionPaises : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {


        Thread.sleep(500)
        setTheme(R.style.Apptheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botonArg = findViewById<ImageButton>(R.id.imArg)
        botonArg.setOnClickListener{
            val lanzar1 = Intent(this, SeleccionPostreArg::class.java)
            startActivity(lanzar1)
        }
        val botonPeru = findViewById<ImageButton>(R.id.imPeru)
        botonPeru.setOnClickListener{
            val lanzar2 = Intent(this, SeleccionPostrePeru::class.java)
            startActivity(lanzar2)
        }

    }
}