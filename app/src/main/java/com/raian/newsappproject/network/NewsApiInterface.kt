package com.raian.newsappproject.network

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
    @GET("top-headlines?country=us&category=business&apiKey=c8cbffe47af045ffa8e3b15a6e6d2138")
    suspend fun getBusiness(): NewsDatAaSource

    @GET("top-headlines?country=us&category=sports&apiKey=c8cbffe47af045ffa8e3b15a6e6d2138")
    suspend fun getSports(): NewsDatAaSource

    @GET("top-headlines?country=us&category=science&apiKey=c8cbffe47af045ffa8e3b15a6e6d2138")
    suspend fun getScience(): NewsDatAaSource

    @GET("top-headlines?country=us&category=technology&apiKey=c8cbffe47af045ffa8e3b15a6e6d2138")
    suspend fun getTechnology(): NewsDatAaSource
}

object NewsApi {
    val retrofitService: NewsApiInterface by lazy { retrofit.create(NewsApiInterface::class.java) }
}