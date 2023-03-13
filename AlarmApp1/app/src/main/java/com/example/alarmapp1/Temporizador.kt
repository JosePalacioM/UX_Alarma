package com.example.alarmapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Temporizador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temporizador)

        val image_view = findViewById<ImageView>(R.id.imgAlarmas)
        image_view.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

        val image_view2 = findViewById<ImageView>(R.id.imgRecordatorios)
        image_view2.setOnClickListener {
            val intent = Intent(this, Recordatorios::class.java)
            startActivity(intent)
        }

        val image_view3 = findViewById<ImageView>(R.id.imgCronometro)
        // set on-click listener for ImageView
        image_view3.setOnClickListener {
            val intent = Intent(this, Cronometro::class.java)
            startActivity(intent)
        }
    }
}