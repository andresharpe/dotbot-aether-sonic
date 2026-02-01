package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "RootTelemetryConfigurationCreator")
@I0.a
/* loaded from: classes.dex */
public class B extends K0.a {

    @I0.a
    @androidx.annotation.N
    public static final Parcelable.Creator<B> CREATOR = new C1286y0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getVersion", id = 1)
    private final int f28595E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f28596F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f28597G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getBatchPeriodMillis", id = 4)
    private final int f28598H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int f28599I;

    @c.b
    public B(@c.e(id = 1) int i4, @c.e(id = 2) boolean z3, @c.e(id = 3) boolean z4, @c.e(id = 4) int i5, @c.e(id = 5) int i6) {
        this.f28595E = i4;
        this.f28596F = z3;
        this.f28597G = z4;
        this.f28598H = i5;
        this.f28599I = i6;
    }

    @I0.a
    public int c0() {
        return this.f28598H;
    }

    @I0.a
    public int e0() {
        return this.f28599I;
    }

    @I0.a
    public boolean i0() {
        return this.f28596F;
    }

    @I0.a
    public boolean u0() {
        return this.f28597G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, x0());
        K0.b.g(parcel, 2, i0());
        K0.b.g(parcel, 3, u0());
        K0.b.F(parcel, 4, c0());
        K0.b.F(parcel, 5, e0());
        K0.b.b(parcel, a4);
    }

    @I0.a
    public int x0() {
        return this.f28595E;
    }
}
