package com.application.bua.bua.utilitise;

import android.support.design.widget.Snackbar;
import android.view.View;

public class DisplayMessageUtils
{

    public static void showSnack(View v, String message)
    {
        Snackbar.make(v, message, Snackbar.LENGTH_LONG).show();
    }

}
