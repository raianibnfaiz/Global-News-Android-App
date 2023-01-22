package com.raian.newsappproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.raian.newsappproject.R
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.adapter.SportsAdapter
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SportsFragment : Fragment() {
    private lateinit var viewModel : NewsViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var swapRefresh: SwipeRefreshLayout
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
        return inflater.inflate(R.layout.fragment_sports, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val applicationDao = NewsDatabase.getDatabase(requireContext())?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        recyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        val adapter = SportsAdapter(
            requireContext(), viewModel, listNews as ArrayList<TempArticle>
        )
        recyclerView.adapter = adapter
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                repository.refreshSportsTab()
            }
        }
        viewModel.readAllSportsNews.observe(
            viewLifecycleOwner
        ) {
            adapter.setData(it)
        }
        swapRefresh = view.findViewById(R.id.swipeRefreshLayout)
        swapRefresh.setOnRefreshListener {
            //recyclerView = view.findViewById(R.id.rv_recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            //recyclerView.visibility = View.VISIBLE
            //setTechnologyArticle()
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    repository.refreshSportsTab()
                }
            }
            swapRefresh.isRefreshing = false
        }


    }


}