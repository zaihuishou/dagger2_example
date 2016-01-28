package com.zhiqiang.pricticedagger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.zhiqiang.pricticedagger.module.MainModule;
import com.zhiqiang.pricticedagger.mvp.presenter.MainPresenter;
import com.zhiqiang.pricticedagger.mvp.ui.BascActivity;

import javax.inject.Inject;

public class MainActivity extends BascActivity {

    @Inject
    MainPresenter mPresenter;

    @Inject
    LoginManager mLoginManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "是否登陆:"+mLoginManager.isLogin(), Toast.LENGTH_LONG).show();
//                mPresenter.getUser();
            }
        });
    }

    protected void setUpComponent() {
        MyApplication.get(this).getAppComponent().plus(new MainModule(this)).inject(this);
//        MainComponent mainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
//        mainComponent.inject(this);
    }

    public void showInfo(String info) {
        Toast.makeText(this, info, Toast.LENGTH_LONG).show();
    }
}
