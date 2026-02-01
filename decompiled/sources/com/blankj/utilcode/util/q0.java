package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class q0 {
    private q0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int c() {
        WindowManager windowManager = (WindowManager) E0.a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int d() {
        WindowManager windowManager = (WindowManager) E0.a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int f() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static int g() {
        WindowManager windowManager = (WindowManager) E0.a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int h(@androidx.annotation.N Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public static int i() {
        WindowManager windowManager = (WindowManager) E0.a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static float j() {
        return Resources.getSystem().getDisplayMetrics().xdpi;
    }

    public static float k() {
        return Resources.getSystem().getDisplayMetrics().ydpi;
    }

    public static int l() {
        try {
            return Settings.System.getInt(E0.a().getContentResolver(), "screen_off_timeout");
        } catch (Settings.SettingNotFoundException e4) {
            e4.printStackTrace();
            return -123;
        }
    }

    public static boolean o(@androidx.annotation.N Activity activity) {
        if ((activity.getWindow().getAttributes().flags & 1024) == 1024) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        if (E0.a().getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static boolean q() {
        if (E0.a().getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static boolean r() {
        KeyguardManager keyguardManager = (KeyguardManager) E0.a().getSystemService("keyguard");
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static Bitmap s(@androidx.annotation.N Activity activity) {
        return t(activity, false);
    }

    public static Bitmap t(@androidx.annotation.N Activity activity, boolean z3) {
        Bitmap g12 = H0.g1(activity.getWindow().getDecorView());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (z3) {
            int e02 = H0.e0();
            return Bitmap.createBitmap(g12, 0, e02, displayMetrics.widthPixels, displayMetrics.heightPixels - e02);
        }
        return Bitmap.createBitmap(g12, 0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void u(@androidx.annotation.N Activity activity) {
        activity.getWindow().addFlags(1024);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void v(@androidx.annotation.N Activity activity) {
        activity.setRequestedOrientation(0);
    }

    public static void w(@androidx.annotation.N Activity activity) {
        activity.getWindow().clearFlags(1024);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void x(@androidx.annotation.N Activity activity) {
        activity.setRequestedOrientation(1);
    }

    @androidx.annotation.Y("android.permission.WRITE_SETTINGS")
    public static void y(int i4) {
        Settings.System.putInt(E0.a().getContentResolver(), "screen_off_timeout", i4);
    }

    public static void z(@androidx.annotation.N Activity activity) {
        boolean o4 = o(activity);
        Window window = activity.getWindow();
        if (o4) {
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
        }
    }

    public int a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return i() - iArr[0];
    }

    public int b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return g() - iArr[1];
    }

    public int m(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public int n(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }
}
