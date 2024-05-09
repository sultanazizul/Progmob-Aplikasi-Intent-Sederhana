package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnOpenFirstActivity = findViewById<Button>(R.id.BtnFirstAct)
        val btnOpenSecondActivity = findViewById<Button>(R.id.BtnSecondAct)

        btnOpenFirstActivity.setOnClickListener {
            // Membuat intent untuk berpindah ke FirstActivity
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        btnOpenSecondActivity.setOnClickListener {
            // Membuat intent untuk berpindah ke SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}