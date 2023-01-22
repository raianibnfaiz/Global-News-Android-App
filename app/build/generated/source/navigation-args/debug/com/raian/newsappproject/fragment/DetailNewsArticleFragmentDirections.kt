package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import kotlin.Int
import kotlin.String

public class DetailNewsArticleFragmentDirections private constructor() {
  private data class ActionDetailNewsArticleFragment2ToWebPageViewFragment(
    public val newsUrl: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_detailNewsArticleFragment2_to_webPageViewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("news_url", this.newsUrl)
        return result
      }
  }

  public companion object {
    public fun actionDetailNewsArticleFragment2ToWebPageViewFragment(newsUrl: String): NavDirections
        = ActionDetailNewsArticleFragment2ToWebPageViewFragment(newsUrl)
  }
}
