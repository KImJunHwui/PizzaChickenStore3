package com.kim.pizzachickenstore3.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.kim.pizzachickenstore3.R
import com.kim.pizzachickenstore3.datas.Store
import java.util.zip.Inflater

class PizzaStoreListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)

        }

        val row = tempRow!!

        val pizzaData = mList[position]

        val pizzaStoreName = row.findViewById<TextView>(R.id.pizzaStoreName)
        val pizzaStoreImg = row.findViewById<ImageView>(R.id.pizzaStoreImg)

        pizzaStoreName.text = pizzaData.name

        Glide.with(mContext).load(pizzaData.imgUrl).into(pizzaStoreImg)



        return row
    }
}