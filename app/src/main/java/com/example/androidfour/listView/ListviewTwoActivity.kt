package com.example.androidfour.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.androidfour.R

class ListviewTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_two)

        val data:ArrayList<Item> = getList()
        val lvList  = findViewById<ListView>(R.id.lvList)

        val adapter = CustomListAdapter(this , data)
        lvList.adapter = adapter

        /// click

        lvList.setOnItemClickListener{
                parent, view, position, id ->
            // This is your listview's selected item
            val item = parent.getItemAtPosition(position) as Item
            Toast.makeText(this, "haiiii: "+item.itemName, Toast.LENGTH_SHORT).show()
        }

//        lvList.onItemClickListener = AdapterView.OnItemClickListener{
//                parent, view, position, id ->
//            // This is your listview's selected item
//            val item = parent.getItemAtPosition(position) as Item
//            Toast.makeText(this, "haiiii: "+item.itemName, Toast.LENGTH_SHORT).show()
//        }



//        adapter.setOnItemClickListener(AdapterView.OnItemClickListener(
//            adapter
//        ) )

    }

    private fun getList(): ArrayList<Item> {

      val list: ArrayList<Item> = arrayListOf();
        list.add(Item("Dhoni", "Cricket"))
        list.add(Item("Dhoni2", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))
        list.add(Item("Dhoni3", "Cricket"))

        return list
    }
}