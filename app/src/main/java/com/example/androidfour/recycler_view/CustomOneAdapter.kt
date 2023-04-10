package com.example.androidfour.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfour.R

class CustomOneAdapter(private val mList: List<ItemViewModel>): RecyclerView.Adapter<CustomOneAdapter.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val imageView :ImageView = itemView.findViewById(R.id.imageview)
        val textView :TextView = itemView.findViewById(R.id.textView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view  = LayoutInflater.from(parent.context).
         inflate(R.layout.item_rvonelist, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemViewModel = mList[position]

        holder.imageView.setImageResource(ItemViewModel.img)
        holder.textView.text = ItemViewModel.text

    }
}