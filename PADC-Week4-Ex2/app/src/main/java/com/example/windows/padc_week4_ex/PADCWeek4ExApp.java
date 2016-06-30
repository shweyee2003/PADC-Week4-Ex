package com.example.windows.padc_week4_ex;

import android.app.Application;
import android.content.Context;

/**
 * Created by windows on 6/27/2016.
 */
public class PADCWeek4ExApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
