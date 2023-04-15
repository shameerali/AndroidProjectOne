package com.example.androidfour.mvvm.code_first

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FirstMvvmViewModelFactory():ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(FirstMvvmViewModel::class.java)){
            return FirstMvvmViewModel() as T
        }

        throw IllegalArgumentException ("UnknownViewModel")

    }
}