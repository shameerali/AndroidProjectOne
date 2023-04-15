package com.example.androidfour.mvvm.code_first

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfour.R

class NoteRecyclerAdapter(val viewModel: FirstMvvmViewModel, val arrayList: ArrayList<Blog>, val context: Context)
    :RecyclerView.Adapter<NoteRecyclerAdapter.NotesViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        var root = LayoutInflater.from(parent.context).inflate(R.layout.item_first_mvvm,parent,false)
        return NotesViewHolder(root)
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
       holder.bind(arrayList.get(position))
    }

    override fun getItemCount(): Int {
        if (arrayList.size == 0){
            Toast.makeText(context,"List is empty", Toast.LENGTH_LONG).show()
        }else{

        }

       return arrayList.size
    }

    inner class NotesViewHolder(private val binding: View):RecyclerView.ViewHolder(binding){
        var title: TextView = binding.findViewById(R.id.title)
        var delete: ImageButton = binding.findViewById(R.id.delete)
        fun bind(blog: Blog){
            title.text = blog.title
            delete.setOnClickListener{
                viewModel.remove(blog)
                notifyItemRemoved(arrayList.indexOf(blog))
            }
        }

    }
}