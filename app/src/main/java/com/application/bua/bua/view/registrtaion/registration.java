package com.application.bua.bua.view.registrtaion;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.application.bua.bua.R;
import com.application.bua.bua.model.Country;
import com.application.bua.bua.model.RegistrationCollections;
import com.application.bua.bua.presenter.Registration.RegistrationContract;
import com.application.bua.bua.view.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class registration extends BaseActivity implements RegistrationContract.View {

    @BindView(R.id.spLanguage)
    AppCompatSpinner spLanguage;
    @BindView(R.id.edtFarmName)
    EditText edtFarmName;
    @BindView(R.id.emailTextInputLayout1)
    TextInputLayout emailTextInputLayout1;
    @BindView(R.id.edtMobileNumber)
    EditText edtMobileNumber;
    @BindView(R.id.passwordTextInputLayout1)
    TextInputLayout passwordTextInputLayout1;
    @BindView(R.id.spCountry)
    AppCompatSpinner spCountry;
    @BindView(R.id.edtEmailId)
    EditText edtEmailId;
    @BindView(R.id.emailTextInputLayout2)
    TextInputLayout emailTextInputLayout2;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.passwordTextInputLayout2)
    TextInputLayout passwordTextInputLayout2;
    @BindView(R.id.edtConfirmPassWord)
    EditText edtConfirmPassWord;
    @BindView(R.id.cbTermsCondition)
    AppCompatCheckBox cbTermsCondition;
    @BindView(R.id.tvNote)
    AppCompatTextView tvNote;
    @BindView(R.id.btnSignOutButton)
    Button btnSignOutButton;
    @BindView(R.id.signInButton)
    Button signInButton;
    @BindView(R.id.ll_bottom)
    LinearLayout llBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    @Override
    protected void initializeView() {

    }

    @Override
    protected void initializePresenter() {

    }

    @Override
    public void onRegistrationSuccess(RegistrationCollections regData) {

    }

    @Override
    public void onRegistrationFailed() {

    }

    @Override
    public void showEmptyError(String message) {

    }

    @Override
    public void setCountries(ArrayList<Country> coutries) {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void setLanguages(ArrayList<String> lanuages) {

    }

    @Override
    public void setData(RegistrationCollections registrationCollection) {

    }

    @OnClick({R.id.btnSignOutButton, R.id.signInButton})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.btnSignOutButton:
                break;
            case R.id.signInButton:
                break;
        }
    }
}
