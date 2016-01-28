package com.zhiqiang.pricticedagger.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhiqiang on 16-1-28.
 */
public abstract class BascActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpComponent();
    }

    protected abstract void setUpComponent();
}
