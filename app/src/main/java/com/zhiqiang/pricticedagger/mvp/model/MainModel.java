package com.zhiqiang.pricticedagger.mvp.model;

import android.content.Context;
import android.support.annotation.NonNull;

import com.loopj.android.http.RequestParams;
import com.zhiqiang.pricticedagger.api.AsyncHttpUtil;

/**
 * Created by zhiqiang on 16-1-28.
 */
public class MainModel implements IMainModel {
    @Override
    public void getUser(Context context, @NonNull String userId, AsyncHttpUtil.LoadListener listener) {
        String url = "http://112.74.20.53/webapp/user/selectFriend";
        RequestParams params = new RequestParams();
        params.put("friendId", userId);
        params.put("userId", userId);
        AsyncHttpUtil.get(context, url, params, listener);
    }
}
