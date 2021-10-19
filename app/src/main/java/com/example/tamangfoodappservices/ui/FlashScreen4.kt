package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class FlashScreen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen4)

        var buttonGetStartedFourth = findViewById<Button>(R.id.btn_get4)

        buttonGetStartedFourth.setOnClickListener(){

            intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}