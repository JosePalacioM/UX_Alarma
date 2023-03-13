package com.example.alarmapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Recordatorios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recordatorios)

        val image_view = findViewById<ImageView>(R.id.imgAlarmas)
        image_view.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

        val image_view2 = findViewById<ImageView>(R.id.imgCronometro)
        image_view2.setOnClickListener {
            val intent = Intent(this, Cronometro::class.java)
            startActivity(intent)
        }

        val image_view3 = findViewById<ImageView>(R.id.imgTemporizador)
        // set on-click listener for ImageView
        image_view3.setOnClickListener {
            val intent = Intent(this, Temporizador::class.java)
            startActivity(intent)
        }

        val image_view4 = findViewById<ImageView>(R.id.imgCrear)
        image_view4.setOnClickListener {
            val intent = Intent(this, ConfigRecordatorio::class.java)
            startActivity(intent)
        }
    }
}