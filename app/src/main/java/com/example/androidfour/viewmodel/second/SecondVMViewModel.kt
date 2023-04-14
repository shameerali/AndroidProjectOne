package com.example.androidfour.viewmodel.second

import androidx.lifecycle.ViewModel

class SecondVMViewModel(startingCount: Int):ViewModel() {

    private var count = startingCount

    fun getCurrentCount(): Int{
        return count

    }

    fun getUpdatedCount():Int {
        return ++count
    }
}