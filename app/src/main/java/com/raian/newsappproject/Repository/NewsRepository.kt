package com.raian.newsappproject.Repository

import androidx.lifecycle.LiveData
import com.raian.newsappproject.Dao.NewsDao
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.network.NewsApi

class NewsRepository(private val newsDao: NewsDao) {
    suspend fun insertArticles(article: List<TempArticle>) {
        newsDao.insertArticles(article)
    }

    fun getArticles(): LiveData<List<TempArticle>> {
        return newsDao.getArticles()
    }

    fun getBusinessNews(): LiveData<List<TempArticle>> {
        return newsDao.getBusinessNews()
    }

    fun getSportsNews(): LiveData<List<TempArticle>> {
        return newsDao.getSportsNews()
    }

    fun getScienceNews(): LiveData<List<TempArticle>> {
        return newsDao.getScienceNews()
    }

    fun getTechnologyNews(): LiveData<List<TempArticle>> {
        return newsDao.getTechnologyNews()
    }

    fun deleteSports() {
        newsDao.deleteSports()
    }

    fun deleteTechnology() {
        newsDao.deleteTechnology()
    }

    fun deleteScience() {
        newsDao.deleteScience()
    }

    fun deleteTopNews() {
        newsDao.deleteTopNews()
    }

    suspend fun updateArticle(article: TempArticle) {
        newsDao.update(article)
    }

    //FOR BOOKMARK FUNCTIONALITY

    suspend fun insertBookMarkArticle(article: Bookmark) {
        return newsDao.insertBookMark(article)
    }

    fun getAllBookMarkNews(): LiveData<List<Bookmark>> {
        return newsDao.getAllBookMark()
    }
    suspend fun deleteBookMarKArticle(bookMarkNews: Bookmark) {
        newsDao.deleteBookMarKArticle(bookMarkNews)
    }

    suspend fun deleteUser(article: TempArticle) {
        newsDao.delete(article)
    }

    suspend fun deleteAllBookmarks() {
        newsDao.deleteAllBookmarks()
    }


    suspend fun refresh() {
//        deleteTechnology()

        val response = NewsApi.retrofitService.getTechnology()
        val adjust = adjustArticleModel(response.articles, "technology")

        insertArticles(adjust)
        // repeat for sports , etc.
    }

    suspend fun refreshSportsTab() {
//        deleteSports()

        val response = NewsApi.retrofitService.getSports()
        val adjust = adjustArticleModel(response.articles, "sports")

        insertArticles(adjust)
        // repeat for sports , etc.
    }

    suspend fun refreshScienceTab() {
//        deleteScience()

        val response = NewsApi.retrofitService.getScience()
        val adjust = adjustArticleModel(response.articles, "science")

        insertArticles(adjust)
        // repeat for sports , etc.
    }

    suspend fun refreshTopNewsTab() {
//        deleteTopNews()

        val response = NewsApi.retrofitService.getBusiness()
        val adjust = adjustArticleModel(response.articles, "business")

        insertArticles(adjust)
        // repeat for sports , etc.
    }

    fun adjustArticleModel(articles: List<Article>, category: String): List<TempArticle> {
        return articles.map { article ->
            TempArticle(
                article.author,
                article.content,
                article.description,
                article.publishedAt,
                article.source,
                article.title,
                category,
                article.url,
                article.urlToImage,
                false
            )
        }

    }
}