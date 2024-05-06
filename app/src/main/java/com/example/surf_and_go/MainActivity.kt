package com.example.surf_and_go

import android.content.Intent
import android.graphics.Typeface
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val button = findViewById<Button>(R.id.button_start)
        button.setOnClickListener{
            finish()
            startActivity(Intent(applicationContext, SpotsList::class.java))
        }
        val emptyView = findViewById<TextView>(R.id.empty_view)
        val typeface = Typeface.createFromAsset(assets, "fonts/neord.ttf")
        emptyView.typeface = typeface

    }

}

