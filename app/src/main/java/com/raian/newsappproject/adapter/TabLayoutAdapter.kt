package com.raian.newsappproject.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.raian.newsappproject.fragment.*
import com.raian.newsappproject.models.Tab

class TabLayoutAdapter(manager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(manager, lifecycle) {


    companion object {
        val tabList = listOf(
            Tab(TopNewsFragment(), "Top-News"),
            Tab(BusinessFragment(), "Business"),
            Tab(EntertainmentFragment(), "Entertainment"),
            Tab(GeneralFragment(), "General"),
            Tab(HealthFragment(), "Health"),
            Tab(ScienceFragment(), "Science"),
            Tab(SportsFragment(), "Sports"),
            Tab(TechnologyFragment(), "Technology")
        )
    }
    override fun getItemCount(): Int {
        return tabList.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabList[position].fragment
    }
}