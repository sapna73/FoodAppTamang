package com.example.tamangfoodappservices.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.ResturantViewPager
import com.example.tamangfoodappservices.fragments.RestaurantPlaceHolder

class FlashScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen1)

        var imageAdd = findViewById<Button>(R.id.btn_get1)

        imageAdd.setOnClickListener(){

            intent = Intent(this, FlashScreen2::class.java)
            startActivity(intent)
        }
    }
}