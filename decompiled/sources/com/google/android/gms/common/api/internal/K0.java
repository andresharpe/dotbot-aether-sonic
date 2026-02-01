package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.C1252h;
import com.google.android.gms.common.internal.C1279v;
import com.google.android.gms.common.util.C1301b;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class K0<T> implements InterfaceC1764e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C1193i f28177a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28178b;

    /* renamed from: c, reason: collision with root package name */
    private final C1175c<?> f28179c;

    /* renamed from: d, reason: collision with root package name */
    private final long f28180d;

    /* renamed from: e, reason: collision with root package name */
    private final long f28181e;

    @com.google.android.gms.common.util.D
    K0(C1193i c1193i, int i4, C1175c<?> c1175c, long j4, long j5, @androidx.annotation.P String str, @androidx.annotation.P String str2) {
        this.f28177a = c1193i;
        this.f28178b = i4;
        this.f28179c = c1175c;
        this.f28180d = j4;
        this.f28181e = j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static <T> K0<T> b(C1193i c1193i, int i4, C1175c<?> c1175c) {
        boolean z3;
        long j4;
        long j5;
        if (!c1193i.g()) {
            return null;
        }
        com.google.android.gms.common.internal.B a4 = com.google.android.gms.common.internal.A.b().a();
        if (a4 != null) {
            if (!a4.i0()) {
                return null;
            }
            z3 = a4.u0();
            C1223w0 x3 = c1193i.x(c1175c);
            if (x3 != null) {
                if (!(x3.s() instanceof AbstractC1246e)) {
                    return null;
                }
                AbstractC1246e abstractC1246e = (AbstractC1246e) x3.s();
                if (abstractC1246e.S() && !abstractC1246e.e()) {
                    C1252h c4 = c(x3, abstractC1246e, i4);
                    if (c4 == null) {
                        return null;
                    }
                    x3.F();
                    z3 = c4.x0();
                }
            }
        } else {
            z3 = true;
        }
        if (z3) {
            j4 = System.currentTimeMillis();
        } else {
            j4 = 0;
        }
        if (z3) {
            j5 = SystemClock.elapsedRealtime();
        } else {
            j5 = 0;
        }
        return new K0<>(c1193i, i4, c1175c, j4, j5, null, null);
    }

    @androidx.annotation.P
    private static C1252h c(C1223w0<?> c1223w0, AbstractC1246e<?> abstractC1246e, int i4) {
        int[] e02;
        int[] i02;
        C1252h Q3 = abstractC1246e.Q();
        if (Q3 == null || !Q3.u0() || ((e02 = Q3.e0()) != null ? !C1301b.c(e02, i4) : !((i02 = Q3.i0()) == null || !C1301b.c(i02, i4))) || c1223w0.p() >= Q3.c0()) {
            return null;
        }
        return Q3;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1764e
    @androidx.annotation.j0
    public final void a(@androidx.annotation.N AbstractC1770k<T> abstractC1770k) {
        C1223w0 x3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int c02;
        int i7;
        long j4;
        long j5;
        int i8;
        if (!this.f28177a.g()) {
            return;
        }
        com.google.android.gms.common.internal.B a4 = com.google.android.gms.common.internal.A.b().a();
        if ((a4 == null || a4.i0()) && (x3 = this.f28177a.x(this.f28179c)) != null && (x3.s() instanceof AbstractC1246e)) {
            AbstractC1246e abstractC1246e = (AbstractC1246e) x3.s();
            boolean z4 = true;
            int i9 = 0;
            if (this.f28180d > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int H3 = abstractC1246e.H();
            if (a4 != null) {
                z3 &= a4.u0();
                int c03 = a4.c0();
                int e02 = a4.e0();
                i4 = a4.x0();
                if (abstractC1246e.S() && !abstractC1246e.e()) {
                    C1252h c4 = c(x3, abstractC1246e, this.f28178b);
                    if (c4 == null) {
                        return;
                    }
                    if (!c4.x0() || this.f28180d <= 0) {
                        z4 = false;
                    }
                    e02 = c4.c0();
                    z3 = z4;
                }
                i6 = c03;
                i5 = e02;
            } else {
                i4 = 0;
                i5 = 100;
                i6 = 5000;
            }
            C1193i c1193i = this.f28177a;
            if (abstractC1770k.v()) {
                i7 = 0;
            } else {
                if (abstractC1770k.t()) {
                    i9 = 100;
                } else {
                    Exception q4 = abstractC1770k.q();
                    if (q4 instanceof ApiException) {
                        Status a5 = ((ApiException) q4).a();
                        int i02 = a5.i0();
                        C1231c c04 = a5.c0();
                        if (c04 == null) {
                            c02 = -1;
                        } else {
                            c02 = c04.c0();
                        }
                        i7 = c02;
                        i9 = i02;
                    } else {
                        i9 = 101;
                    }
                }
                i7 = -1;
            }
            if (z3) {
                long j6 = this.f28180d;
                long currentTimeMillis = System.currentTimeMillis();
                i8 = (int) (SystemClock.elapsedRealtime() - this.f28181e);
                j4 = j6;
                j5 = currentTimeMillis;
            } else {
                j4 = 0;
                j5 = 0;
                i8 = -1;
            }
            c1193i.L(new C1279v(this.f28178b, i9, i7, j4, j5, null, null, H3, i8), i4, i6, i5);
        }
    }
}
