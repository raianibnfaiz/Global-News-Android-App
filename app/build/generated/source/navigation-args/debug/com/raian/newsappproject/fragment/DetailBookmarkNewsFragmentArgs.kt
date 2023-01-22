package com.raian.newsappproject.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.raian.newsappproject.models.Bookmark
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailBookmarkNewsFragmentArgs(
  public val detailBookmark: Bookmark
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Bookmark::class.java)) {
      result.set("detailBookmark", this.detailBookmark as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Bookmark::class.java)) {
      result.set("detailBookmark", this.detailBookmark as Serializable)
    } else {
      throw UnsupportedOperationException(Bookmark::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailBookmarkNewsFragmentArgs {
      bundle.setClassLoader(DetailBookmarkNewsFragmentArgs::class.java.classLoader)
      val __detailBookmark : Bookmark?
      if (bundle.containsKey("detailBookmark")) {
        if (Parcelable::class.java.isAssignableFrom(Bookmark::class.java) ||
            Serializable::class.java.isAssignableFrom(Bookmark::class.java)) {
          __detailBookmark = bundle.get("detailBookmark") as Bookmark?
        } else {
          throw UnsupportedOperationException(Bookmark::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__detailBookmark == null) {
          throw IllegalArgumentException("Argument \"detailBookmark\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"detailBookmark\" is missing and does not have an android:defaultValue")
      }
      return DetailBookmarkNewsFragmentArgs(__detailBookmark)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        DetailBookmarkNewsFragmentArgs {
      val __detailBookmark : Bookmark?
      if (savedStateHandle.contains("detailBookmark")) {
        if (Parcelable::class.java.isAssignableFrom(Bookmark::class.java) ||
            Serializable::class.java.isAssignableFrom(Bookmark::class.java)) {
          __detailBookmark = savedStateHandle.get<Bookmark?>("detailBookmark")
        } else {
          throw UnsupportedOperationException(Bookmark::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__detailBookmark == null) {
          throw IllegalArgumentException("Argument \"detailBookmark\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"detailBookmark\" is missing and does not have an android:defaultValue")
      }
      return DetailBookmarkNewsFragmentArgs(__detailBookmark)
    }
  }
}
