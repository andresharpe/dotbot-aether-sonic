package com.harman.jbl.partybox.utils;

import android.util.Log;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static long f46174a;

    /* renamed from: b, reason: collision with root package name */
    private static long f46175b;

    /* renamed from: c, reason: collision with root package name */
    private static int f46176c;

    public static boolean a() {
        int i4 = f46176c;
        if (i4 == 0) {
            f46175b = System.currentTimeMillis();
        } else if (i4 == 9) {
            if (System.currentTimeMillis() - f46175b < 3000) {
                f46176c = -1;
                return true;
            }
            f46176c = -1;
        } else if (System.currentTimeMillis() - f46175b >= 3000) {
            f46176c = 0;
            f46175b = System.currentTimeMillis();
        }
        f46176c++;
        return false;
    }

    public static boolean b() {
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f46174a < 500) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            f46174a = currentTimeMillis;
        }
        if (f46174a > currentTimeMillis) {
            f46174a = currentTimeMillis;
        }
        Log.d("ClickHelper", "ClickHelper:" + z3);
        return z3;
    }

    public static boolean c(long j4) {
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f46174a < j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            f46174a = currentTimeMillis;
        }
        return z3;
    }
}
