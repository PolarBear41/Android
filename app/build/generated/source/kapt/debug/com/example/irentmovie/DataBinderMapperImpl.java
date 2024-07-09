package com.example.irentmovie;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.irentmovie.databinding.ActivityMainBindingImpl;
import com.example.irentmovie.databinding.FragmentCreatePostBindingImpl;
import com.example.irentmovie.databinding.FragmentLoginBindingImpl;
import com.example.irentmovie.databinding.FragmentProductListBindingImpl;
import com.example.irentmovie.databinding.FragmentProfileBindingImpl;
import com.example.irentmovie.databinding.FragmentRegisterBindingImpl;
import com.example.irentmovie.databinding.ItemMovieAdBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCREATEPOST = 2;

  private static final int LAYOUT_FRAGMENTLOGIN = 3;

  private static final int LAYOUT_FRAGMENTPRODUCTLIST = 4;

  private static final int LAYOUT_FRAGMENTPROFILE = 5;

  private static final int LAYOUT_FRAGMENTREGISTER = 6;

  private static final int LAYOUT_ITEMMOVIEAD = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.fragment_create_post, LAYOUT_FRAGMENTCREATEPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.fragment_product_list, LAYOUT_FRAGMENTPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.irentmovie.R.layout.item_movie_ad, LAYOUT_ITEMMOVIEAD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEPOST: {
          if ("layout/fragment_create_post_0".equals(tag)) {
            return new FragmentCreatePostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_post is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTLIST: {
          if ("layout/fragment_product_list_0".equals(tag)) {
            return new FragmentProductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIEAD: {
          if ("layout/item_movie_ad_0".equals(tag)) {
            return new ItemMovieAdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie_ad is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "listener");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.example.irentmovie.R.layout.activity_main);
      sKeys.put("layout/fragment_create_post_0", com.example.irentmovie.R.layout.fragment_create_post);
      sKeys.put("layout/fragment_login_0", com.example.irentmovie.R.layout.fragment_login);
      sKeys.put("layout/fragment_product_list_0", com.example.irentmovie.R.layout.fragment_product_list);
      sKeys.put("layout/fragment_profile_0", com.example.irentmovie.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", com.example.irentmovie.R.layout.fragment_register);
      sKeys.put("layout/item_movie_ad_0", com.example.irentmovie.R.layout.item_movie_ad);
    }
  }
}
