package com.raian.newsappproject.adapter

import android.annotation.SuppressLint
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
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.raian.newsappproject.R
import com.raian.newsappproject.fragment.HomeFragmentDirections
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import com.squareup.picasso.Picasso
import java.util.*
import kotlin.collections.ArrayList

class TopNewsAdapter(
    private val context: Context,
    private val viewModel: NewsViewModel,
    private val arrayList: List<TempArticle>
) : RecyclerView.Adapter<TopNewsAdapter.NewsViewHolder>() {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        Log.d("title", "oncreateViewHolder entered")
        val root =
            LayoutInflater.from(parent.context).inflate(R.layout.new_item_layout, parent, false)
        return NewsViewHolder(root)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentData = theNewsList[position]
        //val item = arrayList[position]
        if (!TextUtils.isEmpty(currentData?.title)) {
            holder.itemTitle.text = currentData?.title
        } else {
            holder.itemTitle.text = "No Title!"
        }

        if (!TextUtils.isEmpty(currentData?.description)) {
            holder.itemDetail.text = currentData?.description
        } else {
            holder.itemDetail.text = "No Description!"
        }

        if (!TextUtils.isEmpty(currentData?.author)) {
            holder.itemAuthor.text = currentData?.author
        } else {
            holder.itemAuthor.text = "No Author!"
        }
        if (!TextUtils.isEmpty(currentData?.publishedAt)) {
            holder.itemDate.text = currentData?.publishedAt?.removeRange(10..19) ?: "No Date"
        } else {
            holder.itemDate.text = "No Date"
        }
        if (!TextUtils.isEmpty(currentData?.urlToImage)) {
            Picasso.get()
                .load(currentData?.urlToImage)
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
        holder.favButton.setOnClickListener{
            val bookmarkNews = currentData?.source?.let { it1 ->
                Bookmark(
                    0,
                    currentData?.author,
                    currentData?.content,
                    currentData?.description,
                    currentData?.publishedAt,
                    currentData?.title,
                    currentData?.url,
                    currentData?.urlToImage
                )
            }
            if (bookmarkNews != null) {
                viewModel.addBookMarkArticle(bookmarkNews)
            }
            Toast.makeText(context, "BookMark Inserted", Toast.LENGTH_SHORT).show()
        }


//        holder.itemTitle.text = currentData?.title
//        Log.d("title", currentData?.title.toString())
//        holder.itemDetail.text = currentData?.description
//        holder.itemAuthor.text = currentData?.author
//        holder.itemDate.text = currentData?.publishedAt
//        holder.favButton.setOnClickListener {
//            val bookmarkNews = currentData?.source?.let { it1 ->
//                Bookmark(
//                    0,
//                    currentData.author,
//                    currentData.content,
//                    currentData.description,
//                    currentData.publishedAt,
//                    currentData.title,
//                    currentData.url,
//                    currentData.urlToImage
//                )
//            }
//            if (bookmarkNews != null) {
//                viewModel.addBookMarkArticle(bookmarkNews)
//            }
//            Toast.makeText(context, "BookMark Inserted", Toast.LENGTH_SHORT).show()
//        }
//
//        Picasso.get()
//            .load(currentData?.urlToImage)
//            .into(holder.itemPicture)

        holder.newsCard.setOnClickListener {
            Toast.makeText(context, "Card Clicked", Toast.LENGTH_SHORT).show()
            val action =
                HomeFragmentDirections.actionHomeFragment2ToDetailNewsArticleFragment(currentData!!)

            holder.itemView.findNavController().navigate(
                action
            )
        }
//        Glide.with(holder.itemPicture)
//            .load(item.urlToImage?.get(position))
//            .into(holder.itemPicture)
    }

    override fun getItemCount(): Int {
        return theNewsList?.size ?: 0
    }

    fun setData(note: List<TempArticle>) {
        this.theNewsList = note
        notifyDataSetChanged()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun filterList(filterlist: List<TempArticle>) {
        theNewsList = filterlist
        notifyDataSetChanged()
    }

    fun filter(text: String) {
        val filteredList = ArrayList<TempArticle>()
        for (article in theNewsList!!) {
            if (article.title?.lowercase(Locale.ROOT)
                    ?.contains(text.lowercase(Locale.ROOT)) == true
            ) {
                filteredList.add(article)
            }
        }
        filterList(filteredList)
    }
}




