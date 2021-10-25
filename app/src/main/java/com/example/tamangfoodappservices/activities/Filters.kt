package com.example.tamangfoodappservices.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.ui.FlashScreen2

class Filters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filters)

        var buttonGetStartedFirst = findViewById<ImageView>(R.id.image_apply_filter)

        buttonGetStartedFirst.setOnClickListener(){

            intent = Intent(this, SearchResturants::class.java)
            startActivity(intent)
        }
    }
}