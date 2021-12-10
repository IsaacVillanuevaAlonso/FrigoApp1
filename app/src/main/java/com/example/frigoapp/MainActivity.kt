package com.example.frigoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val congelador = findViewById<Button>(R.id.btn_congelador)
        congelador.setOnClickListener{
            val intent =    Intent(this,Congelador::class.java)
            startActivity(intent)
        }
    }
}