package com.example.alarmapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.btnIngresar)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }

        val text = findViewById<TextView>(R.id.txtRegistrate)
        text.setOnClickListener {
            val intent= Intent(this, SignIN::class.java)
            startActivity(intent)

        }
    }
}

