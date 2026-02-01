package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "ConnectionTelemetryConfigurationCreator")
@I0.a
/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1252h extends K0.a {

    @I0.a
    @androidx.annotation.N
    public static final Parcelable.Creator<C1252h> CREATOR = new L0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getRootTelemetryConfiguration", id = 1)
    private final B f28745E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f28746F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f28747G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    private final int[] f28748H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int f28749I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    private final int[] f28750J;

    @c.b
    public C1252h(@c.e(id = 1) @androidx.annotation.N B b4, @c.e(id = 2) boolean z3, @c.e(id = 3) boolean z4, @c.e(id = 4) @androidx.annotation.P int[] iArr, @c.e(id = 5) int i4, @c.e(id = 6) @androidx.annotation.P int[] iArr2) {
        this.f28745E = b4;
        this.f28746F = z3;
        this.f28747G = z4;
        this.f28748H = iArr;
        this.f28749I = i4;
        this.f28750J = iArr2;
    }

    @I0.a
    public int c0() {
        return this.f28749I;
    }

    @androidx.annotation.P
    @I0.a
    public int[] e0() {
        return this.f28748H;
    }

    @androidx.annotation.P
    @I0.a
    public int[] i0() {
        return this.f28750J;
    }

    @I0.a
    public boolean u0() {
        return this.f28746F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, this.f28745E, i4, false);
        K0.b.g(parcel, 2, u0());
        K0.b.g(parcel, 3, x0());
        K0.b.G(parcel, 4, e0(), false);
        K0.b.F(parcel, 5, c0());
        K0.b.G(parcel, 6, i0(), false);
        K0.b.b(parcel, a4);
    }

    @I0.a
    public boolean x0() {
        return this.f28747G;
    }

    @androidx.annotation.N
    public final B y0() {
        return this.f28745E;
    }
}
