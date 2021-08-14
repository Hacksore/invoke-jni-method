package com.hacksore.invoke_jni_method;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.station.servermodule.context.SignContext;

import stationdm.euapi.header.RemoteHttpHeader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // working for EU versions
        System.out.println(RemoteHttpHeader.getStamp("99cfff84-f4e2-4be8-a5ed-e5b755eb6581:1614438506420"));

        // bonk go directly to java jail
        System.out.println(SignContext.getClientID("com.hyundai.bluelink", true));

        setContentView(R.layout.activity_main);
    }
}