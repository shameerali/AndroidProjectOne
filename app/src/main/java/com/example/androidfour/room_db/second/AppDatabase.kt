package com.example.androidfour.room_db.second

import androidx.room.Database
import androidx.room.RoomDatabase

//@Database(entities = [Course::class] , version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun CourseDao(): CourseDao
}