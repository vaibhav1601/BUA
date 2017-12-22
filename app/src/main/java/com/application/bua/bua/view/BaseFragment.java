package com.application.bua.bua.view;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.application.bua.bua.BUAApplication;
import com.application.bua.bua.utilitise.DisplayMessageUtils;

import retrofit2.Retrofit;


/**
 * Created by StinVaibhavK on 23/07/17.
 */

public abstract class BaseFragment extends Fragment {
    protected Context context;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        context = getActivity();
        getScreenData();
        initializeView();

        initializePresenter();
    }

    protected void getScreenData() {

    }

    protected abstract void initializeView();

    protected abstract void initializePresenter();


    protected Retrofit getRetrofitClient()
    {
        return ((BUAApplication) context.getApplicationContext()).getRetrofit();
    }


    protected void showMessage(String message)
    {
        DisplayMessageUtils.showSnack(getView(), message);
    }
}
