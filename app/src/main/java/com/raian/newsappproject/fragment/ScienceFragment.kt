package com.raian.newsappproject.fragment

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.raian.newsappproject.R
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.adapter.ScienceAdapter
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScienceFragment : Fragment() {
    private lateinit var viewModel: NewsViewModel
    private lateinit var swapRefresh: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    lateinit var repository: NewsRepository
    var listNews = ArrayList<TempArticle>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_science, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val applicationDao = NewsDatabase.getDatabase(requireContext())?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        recyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        val adapter = ScienceAdapter(
            requireContext(), viewModel, listNews
        )
        recyclerView.adapter = adapter
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                repository.refreshScienceTab()
            }
        }
        viewModel.readAllSciencesNews.observe(
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
                    repository.refreshScienceTab()
                }
            }
            swapRefresh.isRefreshing = false
        }


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_item, menu)
        val item = menu.findItem(R.id.actionSearch)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    val adapter = recyclerView.adapter as ScienceAdapter
                    adapter.filter(newText)
                }
                return false
            }
        })
        super.onCreateOptionsMenu(menu, inflater)
    }


}