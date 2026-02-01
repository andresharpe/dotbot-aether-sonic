package com.harman.jbl.partybox.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.N;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f46194a = "ldpi";

    /* renamed from: b, reason: collision with root package name */
    public static final String f46195b = "mdpi";

    /* renamed from: c, reason: collision with root package name */
    public static final String f46196c = "hdpi";

    /* renamed from: d, reason: collision with root package name */
    public static final String f46197d = "xhdpi";

    /* renamed from: e, reason: collision with root package name */
    public static final String f46198e = "xxhdpi";

    /* renamed from: f, reason: collision with root package name */
    public static final String f46199f = "xxxhdpi";

    /* renamed from: g, reason: collision with root package name */
    public static final String f46200g = "tvdpi";

    public static DisplayMetrics a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        T1.a.a("BLE_LOG DisplayMetrics getMetrics =" + displayMetrics.toString() + " :outMetrics.densityDpi=" + displayMetrics.densityDpi + " :getDpiName=" + b(displayMetrics.density));
        StringBuilder sb = new StringBuilder();
        sb.append("BLE_LOG ScreenWidthDp=");
        sb.append(((float) displayMetrics.widthPixels) / displayMetrics.density);
        sb.append("  :ScreenHeightDp=");
        sb.append(((float) displayMetrics.heightPixels) / displayMetrics.density);
        T1.a.a(sb.toString());
        T1.a.a("BLE_LOG Device manufacturer=" + Build.MANUFACTURER + " :Mobile device model=" + Build.MODEL + " :API version=" + Build.VERSION.SDK_INT + " :Android=" + Build.VERSION.RELEASE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BLE_LOG CRC16.getDeviceName()=");
        sb2.append(com.harman.sdk.utils.b.g());
        sb2.append("  :APP RELEASE version=");
        sb2.append("3.12.20");
        T1.a.a(sb2.toString());
        return displayMetrics;
    }

    private static String b(float f4) {
        if (f4 < 1.0d) {
            return f46194a;
        }
        if (f4 == 1.0f) {
            return f46195b;
        }
        if (f4 <= 1.3f) {
            return f46200g;
        }
        if (f4 <= 1.5f) {
            return f46196c;
        }
        if (f4 <= 2.0f) {
            return f46197d;
        }
        if (f4 <= 3.0f) {
            return f46198e;
        }
        if (f4 <= 4.0f) {
            return f46199f;
        }
        return "undefined";
    }

    @N
    public static DisplayMetrics c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int d(Context context) {
        return a(context).widthPixels;
    }

    public static void e(Context context, Window window, int i4, boolean z3) {
        if (z3) {
            window.getDecorView().setSystemUiVisibility(8192);
            window.setStatusBarColor(i4);
        } else if (i4 != C0669d.f(context, j.d.f40749f1)) {
            window.getDecorView().setSystemUiVisibility(256);
            window.setStatusBarColor(i4);
        }
    }
}
