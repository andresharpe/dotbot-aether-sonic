package com.google.android.gms.signin.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1255i0;

@c.a(creator = "SignInRequestCreator")
/* loaded from: classes2.dex */
public final class j extends K0.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f31099E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getResolveAccountRequest", id = 2)
    final C1255i0 f31100F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public j(@c.e(id = 1) int i4, @c.e(id = 2) C1255i0 c1255i0) {
        this.f31099E = i4;
        this.f31100F = c1255i0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f31099E);
        K0.b.S(parcel, 2, this.f31100F, i4, false);
        K0.b.b(parcel, a4);
    }
}
