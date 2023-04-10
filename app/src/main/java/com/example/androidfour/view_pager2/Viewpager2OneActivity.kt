package com.example.androidfour.view_pager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfour.R

class Viewpager2OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager2_one)

        val pagerAdapter = ViewPager2OneAdapter(this, 8)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager)
        viewPager2.adapter = pagerAdapter

    }
}