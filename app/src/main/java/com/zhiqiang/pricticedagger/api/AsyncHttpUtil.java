package com.zhiqiang.pricticedagger.api;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

/**
 * Created by zhiqiang on 16-1-28.
 */
public class AsyncHttpUtil {
    private static AsyncHttpClient getAsyncHttpClient() {
        AsyncHttpClient client = new AsyncHttpClient();
        return client;
    }

    public static void get(@NonNull Context context, @NonNull String url, @Nullable RequestParams params, final LoadListener listener) {
        getAsyncHttpClient().get(context, url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                if (listener != null)
                    listener.onFailure(statusCode, responseString);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                if (listener != null)
                    listener.onSuccess(responseString);
            }
        });

    }

    public interface LoadListener {
        void onFailure(int statusCode, String responseString);

        void onSuccess(String responseString);
    }
}
