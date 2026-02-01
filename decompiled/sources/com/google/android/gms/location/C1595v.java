package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

@c.a(creator = "LocationSettingsResultCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1595v extends K0.a implements com.google.android.gms.common.api.q {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1595v> CREATOR = new C1594u0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatus", id = 1)
    private final Status f30065E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getLocationSettingsStates", id = 2)
    private final C1597w f30066F;

    @c.b
    public C1595v(@c.e(id = 1) @androidx.annotation.N Status status, @c.e(id = 2) @androidx.annotation.P C1597w c1597w) {
        this.f30065E = status;
        this.f30066F = c1597w;
    }

    @androidx.annotation.P
    public C1597w c0() {
        return this.f30066F;
    }

    @Override // com.google.android.gms.common.api.q
    @androidx.annotation.N
    public Status getStatus() {
        return this.f30065E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, getStatus(), i4, false);
        K0.b.S(parcel, 2, c0(), i4, false);
        K0.b.b(parcel, a4);
    }
}
