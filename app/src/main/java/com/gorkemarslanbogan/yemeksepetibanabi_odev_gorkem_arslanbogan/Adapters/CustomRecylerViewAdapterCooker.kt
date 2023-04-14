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


class CustomRecylerViewAdapterCooker(private val itemList: ArrayList<Promotions>) : RecyclerView.Adapter<CustomRecylerViewAdapterCooker.ModelViewHolderCooker>() {

    class ModelViewHolderCooker(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView2)
        val sellerInfo: TextView = itemView.findViewById(R.id.textView)
        val sellInfo: TextView = itemView.findViewById(R.id.textView2)
        val priceInfo: TextView = itemView.findViewById(R.id.textView3)
        val price: TextView = itemView.findViewById(R.id.textView5)
    }
//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolderCooker {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rc_cookers_view, parent, false)
        return ModelViewHolderCooker(view)
    }

    override fun getItemCount() : Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolderCooker, position: Int) {
        val ItemsViewModel = itemList[position]
        Picasso.get().load(ItemsViewModel.imageUrl).into(holder.imageView)
        holder.sellerInfo.text = ItemsViewModel.sellerName
        holder.sellInfo.text = ItemsViewModel.deliveryInfo
        holder.priceInfo.text = ItemsViewModel.priceInfo
        holder.price.text = ItemsViewModel.price
    }


}