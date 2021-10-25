package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.ResturantViewPager

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var textViewAlready = findViewById<TextView>(R.id.tv_already_acc)

        textViewAlready.setOnClickListener(){

            intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        var textViewAlreadybtn = findViewById<Button>(R.id.btn_sign_in)

        textViewAlreadybtn.setOnClickListener(){

            intent = Intent(this, ResturantViewPager::class.java)
            startActivity(intent)
        }
    }
}