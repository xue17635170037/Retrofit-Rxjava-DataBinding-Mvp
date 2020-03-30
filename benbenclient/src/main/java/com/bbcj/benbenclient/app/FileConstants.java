package com.bbcj.benbenclient.app;

import android.os.Environment;

import com.bbcj.benbenclient.BuildConfig;

import java.io.File;

/**
 * FileConstants
 * github   Larissa
 * @Emil xuehao.huaykeji.com
 */

public class FileConstants {

    private static final String EXTERNAL_STORAGE = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static final String DIANDIAN = EXTERNAL_STORAGE + File.separator + "bbcj";
    public static final String PROVIDER_DIANDIAN_AUTHORITY = BuildConfig.APPLICATION_ID + ".fileProvider";
    public static final String CLIENT = DIANDIAN + File.separator + "Client";
    public static final String START = CLIENT + File.separator + "start";
    public static final String MAIN = CLIENT + File.separator + "main";
    public static final String APK = CLIENT + File.separator + "apk";
    static final String DIR_CRASH = CLIENT + File.separator + "crash";
    public static final String AMAP_ASSERT = CLIENT + File.separator + "amap";
    public static final String AMAP_STYLE_YUANSHANDAI = "mystyle_sdk_1512546238_0100.data";
    public static final String IMG_HEADER ="header.jpg";
    public static final String IMG_QRCODE = "QRCode.jpg";
    public static final String IMG_ORDER_SHARE = CLIENT + File.separator +"OrderShare.jpg";
    public static final String IMG_CAR = "car.jpg";

}
