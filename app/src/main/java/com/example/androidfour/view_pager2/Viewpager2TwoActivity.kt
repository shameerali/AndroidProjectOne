package com.example.androidfour.view_pager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfour.R

class Viewpager2TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager2_two)

        val viewpager = findViewById<ViewPager2>(R.id.viewpager)

        val adapter = Viewpager2TwoAdapter(this)

        viewpager.adapter = adapter


    }
}