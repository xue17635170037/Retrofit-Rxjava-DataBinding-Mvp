package com.example.ui.activity

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ToastUtils
import com.example.ui.R
import com.example.ui.bean.ActionBarBean
import com.example.ui.databinding.ActivityBaseBinding
import com.example.ui.databinding.BaseActionBarBinding
import com.example.ui.mvp.base.BaseActivityView
import com.example.ui.mvp.base.BasePresenter
import com.example.ui.mvp.base.BaseView

abstract class BaseMVPActivity<AV : ViewDataBinding,P : BasePresenter<*>?> :BaseActivityView,AppCompatActivity(){

    protected var mBaseBinding :ActivityBaseBinding? = null
    protected var mActionbarBaseBinding: BaseActionBarBinding? = null
    private var mPresenter: P? = null
    protected var mContentBinding : AV? = null
    private var dialog:AlertDialog? = null
    protected var  mActionBarBean :ActionBarBean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base)
        mContentBinding = DataBindingUtil.inflate(layoutInflater,setContentLayout(),null,false)
        var rl_params = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
        mContentBinding!!.root.layoutParams = rl_params
        mBaseBinding!!.includeContent.rlContent.addView(mContentBinding!!.root)
        setStatusBar()
        setToolBar()
        mPresenter = createPresenter()
        onActivityStart(savedInstanceState)
    }

    abstract fun setContentLayout(): Int
    abstract fun createPresenter(): P
    protected open fun setStatusBar(){
        com.example.ui.utils.BarUtils.setStatusBarLightMode(this,true)
    }

    protected fun initActionBar():View{
        mActionbarBaseBinding = DataBindingUtil.inflate(layoutInflater,R.layout.base_action_bar,null,false)
        var rlParmas = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
        mActionbarBaseBinding!!.root.layoutParams = rlParmas
        mActionBarBean = ActionBarBean(resources.getString(R.string.app_name),resources.getDrawable(R.drawable.fanhui),null,null)
        mActionbarBaseBinding!!.actionbarBean = mActionBarBean
        mActionbarBaseBinding!!.leftImbt.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                onLeftActionClick(v!!)
            }
        })
        mActionbarBaseBinding!!.rightTv.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                onRightTvActionClick(v!!)
            }
        })
        mActionbarBaseBinding!!.rightImbt.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                onRightActionClick(v!!)
            }
        })
        return mActionbarBaseBinding!!.root
    }
    private fun setToolBar(){
        setSupportActionBar(mBaseBinding!!.includeToolbar.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setHomeButtonEnabled(false)
        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setCustomView(initActionBar())
    }

    override fun showToolBar(show: Boolean) {
        if (show){
            supportActionBar!!.show()
        }else{
            supportActionBar!!.hide()
        }
    }
    protected fun onLeftActionClick(v:View){
        onBackPressed()
    }

    protected fun onRightActionClick(v:View){

    }

    protected fun onRightTvActionClick(v:View){

    }

    override fun showLoading(show: Boolean) {
        if(dialog == null){
            dialog = AlertDialog.Builder(this).create()
            dialog!!.setView(LayoutInflater.from(this).inflate(R.layout.loading_layout,null))
        }
        if (show){
            dialog!!.show()
        }else{
            dialog!!.dismiss()
        }

    }

    override fun showToast(msg:String) {
        ToastUtils.showLong(msg)
    }

    override fun noLogin() {
        ToastUtils.showLong("未登录")
    }

    override fun getmActivity(): AppCompatActivity {
        return this;
    }

    fun setActionBarBean(actionBarBean: ActionBarBean){
        if (this.mActionBarBean == null){
            this.mActionBarBean = ActionBarBean(resources.getString(R.string.app_name),resources.getDrawable(R.drawable.fanhui),null)
        }
        if (!TextUtils.isEmpty(actionBarBean.title)){
            this.mActionBarBean!!.title = actionBarBean.title
        }
        this.mActionBarBean!!.left = actionBarBean.left
        this.mActionBarBean!!.right = actionBarBean.right
        this.mActionBarBean!!.rightTv = actionBarBean.rightTv

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter!!.unBind()
        mPresenter = null
    }
    fun getmPresenter(): P? {
        return this!!.mPresenter;
    }

}