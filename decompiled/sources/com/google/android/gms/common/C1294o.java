package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.errorprone.annotations.RestrictedInheritance;

@com.google.android.gms.common.internal.D
@I0.a
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@l1.b
/* renamed from: com.google.android.gms.common.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1294o {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private static B f28858b;

    /* renamed from: a, reason: collision with root package name */
    private volatile A f28859a;

    private static B c() {
        B b4;
        synchronized (B.class) {
            try {
                if (f28858b == null) {
                    f28858b = new B();
                }
                b4 = f28858b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b4;
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @androidx.annotation.N
    public C1295p a(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        String str2;
        C1295p c1295p;
        String str3;
        C1295p c1295p2;
        boolean k4 = C1290k.k(context);
        c();
        if (O.f()) {
            if (true != k4) {
                str2 = "-0";
            } else {
                str2 = "-1";
            }
            String concat = String.valueOf(str).concat(str2);
            if (this.f28859a != null) {
                str3 = this.f28859a.f27953a;
                if (str3.equals(concat)) {
                    c1295p2 = this.f28859a.f27954b;
                    return c1295p2;
                }
            }
            c();
            Z c4 = O.c(str, k4, false, false);
            if (c4.f27992a) {
                this.f28859a = new A(concat, C1295p.d(str, c4.f27995d));
                c1295p = this.f28859a.f27954b;
                return c1295p;
            }
            C1285y.l(c4.f27993b);
            return C1295p.a(str, c4.f27993b, c4.f27994c);
        }
        throw new zzae();
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @androidx.annotation.N
    public C1295p b(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        try {
            C1295p a4 = a(context, str);
            a4.b();
            return a4;
        } catch (SecurityException e4) {
            C1295p a5 = a(context, str);
            if (a5.c()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e4);
                return a5;
            }
            return a5;
        }
    }
}
