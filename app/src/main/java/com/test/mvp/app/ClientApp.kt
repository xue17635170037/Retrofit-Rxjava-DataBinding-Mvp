package com.test.mvp.app
import com.blankj.utilcode.util.Utils
import com.example.ui.app.BaseApp
import com.example.ui.http.HttpUtils
import com.example.ui.utils.LogI
import com.example.ui.utils.LogToFileUtils


class ClientApp : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        HttpUtils.getInstance().init(this,true)
        LogI.TAG = "DEBUG_BBCJ_CLIENT";
        Utils.init(this)
        LogToFileUtils.init(FileConstants.CLIENT)
    }


}
