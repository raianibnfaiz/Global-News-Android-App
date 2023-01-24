package com.raian.newsappproject.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "bookmark")
@Parcelize
data class Bookmark(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val catagory:String?,
    @PrimaryKey
    val url: String,
    val urlToImage: String?
):Parcelable
