package com.google.android.gms.signin.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.P;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.C1259k0;

@c.a(creator = "SignInResponseCreator")
/* loaded from: classes2.dex */
public final class l extends K0.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f31101E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConnectionResult", id = 2)
    private final C1231c f31102F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getResolveAccountResponse", id = 3)
    private final C1259k0 f31103G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public l(@c.e(id = 1) int i4, @c.e(id = 2) C1231c c1231c, @c.e(id = 3) @P C1259k0 c1259k0) {
        this.f31101E = i4;
        this.f31102F = c1231c;
        this.f31103G = c1259k0;
    }

    public final C1231c c0() {
        return this.f31102F;
    }

    @P
    public final C1259k0 e0() {
        return this.f31103G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f31101E);
        K0.b.S(parcel, 2, this.f31102F, i4, false);
        K0.b.S(parcel, 3, this.f31103G, i4, false);
        K0.b.b(parcel, a4);
    }
}
