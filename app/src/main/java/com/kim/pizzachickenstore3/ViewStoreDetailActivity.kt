package com.kim.pizzachickenstore3

import android.os.Bundle
import com.bumptech.glide.Glide
import com.kim.pizzachickenstore3.datas.Store
import kotlinx.android.synthetic.main.c.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mChicken : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        val clickedChicken = intent.getSerializableExtra("chicken") as Store

        chickenDetailNameTxt.text = clickedChicken.name
        chickenDetailPhonNumTxt.text = clickedChicken.phonNum

        Glide.with(mContext).load(clickedChicken.imgUrl).into(chickenDetailImg)

    }

    override fun setValues() {

    }


}