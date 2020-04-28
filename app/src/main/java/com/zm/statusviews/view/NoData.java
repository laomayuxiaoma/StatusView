package com.zm.statusviews.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;


import com.zm.statusview.BaseView;
import com.zm.statusviews.databinding.NetNoDataBinding;
import com.zm.statusviews.R;

import java.util.HashMap;

/**
 * 暂无数据
 */
public class NoData extends BaseView<Object, NetNoDataBinding> {


    public NoData(Context context, Object data, ViewGroup parent) {
        super(context, data, parent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.net_no_data;
    }

    @Override
    protected void initView(View view, boolean isUpdate) {
        if (!isUpdate) {
            mBinding.tvResponse.setText("暂无数据");
        }
    }

    @Override
    protected void initListener(View view, boolean isUpdate) {

    }

    @Override
    protected void initViewConfigure(HashMap<String, Class> viewConfigure) {

    }

    @Override
    protected ConbinationBuilder combinationViewBuilder() {
        return null;
    }
}
