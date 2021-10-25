package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.ResturantViewPager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var textViewCreateNew = findViewById<TextView>(R.id.tv_create_new)
        var textViewForgot = findViewById<TextView>(R.id.tv_forgot)
        var btnSignIn = findViewById<Button>(R.id.btn_sign_in)
        val textLayout1 = findViewById<TextInputEditText>(R.id.et_password)
        val textLayout2 = findViewById<TextInputEditText>(R.id.et_email)

        textViewForgot.setOnClickListener(){

            intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }

        textViewCreateNew.setOnClickListener(){

            intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener(){

            intent = Intent(this, Foodly::class.java)
            startActivity(intent)
        }
    }
}