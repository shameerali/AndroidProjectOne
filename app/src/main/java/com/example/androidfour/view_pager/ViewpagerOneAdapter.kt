package com.example.androidfour.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewpagerOneAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

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
            else -> {
                return FragmentOne1()
            }
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position){
            0 -> {
                return "Tab 1"
            }
            1 -> {
                return  "Tab 2"
            }
            2-> {
                return "Tab 3"
            }
        }


        return super.getPageTitle(position)
    }
}