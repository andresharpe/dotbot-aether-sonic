package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "LocationSettingsStatesCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1597w extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1597w> CREATOR = new C1596v0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isGpsUsable", id = 1)
    private final boolean f30067E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isNetworkLocationUsable", id = 2)
    private final boolean f30068F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isBleUsable", id = 3)
    private final boolean f30069G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isGpsPresent", id = 4)
    private final boolean f30070H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isNetworkLocationPresent", id = 5)
    private final boolean f30071I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isBlePresent", id = 6)
    private final boolean f30072J;

    @c.b
    public C1597w(@c.e(id = 1) boolean z3, @c.e(id = 2) boolean z4, @c.e(id = 3) boolean z5, @c.e(id = 4) boolean z6, @c.e(id = 5) boolean z7, @c.e(id = 6) boolean z8) {
        this.f30067E = z3;
        this.f30068F = z4;
        this.f30069G = z5;
        this.f30070H = z6;
        this.f30071I = z7;
        this.f30072J = z8;
    }

    @androidx.annotation.P
    public static C1597w c0(@androidx.annotation.N Intent intent) {
        return (C1597w) K0.d.b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean B0() {
        return this.f30071I;
    }

    public boolean E0() {
        return this.f30068F;
    }

    public boolean e0() {
        return this.f30072J;
    }

    public boolean i0() {
        return this.f30069G;
    }

    public boolean u0() {
        return this.f30070H;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.g(parcel, 1, x0());
        K0.b.g(parcel, 2, E0());
        K0.b.g(parcel, 3, i0());
        K0.b.g(parcel, 4, u0());
        K0.b.g(parcel, 5, B0());
        K0.b.g(parcel, 6, e0());
        K0.b.b(parcel, a4);
    }

    public boolean x0() {
        return this.f30067E;
    }

    public boolean y0() {
        return this.f30070H || this.f30071I;
    }

    public boolean z0() {
        return this.f30067E || this.f30068F;
    }
}
