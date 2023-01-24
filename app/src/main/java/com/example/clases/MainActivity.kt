package com.example.clases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imagen = findViewById<ImageView>(R.id.imageView)
        var comenzar = findViewById<Button>(R.id.button)
        var mago = findViewById<Button>(R.id.mago)
        var ladron = findViewById<Button>(R.id.ladron)
        var guerrero = findViewById<Button>(R.id.gurrero)
        var berserker = findViewById<Button>(R.id.berserker)

        mago.setOnClickListener(){
            imagen.setImageResource(R.drawable.mago)
        }

        ladron.setOnClickListener(){
            imagen.setImageResource(R.drawable.ladron)
        }

        guerrero.setOnClickListener(){
            imagen.setImageResource(R.drawable.guerrero)
        }

        berserker.setOnClickListener(){
            imagen.setImageResource(R.drawable.berserker)
        }

        comenzar.setOnClickListener(){
            var cambio=Intent(this, MainActivity2::class.java)
            startActivity(cambio)
        }

    }
}