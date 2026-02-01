package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.N;

@I0.a
/* loaded from: classes.dex */
public class k implements InterfaceC1306g {

    /* renamed from: a, reason: collision with root package name */
    private static final k f28996a = new k();

    private k() {
    }

    @I0.a
    @N
    public static InterfaceC1306g e() {
        return f28996a;
    }

    @Override // com.google.android.gms.common.util.InterfaceC1306g
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1306g
    public final long b() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1306g
    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1306g
    public final long d() {
        return System.nanoTime();
    }
}
