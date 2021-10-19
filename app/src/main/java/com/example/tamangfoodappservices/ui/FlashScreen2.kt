package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class FlashScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen2)

        var buttonGetStartedSecond = findViewById<Button>(R.id.btn_get2)

        buttonGetStartedSecond.setOnClickListener(){

            intent = Intent(this, FlashScreen3::class.java)
            startActivity(intent)
        }
    }
}