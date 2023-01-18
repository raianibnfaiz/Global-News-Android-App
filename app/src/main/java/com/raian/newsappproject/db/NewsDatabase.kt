package com.raian.newsappproject.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.Dao.NewsDao

abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}