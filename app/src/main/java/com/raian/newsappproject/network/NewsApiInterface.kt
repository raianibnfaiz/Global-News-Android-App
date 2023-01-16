package com.raian.newsappproject.network

import com.raian.newsappproject.Article
import com.raian.newsappproject.NewsDatAaSource
import retrofit2.Call
import retrofit2.http.GET

interface NewsApiInterface {
    @GET("everything?q=tesla&from=2022-12-16&sortBy=publishedAt&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    suspend fun getNews(): NewsDatAaSource
}