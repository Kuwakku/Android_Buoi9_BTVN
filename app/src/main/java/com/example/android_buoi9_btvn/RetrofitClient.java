package com.example.android_buoi9_btvn;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit mInstance;
    public static final String BASE_URL = "https://dummyjson.com/";
    public static Retrofit getInstance() {
        if (mInstance != null) {
            mInstance = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return mInstance;
    }

    public static <T>T create(Class<T> t) {
        return getInstance().create(t);
    }

}
