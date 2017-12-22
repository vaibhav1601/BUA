package com.application.bua.bua.view.login;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;

import com.application.bua.bua.R;
import com.application.bua.bua.presenter.Login.LoginContract;
import com.application.bua.bua.presenter.Login.LoginPresenter;
import com.application.bua.bua.view.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;






/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginContract.View {
    @BindView(R.id.login_progress)
    ProgressBar loginProgress;
    @BindView(R.id.email)
    AutoCompleteTextView email;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.email_sign_in_button)
    Button emailSignInButton;
    @BindView(R.id.email_login_form)
    LinearLayout emailLoginForm;
    @BindView(R.id.login_form)
    ScrollView loginForm;
    private LoginPresenter loginPresenter;
    Unbinder unbinder;


    public LoginActivity()
    {

    }



    @Override
    protected void initializeView()
    {



    }

    @Override
    protected void initializePresenter()
    {
        loginPresenter = new LoginPresenter();
        loginPresenter.attachView(this);
        loginPresenter.attachProgressDialog(new ProgressDialog(getApplication()));

    }

    @Override
    public void onLoginSuccess(String msg) {

    }

    @Override
    public void onLoginFailed() {

    }

    @Override
    public void onInActiveUser() {

    }

    @Override
    public void showUserNameEmptyError() {

    }

    @Override
    public void showPasswordEmptyError() {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void showForgetProcess(boolean flag) {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void loginData(String jsonData) {

    }

    @Override
    public void userPresent(boolean val, String uname, String pwd) {

    }

    @Override
    public void passwordChanged(boolean flag) {

    }

    @Override
    public void userInactive() {

    }

    @Override
    public void userNotAllow() {

    }

    @Override
    public void accountDeactivated() {

    }

    @Override
    public void accountExpired() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }
}

