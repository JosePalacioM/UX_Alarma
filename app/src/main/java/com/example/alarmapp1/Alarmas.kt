package com.example.alarmapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class Alarmas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas)

        val image_view = findViewById<ImageView>(R.id.imgRecordatorios)
        image_view.setOnClickListener {
            val intent = Intent(this, Recordatorios::class.java)
            startActivity(intent)
        }

        val image_view2 = findViewById<ImageView>(R.id.imgCronometro)
        image_view2.setOnClickListener {
            val intent = Intent(this, Cronometro::class.java)
            startActivity(intent)
        }

        val image_view3 = findViewById<ImageView>(R.id.imgTemporizador)
        image_view3.setOnClickListener {
            val intent = Intent(this, Temporizador::class.java)
            startActivity(intent)
        }

        val image_view4 = findViewById<ImageView>(R.id.imgLogin)
        image_view4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val image_view5 = findViewById<ImageView>(R.id.imgAlarmasToggle1)
        image_view5.setOnClickListener {
            val intent = Intent(this, ConfigAlarma::class.java)
            startActivity(intent)
        }

        val image_view6 = findViewById<ImageView>(R.id.imgAlarmasToggle2)
        image_view6.setOnClickListener {
            val intent = Intent(this, ConfigAlarma::class.java)
            startActivity(intent)
        }

        val image_view7 = findViewById<ImageView>(R.id.imgCrear)
        image_view7.setOnClickListener {
            val intent = Intent(this, ConfigAlarma::class.java)
            startActivity(intent)
        }

    }
}