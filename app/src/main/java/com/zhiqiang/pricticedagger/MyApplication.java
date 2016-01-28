package com.zhiqiang.pricticedagger;

import android.app.Application;
import android.content.Context;

import com.zhiqiang.pricticedagger.component.AppComponent;
import com.zhiqiang.pricticedagger.component.DaggerAppComponent;
import com.zhiqiang.pricticedagger.module.AppModule;

/**
 * Created by zhiqiang on 16-1-28.
 */
public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
