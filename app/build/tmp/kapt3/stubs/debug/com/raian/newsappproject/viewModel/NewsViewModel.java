package com.raian.newsappproject.viewModel;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ\u000e\u0010:\u001a\u0002082\u0006\u0010\u0019\u001a\u00020\u001bJ\u000e\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020#R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001d\u00a8\u0006<"}, d2 = {"Lcom/raian/newsappproject/viewModel/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "_list", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/raian/newsappproject/models/Article;", "get_list", "()Landroidx/lifecycle/MutableLiveData;", "set_list", "(Landroidx/lifecycle/MutableLiveData;)V", "_scienceNewsList", "get_scienceNewsList", "_sportsNewsList", "get_sportsNewsList", "_technologyNewsList", "get_technologyNewsList", "_tempArticle", "get_tempArticle", "bookMarkNews", "Landroidx/lifecycle/LiveData;", "Lcom/raian/newsappproject/models/Bookmark;", "getBookMarkNews", "()Landroidx/lifecycle/LiveData;", "setBookMarkNews", "(Landroidx/lifecycle/LiveData;)V", "list", "getList", "readAllBusinessNews", "Lcom/raian/newsappproject/models/TempArticle;", "getReadAllBusinessNews", "readAllSciencesNews", "getReadAllSciencesNews", "readAllSportsNews", "getReadAllSportsNews", "readAllTechnologyNews", "getReadAllTechnologyNews", "repository", "Lcom/raian/newsappproject/Repository/NewsRepository;", "getRepository", "()Lcom/raian/newsappproject/Repository/NewsRepository;", "setRepository", "(Lcom/raian/newsappproject/Repository/NewsRepository;)V", "scienceList", "getScienceList", "sportsList", "getSportsList", "technologyList", "getTechnologyList", "addBookMarkArticle", "", "article", "deleteBookBarkArticle", "updateArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    public com.raian.newsappproject.Repository.NewsRepository repository;
    public androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> bookMarkNews;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllBusinessNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllSportsNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllSciencesNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllTechnologyNews = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "https://newsapi.org/v2/";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> _tempArticle = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> _list;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> _sportsNewsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> sportsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> _scienceNewsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> scienceList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> _technologyNewsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> technologyList = null;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.Repository.NewsRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.Repository.NewsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> getBookMarkNews() {
        return null;
    }
    
    public final void setBookMarkNews(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllBusinessNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllSportsNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllSciencesNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllTechnologyNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> get_tempArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> get_list() {
        return null;
    }
    
    public final void set_list(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> get_sportsNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> getSportsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> get_scienceNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> getScienceList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raian.newsappproject.models.Article>> get_technologyNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Article>> getTechnologyList() {
        return null;
    }
    
    public final void addBookMarkArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark article) {
    }
    
    public final void updateArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article) {
    }
    
    public final void deleteBookBarkArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark bookMarkNews) {
    }
}