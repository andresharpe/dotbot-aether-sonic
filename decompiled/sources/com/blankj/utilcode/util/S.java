package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class S {
    private S() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String a(@androidx.annotation.N Activity activity, @androidx.annotation.N String str) {
        return b(activity.getClass(), str);
    }

    public static String b(@androidx.annotation.N Class<? extends Activity> cls, @androidx.annotation.N String str) {
        try {
            return String.valueOf(E0.a().getPackageManager().getActivityInfo(new ComponentName(E0.a(), cls), 128).metaData.get(str));
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String c(@androidx.annotation.N String str) {
        try {
            return String.valueOf(E0.a().getPackageManager().getApplicationInfo(E0.a().getPackageName(), 128).metaData.get(str));
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String d(@androidx.annotation.N BroadcastReceiver broadcastReceiver, @androidx.annotation.N String str) {
        return e(broadcastReceiver.getClass(), str);
    }

    public static String e(@androidx.annotation.N Class<? extends BroadcastReceiver> cls, @androidx.annotation.N String str) {
        try {
            return String.valueOf(E0.a().getPackageManager().getReceiverInfo(new ComponentName(E0.a(), cls), 128).metaData.get(str));
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String f(@androidx.annotation.N Service service, @androidx.annotation.N String str) {
        return g(service.getClass(), str);
    }

    public static String g(@androidx.annotation.N Class<? extends Service> cls, @androidx.annotation.N String str) {
        try {
            return String.valueOf(E0.a().getPackageManager().getServiceInfo(new ComponentName(E0.a(), cls), 128).metaData.get(str));
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }
}
