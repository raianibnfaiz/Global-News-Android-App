package com.raian.newsappproject.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.raian.newsappproject.models.TempArticle
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailNewsArticleFragmentArgs(
  public val details: TempArticle
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(TempArticle::class.java)) {
      result.set("details", this.details as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(TempArticle::class.java)) {
      result.set("details", this.details as Serializable)
    } else {
      throw UnsupportedOperationException(TempArticle::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailNewsArticleFragmentArgs {
      bundle.setClassLoader(DetailNewsArticleFragmentArgs::class.java.classLoader)
      val __details : TempArticle?
      if (bundle.containsKey("details")) {
        if (Parcelable::class.java.isAssignableFrom(TempArticle::class.java) ||
            Serializable::class.java.isAssignableFrom(TempArticle::class.java)) {
          __details = bundle.get("details") as TempArticle?
        } else {
          throw UnsupportedOperationException(TempArticle::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__details == null) {
          throw IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"details\" is missing and does not have an android:defaultValue")
      }
      return DetailNewsArticleFragmentArgs(__details)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        DetailNewsArticleFragmentArgs {
      val __details : TempArticle?
      if (savedStateHandle.contains("details")) {
        if (Parcelable::class.java.isAssignableFrom(TempArticle::class.java) ||
            Serializable::class.java.isAssignableFrom(TempArticle::class.java)) {
          __details = savedStateHandle.get<TempArticle?>("details")
        } else {
          throw UnsupportedOperationException(TempArticle::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__details == null) {
          throw IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"details\" is missing and does not have an android:defaultValue")
      }
      return DetailNewsArticleFragmentArgs(__details)
    }
  }
}
