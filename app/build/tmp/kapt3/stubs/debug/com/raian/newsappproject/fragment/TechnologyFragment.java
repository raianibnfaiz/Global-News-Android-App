package com.raian.newsappproject.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010&\u001a\u00020\u0017R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/raian/newsappproject/fragment/TechnologyFragment;", "Landroidx/fragment/app/Fragment;", "()V", "listNews", "Ljava/util/ArrayList;", "Lcom/raian/newsappproject/models/TempArticle;", "getListNews", "()Ljava/util/ArrayList;", "setListNews", "(Ljava/util/ArrayList;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "repository", "Lcom/raian/newsappproject/Repository/NewsRepository;", "getRepository", "()Lcom/raian/newsappproject/Repository/NewsRepository;", "setRepository", "(Lcom/raian/newsappproject/Repository/NewsRepository;)V", "swapRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "viewModel", "Lcom/raian/newsappproject/viewModel/NewsViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setTechnologyArticle", "app_debug"})
public final class TechnologyFragment extends androidx.fragment.app.Fragment {
    private com.raian.newsappproject.viewModel.NewsViewModel viewModel;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swapRefresh;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    public com.raian.newsappproject.Repository.NewsRepository repository;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.raian.newsappproject.models.TempArticle> listNews;
    private java.util.HashMap _$_findViewCache;
    
    public TechnologyFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.Repository.NewsRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.Repository.NewsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.raian.newsappproject.models.TempArticle> getListNews() {
        return null;
    }
    
    public final void setListNews(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.raian.newsappproject.models.TempArticle> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setTechnologyArticle() {
    }
}