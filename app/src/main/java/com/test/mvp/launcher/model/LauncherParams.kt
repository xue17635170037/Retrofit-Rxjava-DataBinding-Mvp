package com.test.mvp.launcher.model

import com.example.ui.bean.BaseBean
import com.example.ui.http.HttpHead
import com.example.ui.http.ParamNames

class LauncherParams : BaseBean() {
    @ParamNames(value = "adType")
    var adType = "1"
    @ParamNames(value = "appType")
    var appType = HttpHead.APP_TYPE_CLIENT

    companion object {
        private var instance: LauncherParams? = null
        fun getInstance(): LauncherParams {
            if (instance == null) {
                synchronized(LauncherParams::class.java) {
                    if (instance == null) {
                        instance = LauncherParams()
                    }
                }
            }
            return this.instance!!
        }
    }
}
