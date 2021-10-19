package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class FlashScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen3)

        var buttonGetStartedThird = findViewById<Button>(R.id.btn_get3)

        buttonGetStartedThird.setOnClickListener(){

            intent = Intent(this, FlashScreen4::class.java)
            startActivity(intent)
        }
    }
}