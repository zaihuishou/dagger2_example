package com.zhiqiang.pricticedagger.mvp.presenter;

import com.zhiqiang.pricticedagger.MainActivity;
import com.zhiqiang.pricticedagger.api.AsyncHttpUtil;
import com.zhiqiang.pricticedagger.mvp.model.IMainModel;

/**
 * Created by zhiqiang on 16-1-28.
 */
public class MainPresenter {
    private IMainModel mMainModel;
    private MainActivity mActivity;

    public MainPresenter(IMainModel mainModel, MainActivity activity) {
        mMainModel = mainModel;
        mActivity = activity;
    }

    public void getUser() {
        mMainModel.getUser(mActivity, "56a5295c9325748a2c501fe3da8461f1", new AsyncHttpUtil.LoadListener() {
            @Override
            public void onFailure(int statusCode, String responseString) {
                mActivity.showInfo(responseString);
            }

            @Override
            public void onSuccess(String responseString) {
                mActivity.showInfo(responseString);
            }
        });
    }
}
