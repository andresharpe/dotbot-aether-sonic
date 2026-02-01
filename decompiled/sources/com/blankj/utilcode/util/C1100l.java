package com.blankj.utilcode.util;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.blankj.utilcode.util.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100l {
    private C1100l() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int a() {
        try {
            return Settings.System.getInt(E0.a().getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static int b(@androidx.annotation.N Window window) {
        float f4 = window.getAttributes().screenBrightness;
        if (f4 < 0.0f) {
            return a();
        }
        return (int) (f4 * 255.0f);
    }

    public static boolean c() {
        try {
            if (Settings.System.getInt(E0.a().getContentResolver(), "screen_brightness_mode") != 1) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean d(boolean z3) {
        return Settings.System.putInt(E0.a().getContentResolver(), "screen_brightness_mode", z3 ? 1 : 0);
    }

    public static boolean e(@androidx.annotation.F(from = 0, to = 255) int i4) {
        ContentResolver contentResolver = E0.a().getContentResolver();
        boolean putInt = Settings.System.putInt(contentResolver, "screen_brightness", i4);
        contentResolver.notifyChange(Settings.System.getUriFor("screen_brightness"), null);
        return putInt;
    }

    public static void f(@androidx.annotation.N Window window, @androidx.annotation.F(from = 0, to = 255) int i4) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = i4 / 255.0f;
        window.setAttributes(attributes);
    }
}
