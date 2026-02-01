package com.google.android.gms.common.server.converter;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "StringToIntConverterEntryCreator")
/* loaded from: classes.dex */
public final class d extends K0.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28891E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    final String f28892F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    final int f28893G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public d(@c.e(id = 1) int i4, @c.e(id = 2) String str, @c.e(id = 3) int i5) {
        this.f28891E = i4;
        this.f28892F = str;
        this.f28893G = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28891E);
        K0.b.Y(parcel, 2, this.f28892F, false);
        K0.b.F(parcel, 3, this.f28893G);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, int i4) {
        this.f28891E = 1;
        this.f28892F = str;
        this.f28893G = i4;
    }
}
