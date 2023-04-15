package com.example.androidfour.mvvm.code_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfour.R
import okhttp3.internal.notify

class FirstMvvmActivity : AppCompatActivity() {
    private var viewManager= LinearLayoutManager(this)
    private lateinit var viewModel: FirstMvvmViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_mvvm)

        recyclerView = findViewById(R.id.recycler)
        val application = requireNotNull(this).application
        val factory = FirstMvvmViewModelFactory()
        viewModel = ViewModelProvider(this, factory).get(FirstMvvmViewModel::class.java)

        btn = findViewById(R.id.button)
        btn.setOnClickListener{
            addData()
        }

        initialiseAdapter()

    }

    private fun initialiseAdapter() {
        recyclerView.layoutManager = viewManager
        observeData()
    }

    private fun observeData() {

        viewModel.lst.observe(this, Observer {
            Log.d("TAG", "observeData: "+it.toString())
            recyclerView.adapter = NoteRecyclerAdapter(viewModel,it,this)
        })
    }

    private fun addData() {
        var txtPlace = findViewById<EditText>(R.id.titletxt)
        var title = txtPlace.text.toString()
        if (title.isNullOrBlank()){
            Toast.makeText(this,"Enter value!", Toast.LENGTH_LONG).show()
        }else{
            var blog = Blog(title)
            viewModel.add(blog)
            txtPlace.text.clear()
            recyclerView.adapter ?.notifyDataSetChanged()
        }

    }
}