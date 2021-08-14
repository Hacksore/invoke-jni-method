package com.station.servermodule.context;

public class SignContext {
    static {
        System.loadLibrary("native-lib-us");
    }

    public static native String getClientID(String str, boolean z);
    public static native String getClientSecret(String str, boolean z);
}