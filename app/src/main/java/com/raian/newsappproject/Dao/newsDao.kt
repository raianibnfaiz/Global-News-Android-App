package com.raian.newsappproject.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.raian.newsappproject.models.Article

//@Dao
//interface newsDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertArticles(articles: List<Article>)
//
//    @Query("SELECT * FROM articles")
//    fun getArticles(): LiveData<List<Article>>
//}