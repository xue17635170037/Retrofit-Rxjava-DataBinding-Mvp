package com.example.ui.mvp.base;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public interface BaseModel {
    void add(Observable o, Subscriber subscriber);
    void add(Observable o, Action1 subscriber);
}
