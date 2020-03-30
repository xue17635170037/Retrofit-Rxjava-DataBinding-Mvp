package com.example.ui.mvp.base;


import rx.Observable;
import rx.Subscriber;

public interface BasePresenter<V extends BaseView> {
    void init();
    V getmView();
    void unBind();

}
