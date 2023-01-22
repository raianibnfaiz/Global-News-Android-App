package com.raian.newsappproject.adapter

import android.content.Context
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
import com.raian.newsappproject.fragment.DetailNewsArticleFragment
import com.raian.newsappproject.fragment.HomeFragmentDirections
import com.raian.newsappproject.models.Article
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.viewModel.NewsViewModel
import com.squareup.picasso.Picasso

class TechnologyAdapter(private val context: Context,
                     private val viewModel: NewsViewModel,
                     private val arrayList: ArrayList<TempArticle>
) : RecyclerView.Adapter<TechnologyAdapter.TechnologyViewHolder>() {
    private var theNewsList = viewModel.readAllTechnologyNews.value
    class TechnologyViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {

        val itemTitle: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_description)
        val itemAuthor: TextView = itemView.findViewById(R.id.tv_author)
        val itemPicture: ImageView = itemView.findViewById(R.id.iv_image)
        val itemDate: TextView = itemView.findViewById(R.id.tv_publishDate)
        val favButton: ImageFilterButton = itemView.findViewById(R.id.favouriteIcon)
        val newsCard: CardView = itemView.findViewById(R.id.cardViewNews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnologyViewHolder {
        Log.d("title", "oncreateViewHolder entered")
        val root = LayoutInflater.from(parent.context).inflate(R.layout.new_item_layout, parent, false)
        return TechnologyViewHolder(root)
    }

    override fun onBindViewHolder(holder: TechnologyViewHolder, position: Int) {
        val currentData = theNewsList?.get(position)
        //val item = arrayList[position]

        holder.itemTitle.text = currentData?.title
        Log.d("title", currentData?.title.toString())
        holder.itemDetail.text = currentData?.description
        holder.itemAuthor.text = currentData?.author
        holder.itemDate.text = currentData?.publishedAt
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
        holder.newsCard.setOnClickListener {
            Toast.makeText(context, "Card Clicked", Toast.LENGTH_SHORT).show()
            val action = HomeFragmentDirections.actionHomeFragment2ToDetailNewsArticleFragment22(currentData!!)

            holder.itemView.findNavController().navigate(
                action
            )
        }


        Picasso.get().load(currentData?.urlToImage).into(holder.itemPicture)
    }

    override fun getItemCount(): Int {
        return theNewsList?.size ?: 0
    }
    fun setData(note: List<TempArticle>){
        this.theNewsList = note
        notifyDataSetChanged()
    }
}