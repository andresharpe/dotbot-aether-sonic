package com.blankj.utilcode.util;

import android.os.Vibrator;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private static Vibrator f24795a;

    private I0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.Y("android.permission.VIBRATE")
    public static void a() {
        Vibrator b4 = b();
        if (b4 == null) {
            return;
        }
        b4.cancel();
    }

    private static Vibrator b() {
        if (f24795a == null) {
            f24795a = (Vibrator) E0.a().getSystemService("vibrator");
        }
        return f24795a;
    }

    @androidx.annotation.Y("android.permission.VIBRATE")
    public static void c(long j4) {
        Vibrator b4 = b();
        if (b4 == null) {
            return;
        }
        b4.vibrate(j4);
    }

    @androidx.annotation.Y("android.permission.VIBRATE")
    public static void d(long[] jArr, int i4) {
        Vibrator b4 = b();
        if (b4 == null) {
            return;
        }
        b4.vibrate(jArr, i4);
    }
}
