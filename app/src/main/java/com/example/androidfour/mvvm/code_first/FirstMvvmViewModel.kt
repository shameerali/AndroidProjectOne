package com.example.androidfour.mvvm.code_first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstMvvmViewModel:ViewModel() {
    var lst = MutableLiveData<ArrayList<Blog>>()
    var newlist = arrayListOf<Blog>()

    fun add(blog: Blog){
        newlist.add(blog)
        lst.value = newlist
    }

    fun remove(blog: Blog){
        newlist.remove(blog)
        lst.value = newlist
    }
}