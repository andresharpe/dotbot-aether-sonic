package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1726u1 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    public final String f30990a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    public final String f30991b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30992c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.N
    public final Bundle f30993d;

    public C1726u1(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P Bundle bundle, long j4) {
        this.f30990a = str;
        this.f30991b = str2;
        this.f30993d = bundle;
        this.f30992c = j4;
    }

    public static C1726u1 b(C1736w c1736w) {
        return new C1726u1(c1736w.f31012E, c1736w.f31014G, c1736w.f31013F.i0(), c1736w.f31015H);
    }

    public final C1736w a() {
        return new C1736w(this.f30990a, new C1724u(new Bundle(this.f30993d)), this.f30991b, this.f30992c);
    }

    public final String toString() {
        return "origin=" + this.f30991b + ",name=" + this.f30990a + ",params=" + this.f30993d.toString();
    }
}
