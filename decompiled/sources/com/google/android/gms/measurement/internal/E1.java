package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30158a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30159b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30160c;

    /* renamed from: d, reason: collision with root package name */
    private long f30161d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J1 f30162e;

    public E1(J1 j12, String str, long j4) {
        this.f30162e = j12;
        C1285y.h(str);
        this.f30158a = str;
        this.f30159b = j4;
    }

    @androidx.annotation.j0
    public final long a() {
        if (!this.f30160c) {
            this.f30160c = true;
            this.f30161d = this.f30162e.m().getLong(this.f30158a, this.f30159b);
        }
        return this.f30161d;
    }

    @androidx.annotation.j0
    public final void b(long j4) {
        SharedPreferences.Editor edit = this.f30162e.m().edit();
        edit.putLong(this.f30158a, j4);
        edit.apply();
        this.f30161d = j4;
    }
}
