package com.example.androidfour.retrofit.api

import com.example.androidfour.retrofit.data_class.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {

    @GET("/quotes")
    suspend fun getQuotes(): Response<QuoteList>
}