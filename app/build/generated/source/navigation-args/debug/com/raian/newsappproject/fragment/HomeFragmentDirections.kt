package com.raian.newsappproject.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import com.raian.newsappproject.models.TempArticle
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragment2ToDetailNewsArticleFragment(
    public val details: TempArticle
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment2_to_detailNewsArticleFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(TempArticle::class.java)) {
          result.putParcelable("details", this.details as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(TempArticle::class.java)) {
          result.putSerializable("details", this.details as Serializable)
        } else {
          throw UnsupportedOperationException(TempArticle::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragment2ToDetailNewsArticleFragment(details: TempArticle): NavDirections =
        ActionHomeFragment2ToDetailNewsArticleFragment(details)
  }
}
