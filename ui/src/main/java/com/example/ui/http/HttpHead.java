package com.example.ui.http;

import android.content.Context;

import com.blankj.utilcode.util.SPUtils;
import com.example.ui.utils.SystemUtils;

import java.util.HashMap;
import java.util.Map;


public class HttpHead {
    public static final String APP_TYPE_DRIVER = "1";//1:表示司机端;2:表示普通会员
    public static final String APP_TYPE_CLIENT = "2";//1:表示司机端;2:表示普通会员
    public static final String DEVICE_TYPE_ANDROID = "1";//1:android;2:ios

    public static Map<String,String> getClientHttpHead(Context mContext){
        String serialNumber = SystemUtils.getSerialNumber(mContext);

        Map <String,String> headers = new HashMap<String,String>();
        headers.put("appType", APP_TYPE_CLIENT);
        //devicetype：设备序类型，1:android;2:ios
        headers.put("devicetype", DEVICE_TYPE_ANDROID);
        //deviceno：设备序列号
        headers.put("deviceno", serialNumber);
        headers.put("token", SPUtils.getInstance("client_user").getString("token"));
        headers.put("secret", SPUtils.getInstance("client_user").getString("secret"));
        return headers;
    }
    public static Map<String,String> getDriverHttpHead(Context mContext){
        String serialNumber = SystemUtils.getSerialNumber(mContext);
        Map<String,String> headers = new HashMap<>();
        headers.put("appType", APP_TYPE_DRIVER);
        //devicetype：设备序类型，1:android;2:ios
        headers.put("devicetype", DEVICE_TYPE_ANDROID);
        //deviceno：设备序列号
        headers.put("deviceno", serialNumber);
        headers.put("token", SPUtils.getInstance("driver_user").getString("token"));
        headers.put("secret", SPUtils.getInstance("driver_user").getString("secret"));
        return headers;
    }
}
