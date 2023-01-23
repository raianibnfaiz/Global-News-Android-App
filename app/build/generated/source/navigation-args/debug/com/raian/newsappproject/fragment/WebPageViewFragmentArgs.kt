package com.raian.newsappproject.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class WebPageViewFragmentArgs(
  public val newsUrl: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("newsUrl", this.newsUrl)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("newsUrl", this.newsUrl)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): WebPageViewFragmentArgs {
      bundle.setClassLoader(WebPageViewFragmentArgs::class.java.classLoader)
      val __newsUrl : String?
      if (bundle.containsKey("newsUrl")) {
        __newsUrl = bundle.getString("newsUrl")
        if (__newsUrl == null) {
          throw IllegalArgumentException("Argument \"newsUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newsUrl\" is missing and does not have an android:defaultValue")
      }
      return WebPageViewFragmentArgs(__newsUrl)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): WebPageViewFragmentArgs {
      val __newsUrl : String?
      if (savedStateHandle.contains("newsUrl")) {
        __newsUrl = savedStateHandle["newsUrl"]
        if (__newsUrl == null) {
          throw IllegalArgumentException("Argument \"newsUrl\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newsUrl\" is missing and does not have an android:defaultValue")
      }
      return WebPageViewFragmentArgs(__newsUrl)
    }
  }
}
