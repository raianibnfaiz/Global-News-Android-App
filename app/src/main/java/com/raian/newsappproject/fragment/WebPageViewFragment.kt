package com.raian.newsappproject.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.raian.newsappproject.R
import com.raian.newsappproject.databinding.FragmentWebPageViewBinding

class WebPageViewFragment : Fragment() {
    lateinit var webView: WebView
    private val args: WebPageViewFragmentArgs by navArgs()
    private var _binding:FragmentWebPageViewBinding ?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_web_page_view, container, false)
        _binding = FragmentWebPageViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        webView = view.findViewById(R.id.webView1)
//        webView.loadUrl(args.newsUrl)
//        webView.settings.javaScriptEnabled = true
//        webView.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
//                return false
//            }
//        }
        binding.webViewNewsDetails.loadUrl(args.newsUrl)
    }
}


