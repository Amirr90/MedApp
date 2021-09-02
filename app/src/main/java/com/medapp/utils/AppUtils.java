package com.medapp.utils;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public class AppUtils {


    public static LayoutInflater getInflater(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext());
    }
}
