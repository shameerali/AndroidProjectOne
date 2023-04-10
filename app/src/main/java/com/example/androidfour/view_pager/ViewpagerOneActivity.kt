package com.example.androidfour.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.androidfour.R
import com.google.android.material.tabs.TabLayout

class ViewpagerOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_one)


        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = ViewpagerOneAdapter(supportFragmentManager)

        val tabLayout =findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)
    }
}