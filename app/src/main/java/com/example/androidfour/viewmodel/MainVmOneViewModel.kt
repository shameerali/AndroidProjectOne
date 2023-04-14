package com.example.androidfour.viewmodel

import androidx.lifecycle.ViewModel

class MainVmOneViewModel : ViewModel() {
    var num = 0

    fun addOne(){
        num ++
    }
}