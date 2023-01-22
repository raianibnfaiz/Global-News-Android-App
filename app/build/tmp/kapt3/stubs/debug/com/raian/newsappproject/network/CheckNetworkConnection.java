package com.raian.newsappproject.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0015J\b\u0010\r\u001a\u00020\fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raian/newsappproject/network/CheckNetworkConnection;", "Landroidx/lifecycle/LiveData;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "onActive", "", "onInactive", "app_debug"})
public final class CheckNetworkConnection extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    private final android.net.ConnectivityManager connectivityManager = null;
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    
    public CheckNetworkConnection(@org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager connectivityManager) {
        super(null);
    }
    
    public CheckNetworkConnection(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
}