package com.personal.coine.scorpion.jxnuhelper.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapEditText;
import com.kaopiz.kprogresshud.KProgressHUD;
import com.personal.coine.scorpion.jxnuhelper.R;
import com.personal.coine.scorpion.jxnuhelper.presenter.LoginPresenter;
import com.personal.coine.scorpion.jxnuhelper.view.ILoginView;

public class LoginActivity extends Activity implements ILoginView {
    private LoginPresenter loginPresenter = new LoginPresenter(this);
    private BootstrapEditText phoneNumber;
    private BootstrapEditText password;
    private KProgressHUD loginProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        phoneNumber = (BootstrapEditText) findViewById(R.id.et_phone_number);
        password = (BootstrapEditText) findViewById(R.id.et_password);
        findViewById(R.id.btn_action_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login();
            }
        });
        findViewById(R.id.btn_action_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        loginProgress = KProgressHUD.create(this).setStyle(KProgressHUD.Style.SPIN_INDETERMINATE).setLabel("正在登陆...").setCancellable(false).setAnimationSpeed(2).setDimAmount(0.5f);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void showLoading() {
        loginProgress.show();
    }

    @Override
    public void hideLoading() {
        loginProgress.dismiss();
    }

    @Override
    public void toMainActivity() {
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

    @Override
    public void showFailedError(String description) {
        Toast.makeText(LoginActivity.this, "登录失败" + description, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
