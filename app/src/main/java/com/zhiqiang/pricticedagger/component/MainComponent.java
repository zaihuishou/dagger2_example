package com.zhiqiang.pricticedagger.component;

import com.zhiqiang.pricticedagger.ActivityScope;
import com.zhiqiang.pricticedagger.MainActivity;
import com.zhiqiang.pricticedagger.module.MainModule;

import dagger.Subcomponent;

/**
 * Created by zhiqiang on 16-1-28.
 */
@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    MainActivity inject(MainActivity mainActivity);
}
