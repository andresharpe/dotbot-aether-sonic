package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "ValidateAccountRequestCreator")
@Deprecated
/* renamed from: com.google.android.gms.common.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288z0 extends K0.a {
    public static final Parcelable.Creator<C1288z0> CREATOR = new A0();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28835E;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1288z0(@c.e(id = 1) int i4) {
        this.f28835E = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28835E);
        K0.b.b(parcel, a4);
    }
}
