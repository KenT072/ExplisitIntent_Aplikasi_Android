package com.example.explisitintent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    companion object {
        const val dataTerima = "data_terima"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val tvShowData = findViewById<TextView>(R.id.showData)
        val dataTeks = intent.getStringExtra(dataTerima)
        tvShowData.text = dataTeks
    }
}