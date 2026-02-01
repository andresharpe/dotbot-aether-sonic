package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.N;
import com.google.android.gms.common.api.internal.C1228z;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class m {
    @I0.a
    private m() {
    }

    @N
    public static l<Status> a() {
        C1228z c1228z = new C1228z(Looper.getMainLooper());
        c1228z.cancel();
        return c1228z;
    }

    @N
    public static <R extends q> l<R> b(@N R r4) {
        boolean z3;
        C1285y.m(r4, "Result must not be null");
        if (r4.getStatus().i0() == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "Status code must be CommonStatusCodes.CANCELED");
        A a4 = new A(r4);
        a4.cancel();
        return a4;
    }

    @I0.a
    @N
    public static <R extends q> l<R> c(@N R r4, @N i iVar) {
        C1285y.m(r4, "Result must not be null");
        C1285y.b(!r4.getStatus().B0(), "Status code must not be SUCCESS");
        B b4 = new B(iVar, r4);
        b4.setResult(r4);
        return b4;
    }

    @I0.a
    @N
    public static <R extends q> k<R> d(@N R r4) {
        C1285y.m(r4, "Result must not be null");
        C c4 = new C(null);
        c4.setResult(r4);
        return new com.google.android.gms.common.api.internal.r(c4);
    }

    @I0.a
    @N
    public static <R extends q> k<R> e(@N R r4, @N i iVar) {
        C1285y.m(r4, "Result must not be null");
        C c4 = new C(iVar);
        c4.setResult(r4);
        return new com.google.android.gms.common.api.internal.r(c4);
    }

    @I0.a
    @N
    public static l<Status> f(@N Status status) {
        C1285y.m(status, "Result must not be null");
        C1228z c1228z = new C1228z(Looper.getMainLooper());
        c1228z.setResult(status);
        return c1228z;
    }

    @I0.a
    @N
    public static l<Status> g(@N Status status, @N i iVar) {
        C1285y.m(status, "Result must not be null");
        C1228z c1228z = new C1228z(iVar);
        c1228z.setResult(status);
        return c1228z;
    }
}
