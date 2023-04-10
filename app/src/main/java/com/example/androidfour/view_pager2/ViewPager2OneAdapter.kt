package com.example.androidfour.view_pager2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2OneAdapter(
    private val activity: AppCompatActivity, val itemsCount: Int
    ) :FragmentStateAdapter(activity)  {


    override fun getItemCount(): Int {
       return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
       return Fragment2One1()
    }


}