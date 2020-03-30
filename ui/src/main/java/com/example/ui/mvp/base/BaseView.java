package com.example.ui.mvp.base;

import androidx.fragment.app.FragmentActivity;

public interface BaseView{
    void showLoading(boolean show);
    void showToast(String msg);
    void noLogin();
}
