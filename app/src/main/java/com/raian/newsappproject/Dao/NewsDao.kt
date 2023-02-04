package com.raian.newsappproject.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
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

    @Query("Delete from articles where catagory = 'sports' ")
    fun deleteSports()

    @Query("Delete from articles where catagory = 'technology' ")
    fun deleteTechnology()

    @Query("Delete from articles where catagory = 'science' ")
    fun deleteScience()

    @Query("Delete from articles where catagory = 'business' ")
    fun deleteTopNews()

    //FOR BOOKMARK FUNCTIONALITY

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBookMark(article: Bookmark)

    @Query("SELECT * FROM bookmark")
    fun getAllBookMark(): LiveData<List<Bookmark>>

    @Delete
    suspend fun deleteBookMarKArticle(bookMarkNews: Bookmark)
    @Update
    suspend fun update(article: TempArticle)

    @Delete
    suspend fun delete(article: TempArticle)

    @Query("DELETE FROM bookmark")
    suspend fun deleteAllBookmarks()

    @Query("DELETE FROM articles")
    suspend fun deleteAll()
}