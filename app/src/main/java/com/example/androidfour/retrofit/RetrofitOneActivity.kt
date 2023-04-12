package com.example.androidfour.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidfour.R
import com.example.androidfour.retrofit.api.QuotesApi
import com.example.androidfour.retrofit.retrofit_object.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RetrofitOneActivity : AppCompatActivity() {
/*
    // retrofit

    implementation ‘com.squareup.retrofit2:retrofit:2.9.0’

// GSON

    implementation ‘com.squareup.retrofit2:converter-gson:2.9.0’

// coroutine

    implementation ‘org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2’

    implementation ‘org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2’
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_one)

    val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
    // launching a new coroutine
    GlobalScope.launch {
        val result = quotesApi.getQuotes()
        if (result != null){
            Log.d("TAG", "onCreate: "+result.body().toString())
        }
    }


    }
}