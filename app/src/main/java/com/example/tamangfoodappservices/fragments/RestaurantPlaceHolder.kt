package com.example.tamangfoodappservices.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.activities.ResturantViewPager

class RestaurantPlaceHolder : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_restaurant_place_holder, container, false)

        val imageView = rootView.findViewById<ImageView>(R.id.vpImg1)
        val textView1 = rootView.findViewById<TextView>(R.id.descriptionTv)
        when(arguments?.getInt(ARG_SECTION_NUMBER)){
            1->{
                imageView.setImageResource(R.drawable.rest_pic1)
                textView1.text = "Jump everywhere"
            }
            2->{
                imageView.setImageResource(R.drawable.rest_pic2)
                textView1.text = "Fly high"
            }
            3->{
                imageView.setImageResource(R.drawable.rest_pic3)
                textView1.text = "Forset Friends "
            }
            4->{
                imageView.setImageResource(R.drawable.rest_pic4)
                textView1.text = "Lazy"
            }
            5->{
                imageView.setImageResource(R.drawable.rest_pic5)
                textView1.text = "Lazy"
            }
            6->{
                imageView.setImageResource(R.drawable.rest_pic6)
                textView1.text = "Lazy"
            }
        }
        return rootView
    }

    companion object {

        private val ARG_SECTION_NUMBER = "section_number"

        fun newInstance(sectionNumber: Int): RestaurantPlaceHolder {
            val fragment = RestaurantPlaceHolder()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}