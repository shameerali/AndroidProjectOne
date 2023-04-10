package com.example.androidfour.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.androidfour.R

class ViewPagerTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_two)

        var textList = ArrayList<String>()

//        for (i in 1..20){
//            textList.add("Slide "+i)
//        }

        textList.add("Slide 1")
        textList.add("Slide 2")
        textList.add("Slide 3")
        textList.add("Slide 4")

        var mViewpagerTwoAdapter = ViewpagerTwoAdapter(this, textList)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = mViewpagerTwoAdapter
    }
}