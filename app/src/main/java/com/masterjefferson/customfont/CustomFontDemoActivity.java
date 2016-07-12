package com.masterjefferson.customfont;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CustomFontDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_font_demo);
    }

    @Override
    protected void attachBaseContext(Context newContext) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newContext));
    }
}
