package com.example.tamangfoodappservices.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.tamangfoodappservices.R
import com.example.tamangfoodappservices.models.SingleRestaurant
import com.example.tamangfoodappservices.mostused.Constants

class SingleRestaurantAdapter(private val singleRestaurant:  List<SingleRestaurant>) :
    RecyclerView.Adapter<SingleRestaurantAdapter.RestaurantsVH>() {

    inner class RestaurantsVH(view: View) : RecyclerView.ViewHolder(view) {

        private val imageView = view.findViewById<ImageView>(R.id.image_single_restaurants)
        private val itemsName = view.findViewById<TextView>(R.id.tv_single_restaurants)
        private val itemsDesc = view.findViewById<TextView>(R.id.tv_single_restaurantsDesc)

        init {
            with(view){
                view.setOnClickListener {

                    val bundle = Bundle()
                    bundle.putInt(Constants.Prefs.image, singleRestaurant[adapterPosition].singleRestaurantImage)
                    bundle.putString(Constants.Prefs.title,singleRestaurant[adapterPosition].singleRestaurantName)

                    val navController: NavController = Navigation.findNavController(view)
                    navController.navigate(R.id.action_singleRestaurantFragment2_to_addToOrderFragment2,bundle)
                }
            }
        }

        fun bind(singleRestaurant: SingleRestaurant) {
            imageView.setImageResource(singleRestaurant.singleRestaurantImage)
            itemsName.text = singleRestaurant.singleRestaurantName
            itemsDesc.text = singleRestaurant.singleRestaurantDesc

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsVH {
        return RestaurantsVH(LayoutInflater.from(parent.context).inflate(R.layout.item_single_tab_fragment,parent,false))
    }

    override fun onBindViewHolder(holder: RestaurantsVH, position: Int) {
        holder.bind(singleRestaurant[position])
    }

    override fun getItemCount(): Int {
        return singleRestaurant.size
    }
}