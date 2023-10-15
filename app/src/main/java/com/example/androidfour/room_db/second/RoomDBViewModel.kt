package com.example.androidfour.room_db.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RoomDBViewModel(private val gfgApiHelper: DatabaseHelperImpl, private val dbHelper: AppDatabase): ViewModel() {

    init {
        fetchCourses()
    }

    private fun fetchCourses() {
        viewModelScope.launch {
            try {
//                val CoursesFromDb = dbHelper.getCourses()
                // here you have your CoursesFromDb
            } catch (e: Exception) {
                // handler error
            }

        }

        }
    }