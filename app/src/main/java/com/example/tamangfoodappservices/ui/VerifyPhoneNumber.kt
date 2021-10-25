package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class VerifyPhoneNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_password)

        var imageAdd = findViewById<Button>(R.id.btn_verify_continue)

        imageAdd.setOnClickListener(){

            intent = Intent(this, ResturantNear::class.java)
            startActivity(intent)
        }
    }
}