package com.example.ui.http_gson;

import com.example.ui.http.ParamNames;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class GsonUtils {
    private static Gson gson = null;

    public static Gson getGson(){
        if (gson == null){
            GsonBuilder builder = new GsonBuilder();
            builder.setLenient();
            builder.setFieldNamingStrategy(new AnnotateNaming());
            builder.serializeNulls();
            gson = builder.create();
        }
        return gson;
    }
    public static class AnnotateNaming implements FieldNamingStrategy{

        @Override
        public String translateName(Field f) {
            ParamNames names = f.getAnnotation(ParamNames.class);
            return names!=null ? names.value() : FieldNamingPolicy.IDENTITY.translateName(f);
        }
    }
}
