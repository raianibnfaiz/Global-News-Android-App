package com.raian.newsappproject.Repository

import com.raian.newsappproject.network.NewsApiInterface

class NewsRepository(private val newsApiInterface: NewsApiInterface) {
    suspend fun getTopHeadlines() = newsApiInterface.getNews()
}