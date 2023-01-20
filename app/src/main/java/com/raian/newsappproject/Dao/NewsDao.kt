package com.raian.newsappproject.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.TempArticle

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(articles: List<TempArticle>)

    @Query("SELECT * FROM articles")
    fun getArticles(): LiveData<List<TempArticle>>

    @Query("SELECT * FROM articles WHERE catagory = 'business' ")
    fun getBusinessNews():LiveData<List<TempArticle>>

    @Query("SELECT * FROM articles WHERE catagory = 'sports' ")
    fun getSportsNews():LiveData<List<TempArticle>>

    @Query("SELECT * FROM articles WHERE catagory = 'science' ")
    fun getScienceNews():LiveData<List<TempArticle>>

    @Query("SELECT * FROM articles WHERE catagory = 'technology' ")
    fun getTechnologyNews():LiveData<List<TempArticle>>
    @Query("Delete from articles")
    fun deleteAll()

}