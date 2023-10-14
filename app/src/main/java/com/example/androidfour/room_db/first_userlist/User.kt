package com.example.androidfour.room_db.first_userlist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val id: Long,
    val name: String,
    val age: Int
)
