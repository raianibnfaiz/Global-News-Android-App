package com.raian.newsappproject.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.models.TempArticle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocalDataViewModel(application: Application) : AndroidViewModel(application) {
    lateinit var businesesNewsList: LiveData<List<TempArticle>>
    lateinit var newsRepo: NewsRepository

    init {
        //newsRepo = NewsRepository(application)
//        newsList = newsRepo.getAllNews()
//        bookMarkNews = newsRepo.getAllBookMarkNews()
        businesesNewsList = newsRepo.getBusinessNews()
//        sportsNewsList = newsRepo.getSportsNews()
//        technologyNewsList = newsRepo.getTechnologyNews()
    }

    fun addAllArticle(article: List<TempArticle>) {
        viewModelScope.launch(Dispatchers.IO) {
            newsRepo.insertArticles(article)
        }
    }
}