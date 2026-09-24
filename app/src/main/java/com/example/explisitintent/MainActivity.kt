package com.example.explisitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var _btnExplisit1 = findViewById<Button>(R.id.btnExplisit1)
        _btnExplisit1.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                MainActivity2 ::class.java
            )
            startActivity(intent)
        }

        val edtExplisit = findViewById<EditText>(R.id.edtExplisit)
        val btnExplisit2 = findViewById<Button>(R.id.btnExplisit2)

        btnExplisit2.setOnClickListener {
            val teksYangDikirim = edtExplisit.text.toString()
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            intent.putExtra(MainActivity3.dataTerima, teksYangDikirim)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}