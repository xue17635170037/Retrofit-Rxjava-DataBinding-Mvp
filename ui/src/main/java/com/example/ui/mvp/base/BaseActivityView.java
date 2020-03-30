package com.example.ui.mvp.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public interface BaseActivityView extends BaseView{
    AppCompatActivity getmActivity();
    void showToolBar(boolean show);
    void onActivityStart(Bundle savedInstanceState);
}
