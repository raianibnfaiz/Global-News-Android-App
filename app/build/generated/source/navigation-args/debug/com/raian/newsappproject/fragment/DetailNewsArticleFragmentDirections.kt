package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import kotlin.Int
import kotlin.String

public class DetailNewsArticleFragmentDirections private constructor() {
  private data class ActionDetailNewsArticleFragmentToWebPageViewFragment(
    public val newsUrl: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_detailNewsArticleFragment_to_webPageViewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("newsUrl", this.newsUrl)
        return result
      }
  }

  public companion object {
    public fun actionDetailNewsArticleFragmentToWebPageViewFragment(newsUrl: String): NavDirections
        = ActionDetailNewsArticleFragmentToWebPageViewFragment(newsUrl)
  }
}
