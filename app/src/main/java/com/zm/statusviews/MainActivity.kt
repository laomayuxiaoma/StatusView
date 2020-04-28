package com.zm.statusviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zm.statusview.BaseView
import com.zm.statusviews.util.Constant
import com.zm.statusviews.view.NetError
import com.zm.statusviews.view.NoData
import kotlinx.android.synthetic.main.activity_main.*
import java.util.HashMap

class MainActivity : AppCompatActivity() {

    private val mTagMapView = HashMap<String, Class<*>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTagMapView()
    }

    private fun initTagMapView() {
        mTagMapView[Constant.NET_ERROR] = NetError::class.java
        mTagMapView[Constant.NET_NO_DATA] = NoData::class.java
    }

    fun netError(v: View?) {
        //第三个参数是要传入的数据
        sv_view.setData(Constant.NET_ERROR, mTagMapView,"")
    }

    fun noData(v: View?) {
        sv_view.setData(Constant.NET_NO_DATA, mTagMapView,"")
    }
}
