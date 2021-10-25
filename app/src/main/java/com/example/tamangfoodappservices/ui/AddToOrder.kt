package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.YourOrders

class AddToOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_order)

        var imageViewBtn = findViewById<ImageView>(R.id.image_add_to_order_btn)

        imageViewBtn.setOnClickListener(){

            intent = Intent(this, YourOrders::class.java)
            startActivity(intent)
        }
    }
}