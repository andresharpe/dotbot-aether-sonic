package com.google.android.gms.common.api;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    @N
    @Deprecated
    protected final Status f28018E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ApiException(@androidx.annotation.N com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.i0()
            java.lang.String r1 = r4.u0()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r4.u0()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.f28018E = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @N
    public Status a() {
        return this.f28018E;
    }

    public int b() {
        return this.f28018E.i0();
    }

    @P
    @Deprecated
    public String c() {
        return this.f28018E.u0();
    }
}
