package com.kim.pizzachickenstore3.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzachickenstore3.fragments.ChickenStoreListFragment
import com.kim.pizzachickenstore3.fragments.PizzaStoreListFragment

class MainViewFragmentAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            1 -> " 치킨가게"
            else -> "피자가게"

        }
    }


    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            1-> ChickenStoreListFragment()
            else -> PizzaStoreListFragment()

        }

    }

}