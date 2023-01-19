package com.raian.newsappproject.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.R
import com.raian.newsappproject.viewModel.NewsViewModel
import com.squareup.picasso.Picasso

class NewsAdapter (private val context: Context,
                   private val viewModel: NewsViewModel,
                   private val arrayList: ArrayList<Article>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {

        val itemTitle: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_description)
        val tv_author: TextView = itemView.findViewById(R.id.tv_author)
        val itemPicture: ImageView = itemView.findViewById(R.id.iv_image)
        val itemDate:TextView = itemView.findViewById(R.id.tv_publishDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        Log.d("title", "oncreateViewHolder entered")
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return NewsViewHolder(root)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        val item = arrayList[position]

        holder.itemTitle.text = item.title
        Log.d("title", item.title.toString())
        holder.itemDetail.text = item.description
        holder.tv_author.text = item.author
        holder.itemDate.text = item.publishedAt


        Picasso.get().load(item.urlToImage).into(holder.itemPicture)
//        Glide.with(holder.itemPicture)
//            .load(item.urlToImage?.get(position))
//            .into(holder.itemPicture)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}




