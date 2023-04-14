package com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.R
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.data.Promotions
import com.squareup.picasso.Picasso

class CustomRyclerViewAdapterFoods(private val itemList: ArrayList<Promotions>) : RecyclerView.Adapter<CustomRyclerViewAdapterFoods.ModelViewHolderFoods>() {

        class ModelViewHolderFoods(view: View) : RecyclerView.ViewHolder(view) {
            val imageView: ImageView = itemView.findViewById(R.id.imageView2)
            val sellerInfo: TextView = itemView.findViewById(R.id.textView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolderFoods {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rc_foods_view, parent, false)
            return ModelViewHolderFoods(view)
        }
//
        override fun getItemCount() : Int {
            return itemList.size
        }

        override fun onBindViewHolder(holder: ModelViewHolderFoods, position: Int) {
            val ItemsViewModel = itemList[position]
            Picasso.get().load(ItemsViewModel.imageUrl).into(holder.imageView)
            holder.sellerInfo.text = ItemsViewModel.sellerName
        }


    }
