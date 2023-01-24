package com.raian.newsappproject.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.network.NewsApi
import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
class NewsViewModel(application: Application) : AndroidViewModel(application){
    lateinit var repository : NewsRepository
    lateinit var bookMarkNews: LiveData<List<Bookmark>>
    val readAllBusinessNews:LiveData<List<TempArticle>>
    val readAllSportsNews: LiveData<List<TempArticle>>
    val readAllSciencesNews: LiveData<List<TempArticle>>
    val readAllTechnologyNews: LiveData<List<TempArticle>>
    val BASE_URL = "https://newsapi.org/v2/"
    val _tempArticle = MutableLiveData<List<Article>>()
    var _list = MutableLiveData<List<Article>>()
    val list:LiveData<List<Article>> = _list
    val _sportsNewsList= MutableLiveData<List<Article>>()
    val sportsList:LiveData<List<Article>> = _sportsNewsList
    val _scienceNewsList= MutableLiveData<List<Article>>()
    val scienceList:LiveData<List<Article>> = _scienceNewsList
    val _technologyNewsList= MutableLiveData<List<Article>>()
    val technologyList:LiveData<List<Article>> = _technologyNewsList


    init{
    Log.e("Error", "init")
        val applicationDao = NewsDatabase.getDatabase(application)?.newsDao()
        repository=applicationDao?.let { NewsRepository(it) }!!

        bookMarkNews = repository.getAllBookMarkNews()
        readAllBusinessNews = repository.getBusinessNews()
        readAllSportsNews = repository.getSportsNews()
        readAllSciencesNews = repository.getScienceNews()
        readAllTechnologyNews = repository.getTechnologyNews()

    }
    fun addBookMarkArticle(article: Bookmark) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertBookMarkArticle(article)
        }
    }
    fun updateArticle(article: TempArticle) {
        viewModelScope.launch(Dispatchers.IO) {
           repository.updateArticle(article)
        }
    }
    fun deleteBookBarkArticle(bookMarkNews: Bookmark) {
        viewModelScope.launch {
            repository.deleteBookMarKArticle(bookMarkNews)
        }
    }



}