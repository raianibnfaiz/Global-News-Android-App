package com.raian.newsappproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.adapter.NewsAdapter
import com.raian.newsappproject.viewModel.NewsViewModel




class HomeNewsFragment : Fragment() {
    private lateinit var viewModel : NewsViewModel
    private lateinit var recyclerView:RecyclerView
    var listNews: List<Article> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_news, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        recyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        listNews = viewModel.list
        recyclerView.adapter = NewsAdapter(
            requireContext(), viewModel, listNews as ArrayList<Article>)

    }


}