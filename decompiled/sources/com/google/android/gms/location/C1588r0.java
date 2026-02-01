package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "LocationSettingsConfigurationCreator")
@com.google.android.gms.common.internal.D
@c.g({3, 4, 1000})
@Deprecated
/* renamed from: com.google.android.gms.location.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1588r0 extends K0.a {
    public static final Parcelable.Creator<C1588r0> CREATOR = new C1590s0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", getter = "getJustificationText", id = 1)
    private final String f30049E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", getter = "getExperimentId", id = 2)
    private final String f30050F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", getter = "getTitleText", id = 5)
    private final String f30051G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1588r0(@c.e(id = 5) String str, @c.e(id = 1) String str2, @c.e(id = 2) String str3) {
        this.f30051G = str;
        this.f30049E = str2;
        this.f30050F = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 1, this.f30049E, false);
        K0.b.Y(parcel, 2, this.f30050F, false);
        K0.b.Y(parcel, 5, this.f30051G, false);
        K0.b.b(parcel, a4);
    }
}
