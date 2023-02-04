package com.raian.newsappproject.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.raian.newsappproject.Dao.NewsDao
import com.raian.newsappproject.converter.NewsConverter
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle

@Database(entities = [TempArticle::class, Bookmark::class], version = 5, exportSchema = false)
@TypeConverters(NewsConverter::class)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao


    companion object {

        @Volatile
        private var INSTANCE: NewsDatabase? = null
        fun getDatabase(context: Context): NewsDatabase? {
            val temInstance = INSTANCE
            if (temInstance != null) {
                return temInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NewsDatabase::class.java,
                    "application_database"
                ).fallbackToDestructiveMigration().build()

                INSTANCE = instance
                return instance
            }
        }
    }
}