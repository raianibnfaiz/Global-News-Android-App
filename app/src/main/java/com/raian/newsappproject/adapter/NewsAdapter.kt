package com.raian.newsappproject.adapter

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.utils.widget.ImageFilterButton
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.R
import com.raian.newsappproject.fragment.HomeFragmentDirections
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import com.squareup.picasso.Picasso
import java.util.*

class NewsAdapter(private val context: Context,
                  private val viewModel: NewsViewModel,
                  private val arrayList: List<TempArticle>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    private var theNewsList = arrayList

    class NewsViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {

        val itemTitle: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_description)
        val itemAuthor: TextView = itemView.findViewById(R.id.tv_author)
        val itemPicture: ImageView = itemView.findViewById(R.id.iv_image)
        val itemDate: TextView = itemView.findViewById(R.id.tv_publishDate)
        val newsCard: CardView = itemView.findViewById(R.id.cardViewNews)
        val favButton: ImageFilterButton = itemView.findViewById(R.id.favouriteIcon)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsAdapter.NewsViewHolder {
        val root =
            LayoutInflater.from(parent.context).inflate(R.layout.new_item_layout, parent, false)
        return NewsAdapter.NewsViewHolder(root)
    }

    override fun onBindViewHolder(holder: NewsAdapter.NewsViewHolder, position: Int) {
        val currentData = theNewsList[position]
        if (!TextUtils.isEmpty(currentData.title)) {
            holder.itemTitle.text = currentData.title
        } else {
            holder.itemTitle.text = "Title Missing!"
        }

        if (!TextUtils.isEmpty(currentData.description)) {
            holder.itemDetail.text = currentData.description
        } else {
            holder.itemDetail.text = "No Description!"
        }

        if (!TextUtils.isEmpty(currentData.source?.name.toString())) {
            holder.itemAuthor.text = currentData.source?.name.toString()
        } else {
            holder.itemAuthor.text = "Source Missing!"
        }
        if (!TextUtils.isEmpty(currentData.publishedAt)) {
            holder.itemDate.text = currentData.publishedAt?.removeRange(10..19) ?: "No Date"
        } else {
            holder.itemDate.text = "Date Missing"
        }
        if (!TextUtils.isEmpty(currentData.urlToImage)) {
            Picasso.get()
                .load(currentData.urlToImage)
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_connection_error)
                .into(holder.itemPicture)
        } else {
            Picasso.get()
                .load(R.drawable.ic_connection_error)
                .fit()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_connection_error)
                .centerCrop(1)
                .centerCrop()
                .into(holder.itemPicture)
        }
        if (currentData.likedArticle) {
            holder.favButton.setImageResource(R.drawable.baseline_bookmark_24)
        } else {
            holder.favButton.setImageResource(R.drawable.baseline_bookmark_border_24)
        }
        holder.favButton.setOnClickListener {
            currentData.likedArticle=true
            viewModel.updateArticle(currentData)
            val bookmarkNews = currentData.source?.let { it1 ->
                Bookmark(
                    currentData.author,
                    currentData.content,
                    currentData.description,
                    currentData.publishedAt,
                    currentData.source,
                    currentData.title,
                    currentData.catagory,
                    currentData.url,
                    currentData.urlToImage
                )
            }
            if (bookmarkNews != null) {
                viewModel.addBookMarkArticle(bookmarkNews)
            }
            Toast.makeText(context, "BookMark Inserted", Toast.LENGTH_SHORT).show()
        }
        holder.newsCard.setOnClickListener {
            val action =
                HomeFragmentDirections.actionHomeFragment2ToDetailNewsArticleFragment(currentData)
            holder.itemView.findNavController().navigate(
                action
            )
        }
    }

    override fun getItemCount(): Int {
        return theNewsList.size
    }
    fun setData(note: List<TempArticle>) {
        theNewsList = note
        notifyDataSetChanged()
    }
    private fun filterList(filterlist: List<TempArticle>) {
        theNewsList = filterlist
        notifyDataSetChanged()
    }

    fun filter(text: String) {
        val filteredList = ArrayList<TempArticle>()
        for (article in theNewsList) {
            if (article.title?.lowercase(Locale.ROOT)
                    ?.contains(text.lowercase(Locale.ROOT)) == true
            ) {
                filteredList.add(article)
                notifyDataSetChanged()
            }
        }
        filterList(filteredList)
    }
}