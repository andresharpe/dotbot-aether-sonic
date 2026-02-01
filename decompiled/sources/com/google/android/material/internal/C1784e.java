package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0734z;
import androidx.core.view.C0823k0;
import androidx.core.view.C0858x0;
import androidx.core.view.E1;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1784e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f32619a = 128;

    private C1784e() {
    }

    public static void a(@N Window window, boolean z3) {
        b(window, z3, null, null);
    }

    public static void b(@N Window window, boolean z3, @P @InterfaceC0569l Integer num, @P @InterfaceC0569l Integer num2) {
        boolean z4;
        boolean z5 = false;
        if (num != null && num.intValue() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z5 = true;
        }
        if (z4 || z5) {
            int b4 = com.google.android.material.color.s.b(window.getContext(), R.attr.colorBackground, C0823k0.f13589t);
            if (z4) {
                num = Integer.valueOf(b4);
            }
            if (z5) {
                num2 = Integer.valueOf(b4);
            }
        }
        C0858x0.c(window, !z3);
        int d4 = d(window.getContext(), z3);
        int c4 = c(window.getContext(), z3);
        window.setStatusBarColor(d4);
        window.setNavigationBarColor(c4);
        boolean e4 = e(d4, com.google.android.material.color.s.k(num.intValue()));
        boolean e5 = e(c4, com.google.android.material.color.s.k(num2.intValue()));
        E1 a4 = C0858x0.a(window, window.getDecorView());
        if (a4 != null) {
            a4.i(e4);
            a4.h(e5);
        }
    }

    @TargetApi(21)
    private static int c(Context context, boolean z3) {
        if (z3 && Build.VERSION.SDK_INT < 27) {
            return C0734z.B(com.google.android.material.color.s.b(context, R.attr.navigationBarColor, C0823k0.f13589t), 128);
        }
        if (z3) {
            return 0;
        }
        return com.google.android.material.color.s.b(context, R.attr.navigationBarColor, C0823k0.f13589t);
    }

    @TargetApi(21)
    private static int d(Context context, boolean z3) {
        if (z3) {
            return 0;
        }
        return com.google.android.material.color.s.b(context, R.attr.statusBarColor, C0823k0.f13589t);
    }

    private static boolean e(int i4, boolean z3) {
        if (!com.google.android.material.color.s.k(i4) && (i4 != 0 || !z3)) {
            return false;
        }
        return true;
    }
}
