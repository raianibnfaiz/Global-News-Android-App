package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import kotlin.Int
import kotlin.String

public class DetailBookmarkNewsFragmentDirections private constructor() {
  private data class ActionDetailBookmarkNewsFragmentToWebPageViewFragment(
    public val newsUrl: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_detailBookmarkNewsFragment_to_webPageViewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("newsUrl", this.newsUrl)
        return result
      }
  }

  public companion object {
    public fun actionDetailBookmarkNewsFragmentToWebPageViewFragment(newsUrl: String): NavDirections
        = ActionDetailBookmarkNewsFragmentToWebPageViewFragment(newsUrl)
  }
}
