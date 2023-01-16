package com.raian.newsappproject

data class NewsDatAaSource(
    val articles: List<Article>,
    val status: String?,
    val totalResults: Int?
)