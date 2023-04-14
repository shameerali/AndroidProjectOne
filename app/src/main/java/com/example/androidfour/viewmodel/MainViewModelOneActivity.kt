package com.example.androidfour.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.androidfour.R

class MainViewModelOneActivity : AppCompatActivity() {

  /*  We are adding these two dependencies because to avoid using
    findViewById() in our MainActivity.kt file.
    apply plugin: ‘kotlin-android’

    apply plugin: ‘kotlin-android-extensions’*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_view_model_one)

        var textview  = findViewById<TextView>(R.id.textView)
        var btn = findViewById<Button>(R.id.button)

        // view model instance
        var viewModel: MainVmOneViewModel = ViewModelProvider(this)
            .get(MainVmOneViewModel::class.java)

        textview.text = viewModel.num.toString()

        btn.setOnClickListener{
            viewModel.addOne()
            textview.text= viewModel.num.toString()
        }


//        textView.text = number.toString()
//
//        button.setOnClickListener {
//            number++
//            textView.text = number.toString()
//        }
    }
}