package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.raian.newsappproject.R
import com.raian.newsappproject.adapter.BookmarkAdapter
import com.raian.newsappproject.databinding.FragmentBookmarkBinding
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.viewModel.NewsViewModel

class BookmarkFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var refreshLayout: SwipeRefreshLayout
    private val viewModel: NewsViewModel by viewModels()
    private var _binding: FragmentBookmarkBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookmarkBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }


    override fun onResume() {
        super.onResume()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.photos_grid)
        refreshLayout = view.findViewById(R.id.swipeLayout)
        recyclerView.setHasFixedSize(true)
        initializingAdapter()
        refreshLayout.setOnRefreshListener {
            initializingAdapter()
            refreshLayout.isRefreshing = false
        }
    }

    private fun initializingAdapter() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.visibility = View.VISIBLE
        dataObservation()
    }

    private fun dataObservation() {
        viewModel.bookMarkNews.observe(viewLifecycleOwner) {
            recyclerView.adapter = BookmarkAdapter(
                requireContext(), viewModel, it as ArrayList<Bookmark>
            )
        }
    }
}