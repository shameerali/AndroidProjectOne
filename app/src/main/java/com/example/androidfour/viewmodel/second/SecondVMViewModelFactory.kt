package com.example.androidfour.viewmodel.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecondVMViewModelFactory(private val startingCount : Int) :ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
         if (modelClass.isAssignableFrom(SecondVMViewModel::class.java)){
             return SecondVMViewModel(startingCount) as T
         }
        throw IllegalArgumentException("Unknown View Model Class")

    }
}