package com.raian.newsappproject.adapter

import android.content.Context
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.utils.widget.ImageFilterButton
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.R
import com.raian.newsappproject.fragment.BookmarkFragmentDirections
import com.raian.newsappproject.fragment.HomeFragmentDirections
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import com.squareup.picasso.Picasso

class BookmarkAdapter(private val context: Context,
                      val viewModel: NewsViewModel,
                      private val arrayList: ArrayList<Bookmark>
) : RecyclerView.Adapter<BookmarkAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.iv_image)
        val title: TextView = view.findViewById(R.id.tv_title)
        val description: TextView = view.findViewById(R.id.tv_description)
        val authorName: TextView = view.findViewById(R.id.tv_author)
        val date: TextView = view.findViewById(R.id.tv_publishDate)
        val newsCard: CardView = itemView.findViewById(R.id.cardViewNews)
        val deleteBtn: ImageFilterButton = itemView.findViewById(R.id.deleteBookMark)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(root)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val news = arrayList[position]

        if (!TextUtils.isEmpty(news.title)) {
            holder.title.text = news.title
        } else {
            holder.title.text = "Title Missing!"
        }

        if (!TextUtils.isEmpty(news.description)) {
            holder.description.text = news.description
        } else {
            holder.description.text = "Description Missing!"
        }

        if (!TextUtils.isEmpty(news.author)) {
            holder.authorName.text = news.author
        } else {
            holder.authorName.text = "Author Name Missing!"
        }
        if (!TextUtils.isEmpty(news.publishedAt)) {
            holder.date.text = news.publishedAt?.removeRange(10..19) ?: "No Date"
        } else {
            holder.date.text = "Date Missing"
        }
        if (!TextUtils.isEmpty(news.urlToImage)) {
            Picasso.get()
                .load(news.urlToImage)
                .fit()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_connection_error)
                .centerCrop(1)
                .centerCrop()
                .into(holder.image)
        } else {
            Picasso.get()
                .load(R.drawable.ic_connection_error)
                .fit()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_connection_error)
                .centerCrop(1)
                .centerCrop()
                .into(holder.image)
        }
        holder.deleteBtn.setOnClickListener {
            val article = TempArticle(
                news.author,
                news.content,
                news.description,
                news.publishedAt,
                news.source,
                news.title,
                news.catagory,
                news.url,
                news.urlToImage,
                false
            )
            try {
                viewModel.updateArticle(article)
            } catch (e: Exception) {
                Log.d("tag", "Error: ")
            }
            viewModel.deleteBookBarkArticle(news)
        }
        holder.newsCard.setOnClickListener {
            val action = BookmarkFragmentDirections.actionBookmarkFragment2ToDetailBookmarkNewsFragment(news)
            Navigation.findNavController(holder.itemView).navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}