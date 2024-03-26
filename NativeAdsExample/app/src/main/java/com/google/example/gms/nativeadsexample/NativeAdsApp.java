package com.google.example.gms.nativeadsexample;

import android.app.Application;

public class NativeAdsApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkInitializeHelper.initialize(this);
    }
}
