package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class r0 {
    private r0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(@androidx.annotation.N Intent intent, @androidx.annotation.N ServiceConnection serviceConnection, int i4) {
        try {
            E0.a().bindService(intent, serviceConnection, i4);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void b(@androidx.annotation.N Class<?> cls, @androidx.annotation.N ServiceConnection serviceConnection, int i4) {
        a(new Intent(E0.a(), cls), serviceConnection, i4);
    }

    public static void c(@androidx.annotation.N String str, @androidx.annotation.N ServiceConnection serviceConnection, int i4) {
        try {
            b(Class.forName(str), serviceConnection, i4);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static Set<String> d() {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) E0.a().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        HashSet hashSet = new HashSet();
        if (runningServices != null && runningServices.size() != 0) {
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().service.getClassName());
            }
            return hashSet;
        }
        return null;
    }

    public static boolean e(@androidx.annotation.N Class<?> cls) {
        return f(cls.getName());
    }

    public static boolean f(@androidx.annotation.N String str) {
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) E0.a().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() != 0) {
                Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().service.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void g(Intent intent) {
        try {
            intent.setFlags(32);
            if (Build.VERSION.SDK_INT >= 26) {
                E0.a().startForegroundService(intent);
            } else {
                E0.a().startService(intent);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void h(@androidx.annotation.N Class<?> cls) {
        g(new Intent(E0.a(), cls));
    }

    public static void i(@androidx.annotation.N String str) {
        try {
            h(Class.forName(str));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static boolean j(@androidx.annotation.N Intent intent) {
        try {
            return E0.a().stopService(intent);
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean k(@androidx.annotation.N Class<?> cls) {
        return j(new Intent(E0.a(), cls));
    }

    public static boolean l(@androidx.annotation.N String str) {
        try {
            return k(Class.forName(str));
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static void m(@androidx.annotation.N ServiceConnection serviceConnection) {
        E0.a().unbindService(serviceConnection);
    }
}
