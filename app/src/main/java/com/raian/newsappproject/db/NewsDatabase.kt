package com.raian.newsappproject.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.Dao.NewsDao

@Database(entities = [Article::class], version = 1)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}