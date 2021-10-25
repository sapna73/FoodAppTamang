package com.example.tamangfoodappservices.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.ui.FlashScreen2

class YourOrders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_orders)

        var imageBtnContinue = findViewById<ImageView>(R.id.btn_continue)

        imageBtnContinue.setOnClickListener(){

            intent = Intent(this, AddPaymentMethods::class.java)
            startActivity(intent)
        }
    }
}