package com.raian.newsappproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.R
import com.raian.newsappproject.adapter.NewsAdapter
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.viewModel.NewsViewModel




class TopNewsFragment : Fragment() {
    private lateinit var viewModel : NewsViewModel
    private lateinit var recyclerView:RecyclerView
    var listNews: MutableList<Article> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_news, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]

        viewModel.readAllBusinessNews?.observe(viewLifecycleOwner
        ) {
            listNews = it as MutableList<Article>
            Log.d("home", "It: ${it.toString()}")
            Log.d("home", "listNews it is ${listNews.toString()}")
            recyclerView = view.findViewById(R.id.rv_recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = NewsAdapter(
                requireContext(), viewModel, listNews as ArrayList<Article>)
            Log.d("home", "listNews before ${listNews.toString()}")
        }
        Log.d("home", "list home fragment: ${ viewModel.list?.value.toString() }")

        //listNews = viewModel.list



    }


}