package com.google.android.gms.internal.measurement;

import K0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "InitializationParamsCreator")
/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1468p0 extends K0.a {
    public static final Parcelable.Creator<C1468p0> CREATOR = new C1476q0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    public final long f29736E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    public final long f29737F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    public final boolean f29738G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 4)
    public final String f29739H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 5)
    public final String f29740I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 6)
    public final String f29741J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 7)
    public final Bundle f29742K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 8)
    public final String f29743L;

    @c.b
    public C1468p0(@c.e(id = 1) long j4, @c.e(id = 2) long j5, @c.e(id = 3) boolean z3, @c.e(id = 4) @androidx.annotation.P String str, @c.e(id = 5) @androidx.annotation.P String str2, @c.e(id = 6) @androidx.annotation.P String str3, @c.e(id = 7) @androidx.annotation.P Bundle bundle, @c.e(id = 8) @androidx.annotation.P String str4) {
        this.f29736E = j4;
        this.f29737F = j5;
        this.f29738G = z3;
        this.f29739H = str;
        this.f29740I = str2;
        this.f29741J = str3;
        this.f29742K = bundle;
        this.f29743L = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.K(parcel, 1, this.f29736E);
        K0.b.K(parcel, 2, this.f29737F);
        K0.b.g(parcel, 3, this.f29738G);
        K0.b.Y(parcel, 4, this.f29739H, false);
        K0.b.Y(parcel, 5, this.f29740I, false);
        K0.b.Y(parcel, 6, this.f29741J, false);
        K0.b.k(parcel, 7, this.f29742K, false);
        K0.b.Y(parcel, 8, this.f29743L, false);
        K0.b.b(parcel, a4);
    }
}
