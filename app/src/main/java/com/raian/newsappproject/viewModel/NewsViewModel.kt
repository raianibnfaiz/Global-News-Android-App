package com.raian.newsappproject.viewModel

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.raian.newsappproject.Article
import com.raian.newsappproject.PostItem
import com.raian.newsappproject.network.NewsApiInterface
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@OptIn(DelicateCoroutinesApi::class)
class NewsViewModel : ViewModel(){
    val BASE_URL = "https://newsapi.org/v2/"
    var list: MutableList<Article> = mutableListOf()
    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<String>()
    private var linksList = mutableListOf<String>()


    init{
         val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(NewsApiInterface::class.java)



        GlobalScope.launch(Dispatchers.IO) {
            try {
                val response = retrofit.getNews()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                list.addAll(response.articles)
                Log.d("MainActivity", "Result + $list")
            } catch (e: Exception) {
                Log.d("MainActivity", e.toString())

            }

        }
    }
}