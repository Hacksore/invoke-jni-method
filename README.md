# jni-invoke-method

Attempt to call native methods in the .so libs


### Current Blocker

The US version will not let me call the method from the x86_64 variant, unsure if it even works tbh.

```log
E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.hacksore.invoke_jni_method, PID: 8904
    java.lang.UnsatisfiedLinkError: JNI_ERR returned from JNI_OnLoad in "/data/app/com.hacksore.invoke_jni_method-hC6PhnpfzY77Cf-a1fuyGQ==/base.apk!/lib/x86_64/libnative-lib-us.so"
        at java.lang.Runtime.loadLibrary0(Runtime.java:1071)
        at java.lang.Runtime.loadLibrary0(Runtime.java:1007)
        at java.lang.System.loadLibrary(System.java:1667)
        at com.station.servermodule.context.SignContext.<clinit>(SignContext.java:5)
        at com.station.servermodule.context.SignContext.getClientID(Native Method)
        at com.hacksore.invoke_jni_method.MainActivity.onCreate(MainActivity.java:20)
        at android.app.Activity.performCreate(Activity.java:7802)
        at android.app.Activity.performCreate(Activity.java:7791)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
```