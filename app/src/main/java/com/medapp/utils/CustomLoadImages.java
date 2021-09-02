package com.medapp.utils;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.medapp.R;

public class CustomLoadImages {
    private static final String TAG = "CustomLoadImages";

    @BindingAdapter("android:loadSplashGifImage")
    public static void loadSplashGifImage(ImageView imageView, int image) {
        try {
            Glide.with(App.context)
                    .load(image)
                    .centerCrop()
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(imageView);

      /*      Glide.with(App.context).load(image).asGif()
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade().into(imageView);*/

        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "loadImageFailure: " + e.getLocalizedMessage());
        }


    }
}
