package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.raian.newsappproject.R
import com.raian.newsappproject.adapter.TabLayoutAdapter
import com.raian.newsappproject.adapter.TabLayoutAdapter.Companion.tabList
import com.raian.newsappproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Tab layout
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout_home)
        val viewPage = view.findViewById<ViewPager2>(R.id.view_pager2)

        val tabAdapter = TabLayoutAdapter(childFragmentManager, lifecycle)
        viewPage.adapter = tabAdapter
        TabLayoutMediator(tabLayout, viewPage) { tab, position ->
            tab.text = tabList[position].title
        }.attach()
    }
}