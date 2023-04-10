package com.example.androidfour.view_pager2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfour.R

class Viewpager2ThreeAdapter(private val ctx: Context, private val list: ArrayList<String>):
RecyclerView.Adapter<Viewpager2ThreeAdapter.MyViewHolder>(){

    class MyViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){

        val textView :TextView = itemView.findViewById(R.id.tvText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val view= LayoutInflater.from(ctx).inflate(R.layout.fragment2_one1, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
       return  list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.textView.text= list[position]
    }
}