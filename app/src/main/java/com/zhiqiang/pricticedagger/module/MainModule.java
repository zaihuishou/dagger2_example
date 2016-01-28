package com.zhiqiang.pricticedagger.module;

import com.zhiqiang.pricticedagger.ActivityScope;
import com.zhiqiang.pricticedagger.MainActivity;
import com.zhiqiang.pricticedagger.mvp.model.MainModel;
import com.zhiqiang.pricticedagger.mvp.presenter.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhiqiang on 16-1-28.
 */
@Module
public class MainModule {

    private MainActivity mActivity;

    public MainModule(MainActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    MainActivity provideMainActivity() {
        return mActivity;
    }

    @ActivityScope
    @Provides
    MainPresenter provideMainPresenter() {
        return new MainPresenter(new MainModel(), mActivity);
    }
}
