package com.raian.newsappproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raian.newsappproject.Article
import com.raian.newsappproject.R
import com.raian.newsappproject.viewModel.NewsViewModel

class NewsAdapter (private val context: Context,
                   private val viewModel: NewsViewModel,
                   private val arrayList: ArrayList<Article>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
        val itemTitle: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_description)
        val itemPicture: ImageView = itemView.findViewById(R.id.iv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return NewsViewHolder(root)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        val item = arrayList[position]

        holder.itemTitle.text = item.title
        holder.itemDetail.text = item.description

        Glide.with(holder.itemPicture)
            .load(item.urlToImage?.get(position))
            .into(holder.itemPicture)
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }
    }



