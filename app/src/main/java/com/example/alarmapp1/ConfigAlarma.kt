package com.example.alarmapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ConfigAlarma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config_alarma)

        val buttonClick = findViewById<Button>(R.id.btnEliminar)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

        val image_view1 = findViewById<ImageView>(R.id.imgAtras)
        image_view1.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

        val image_view2 = findViewById<ImageView>(R.id.imgGuardar)
        image_view2.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

    }
}