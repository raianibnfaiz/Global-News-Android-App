package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import kotlin.Int
import kotlin.String

public class DetailNewsArticleFragmentDirections private constructor() {
<<<<<<< HEAD
  private data class ActionDetailNewsArticleFragment2ToWebPageViewFragment(
    public val newsUrl: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_detailNewsArticleFragment2_to_webPageViewFragment
=======
  private data class ActionDetailNewsArticleFragmentToWebPageViewFragment(
    public val newsUrl: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_detailNewsArticleFragment_to_webPageViewFragment
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119

    public override val arguments: Bundle
      get() {
        val result = Bundle()
<<<<<<< HEAD
        result.putString("news_url", this.newsUrl)
=======
        result.putString("newsUrl", this.newsUrl)
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
        return result
      }
  }

  public companion object {
<<<<<<< HEAD
    public fun actionDetailNewsArticleFragment2ToWebPageViewFragment(newsUrl: String): NavDirections
        = ActionDetailNewsArticleFragment2ToWebPageViewFragment(newsUrl)
=======
    public fun actionDetailNewsArticleFragmentToWebPageViewFragment(newsUrl: String): NavDirections
        = ActionDetailNewsArticleFragmentToWebPageViewFragment(newsUrl)
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
  }
}
