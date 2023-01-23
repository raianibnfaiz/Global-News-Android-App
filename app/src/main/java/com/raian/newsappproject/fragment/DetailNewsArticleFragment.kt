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


class DetailNewsArticleFragment : Fragment() {
    val args : DetailNewsArticleFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_news_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.newTitle)
        val description = view.findViewById<TextView>(R.id.tv_description)
        val content = view.findViewById<TextView>(R.id.newsContent)
        val imageView = view.findViewById<ImageView>(R.id.newsImage)
        val continueButton = view.findViewById<Button>(R.id.continueButton)

        if (!TextUtils.isEmpty(args.details?.title)) {
            title.text = args.details?.title
        } else {
            title.text = "No Name"
        }

        if (!TextUtils.isEmpty(args.details?.description)) {
            description.text = args.details?.description
        }  else {
            description.text = "No Description"
        }

        if (!TextUtils.isEmpty(args.details?.content)) {
            content.text = args.details?.content
        }  else {
            content.text = "No Content"
        }

        if (!TextUtils.isEmpty(args.details?.urlToImage)) {
            Picasso.get()
                .load(args.details?.urlToImage)
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
//            if (!TextUtils.isEmpty(args.details?.content)) {
//                val action =
//                    args.details?.url?.let { it1 ->
//                        DetailNewsArticleFragmentDirections.actionDetailNewsArticleFragment2ToWebPageViewFragment(
//                            it1
//                        )
//                    }
//                if (action != null) {
//                    view.findNavController().navigate(action)
//                }
//            }
            val action = DetailNewsArticleFragmentDirections.actionDetailNewsArticleFragmentToWebPageViewFragment(args.details.url!!)
            Navigation.findNavController(view).navigate(action)
        }

    }
    }

