package com.example.tamangfoodappservices.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.ui.FlashScreen2

class AddPaymentMethods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_payment_methods)

        var imageAddCard = findViewById<ImageView>(R.id.image_add_card)

        imageAddCard.setOnClickListener(){

            intent = Intent(this, Filters::class.java)
            startActivity(intent)
        }
    }
}