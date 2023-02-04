package com.raian.newsappproject.Dao;

import java.lang.System;

@androidx.room.Dao()
<<<<<<< HEAD
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u0003H\'J\b\u0010\u000b\u001a\u00020\u0003H\'J\b\u0010\f\u001a\u00020\u0003H\'J\b\u0010\r\u001a\u00020\u0003H\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u001f\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/raian/newsappproject/Dao/NewsDao;", "", "delete", "", "article", "Lcom/raian/newsappproject/models/TempArticle;", "(Lcom/raian/newsappproject/models/TempArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllBookmarks", "deleteScience", "deleteSports", "deleteTechnology", "deleteTopNews", "getAllBookMark", "Landroidx/lifecycle/LiveData;", "", "Lcom/raian/newsappproject/models/Bookmark;", "getArticles", "getBusinessNews", "getScienceNews", "getSportsNews", "getTechnologyNews", "insertArticles", "articles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBookMark", "(Lcom/raian/newsappproject/models/Bookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 1)
=======
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H\'J\b\u0010\u000f\u001a\u00020\u0003H\'J\b\u0010\u0010\u001a\u00020\u0003H\'J\b\u0010\u0011\u001a\u00020\u0003H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u0013H\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013H\'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013H\'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013H\'J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013H\'J\u001f\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/raian/newsappproject/Dao/NewsDao;", "", "delete", "", "article", "Lcom/raian/newsappproject/models/TempArticle;", "(Lcom/raian/newsappproject/models/TempArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllBookmarks", "deleteBookMarKArticle", "bookMarkNews", "Lcom/raian/newsappproject/models/Bookmark;", "(Lcom/raian/newsappproject/models/Bookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteScience", "deleteSports", "deleteTechnology", "deleteTopNews", "getAllBookMark", "Landroidx/lifecycle/LiveData;", "", "getArticles", "getBusinessNews", "getScienceNews", "getSportsNews", "getTechnologyNews", "insertArticles", "articles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBookMark", "update", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 5)
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
    public abstract java.lang.Object insertArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raian.newsappproject.models.TempArticle> articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getArticles();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles WHERE catagory = \'business\' ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getBusinessNews();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles WHERE catagory = \'sports\' ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getSportsNews();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles WHERE catagory = \'science\' ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getScienceNews();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles WHERE catagory = \'technology\' ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getTechnologyNews();
    
    @androidx.room.Query(value = "Delete from articles where catagory = \'sports\' ")
    public abstract void deleteSports();
    
    @androidx.room.Query(value = "Delete from articles where catagory = \'technology\' ")
    public abstract void deleteTechnology();
    
    @androidx.room.Query(value = "Delete from articles where catagory = \'science\' ")
    public abstract void deleteScience();
    
    @androidx.room.Query(value = "Delete from articles where catagory = \'business\' ")
    public abstract void deleteTopNews();
    
    @org.jetbrains.annotations.Nullable()
<<<<<<< HEAD
    @androidx.room.Insert(onConflict = 1)
=======
    @androidx.room.Insert(onConflict = 5)
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
    public abstract java.lang.Object insertBookMark(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookmark")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> getAllBookMark();
    
    @org.jetbrains.annotations.Nullable()
<<<<<<< HEAD
=======
    @androidx.room.Delete()
    public abstract java.lang.Object deleteBookMarKArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark bookMarkNews, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM bookmark")
    public abstract java.lang.Object deleteAllBookmarks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM articles")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}