package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.InterfaceC1266o;

/* renamed from: com.google.android.gms.common.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289j extends C1290k {

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f28836k = "GooglePlayServicesErrorDialog";

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f28837l = C1290k.f28840a;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final String f28838m = "com.google.android.gms";

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f28839n = "com.android.vending";

    private C1289j() {
    }

    @Deprecated
    public static void A(int i4, @androidx.annotation.N Context context) {
        C1236h x3 = C1236h.x();
        if (!C1290k.o(context, i4) && !C1290k.p(context, i4)) {
            x3.C(context, i4);
        } else {
            x3.J(context);
        }
    }

    @androidx.annotation.N
    @Deprecated
    public static PendingIntent f(int i4, @androidx.annotation.N Context context, int i5) {
        return C1290k.f(i4, context, i5);
    }

    @androidx.annotation.N
    @com.google.android.gms.common.util.D
    @Deprecated
    public static String g(int i4) {
        return C1290k.g(i4);
    }

    @androidx.annotation.N
    public static Context i(@androidx.annotation.N Context context) {
        return C1290k.i(context);
    }

    @androidx.annotation.N
    public static Resources j(@androidx.annotation.N Context context) {
        return C1290k.j(context);
    }

    @InterfaceC1266o
    @Deprecated
    public static int l(@androidx.annotation.N Context context) {
        return C1290k.l(context);
    }

    @I0.a
    @Deprecated
    public static int m(@androidx.annotation.N Context context, int i4) {
        return C1290k.m(context, i4);
    }

    @Deprecated
    public static boolean s(int i4) {
        return C1290k.s(i4);
    }

    @androidx.annotation.P
    @Deprecated
    public static Dialog v(int i4, @androidx.annotation.N Activity activity, int i5) {
        return w(i4, activity, i5, null);
    }

    @androidx.annotation.P
    @Deprecated
    public static Dialog w(int i4, @androidx.annotation.N Activity activity, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        if (true == C1290k.o(activity, i4)) {
            i4 = 18;
        }
        return C1236h.x().t(activity, i4, i5, onCancelListener);
    }

    @Deprecated
    public static boolean x(int i4, @androidx.annotation.N Activity activity, int i5) {
        return y(i4, activity, i5, null);
    }

    @Deprecated
    public static boolean y(int i4, @androidx.annotation.N Activity activity, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        return z(i4, activity, null, i5, onCancelListener);
    }

    public static boolean z(int i4, @androidx.annotation.N Activity activity, @androidx.annotation.P Fragment fragment, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        if (true == C1290k.o(activity, i4)) {
            i4 = 18;
        }
        C1236h x3 = C1236h.x();
        if (fragment == null) {
            return x3.B(activity, i4, i5, onCancelListener);
        }
        Dialog E3 = x3.E(activity, i4, com.google.android.gms.common.internal.V.c(fragment, C1236h.x().e(activity, i4, "d"), i5), onCancelListener);
        if (E3 == null) {
            return false;
        }
        x3.H(activity, E3, f28836k, onCancelListener);
        return true;
    }
}
