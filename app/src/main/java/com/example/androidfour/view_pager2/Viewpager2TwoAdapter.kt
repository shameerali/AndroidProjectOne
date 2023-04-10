package com.example.androidfour.view_pager2

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidfour.view_pager.FragmentOne1
import com.example.androidfour.view_pager.FragmentOne2
import com.example.androidfour.view_pager.FragmentOne3

class Viewpager2TwoAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
         return 4
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                return FragmentOne1()
            }
            1-> {
                return FragmentOne2()
            }
            2-> {
                return FragmentOne3()
            }
            3-> {
                return Fragment2One1()
            }

        }

        return FragmentOne1()
    }
}