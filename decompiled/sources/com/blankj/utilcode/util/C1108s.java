package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.os.Environment;
import java.io.File;

/* renamed from: com.blankj.utilcode.util.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108s {
    private C1108s() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.W(api = 19)
    public static void a() {
        ((ActivityManager) E0.a().getSystemService("activity")).clearApplicationUserData();
    }

    public static boolean b(String str) {
        return H0.u(H0.P(str));
    }

    public static boolean c() {
        if ("mounted".equals(Environment.getExternalStorageState()) && H0.u(E0.a().getExternalCacheDir())) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        return H0.u(E0.a().getCacheDir());
    }

    public static boolean e(String str) {
        return E0.a().deleteDatabase(str);
    }

    public static boolean f() {
        return H0.u(new File(E0.a().getFilesDir().getParent(), "databases"));
    }

    public static boolean g() {
        return H0.u(E0.a().getFilesDir());
    }

    public static boolean h() {
        return H0.u(new File(E0.a().getFilesDir().getParent(), "shared_prefs"));
    }
}
