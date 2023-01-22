package com.raian.newsappproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.raian.newsappproject.R
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.adapter.ScienceAdapter
import com.raian.newsappproject.adapter.TechnologyAdapter
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.network.NewsApi
import com.raian.newsappproject.viewModel.NewsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class TechnologyFragment : Fragment() {
    private lateinit var viewModel: NewsViewModel
    private lateinit var swapRefresh: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    lateinit var repository: NewsRepository
    var listNews = ArrayList<TempArticle>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_technology, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val applicationDao = NewsDatabase.getDatabase(requireContext())?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        recyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        val adapter = TechnologyAdapter(
            requireContext(), viewModel, listNews as ArrayList<TempArticle>
        )
        recyclerView.adapter = adapter
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                repository.refresh()
            }
        }
        viewModel.readAllTechnologyNews.observe(
            viewLifecycleOwner
        ) {

            adapter.setData(it)

        }
        Log.d("home", "list home fragment: ${viewModel.list?.value.toString()}")

        swapRefresh = view.findViewById(R.id.swipeRefreshLayout)
        swapRefresh.setOnRefreshListener {
            //recyclerView = view.findViewById(R.id.rv_recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            //recyclerView.visibility = View.VISIBLE
            //setTechnologyArticle()
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    repository.refresh()
                }
            }
            swapRefresh.isRefreshing = false
        }
    }

    fun setTechnologyArticle() {
//        viewModel.deleteArticle()
        viewModel.technologyList.observe(viewLifecycleOwner) { article ->
            article.map {
                it?.let { it1 ->
                    TempArticle(
                        0,
                        it.author,
                        it.content,
                        it.description,
                        it.publishedAt,
                        it.source,
                        it.title,
                        "technology",
                        it.url,
                        it.urlToImage,
                        true
                    )
                }?.let { it2 ->
                    listNews.add(
                        it2
                    )
                }
            }
            viewModel.addAllArticle(listNews)
        }
        viewModel.readAllTechnologyNews?.observe(
            viewLifecycleOwner
        ) {
            recyclerView.adapter = TechnologyAdapter(
                requireContext(), viewModel, listNews as ArrayList<TempArticle>
            )
        }

    }
}

