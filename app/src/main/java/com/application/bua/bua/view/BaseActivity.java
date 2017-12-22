package com.application.bua.bua.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by StinVaibhavK on 23/07/17.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getScreenData();
        initializeView();
        initializePresenter();
    }


    protected void getScreenData()
    {

    }

    protected abstract void initializeView();

    protected abstract void initializePresenter();

}
