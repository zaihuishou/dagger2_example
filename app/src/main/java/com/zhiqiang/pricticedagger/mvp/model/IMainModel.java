package com.zhiqiang.pricticedagger.mvp.model;

import android.content.Context;
import android.support.annotation.NonNull;

import com.zhiqiang.pricticedagger.api.AsyncHttpUtil;

/**
 * Created by zhiqiang on 16-1-28.
 */
public interface IMainModel {
    void getUser(Context context,@NonNull String userId, AsyncHttpUtil.LoadListener listener);
}
