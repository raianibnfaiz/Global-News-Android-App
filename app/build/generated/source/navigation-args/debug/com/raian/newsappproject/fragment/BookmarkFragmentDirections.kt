package com.raian.newsappproject.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.raian.newsappproject.R
import com.raian.newsappproject.models.Bookmark
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class BookmarkFragmentDirections private constructor() {
  private data class ActionBookmarkFragment2ToDetailBookmarkNewsFragment(
    public val detailBookmark: Bookmark
  ) : NavDirections {
    public override val actionId: Int = R.id.action_bookmarkFragment2_to_detailBookmarkNewsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Bookmark::class.java)) {
          result.putParcelable("detailBookmark", this.detailBookmark as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Bookmark::class.java)) {
          result.putSerializable("detailBookmark", this.detailBookmark as Serializable)
        } else {
          throw UnsupportedOperationException(Bookmark::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionBookmarkFragment2ToDetailBookmarkNewsFragment(detailBookmark: Bookmark):
        NavDirections = ActionBookmarkFragment2ToDetailBookmarkNewsFragment(detailBookmark)
  }
}
