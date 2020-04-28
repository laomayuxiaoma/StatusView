package com.zm.statusviews.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.zm.statusview.BaseView;
import com.zm.statusviews.databinding.NetErrorBinding;
import com.zm.statusviews.R;

import java.util.HashMap;

/**
 * 网络错误
 */
public class NetError extends BaseView<Object, NetErrorBinding> {

    public NetError(Context context, Object data, ViewGroup parent) {
        super(context, data, parent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.net_error;
    }

    @Override
    protected void initView(View view, boolean isUpdate) {
        if (!isUpdate) {
            mBinding.tvResponse.setText("请求失败 稍后重试");
        }
    }

    @Override
    protected void initListener(View view, boolean isUpdate) {
        if (!isUpdate) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {//重新刷新数据，通过data中传过来的接口进行回调

                }
            });
        }
    }

    @Override
    protected void initViewConfigure(HashMap<String, Class> viewConfigure) {

    }

    @Override
    protected ConbinationBuilder combinationViewBuilder() {
        return null;
    }
}
