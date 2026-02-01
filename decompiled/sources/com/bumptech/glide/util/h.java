package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final double f26948a = 1.0d / Math.pow(10.0d, 6.0d);

    private h() {
    }

    public static double a(long j4) {
        return (b() - j4) * f26948a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
