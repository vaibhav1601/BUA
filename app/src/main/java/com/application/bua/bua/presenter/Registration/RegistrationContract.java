package com.application.bua.bua.presenter.Registration;

import com.application.bua.bua.model.Country;
import com.application.bua.bua.model.RegistrationCollections;
import com.application.bua.bua.presenter.BasePresenter;
import com.application.bua.bua.presenter.BaseView;

import java.util.ArrayList;

/**
 * Created by vaibhav on 22/12/17.
 */

public class RegistrationContract
{


    public interface View extends BaseView
    {

        void onRegistrationSuccess(RegistrationCollections regData);

        void onRegistrationFailed();


        void showEmptyError(String message);

        void setCountries(ArrayList<Country> coutries);

        void showProgress(String msg);

        void dismissProgress();
        void setLanguages(ArrayList<String> lanuages);
        void setData(RegistrationCollections registrationCollection);



    }




    public static abstract class Presenter extends BasePresenter<View> {

        public abstract void getLanguages();

        public abstract void getCountries();

        public abstract void calculateMobilePin(String pin);

     //   public abstract void performRegistration(RegistrationViewModel registrationViewModel);

    }


}
