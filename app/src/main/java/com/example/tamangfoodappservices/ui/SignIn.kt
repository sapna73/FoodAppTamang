package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tamangfoodappservices.R

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var textViewForgot = findViewById<TextView>(R.id.tv_forgot)

        textViewForgot.setOnClickListener(){

            intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }
    }
}