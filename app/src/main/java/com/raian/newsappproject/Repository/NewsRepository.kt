package com.raian.newsappproject.Repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.raian.newsappproject.Dao.NewsDao
import com.raian.newsappproject.models.TempArticle

class NewsRepository(private val newsDao: NewsDao)


{
    suspend fun insertArticles(article: List<TempArticle>){
        newsDao.insertArticles(article)
    }
    fun getArticles(): LiveData<List<TempArticle>>{
        return newsDao.getArticles()
    }
    fun getBusinessNews():LiveData<List<TempArticle>>{
        return newsDao.getBusinessNews()
    }
    fun getSportsNews():LiveData<List<TempArticle>>{
        return newsDao.getSportsNews()
    }
    fun getScienceNews():LiveData<List<TempArticle>>{
        return newsDao.getScienceNews()
    }
    fun getTechnologyNews():LiveData<List<TempArticle>>{
        return newsDao.getTechnologyNews()
    }
    fun deleteAll(){
        newsDao.deleteAll()
    }

}