package com.example.androidfour.livedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataOneActivityViewModelFactory(private val startingTitle: String,
private val startingResult: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LiveDataOneActivityViewModel::class.java)){
            return LiveDataOneActivityViewModel(startingTitle, startingResult) as T
            }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}