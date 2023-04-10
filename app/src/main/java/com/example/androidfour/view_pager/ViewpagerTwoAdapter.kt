package com.example.androidfour.view_pager

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.androidfour.R

class ViewpagerTwoAdapter(private val mContext: Context,
                          private val itemList: ArrayList<String>): PagerAdapter() {
    private var layoutInflater: LayoutInflater? =null

    override fun getCount(): Int {

        Log.d("TAG==>", "getCount: "+itemList.size)
       return itemList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater!!.inflate(R.layout.custom_layout_viewpager_two, container, false)
        var textView = view.findViewById<TextView>(R.id.slide_screen_tv)
        textView.text = itemList[position]

        container.addView(view,position)
        return view
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {

        return view === obj

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val view = `object` as View

        container.removeView(view)
    }


}