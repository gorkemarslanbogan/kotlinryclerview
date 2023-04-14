package com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.Adapters.CustomRecylerViewAdapter
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.Adapters.CustomRecylerViewAdapterCooker
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.Adapters.CustomRyclerViewAdapterFoods
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.data.Promotions
import com.gorkemarslanbogan.yemeksepetibanabi_odev_gorkem_arslanbogan.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var promotions = ArrayList<Promotions>()
    var foods = ArrayList<Promotions>()
    var cookers = ArrayList<Promotions>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityObject = this
        binding.toolbar.setTitle("Yemek Sepeti")
        binding.toolbar.setSubtitle("Esentepe Dede Korkut Sk. No: 28/1")
        setSupportActionBar(binding.toolbar)
        loadData()
        binding.rcPromotions.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rcPromotions.adapter = CustomRecylerViewAdapter(promotions)
        binding.rcCookers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rcCookers.adapter = CustomRecylerViewAdapterCooker(cookers)
        binding.rcFoods.adapter = CustomRyclerViewAdapterFoods(foods)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items,menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun loadData() {
        val promotion1 = Promotions(1,"https://images.deliveryhero.io/image/darkstores/Banabi-Campaign-Banners/dg_kampanya_everyday_0504.jpg?height=269&dpi=1","Market Çeliktaş","40 TL Minumum","6,99TL","140 TL Uzeri Ucretsiz Teslimat")
        val promotion2 = Promotions(2,"https://images.deliveryhero.io/image/darkstores/Banabi-Campaign-Banners/0504_sup_dg_kampanya.jpg?height=269&dpi=1","Market Elçik","30 TL Minumum","6,99TL","150 TL Uzeri Ucretsiz Teslimat")
        val promotion3 = Promotions(3,"https://images.deliveryhero.io/image/darkstores/Banabi-Campaign-Banners/Eti/0704_eti5_dg_kampanya.jpg?height=269&dpi=1","Migros 5M","90 TL Minumum","39,99TL","250 TL Uzeri Ucretsiz Teslimat")
        val promotion4 = Promotions(4,"https://images.deliveryhero.io/image/darkstores/Banabi-Campaign-Banners/al%C4%B1s%CC%A7veris%CC%A7_listesi_0604_dog%CC%86um-gu%CC%88nu%CC%88.jpg?height=269&dpi=1","Yalakı Market","80 TL Minumum","9,99TL","200 TL Uzeri Ucretsiz Teslimat")
        val promotion5 = Promotions(5,"https://images.deliveryhero.io/image/darkstores/Banabi-Campaign-Banners/dg_kampanya_everyday_0504.jpg?height=269&dpi=1","Market Çeliktaş","40 TL Minumum","6,99TL","140 TL Uzeri Ucretsiz Teslimat")
        val promotion6 = Promotions(6,"https://images.deliveryhero.io/image/fd-tr/campaign-assets/0cb364fc-d445-11ed-a897-ba2189b24355/desktop_tile_TrEstX.jpg?height=240&quality=95&width=560&","Market Çeliktaş","40 TL Minumum","206,99TL","140 TL Uzeri Ucretsiz Teslimat")
        val promotion7 = Promotions(7,"https://images.deliveryhero.io/image/fd-tr/campaign-assets/a21a3c94-c877-11ed-b036-12d6bf2d404c/desktop_tile_TrJVPs.jpg?height=240&quality=95&width=560&","Komagene","Ramazan Boyunca","%50 Bedava","150 TL Uzeri Ucretsiz Teslimat")
        val promotion8 = Promotions(8,"https://images.deliveryhero.io/image/fd-tr/campaign-assets/6e85761d-ce03-11ed-9c16-6a011a54351e/desktop_tile_TrhhrX.jpg?height=240&quality=95&width=560&","Terra Pizza","2 Adet Orta Boy Pizza","240 TL","200 TL Uzeri Ucretsiz Teslimat")
        val promotion9 = Promotions(9,"https://images.deliveryhero.io/image/fd-tr/campaign-assets/9969a712-d2f0-11ed-8c0c-3e8285a9f067/desktop_tile_TroUSe.png?height=240&quality=95&width=560&","Burger King Algida Ramazan Menüsü","80 TL Minumum","140 TL","150 TL Uzeri Ucretsiz Teslimat")
        val promotion10 = Promotions(10,"https://images.deliveryhero.io/image/fd-tr/campaign-assets/a88e8f86-d380-11ed-ae06-96a557aa04c2/desktop_tile_TrLONN.jpg?height=240&quality=95&width=560&","2 Kuş Başılı Pide Menü","40 TL Minumum","85 TL","140 TL Uzeri Ucretsiz Teslimat")
        val promotion11 = Promotions(11,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1064.png?height=192","Döner","","","")
        val promotion12= Promotions(12,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1058.png?height=192","Burger","","","")
        val promotion13 = Promotions(13,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1082.png?height=192","","","","")
        val promotion14 = Promotions(14,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1073.png?height=192","Köfte","","","")
        val promotion15 = Promotions(15,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1082.png?height=192","Pizza","","","")
        val promotion16 = Promotions(16,"https://images.deliveryhero.io/image/foodpanda/cuisine-images/TR/1086.png?height=192","Tatlı","","","")
        promotions.add(promotion1)
        promotions.add(promotion2)
        promotions.add(promotion3)
        promotions.add(promotion4)
        promotions.add(promotion5)
        cookers.add(promotion6)
        cookers.add(promotion7)
        cookers.add(promotion8)
        cookers.add(promotion9)
        cookers.add(promotion10)
        foods.add(promotion11)
        foods.add(promotion12)
        foods.add(promotion13)
        foods.add(promotion14)
        foods.add(promotion15)
        foods.add(promotion16)
    }
}