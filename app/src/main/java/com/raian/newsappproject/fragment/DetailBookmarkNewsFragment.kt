package com.raian.newsappproject.fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.raian.newsappproject.R
import com.squareup.picasso.Picasso

class DetailBookmarkNewsFragment : Fragment() {
    val args: DetailBookmarkNewsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_bookmark_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.newTitle)
        val description = view.findViewById<TextView>(R.id.tv_description)
        val content = view.findViewById<TextView>(R.id.newsContent)
        val imageView = view.findViewById<ImageView>(R.id.newsImage)
        val sourceNews = view.findViewById<TextView>(R.id.newsSource)
        val continueButton = view.findViewById<Button>(R.id.continueButton)

        if (!TextUtils.isEmpty(args.detailBookmark?.title)) {
            title.text = args.detailBookmark?.title
        } else {
            title.text = "No Name"
        }

        if (!TextUtils.isEmpty(args.detailBookmark?.description)) {
            description.text = args.detailBookmark?.description
        }  else {
            description.text = "No Description"
        }

        if (!TextUtils.isEmpty(args.detailBookmark?.content)) {
            content.text = args.detailBookmark?.content
        }  else {
            content.text = "No Content"
        }
        if (!TextUtils.isEmpty(args.detailBookmark?.source?.name)) {
            sourceNews.text = args.detailBookmark?.source?.name
        }  else {
            sourceNews.text = "Source Not Available"
        }

        if (!TextUtils.isEmpty(args.detailBookmark?.urlToImage)) {
            Picasso.get()
                .load(args.detailBookmark?.urlToImage)
                .placeholder(R.drawable.ic_connection_error)
                .fit()
                .centerCrop()
                .centerCrop(1)
                .into(imageView)
        }  else {
            Picasso.get()
                .load(R.drawable.ic_connection_error)
                .placeholder(R.drawable.ic_connection_error)
                .fit()
                .centerCrop()
                .centerCrop(1)
                .into(imageView)
        }
        continueButton.setOnClickListener {
            val action = args.detailBookmark.url?.let { it1 ->
                DetailBookmarkNewsFragmentDirections.actionDetailBookmarkNewsFragmentToWebPageViewFragment(
                    it1
                )
            }
            if (action != null) {
                Navigation.findNavController(view).navigate(action)
            }
        }
    }


}