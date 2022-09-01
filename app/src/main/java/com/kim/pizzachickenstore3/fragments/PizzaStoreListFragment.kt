package com.kim.pizzachickenstore3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzachickenstore3.Adapters.PizzaStoreListAdapter
import com.kim.pizzachickenstore3.R
import com.kim.pizzachickenstore3.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store_list_item.*

class PizzaStoreListFragment :  Fragment(){

    val mPizzaStoreList = ArrayList<Store>()

    lateinit var mPizzaAdapter : PizzaStoreListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add(Store("A 피자가게","010-3456-4992","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMTUx%2FMDAxNTg2MTcxNjA1NDgx.1GnAnO2ET7g4_wlvVX8S7cKUyT_FbMYa8N3FdD4niAYg.CyOM2xZ2yCfQRbTqMb96Mk5Gn6Ppf-GZP3PDYhmBrb8g.JPEG.ccmartist%2F1586170541966.jpg&type=sc960_832"))
        mPizzaStoreList.add(Store("A 피자가게","010-3456-4992","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMTUx%2FMDAxNTg2MTcxNjA1NDgx.1GnAnO2ET7g4_wlvVX8S7cKUyT_FbMYa8N3FdD4niAYg.CyOM2xZ2yCfQRbTqMb96Mk5Gn6Ppf-GZP3PDYhmBrb8g.JPEG.ccmartist%2F1586170541966.jpg&type=sc960_832"))
        mPizzaStoreList.add(Store("A 피자가게","010-3456-4992","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMTUx%2FMDAxNTg2MTcxNjA1NDgx.1GnAnO2ET7g4_wlvVX8S7cKUyT_FbMYa8N3FdD4niAYg.CyOM2xZ2yCfQRbTqMb96Mk5Gn6Ppf-GZP3PDYhmBrb8g.JPEG.ccmartist%2F1586170541966.jpg&type=sc960_832"))
        mPizzaStoreList.add(Store("A 피자가게","010-3456-4992","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMTUx%2FMDAxNTg2MTcxNjA1NDgx.1GnAnO2ET7g4_wlvVX8S7cKUyT_FbMYa8N3FdD4niAYg.CyOM2xZ2yCfQRbTqMb96Mk5Gn6Ppf-GZP3PDYhmBrb8g.JPEG.ccmartist%2F1586170541966.jpg&type=sc960_832"))
        mPizzaStoreList.add(Store("A 피자가게","010-3456-4992","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMTUx%2FMDAxNTg2MTcxNjA1NDgx.1GnAnO2ET7g4_wlvVX8S7cKUyT_FbMYa8N3FdD4niAYg.CyOM2xZ2yCfQRbTqMb96Mk5Gn6Ppf-GZP3PDYhmBrb8g.JPEG.ccmartist%2F1586170541966.jpg&type=sc960_832"))

        mPizzaAdapter = PizzaStoreListAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreList)
        pizzaListView.adapter = mPizzaAdapter
    }
}