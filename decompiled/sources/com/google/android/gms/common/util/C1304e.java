package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;

@I0.a
/* renamed from: com.google.android.gms.common.util.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1304e {
    private C1304e() {
    }

    @I0.a
    public static int a(@N Context context, @N String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b4 = b(context, str);
        if (b4 == null || (applicationInfo = b4.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @P
    @I0.a
    public static PackageInfo b(@N Context context, @N String str) {
        try {
            return com.google.android.gms.common.wrappers.e.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @I0.a
    public static boolean c() {
        return false;
    }
}
