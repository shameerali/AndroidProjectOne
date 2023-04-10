package com.example.androidfour.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.androidfour.R

class RecyclerViewOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_one)

        val rvList = findViewById<RecyclerView>(R.id.rvList)

        rvList.layoutManager = LinearLayoutManager(this)

        val data  = ArrayList<ItemViewModel>()

        for (i in 1..20){
            data.add(ItemViewModel(R.drawable.baseline_album_24, "Items: "+i))
        }

        val adapter = CustomOneAdapter(data)

        rvList.adapter = adapter
    }


}