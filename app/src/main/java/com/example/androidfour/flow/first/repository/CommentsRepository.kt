package com.example.androidfour.flow.first.repository

import com.example.androidfour.flow.first.model.CommentModel
import com.example.androidfour.flow.first.network.ApiService
import com.example.androidfour.flow.first.network.CommentApiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CommentsRepository(private val apiService: ApiService) {
    suspend fun getComment(id: Int): Flow<CommentApiState<CommentModel>> {
        return flow {
            // get the comment Data from the api
            val comment=apiService.getComments(id)

            // Emit this data wrapped in
            // the helper class [CommentApiState]
            emit(CommentApiState.success(comment))
        }.flowOn(Dispatchers.IO)
    }
}