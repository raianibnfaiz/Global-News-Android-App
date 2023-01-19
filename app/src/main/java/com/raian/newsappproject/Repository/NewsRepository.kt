package com.raian.newsappproject.Repository

import androidx.lifecycle.LiveData
import com.raian.newsappproject.Dao.NewsDao
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.TempArticle

class NewsRepository(private val newsDao: NewsDao)

{
    suspend fun insertArticles(article: List<TempArticle>){
        newsDao.insertArticles(article)
    }
    fun getArticles(): LiveData<List<TempArticle>>{
        return newsDao.getArticles()
    }

}