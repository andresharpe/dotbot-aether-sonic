package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.C0;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.google.firebase.crashlytics.internal.common.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1796d {

    /* renamed from: c, reason: collision with root package name */
    static final int f35037c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f35038d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f35039e = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Float f35040a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35041b;

    private C1796d(Float f4, boolean z3) {
        this.f35041b = z3;
        this.f35040a = f4;
    }

    public static C1796d a(Context context) {
        boolean z3 = false;
        Float f4 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z3 = f(registerReceiver);
                f4 = d(registerReceiver);
            }
        } catch (IllegalStateException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("An error occurred getting battery state.", e4);
        }
        return new C1796d(f4, z3);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.b.f34812t, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    private static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra(C0.f11537F0, -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public Float b() {
        return this.f35040a;
    }

    public int c() {
        Float f4;
        if (this.f35041b && (f4 = this.f35040a) != null) {
            if (f4.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    boolean e() {
        return this.f35041b;
    }
}
