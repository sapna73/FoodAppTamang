package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.ResturantViewPager

class ResetEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_email)

        var imageAdd = findViewById<Button>(R.id.btn_send_again)

        imageAdd.setOnClickListener(){

            intent = Intent(this, ResturantViewPager::class.java)
            startActivity(intent)
        }
    }
}