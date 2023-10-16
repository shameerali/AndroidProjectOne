package com.example.androidfour.data_store.preferences_data_store.second.data.local

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidfour.data_store.preferences_data_store.second.data.local.PreferenceDataStoreConstants.NAME_KEY
import kotlinx.coroutines.launch

class DataStoreTwoViewModel : ViewModel() {

    // Retriving Using the Flow Method
    fun getData(){
        viewModelScope.launch {
//            preferenceDataStoreHelper.getPreference(NAME_KEY,"").collect {
//                name = it
            }
        }



//// Retriving Using the Not Flow / static data Method
//    viewModelScope.launch {
//        val name =  preferenceDataStoreHelper.getFirstPreference(NAME_KEY,"")
//    }
//
//    // Setting Data
//    val name = "Android Developer"
//    viewModelScope.launch {
//        preferenceDataStoreHelper.putPreference(NAME_KEY,name)
//    }

}