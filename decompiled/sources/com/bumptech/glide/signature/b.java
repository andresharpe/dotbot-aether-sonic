package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26919a = "AppVersionSignature";

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, com.bumptech.glide.load.c> f26920b = new ConcurrentHashMap();

    private b() {
    }

    @P
    private static PackageInfo a(@N Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(f26919a, "Cannot resolve info for" + context.getPackageName(), e4);
            return null;
        }
    }

    @N
    private static String b(@P PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @N
    public static com.bumptech.glide.load.c c(@N Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, com.bumptech.glide.load.c> concurrentMap = f26920b;
        com.bumptech.glide.load.c cVar = concurrentMap.get(packageName);
        if (cVar == null) {
            com.bumptech.glide.load.c d4 = d(context);
            com.bumptech.glide.load.c putIfAbsent = concurrentMap.putIfAbsent(packageName, d4);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return d4;
        }
        return cVar;
    }

    @N
    private static com.bumptech.glide.load.c d(@N Context context) {
        return new e(b(a(context)));
    }

    @i0
    static void e() {
        f26920b.clear();
    }
}
