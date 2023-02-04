package com.raian.newsappproject.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Entity(tableName = "articles")
@Parcelize
data class TempArticle(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val catagory:String?,
    @PrimaryKey
    val url: String,
    val urlToImage: String?,
    var likedArticle: Boolean
): Parcelable