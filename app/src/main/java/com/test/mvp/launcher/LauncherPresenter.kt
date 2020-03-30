package com.test.mvp.launcher

import com.test.mvp.databinding.ActivityLauncherBinding
import com.test.mvp.http.API
import com.test.mvp.http.RetrofitClient
import com.test.mvp.launcher.model.LauncherBean
import com.test.mvp.launcher.model.LauncherParams
import com.bumptech.glide.Glide
import com.example.ui.http.BaseSubscriber
import com.example.ui.http.Result
import com.example.ui.mvp.base.BaseView
import com.example.ui.mvp.impl.BasePresenterImp
import com.example.ui.utils.LogI


class LauncherPresenter(mBinding: ActivityLauncherBinding?, mView: LauncherView?) : BasePresenterImp<ActivityLauncherBinding?, LauncherView?>(mBinding, mView) {

    override fun init() {
        getmModel().add(RetrofitClient.Builder.getInstance().launcher(LauncherParams.getInstance().params),object : BaseSubscriber<Result<List<LauncherBean>>, BaseView>(getmView(),true){
            override fun onSuccess(result: Result<List<LauncherBean>>?) {
                LogI.i(API.img_url+result!!.data[0].pic)
                Glide.with(getmView()?.getmActivity())
                    .load(API.img_url+result?.data?.get(0)?.pic)
                    .crossFade(800)
                    .into(getmBinding()?.ivGuanggao)
            }
        })
    }
}