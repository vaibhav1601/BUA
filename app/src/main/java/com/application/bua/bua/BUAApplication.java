package com.application.bua.bua;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * Created by vaibhav on 21/12/17.
 */

public class BUAApplication extends Application
{

    private Retrofit retrofit;

    @Override
    public void onCreate()
    {
        super.onCreate();

        createRetrofitConfiguration();
    }

    private void createRetrofitConfiguration()
    {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);



        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .build();


    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
