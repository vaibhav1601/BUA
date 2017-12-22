package com.application.bua.bua.presenter.Login;

/**
 * Created by vaibhav on 21/12/17.
 */

public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void performLogin(String userName, String password, boolean userPresent)
    {

    }

    @Override
    public boolean getLoginDetails(String userName, String password) {
        return false;
    }

    @Override
    public boolean setgetLoginDetails(String userName, String password) {
        return false;
    }

    @Override
    public boolean setLoginDetails(String userName, String password) {
        return false;
    }

    @Override
    public void emailMobileVerfiy(boolean showProgressBar, String mobileNo, String Email) {

    }

    @Override
    public void forgetPasswordProcess(boolean showProgressBar, String EmailId, String systemPass, String oldPassword) {

    }


}
