package com.example.androidfour.listView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.androidfour.R

class CustomListAdapter(context: Context, items: ArrayList<Item>): BaseAdapter() {

    private val context : Context
    private val items : ArrayList<Item>




    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
         return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?):
            View? {
        var convertView :View? =convertView

        if (convertView == null){
            convertView = LayoutInflater.from(context)
                .inflate(R.layout.item_lvtwolist, viewGroup, false)
        }

        val currentItem = getItem(position) as Item

        val tvName = convertView?.findViewById<TextView>(R.id.tvName)
        val tvDesc = convertView?.findViewById<TextView>(R.id.tvDescription)

        tvName?.text = currentItem.itemName
        tvDesc?.text = currentItem.itemDesc

        return convertView

    }

    init {
        this.context = context
        this.items = items
    }

}