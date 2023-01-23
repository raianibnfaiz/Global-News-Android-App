package com.raian.newsappproject.network

import com.raian.newsappproject.models.NewsDatAaSource
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


val BASE_URL = "https://newsapi.org/v2/"
const val API_KEY = "14cae576ef1844059b621b865d79c164"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL)
        .build()
interface NewsApiInterface {
    @GET("top-headlines?country=us&category=business&apiKey=${API_KEY}")
    suspend fun getBusiness(): NewsDatAaSource

    @GET("top-headlines?country=us&category=sports&apiKey=${API_KEY}")
    suspend fun getSports(): NewsDatAaSource

    @GET("top-headlines?country=us&category=science&apiKey=${API_KEY}")
    suspend fun getScience(): NewsDatAaSource

    @GET("top-headlines?country=us&category=technology&apiKey=${API_KEY}")
    suspend fun getTechnology(): NewsDatAaSource
}

object NewsApi {
    val retrofitService: NewsApiInterface by lazy { retrofit.create(NewsApiInterface::class.java) }
}