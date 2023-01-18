package com.raian.newsappproject.db

//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import androidx.room.TypeConverters
//import com.raian.newsappproject.models.Article
//import com.raian.newsappproject.Dao.newsDao
//import com.raian.newsappproject.adapter.NewsTypeConverter
//
////@Database(entities = [Article::class], version = 1, exportSchema = false)
////@TypeConverters(NewsTypeConverter::class)
//abstract class NewsDatabase : RoomDatabase() {
//    abstract fun newsDao(): newsDao
//
//
//    companion object {
//
//        @Volatile
//        private var INSTANCE: NewsDatabase? = null
//        fun getDatabase(context: Context): NewsDatabase? {
//            val temInstance = INSTANCE
//            if (temInstance != null) {
//                return temInstance
//            }
//            synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    NewsDatabase::class.java,
//                    "application_database"
//                ).build()
//
//                INSTANCE = instance
//                return instance
//            }
//        }
//    }
//}