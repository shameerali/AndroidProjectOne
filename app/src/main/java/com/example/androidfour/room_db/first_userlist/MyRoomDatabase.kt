package com.example.androidfour.room_db.first_userlist

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class MyRoomDatabase:RoomDatabase() {

    abstract fun userDao(): UserDao

}