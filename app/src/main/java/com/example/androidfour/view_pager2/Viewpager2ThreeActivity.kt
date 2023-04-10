package com.example.androidfour.view_pager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfour.R

class Viewpager2ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager2_three)

        val list = ArrayList<String>()

        list.add("Element1")
        list.add("Element2")
        list.add("Element3")
        list.add("Element4")

        val adapter = Viewpager2ThreeAdapter(this, list)
        val viewPager = findViewById<ViewPager2>(R.id.viewpager)
        viewPager.adapter = adapter

    }
}