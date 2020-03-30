package com.bbcj.benbenclient.http;

import com.bbcj.benbenclient.launcher.model.LauncherBean;
import com.example.ui.http.HttpUtils;
import com.example.ui.http.Result;

import java.util.List;
import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface RetrofitClient {
    class Builder{
        public static RetrofitClient getInstance(){
            return HttpUtils.getInstance().clientServer(API.url_root,RetrofitClient.class);
        }
    }

    @FormUrlEncoded
    @POST(API.launcherUrl)
    Observable<Result<List<LauncherBean>>>launcher(@FieldMap Map<String,String>map);
}
