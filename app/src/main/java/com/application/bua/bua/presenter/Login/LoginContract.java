package com.application.bua.bua.presenter.Login;

import com.application.bua.bua.presenter.BasePresenter;
import com.application.bua.bua.presenter.BaseView;

/**
 * Created by vaibhav on 21/12/17.
 */

public class LoginContract
{


    public interface View extends BaseView
    {



        void onLoginSuccess(String msg);

        void onLoginFailed();

        void onInActiveUser();

        void showUserNameEmptyError();

        void showPasswordEmptyError();

        void showProgress(String msg);

        void showForgetProcess(boolean flag);

        void dismissProgress();

        void loginData(String jsonData);

        void userPresent(boolean val, String uname, String pwd);

        void passwordChanged(boolean flag);

        void userInactive();
        void userNotAllow();
        void accountDeactivated();
        void accountExpired();



    }


    public static abstract class Presenter extends BasePresenter<View>
    {

        public abstract void performLogin(String userName, String password,boolean userPresent);

        public abstract boolean getLoginDetails(String userName, String password);

        public abstract boolean setgetLoginDetails(String userName, String password);

        public abstract boolean setLoginDetails(String userName, String password);

        public abstract void emailMobileVerfiy(boolean showProgressBar, String mobileNo, String Email);

        public abstract void forgetPasswordProcess(boolean showProgressBar, String EmailId, String systemPass, String oldPassword);

    }


}
