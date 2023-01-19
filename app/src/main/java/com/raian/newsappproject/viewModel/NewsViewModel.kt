package com.raian.newsappproject.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.network.NewsApi
import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
class NewsViewModel(application: Application) : AndroidViewModel(application){
    lateinit var repository : NewsRepository
    val BASE_URL = "https://newsapi.org/v2/"

    val _tempArticle = MutableLiveData<List<Article>>()
    var _list = MutableLiveData<List<Article>>()
    val list:LiveData<List<Article>> = _list
    val _sportsNewsList= MutableLiveData<List<Article>>()
    val sportsList:LiveData<List<Article>> = _sportsNewsList
    val _scienceNewsList= MutableLiveData<List<Article>>()
    val scienceList:LiveData<List<Article>> = _scienceNewsList
    val _technologyNewsList= MutableLiveData<List<Article>>()
    val technologyList:LiveData<List<Article>> = _technologyNewsList
//    private var titlesList = mutableListOf<String>()
//    private var descList = mutableListOf<String>()
//    private var imagesList = mutableListOf<String>()
//    private var linksList = mutableListOf<String>()
//fun addBlog(article: Article){
//    newList.add(article)
//    list.value = newList
//

    init{

        val newsDao = NewsDatabase.getDatabase(application)!!.newsDao()
        repository = NewsRepository(newsDao)
        getArticle()
        getBusinessNews()
//        getSportsNews()
//        getScienceNews()
//        getTechnologyNews()

//            val newsDao = NewsDatabase.getDatabase(application)?.newsDao()
//            repository = newsDao?.let { NewsRepository(it) }!!
//            readAllNewsData = repository.readAllWriterData()



//        val moshi = Moshi.Builder()
//            .add(KotlinJsonAdapterFactory())
//            .build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .build()
//            .create(NewsApiInterface::class.java)



    }

    fun getBusinessNews(){
        viewModelScope.launch{
            try {
                //val response = retrofit.getNews()
                val response = NewsApi.retrofitService.getNews()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                _list.value=response.articles
                Log.d("home", "Result from viewmodel Listtttt+ ${_list.value}")
                Log.d("home", "Result from viewmodel Response + ${response.articles}")
            } catch (e: Exception) {
                Log.d("home", e.toString())

            }

        }
    }
    fun getSportsNews(){
        viewModelScope.launch{
            try {
                //val response = retrofit.getNews()
                val response = NewsApi.retrofitService.getSports()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                _sportsNewsList.value=response.articles
                Log.d("home", "Result from viewmodel Listtttt+ ${_list.value}")
                Log.d("home", "Result from viewmodel Response + ${response.articles}")
            } catch (e: Exception) {
                Log.d("home", e.toString())

            }

        }
    }
    fun getScienceNews(){
        viewModelScope.launch{
            try {
                //val response = retrofit.getNews()
                val response = NewsApi.retrofitService.getScience()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                _scienceNewsList.value=response.articles
                Log.d("home", "Result from viewmodel Listtttt+ ${_list.value}")
                Log.d("home", "Result from viewmodel Response + ${response.articles}")
            } catch (e: Exception) {
                Log.d("home", e.toString())

            }

        }
    }
    fun getTechnologyNews(){
        viewModelScope.launch{
            try {
                //val response = retrofit.getNews()
                val response = NewsApi.retrofitService.getTechnology()
//                for (article in response.articles) {
//                    Log.d("MainActivity", "Result + $article")
//                    list.add(article)
//                }
                _technologyNewsList.value=response.articles
                Log.d("home", "Result from viewmodel Listtttt+ ${_list.value}")
                Log.d("home", "Result from viewmodel Response + ${response.articles}")
            } catch (e: Exception) {
                Log.d("home", e.toString())

            }

        }
    }
    fun getArticle(){
        viewModelScope.launch {
            try {
                val response = NewsApi.retrofitService.getNews()
                val adjust = adjustArticleModel(response.articles, "business")
                repository.insertArticles(adjust)
            }
            catch (e:Exception){
                Log.d("Error", "error: e")
            }


        }

    }
    fun adjustArticleModel(articles: List<Article>, category: String): List<TempArticle> {
        return articles.map{ article->
        TempArticle(
            0,
            article.content,
            article.author,
            article.description,
            article.publishedAt,
            article.source,
            article.title,
            category,
            article.url,
            article.urlToImage
        )
    }
}
}