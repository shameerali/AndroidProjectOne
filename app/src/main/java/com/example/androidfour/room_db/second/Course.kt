package com.example.androidfour.room_db.second

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "Course")
data class Course(
    @PrimaryKey
    val id: Long
//    @PrimaryKey val courseID: Int,
//    @ColumnInfo(name = "courseName") val name: String?,
//    @ColumnInfo(name = "email") val email: String?,
//    @ColumnInfo(name = "coursePrice") val avatar: String?
)
