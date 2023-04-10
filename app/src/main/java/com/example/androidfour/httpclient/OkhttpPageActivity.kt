package com.example.androidfour.httpclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.androidfour.R
import okhttp3.*
import java.io.IOException

class OkhttpPageActivity : AppCompatActivity() {

    lateinit var client: OkHttpClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okhttp_page)

        val btnApiOne = findViewById<Button>(R.id.btnApiOne)
        val btnApiTwo= findViewById<Button>(R.id.btnApiTwo)

        client = OkHttpClient()


        btnApiOne.setOnClickListener{
            getDataOne("https://quotable.io/quotes?page=1")
        }
        btnApiTwo.setOnClickListener{
            getDataTwo()
        }
    }

    fun getDataOne(url: String) {
        val request = Request.Builder()
            .url(url).build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                println(e.message.toString())
            }

            override fun onResponse(call: Call, response: Response) {

                Log.d("TAG==>", "onResponse: " + response.body?.string())

            }
        })
    }

    fun getDataTwo(){
        var url = "https://reqres.in/api/users"
        // add parameter
        val formBody = FormBody.Builder().add("name", "Parker").build()


        // creating request
        var request = Request.Builder().url(url)
            .post(formBody)
            .build()

        client.newCall(request).enqueue(object :Callback{
            override fun onResponse(call: Call, response: Response) {
                Log.d("TAG==>", "onResponse: "+response.body?.string())


            }

            override fun onFailure(call: Call, e: IOException) {
                println(e.message.toString())
            }
        })
    }
}