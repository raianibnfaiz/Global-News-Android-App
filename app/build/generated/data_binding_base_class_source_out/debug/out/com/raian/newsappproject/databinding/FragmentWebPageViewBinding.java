// Generated by view binder compiler. Do not edit!
package com.raian.newsappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.raian.newsappproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWebPageViewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final WebView webViewNewsDetails;

  private FragmentWebPageViewBinding(@NonNull FrameLayout rootView,
      @NonNull WebView webViewNewsDetails) {
    this.rootView = rootView;
    this.webViewNewsDetails = webViewNewsDetails;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWebPageViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWebPageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_web_page_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWebPageViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.web_view_news_details;
      WebView webViewNewsDetails = ViewBindings.findChildViewById(rootView, id);
      if (webViewNewsDetails == null) {
        break missingId;
      }

      return new FragmentWebPageViewBinding((FrameLayout) rootView, webViewNewsDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}