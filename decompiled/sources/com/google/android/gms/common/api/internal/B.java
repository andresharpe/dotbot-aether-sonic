package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* loaded from: classes.dex */
public class B {
    @I0.a
    public static void a(@androidx.annotation.N Status status, @androidx.annotation.N C1771l<Void> c1771l) {
        b(status, null, c1771l);
    }

    @I0.a
    public static <TResult> void b(@androidx.annotation.N Status status, @androidx.annotation.P TResult tresult, @androidx.annotation.N C1771l<TResult> c1771l) {
        if (status.B0()) {
            c1771l.c(tresult);
        } else {
            c1771l.b(new ApiException(status));
        }
    }

    @I0.a
    @androidx.annotation.N
    @Deprecated
    public static AbstractC1770k<Void> c(@androidx.annotation.N AbstractC1770k<Boolean> abstractC1770k) {
        return abstractC1770k.m(new C1183e1());
    }

    @I0.a
    public static <ResultT> boolean d(@androidx.annotation.N Status status, @androidx.annotation.P ResultT resultt, @androidx.annotation.N C1771l<ResultT> c1771l) {
        if (status.B0()) {
            return c1771l.e(resultt);
        }
        return c1771l.d(new ApiException(status));
    }
}
