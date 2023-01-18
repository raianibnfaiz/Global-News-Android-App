package com.raian.newsappproject.models

data class CatagoryList(
    val business:List<Article>,
    val sports:List<Article>,
    val technology:List<Article>,
    val science:List<Article>
)
