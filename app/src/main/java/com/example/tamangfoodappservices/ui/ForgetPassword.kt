package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R

class ForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        var buttonReset = findViewById<Button>(R.id.btn_reset)

        buttonReset.setOnClickListener(){

            intent = Intent(this, ResetEmail::class.java)
            startActivity(intent)
        }
    }
}