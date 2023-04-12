package com.example.androidfour.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.androidfour.R
import com.example.androidfour.retrofit.api.ApiInterface
import com.example.androidfour.retrofit.retrofit_object.RetrofitClient
import com.google.gson.Gson

class RetrofitTwoActivity : AppCompatActivity() {

//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.0'

    lateinit var txtData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_two)
        txtData = findViewById(R.id.txtData)
        getUserList()
    }

    private fun getUserList() {

        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)

        lifecycleScope.launchWhenCreated {
            try{
                val response = apiInterface.getAllUsers()
                if (response.isSuccessful()) {
                    var json = Gson().toJson(response.body())

                    if (response.body()?.data?.size!! <= 0) {
                        Toast.makeText(
                            this@RetrofitTwoActivity,
                            "No Data ",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {
                        txtData.setText(json)
                    }

                    Log.d("TAG==>", "getUserList: "+response.body())
                }

            }catch (Ex:Exception){
                Log.e("Error",Ex.localizedMessage)
            }

        }
    }
}