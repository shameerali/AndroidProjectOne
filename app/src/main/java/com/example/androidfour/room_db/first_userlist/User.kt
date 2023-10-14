package com.example.androidfour.room_db.first_userlist

import androidx.room.Entity

@Entity(tableName = "users")
data class User(
    val id: Long,
    val name: String,
    val age: Int
)
