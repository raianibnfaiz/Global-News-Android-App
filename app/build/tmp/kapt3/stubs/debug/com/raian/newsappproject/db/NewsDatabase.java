package com.raian.newsappproject.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.raian.newsappproject.converter.NewsConverter.class})
@androidx.room.Database(entities = {com.raian.newsappproject.models.TempArticle.class, com.raian.newsappproject.models.Bookmark.class}, version = 5, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raian/newsappproject/db/NewsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lcom/raian/newsappproject/Dao/NewsDao;", "Companion", "app_debug"})
public abstract class NewsDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.raian.newsappproject.db.NewsDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.raian.newsappproject.db.NewsDatabase INSTANCE;
    
    public NewsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raian.newsappproject.Dao.NewsDao newsDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/raian/newsappproject/db/NewsDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/raian/newsappproject/db/NewsDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.raian.newsappproject.db.NewsDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}