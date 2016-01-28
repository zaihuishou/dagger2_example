package com.zhiqiang.pricticedagger.module;

import com.zhiqiang.pricticedagger.LoginManager;
import com.zhiqiang.pricticedagger.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhiqiang on 16-1-28.
 */
@Module
public class AppModule {

    private MyApplication mApplication;

    public AppModule(MyApplication application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    MyApplication provideMyApplication() {
        return mApplication;
    }

    @Provides
    LoginManager privodeLoginManager() {
        return new LoginManager();
    }
}
