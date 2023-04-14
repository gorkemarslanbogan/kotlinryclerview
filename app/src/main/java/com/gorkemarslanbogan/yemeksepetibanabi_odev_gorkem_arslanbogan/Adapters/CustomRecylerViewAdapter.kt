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
import java.util.*


class CustomRecylerViewAdapter(private val itemList: ArrayList<Promotions>) : RecyclerView.Adapter<CustomRecylerViewAdapter.ModelViewHolder>() {

    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rc_promation_view, parent, false)
        return ModelViewHolder(view)
    }
//
    override fun getItemCount() : Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        val ItemsViewModel = itemList[position]
        Picasso.get().load(ItemsViewModel.imageUrl).resize(147, 213)
            .centerCrop().into(holder.imageView)
    }


}