package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class Foodly : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodly)

        var imageAdd = findViewById<Button>(R.id.btn_foodly_sign_up)

        imageAdd.setOnClickListener(){

            intent = Intent(this, VerifyPhoneNumber::class.java)
            startActivity(intent)
        }
    }
}