package com.raian.newsappproject.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/raian/newsappproject/adapter/BookmarkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raian/newsappproject/adapter/BookmarkAdapter$ItemViewHolder;", "context", "Landroid/content/Context;", "viewModel", "Lcom/raian/newsappproject/viewModel/NewsViewModel;", "arrayList", "Ljava/util/ArrayList;", "Lcom/raian/newsappproject/models/Bookmark;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Lcom/raian/newsappproject/viewModel/NewsViewModel;Ljava/util/ArrayList;)V", "getViewModel", "()Lcom/raian/newsappproject/viewModel/NewsViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_debug"})
public final class BookmarkAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raian.newsappproject.adapter.BookmarkAdapter.ItemViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raian.newsappproject.viewModel.NewsViewModel viewModel = null;
    private final java.util.ArrayList<com.raian.newsappproject.models.Bookmark> arrayList = null;
    
    public BookmarkAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.viewModel.NewsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.raian.newsappproject.models.Bookmark> arrayList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.viewModel.NewsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raian.newsappproject.adapter.BookmarkAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.adapter.BookmarkAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/raian/newsappproject/adapter/BookmarkAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "authorName", "Landroid/widget/TextView;", "getAuthorName", "()Landroid/widget/TextView;", "date", "getDate", "deleteBtn", "Landroidx/constraintlayout/utils/widget/ImageFilterButton;", "getDeleteBtn", "()Landroidx/constraintlayout/utils/widget/ImageFilterButton;", "description", "getDescription", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "newsCard", "Landroidx/cardview/widget/CardView;", "getNewsCard", "()Landroidx/cardview/widget/CardView;", "title", "getTitle", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView description = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView authorName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView date = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView newsCard = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.utils.widget.ImageFilterButton deleteBtn = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAuthorName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getNewsCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.utils.widget.ImageFilterButton getDeleteBtn() {
            return null;
        }
    }
}