package com.example.ui.mvp.impl;

import androidx.databinding.ViewDataBinding;
import com.example.ui.mvp.base.BaseModel;
import com.example.ui.mvp.base.BasePresenter;
import com.example.ui.mvp.base.BaseView;
import rx.Observable;
import rx.Subscriber;

public abstract class BasePresenterImp<AV extends ViewDataBinding,V extends BaseView> implements BasePresenter<V> {
    private V mView;
    private BaseModel mModel;
    private AV mBinding;


    public BasePresenterImp(AV mBinding, V mView) {
        this.mView = mView;
        this.mBinding = mBinding;
        mModel = new BaseModelImp();
    }

    @Override
    public V getmView() {
        return mView;
    }

    public AV getmBinding() {
        return mBinding;
    }

    public BaseModel getmModel() {
        return mModel;
    }


    @Override
    public void unBind() {
        if (getmView()!=null){
            mView = null;
        }
        if (getmModel()!=null){
            mModel = null;
        }
        if (getmBinding()!=null){
            mBinding.unbind();
            mBinding = null;
        }
    }
}
