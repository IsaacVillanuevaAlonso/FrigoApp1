 package com.example.frigoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

 class Congelador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congelador)

        val arrayAdapter:ArrayAdapter<*>

        val elementos = mutableListOf("Nuggets","Pollo","Macarrones","Carne")
        val lista = findViewById<ListView>(R.id.lv_lista)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,elementos)
        lista.adapter = arrayAdapter
    }

}
