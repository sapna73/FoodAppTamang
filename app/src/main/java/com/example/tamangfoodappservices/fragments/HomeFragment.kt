package com.example.tamangfoodappservices.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
//import com.example.androidui.adapters.HomeRestaurantsAdapter
//import com.example.androidui.adapters.HomeViewPagerAdapter
//import com.example.androidui.common.Constants
//import com.example.androidui.data.*
//import com.example.androidui.databinding.FragmentHomeBinding
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.adapters.BestRestaurantsAdapter
import com.example.tamangfoodappservices.adapters.HomeRestaurantsAdapter
import com.example.tamangfoodappservices.adapters.HomeViewPagerAdapter
import com.example.tamangfoodappservices.adapters.PartnersAdapter
import com.example.tamangfoodappservices.models.AllRestaurants
import com.example.tamangfoodappservices.models.BestPartners
import com.example.tamangfoodappservices.models.BestRestaurants
import com.example.tamangfoodappservices.models.ImageList


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    private var pagerAdapter = HomeViewPagerAdapter(
        listOf(
            ImageList(R.drawable.rest_pic1),
            ImageList(R.drawable.rest_pic2),
            ImageList(R.drawable.rest_pic3),
            ImageList(R.drawable.rest_pic4),
            ImageList(R.drawable.rest_pic5)
        )
    )

    private var partnersAdapter = PartnersAdapter(
        listOf(
            BestPartners(
                R.drawable.rest_pic1, "Krispy Creme",
                "St Georgece Terrace, Perth"
            ),
            BestPartners(
                R.drawable.rest_pic2, "Mario Italiano",
                "Hay street , Perth City"
            ),
            BestPartners(
                R.drawable.rest_pic3, "Krispy Creme",
                "St Georgece Terrace, Perth"
            ),
            BestPartners(
                R.drawable.rest_pic4, "Mario Italiano",
                "Hay street , Perth City"
            ),
            BestPartners(
                R.drawable.rest_pic5, "Krispy Creme",
                "St Georgece Terrace, Perth"
            ),
            BestPartners(
                R.drawable.rest_pic6, "Mario Italiano",
                "Hay street , Perth City"
            )
        )
    )

    private var bestRestaurantsAdapter = BestRestaurantsAdapter(
        listOf(
            BestRestaurants(
                R.drawable.rest_pic1, "McDonald’s",
                "Hay street , Perth City"
            ),
            BestRestaurants(
                R.drawable.rest_pic2, "The Halal Guys",
                "Hay street , Perth City"
            ),
            BestRestaurants(
                R.drawable.rest_pic3, "McDonald’s",
                "Hay street , Perth City"
            ),
            BestRestaurants(
                R.drawable.rest_pic4, "The Halal Guys",
                "Hay street , Perth City"
            ),
            BestRestaurants(
                R.drawable.rest_pic5, "McDonald’s",
                "Hay street , Perth City"
            ),
            BestRestaurants(
                R.drawable.rest_pic6, "The Halal Guys",
                "Hay street , Perth City"
            )
        )
    )


    private var allRestaurantsAdapter = HomeRestaurantsAdapter(
        listOf(
            AllRestaurants(R.drawable.rest_pic1, "McDonald's"),
            AllRestaurants(R.drawable.rest_pic2, "Cafe Brichor’s"),
            AllRestaurants(R.drawable.rest_pic3, "Mayfield Bakery & Cafe"),
            AllRestaurants(R.drawable.rest_pic4, "McDonald's"),
            AllRestaurants(R.drawable.rest_pic5, "Cafe Brichor’s"),
            AllRestaurants(R.drawable.rest_pic6, "Mayfield Bakery & Cafe")
        )
    )

    private lateinit var sharedPreferences: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        dotsIndicator()

        binding.viewPagerHome1.adapter = pagerAdapter
        binding.viewPagerHome1.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setDots(position)
            }
        })

        sharedPreferences = this.requireContext()
            .getSharedPreferences(Constants.Location.location, Context.MODE_PRIVATE)

        val location = sharedPreferences.getString("location", null)

        if (location != null) {
            binding.tvDeliveryTo.text = location
        } else {
            binding.tvDeliveryTo.text = R.string.location.toString()
        }

        initRecycler()

        binding.tvHomeFilter.setOnClickListener {
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_navigation_home2_to_filterFragment2)
        }

        binding.tvSeeAll1.setOnClickListener {
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_navigation_home2_to_featuredPartnersFragment2)
        }

        binding.tvSeeAll2.setOnClickListener {
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_navigation_home2_to_topRestaurantFragment2)
        }

        binding.tvSeeAll3.setOnClickListener {
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_navigation_home2_to_allRestaurantFragment2)
        }

    }

    private fun initRecycler() {
        binding.rvHome1.adapter = partnersAdapter
        binding.rvHome1.layoutManager = LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false)

        binding.rvHome2.adapter = bestRestaurantsAdapter
        binding.rvHome2.layoutManager = LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false)

        binding.rvHome3.adapter = allRestaurantsAdapter
        binding.rvHome3.isNestedScrollingEnabled = false
        binding.rvHome3.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
    }

    private fun dotsIndicator() {
        val mDots = arrayOfNulls<ImageView>(pagerAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(8, 0, 8, 0)

        for (i in mDots.indices) {
            mDots[i] = ImageView(this.context)
            mDots[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator1_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            binding.lytViewPager1Dots.addView(mDots[i])
        }
    }

    fun setDots(index: Int) {
        val childCount = binding.lytViewPager1Dots.childCount
        for (i in 0 until childCount) {
            val imageView = binding.lytViewPager1Dots[i] as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator1_active
                    )
                )
            } else imageView.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.indicator1_inactive
                )
            )
        }
    }

}