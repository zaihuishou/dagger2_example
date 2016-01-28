package com.zhiqiang.pricticedagger.component;

import com.zhiqiang.pricticedagger.module.AppModule;
import com.zhiqiang.pricticedagger.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhiqiang on 16-1-28.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    MainComponent plus(MainModule mainModule);
}
