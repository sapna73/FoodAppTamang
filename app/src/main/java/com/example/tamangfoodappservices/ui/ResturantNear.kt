package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tamangfoodappservices.R

class ResturantNear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resturant_near)

        var imageAdd = findViewById<ImageView>(R.id.current_loc)

        imageAdd.setOnClickListener(){

            intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}