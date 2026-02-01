package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "MethodInvocationCreator")
@I0.a
/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1279v extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1279v> CREATOR = new C1243c0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodKey", id = 1)
    private final int f28818E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getResultStatusCode", id = 2)
    private final int f28819F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConnectionResultStatusCode", id = 3)
    private final int f28820G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStartTimeMillis", id = 4)
    private final long f28821H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEndTimeMillis", id = 5)
    private final long f28822I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getCallingModuleId", id = 6)
    private final String f28823J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getCallingEntryPoint", id = 7)
    private final String f28824K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = com.harman.jbl.partybox.ui.effectlab.a.f43472q, getter = "getServiceId", id = 8)
    private final int f28825L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    private final int f28826M;

    @I0.a
    @Deprecated
    public C1279v(int i4, int i5, int i6, long j4, long j5, @androidx.annotation.P String str, @androidx.annotation.P String str2, int i7) {
        this(i4, i5, i6, j4, j5, str, str2, i7, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28818E);
        K0.b.F(parcel, 2, this.f28819F);
        K0.b.F(parcel, 3, this.f28820G);
        K0.b.K(parcel, 4, this.f28821H);
        K0.b.K(parcel, 5, this.f28822I);
        K0.b.Y(parcel, 6, this.f28823J, false);
        K0.b.Y(parcel, 7, this.f28824K, false);
        K0.b.F(parcel, 8, this.f28825L);
        K0.b.F(parcel, 9, this.f28826M);
        K0.b.b(parcel, a4);
    }

    @c.b
    public C1279v(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) int i6, @c.e(id = 4) long j4, @c.e(id = 5) long j5, @c.e(id = 6) @androidx.annotation.P String str, @c.e(id = 7) @androidx.annotation.P String str2, @c.e(id = 8) int i7, @c.e(id = 9) int i8) {
        this.f28818E = i4;
        this.f28819F = i5;
        this.f28820G = i6;
        this.f28821H = j4;
        this.f28822I = j5;
        this.f28823J = str;
        this.f28824K = str2;
        this.f28825L = i7;
        this.f28826M = i8;
    }
}
