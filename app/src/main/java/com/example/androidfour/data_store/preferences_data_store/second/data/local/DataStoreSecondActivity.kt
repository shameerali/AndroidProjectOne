package com.example.androidfour.data_store.preferences_data_store.second.data.local

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.androidfour.R
import com.example.androidfour.data_store.preferences_data_store.second.data.local.PreferenceDataStoreConstants.NAME_KEY
import kotlinx.coroutines.launch

class DataStoreSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_store_second)
        getData()
    }

    private fun getData() {

// Retriving Using the Flow Method
        lifecycleScope.launch {
//            preferenceDataStoreHelper.getPreference(NAME_KEY,"").collect {
//                name = it
            }
        }
    }


//// Retriving Using the Flow Method
//lifecycleScope.launch {
//    preferenceDataStoreHelper.getPreference(NAME_KEY,"").collect {
//        name = it
//    }
//}
//
//// Retriving Using the Not Flow / static data Method
//lifecycleScope.launch {
//    val name =  preferenceDataStoreHelper.getFirstPreference(NAME_KEY,"")
//}
//
//// Setting Data
//val name = "Android Developer"
//lifecycleScope.launch {
//    preferenceDataStoreHelper.putPreference(NAME_KEY,name)
//}