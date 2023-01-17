package com.raian.newsappproject.models

data class NewsDatAaSource(
    val articles: List<Article>,
    val status: String?,
    val totalResults: Int?
)