package com.masterjefferson.customfont;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyUtils;

/**
 * Created by masterjefferson on 7/11/2016.
 */
public class CustomFontApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig config = new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/dimitri.ttf")
                .build();
//        CalligraphyConfig.initDefault(config);
    }
}
