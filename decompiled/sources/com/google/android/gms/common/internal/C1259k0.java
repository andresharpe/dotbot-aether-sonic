package com.google.android.gms.common.internal;

import K0.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.InterfaceC1268p;

@c.a(creator = "ResolveAccountResponseCreator")
/* renamed from: com.google.android.gms.common.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259k0 extends K0.a {
    public static final Parcelable.Creator<C1259k0> CREATOR = new C1261l0();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28777E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 2)
    final IBinder f28778F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConnectionResult", id = 3)
    private final C1231c f28779G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getSaveDefaultAccount", id = 4)
    private final boolean f28780H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isFromCrossClientAuth", id = 5)
    private final boolean f28781I;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1259k0(@c.e(id = 1) int i4, @c.e(id = 2) @androidx.annotation.P IBinder iBinder, @c.e(id = 3) C1231c c1231c, @c.e(id = 4) boolean z3, @c.e(id = 5) boolean z4) {
        this.f28777E = i4;
        this.f28778F = iBinder;
        this.f28779G = c1231c;
        this.f28780H = z3;
        this.f28781I = z4;
    }

    public final C1231c c0() {
        return this.f28779G;
    }

    @androidx.annotation.P
    public final InterfaceC1268p e0() {
        IBinder iBinder = this.f28778F;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1268p.a.A(iBinder);
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1259k0)) {
            return false;
        }
        C1259k0 c1259k0 = (C1259k0) obj;
        if (!this.f28779G.equals(c1259k0.f28779G) || !C1281w.b(e0(), c1259k0.e0())) {
            return false;
        }
        return true;
    }

    public final boolean i0() {
        return this.f28780H;
    }

    public final boolean u0() {
        return this.f28781I;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28777E);
        K0.b.B(parcel, 2, this.f28778F, false);
        K0.b.S(parcel, 3, this.f28779G, i4, false);
        K0.b.g(parcel, 4, this.f28780H);
        K0.b.g(parcel, 5, this.f28781I);
        K0.b.b(parcel, a4);
    }
}
