package com.raian.newsappproject.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\rJ\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u001bJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001bJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001bJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001bJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001bJ\u001f\u0010!\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010$\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010%\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010&\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\'\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010(\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/raian/newsappproject/Repository/NewsRepository;", "", "newsDao", "Lcom/raian/newsappproject/Dao/NewsDao;", "(Lcom/raian/newsappproject/Dao/NewsDao;)V", "adjustArticleModel", "", "Lcom/raian/newsappproject/models/TempArticle;", "articles", "Lcom/raian/newsappproject/models/Article;", "category", "", "deleteAllBookmarks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBookMarKArticle", "bookMarkNews", "Lcom/raian/newsappproject/models/Bookmark;", "(Lcom/raian/newsappproject/models/Bookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteScience", "deleteSports", "deleteTechnology", "deleteTopNews", "deleteUser", "article", "(Lcom/raian/newsappproject/models/TempArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBookMarkNews", "Landroidx/lifecycle/LiveData;", "getArticles", "getBusinessNews", "getScienceNews", "getSportsNews", "getTechnologyNews", "insertArticles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBookMarkArticle", "refresh", "refreshScienceTab", "refreshSportsTab", "refreshTopNewsTab", "updateArticle", "app_debug"})
public final class NewsRepository {
    private final com.raian.newsappproject.Dao.NewsDao newsDao = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.Dao.NewsDao newsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raian.newsappproject.models.TempArticle> article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getBusinessNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getSportsNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getScienceNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getTechnologyNews() {
        return null;
    }
    
    public final void deleteSports() {
    }
    
    public final void deleteTechnology() {
    }
    
    public final void deleteScience() {
    }
    
    public final void deleteTopNews() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertBookMarkArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> getAllBookMarkNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteBookMarKArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark bookMarkNews, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllBookmarks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refresh(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshSportsTab(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshScienceTab(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshTopNewsTab(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.raian.newsappproject.models.TempArticle> adjustArticleModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raian.newsappproject.models.Article> articles, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
}