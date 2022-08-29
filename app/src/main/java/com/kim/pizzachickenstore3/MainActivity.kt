package com.kim.pizzachickenstore3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.pizzachickenstore3.Adapters.MainViewFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvfa : MainViewFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mvfa = MainViewFragmentAdapter(supportFragmentManager)
        mainViewPager.adapter = mvfa

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}