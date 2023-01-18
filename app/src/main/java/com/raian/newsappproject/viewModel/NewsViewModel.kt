package com.raian.newsappproject.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.network.NewsApi
import com.raian.newsappproject.network.NewsApiInterface
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@OptIn(DelicateCoroutinesApi::class)
class NewsViewModel : ViewModel(){
    val BASE_URL = "https://newsapi.org/v2/"
    var _list = MutableLiveData<List<Article>>()
    val list:LiveData<List<Article>> = _list
    val newList = arrayListOf<Article>()
//    private var titlesList = mutableListOf<String>()
//    private var descList = mutableListOf<String>()
//    private var imagesList = mutableListOf<String>()
//    private var linksList = mutableListOf<String>()
//fun addBlog(article: Article){
//    newList.add(article)
//    list.value = newList
//}

    init{

//        val moshi = Moshi.Builder()
//            .add(KotlinJsonAdapterFactory())
//            .build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .build()
//            .create(NewsApiInterface::class.java)


        viewModelScope.launch{
            try {
                //val response = retrofit.getNews()
                val response = NewsApi.retrofitService.getNews()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                _list.value=response.articles
                Log.d("home", "Result from viewmodel Listtttt+ ${_list.value}")
                Log.d("home", "Result from viewmodel Response + ${response.articles}")
            } catch (e: Exception) {
                Log.d("home", e.toString())

            }

        }
    }
}