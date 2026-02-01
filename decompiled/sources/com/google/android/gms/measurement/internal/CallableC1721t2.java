package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1350a2;
import com.google.android.gms.internal.measurement.C1358b2;
import com.google.android.gms.internal.measurement.C1366c2;
import com.google.android.gms.internal.measurement.C1390f2;
import com.google.android.gms.internal.measurement.C1406h2;
import com.google.android.gms.internal.measurement.C1414i2;
import com.google.android.gms.internal.measurement.C1422j2;
import com.google.android.gms.internal.measurement.C1430k2;
import com.google.android.gms.internal.measurement.C1446m2;
import com.google.android.gms.internal.measurement.C1485r2;
import com.google.android.gms.internal.measurement.C1493s2;
import com.google.android.gms.internal.measurement.D6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC1721t2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1736w f30984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30986c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1721t2(BinderC1751y2 binderC1751y2, C1736w c1736w, String str) {
        this.f30986c = binderC1751y2;
        this.f30984a = c1736w;
        this.f30985b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        L4 l4;
        L4 l42;
        R4 r4;
        I2 i22;
        C1390f2 c1390f2;
        String str;
        Bundle bundle;
        C1414i2 c1414i2;
        String str2;
        C1712s c4;
        long j4;
        byte[] bArr;
        L4 l43;
        l4 = this.f30986c.f31053i;
        l4.c();
        l42 = this.f30986c.f31053i;
        C1716s3 b02 = l42.b0();
        C1736w c1736w = this.f30984a;
        String str3 = this.f30985b;
        b02.f();
        C1638f2.r();
        C1285y.l(c1736w);
        C1285y.h(str3);
        if (!b02.f31060a.x().z(str3, C1643g1.f30692U)) {
            b02.f31060a.b().o().b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(c1736w.f31012E) && !"_iapx".equals(c1736w.f31012E)) {
            b02.f31060a.b().o().c("Generating a payload for this event is not available. package_name, event_name", str3, c1736w.f31012E);
            return null;
        }
        C1390f2 A3 = C1406h2.A();
        b02.f31057b.U().c0();
        try {
            I2 P3 = b02.f31057b.U().P(str3);
            if (P3 == null) {
                b02.f31060a.b().o().b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                l43 = b02.f31057b;
            } else if (!P3.J()) {
                b02.f31060a.b().o().b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                l43 = b02.f31057b;
            } else {
                C1414i2 L12 = C1422j2.L1();
                L12.Z(1);
                L12.U("android");
                if (!TextUtils.isEmpty(P3.d0())) {
                    L12.x(P3.d0());
                }
                if (!TextUtils.isEmpty(P3.f0())) {
                    L12.A((String) C1285y.l(P3.f0()));
                }
                if (!TextUtils.isEmpty(P3.g0())) {
                    L12.B((String) C1285y.l(P3.g0()));
                }
                if (P3.L() != -2147483648L) {
                    L12.C((int) P3.L());
                }
                L12.Q(P3.W());
                L12.K(P3.U());
                String i02 = P3.i0();
                String b03 = P3.b0();
                if (!TextUtils.isEmpty(i02)) {
                    L12.P(i02);
                } else if (!TextUtils.isEmpty(b03)) {
                    L12.w(b03);
                }
                C1653i T3 = b02.f31057b.T(str3);
                L12.H(P3.T());
                if (b02.f31060a.m() && b02.f31060a.x().A(L12.l0()) && T3.i(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    L12.J(null);
                }
                L12.G(T3.h());
                if (T3.i(zzah.AD_STORAGE) && P3.I()) {
                    Pair l5 = b02.f31057b.c0().l(P3.d0(), T3);
                    if (P3.I() && !TextUtils.isEmpty((CharSequence) l5.first)) {
                        try {
                            L12.a0(C1716s3.c((String) l5.first, Long.toString(c1736w.f31015H)));
                            Object obj = l5.second;
                            if (obj != null) {
                                L12.S(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e4) {
                            b02.f31060a.b().o().b("Resettable device id encryption failed", e4.getMessage());
                            bArr = new byte[0];
                            l43 = b02.f31057b;
                        }
                    }
                }
                b02.f31060a.y().i();
                L12.I(Build.MODEL);
                b02.f31060a.y().i();
                L12.T(Build.VERSION.RELEASE);
                L12.f0((int) b02.f31060a.y().n());
                L12.j0(b02.f31060a.y().o());
                try {
                    if (T3.i(zzah.ANALYTICS_STORAGE) && P3.e0() != null) {
                        L12.y(C1716s3.c((String) C1285y.l(P3.e0()), Long.toString(c1736w.f31015H)));
                    }
                    if (!TextUtils.isEmpty(P3.h0())) {
                        L12.O((String) C1285y.l(P3.h0()));
                    }
                    String d02 = P3.d0();
                    List a02 = b02.f31057b.U().a0(d02);
                    Iterator it = a02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r4 = (R4) it.next();
                            if ("_lte".equals(r4.f30396c)) {
                                break;
                            }
                        } else {
                            r4 = null;
                            break;
                        }
                    }
                    if (r4 == null || r4.f30398e == null) {
                        R4 r42 = new R4(d02, kotlinx.coroutines.W.f52989c, "_lte", b02.f31060a.zzav().a(), 0L);
                        a02.add(r42);
                        b02.f31057b.U().v(r42);
                    }
                    O4 e02 = b02.f31057b.e0();
                    e02.f31060a.b().t().a("Checking account type status for ad personalization signals");
                    if (e02.f31060a.y().q()) {
                        String d03 = P3.d0();
                        C1285y.l(d03);
                        if (P3.I() && e02.f31057b.Y().z(d03)) {
                            e02.f31060a.b().o().a("Turning off ad personalization due to account type");
                            Iterator it2 = a02.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((R4) it2.next()).f30396c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            a02.add(new R4(d03, kotlinx.coroutines.W.f52989c, "_npa", e02.f31060a.zzav().a(), 1L));
                        }
                    }
                    C1493s2[] c1493s2Arr = new C1493s2[a02.size()];
                    for (int i4 = 0; i4 < a02.size(); i4++) {
                        C1485r2 D3 = C1493s2.D();
                        D3.A(((R4) a02.get(i4)).f30396c);
                        D3.B(((R4) a02.get(i4)).f30397d);
                        b02.f31057b.e0().I(D3, ((R4) a02.get(i4)).f30398e);
                        c1493s2Arr[i4] = (C1493s2) D3.q();
                    }
                    L12.y0(Arrays.asList(c1493s2Arr));
                    C1726u1 b4 = C1726u1.b(c1736w);
                    b02.f31060a.L().x(b4.f30993d, b02.f31057b.U().O(str3));
                    b02.f31060a.L().y(b4, b02.f31060a.x().l(str3));
                    Bundle bundle2 = b4.f30993d;
                    bundle2.putLong("_c", 1L);
                    b02.f31060a.b().o().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", c1736w.f31014G);
                    if (b02.f31060a.L().R(L12.l0())) {
                        b02.f31060a.L().A(bundle2, "_dbg", 1L);
                        b02.f31060a.L().A(bundle2, "_r", 1L);
                    }
                    C1712s T4 = b02.f31057b.U().T(str3, c1736w.f31012E);
                    if (T4 == null) {
                        c1414i2 = L12;
                        i22 = P3;
                        c1390f2 = A3;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        c4 = new C1712s(str3, c1736w.f31012E, 0L, 0L, 0L, c1736w.f31015H, 0L, null, null, null, null);
                        j4 = 0;
                    } else {
                        i22 = P3;
                        c1390f2 = A3;
                        str = str3;
                        bundle = bundle2;
                        c1414i2 = L12;
                        str2 = null;
                        long j5 = T4.f30954f;
                        c4 = T4.c(c1736w.f31015H);
                        j4 = j5;
                    }
                    b02.f31057b.U().o(c4);
                    r rVar = new r(b02.f31060a, c1736w.f31014G, str, c1736w.f31012E, c1736w.f31015H, j4, bundle);
                    com.google.android.gms.internal.measurement.X1 E3 = com.google.android.gms.internal.measurement.Y1.E();
                    E3.H(rVar.f30937d);
                    E3.D(rVar.f30935b);
                    E3.G(rVar.f30938e);
                    C1718t c1718t = new C1718t(rVar.f30939f);
                    while (c1718t.hasNext()) {
                        String next = c1718t.next();
                        C1358b2 E4 = C1366c2.E();
                        E4.E(next);
                        Object y02 = rVar.f30939f.y0(next);
                        if (y02 != null) {
                            b02.f31057b.e0().H(E4, y02);
                            E3.y(E4);
                        }
                    }
                    C1414i2 c1414i22 = c1414i2;
                    c1414i22.z0(E3);
                    C1430k2 A4 = C1446m2.A();
                    com.google.android.gms.internal.measurement.Z1 A5 = C1350a2.A();
                    A5.t(c4.f30951c);
                    A5.u(c1736w.f31012E);
                    A4.t(A5);
                    c1414i22.W(A4);
                    c1414i22.u0(b02.f31057b.R().k(i22.d0(), Collections.emptyList(), c1414i22.p0(), Long.valueOf(E3.w()), Long.valueOf(E3.w())));
                    if (E3.L()) {
                        c1414i22.e0(E3.w());
                        c1414i22.L(E3.w());
                    }
                    long X3 = i22.X();
                    if (X3 != 0) {
                        c1414i22.X(X3);
                    }
                    long Z3 = i22.Z();
                    if (Z3 != 0) {
                        c1414i22.Y(Z3);
                    } else if (X3 != 0) {
                        c1414i22.Y(X3);
                    }
                    String b5 = i22.b();
                    D6.b();
                    if (b02.f31060a.x().z(str2, C1643g1.f30737t0) && b5 != null) {
                        c1414i22.d0(b5);
                    }
                    i22.e();
                    c1414i22.D((int) i22.Y());
                    b02.f31060a.x().o();
                    c1414i22.h0(73000L);
                    c1414i22.g0(b02.f31060a.zzav().a());
                    c1414i22.c0(true);
                    if (b02.f31060a.x().z(str2, C1643g1.f30671B0)) {
                        b02.f31057b.f(c1414i22.l0(), c1414i22);
                    }
                    C1390f2 c1390f22 = c1390f2;
                    c1390f22.t(c1414i22);
                    I2 i23 = i22;
                    i23.C(c1414i22.s0());
                    i23.z(c1414i22.r0());
                    b02.f31057b.U().n(i23);
                    b02.f31057b.U().m();
                    b02.f31057b.U().d0();
                    try {
                        return b02.f31057b.e0().M(((C1406h2) c1390f22.q()).k());
                    } catch (IOException e5) {
                        b02.f31060a.b().p().c("Data loss. Failed to bundle and serialize. appId", C1720t1.x(str), e5);
                        return str2;
                    }
                } catch (SecurityException e6) {
                    b02.f31060a.b().o().b("app instance id encryption failed", e6.getMessage());
                    byte[] bArr2 = new byte[0];
                    b02.f31057b.U().d0();
                    return bArr2;
                }
            }
            l43.U().d0();
            return bArr;
        } catch (Throwable th) {
            b02.f31057b.U().d0();
            throw th;
        }
    }
}
