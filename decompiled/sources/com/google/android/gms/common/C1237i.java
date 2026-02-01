package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.InterfaceC1266o;
import com.google.android.gms.common.internal.U0;

@com.google.android.gms.common.internal.D
@I0.a
/* renamed from: com.google.android.gms.common.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1237i {

    /* renamed from: b, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28554b = "com.google.android.gms";

    /* renamed from: c, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28555c = "com.android.vending";

    /* renamed from: d, reason: collision with root package name */
    @I0.a
    static final String f28556d = "d";

    /* renamed from: e, reason: collision with root package name */
    @I0.a
    static final String f28557e = "n";

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    public static final int f28553a = C1290k.f28840a;

    /* renamed from: f, reason: collision with root package name */
    private static final C1237i f28558f = new C1237i();

    /* JADX INFO: Access modifiers changed from: package-private */
    @I0.a
    public C1237i() {
    }

    @I0.a
    @androidx.annotation.N
    public static C1237i i() {
        return f28558f;
    }

    @I0.a
    public void a(@androidx.annotation.N Context context) {
        C1290k.a(context);
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public int b(@androidx.annotation.N Context context) {
        return C1290k.d(context);
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public int c(@androidx.annotation.N Context context) {
        return C1290k.e(context);
    }

    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    @Deprecated
    @I0.a
    public Intent d(int i4) {
        return e(null, i4, null);
    }

    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    @I0.a
    public Intent e(@androidx.annotation.P Context context, int i4, @androidx.annotation.P String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            return U0.c("com.google.android.gms");
        }
        if (context != null && com.google.android.gms.common.util.l.l(context)) {
            return U0.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f28553a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.wrappers.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return U0.b("com.google.android.gms", sb.toString());
    }

    @androidx.annotation.P
    @I0.a
    public PendingIntent f(@androidx.annotation.N Context context, int i4, int i5) {
        return g(context, i4, i5, null);
    }

    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    @I0.a
    public PendingIntent g(@androidx.annotation.N Context context, int i4, int i5, @androidx.annotation.P String str) {
        Intent e4 = e(context, i4, str);
        if (e4 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i5, e4, com.google.android.gms.internal.common.m.f29154a | 134217728);
    }

    @I0.a
    @androidx.annotation.N
    public String h(int i4) {
        return C1290k.g(i4);
    }

    @I0.a
    @InterfaceC1266o
    public int j(@androidx.annotation.N Context context) {
        return k(context, f28553a);
    }

    @I0.a
    public int k(@androidx.annotation.N Context context, int i4) {
        int m4 = C1290k.m(context, i4);
        if (C1290k.o(context, m4)) {
            return 18;
        }
        return m4;
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public boolean l(@androidx.annotation.N Context context, int i4) {
        return C1290k.o(context, i4);
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public boolean m(@androidx.annotation.N Context context, int i4) {
        return C1290k.p(context, i4);
    }

    @I0.a
    public boolean n(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        return C1290k.u(context, str);
    }

    @I0.a
    public boolean o(int i4) {
        return C1290k.s(i4);
    }

    @I0.a
    public void p(@androidx.annotation.N Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C1290k.c(context, i4);
    }
}
