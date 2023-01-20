package com.raian.newsappproject.network

import com.raian.newsappproject.Dao.NewsDao
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.NewsDatAaSource
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


val BASE_URL = "https://newsapi.org/v2/"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL)
        .build()
interface NewsApiInterface {
    @GET("top-headlines?country=us&category=business&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    suspend fun getNews(): NewsDatAaSource

    @GET("top-headlines?country=us&category=sports&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    suspend fun getSports(): NewsDatAaSource

    @GET("top-headlines?country=us&category=science&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    suspend fun getScience(): NewsDatAaSource

    @GET("top-headlines?country=us&category=technology&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    suspend fun getTechnology(): NewsDatAaSource
}

object NewsApi {
    val retrofitService: NewsApiInterface by lazy { retrofit.create(NewsApiInterface::class.java) }
}