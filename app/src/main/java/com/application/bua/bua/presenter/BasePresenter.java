package com.application.bua.bua.presenter;


import android.app.ProgressDialog;
import android.content.SharedPreferences;

import java.io.InputStream;

import retrofit2.Retrofit;


/**
 *Created by vaibhav on 21/12/17.
 */

public abstract class BasePresenter<V extends BaseView>
{
    protected V view;
    protected Retrofit retrofit;

    protected ProgressDialog progressDialog;
   
    protected InputStream inputStream;
    protected SharedPreferences sharedPreferences;



    public void attachView(V view) {
        this.view = view;
    }

    public void attachApiClient(Retrofit retrofit) {
        this.retrofit = retrofit;
    }



    public void attachProgressDialog(ProgressDialog progressDialog)
    {
        this.progressDialog = progressDialog;
    }


    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
