package com.example.praktikum1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textViewGame = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewGame)
        textViewGame.setOnClickListener {
        }

        val textViewApp = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewApp)
        textViewApp.setOnClickListener {
        }

        val textViewMovie = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewMovie)
        textViewMovie.setOnClickListener {
        }

        val textViewMusic = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewMusic)
        textViewMusic.setOnClickListener {
        }

        val textViewBook = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewBook)
        textViewBook.setOnClickListener {
        }

        val textViewNews = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonViewNews)
        textViewNews.setOnClickListener {
        }

        val ButtonMore1 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonMore1)
        ButtonMore1.setOnClickListener {
        }

        val ButtonMore2 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.ButtonMore2)
        ButtonMore2.setOnClickListener {
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
