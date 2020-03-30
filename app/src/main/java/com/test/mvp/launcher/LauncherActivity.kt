package com.test.mvp.launcher
import android.os.Bundle
import com.test.mvp.R
import com.test.mvp.databinding.ActivityLauncherBinding
import com.example.ui.activity.BaseMVPActivity
import com.example.ui.bean.ActionBarBean
import com.example.ui.utils.BarUtils

class LauncherActivity : BaseMVPActivity<ActivityLauncherBinding,LauncherPresenter>(),LauncherView{

    override fun onActivityStart(savedInstanceState: Bundle?) {
        showToolBar(false)
        setActionBarBean(ActionBarBean("启动页",resources.getDrawable(R.drawable.fanhui),null))
        getmPresenter()!!.init()

    }

    override fun setStatusBar(){
        BarUtils.transparentStatusBar(this)
    }


    /**
     * setContentView
     */
    override fun setContentLayout(): Int {
        return R.layout.activity_launcher
    }

    /**
     * 创建P层
     */
    override fun createPresenter(): LauncherPresenter {
        return LauncherPresenter(mContentBinding,this)
    }



}
