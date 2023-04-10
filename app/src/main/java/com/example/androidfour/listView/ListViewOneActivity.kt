package com.example.androidfour.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.androidfour.R

class ListViewOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_one)

        val arrayAdapter: ArrayAdapter<String>;
        val userList = arrayOf("Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel", "Rohith", "Sachin", "Dhoni", "Sevague", "Bhumra",
            "Ghanguli", "Patel")

        val lvList= findViewById<ListView>(R.id.lvList)
//        arrayAdapter = ArrayAdapter()
        arrayAdapter = ArrayAdapter(this,R.layout.item_lvnamelist, R.id.name,userList)
        lvList.adapter = arrayAdapter
    }
}