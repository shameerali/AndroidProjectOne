package com.example.androidfour.flow.first.model

import com.google.gson.annotations.SerializedName

data class CommentModel(
    val postId: Int?=null,
    val id: Int?=null,
    val email: String?=null,
    val name:String?=null,

    @SerializedName("body")
    val comment: String?=null
)


