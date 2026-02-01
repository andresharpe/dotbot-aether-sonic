package com.google.android.gms.common.internal;

import K0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1233e;

@c.a(creator = "ConnectionInfoCreator")
/* loaded from: classes.dex */
public final class J0 extends K0.a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    Bundle f28627E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    C1233e[] f28628F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = com.harman.jbl.partybox.ui.effectlab.a.f43472q, id = 3)
    int f28629G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 4)
    C1252h f28630H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public J0(@c.e(id = 1) Bundle bundle, @c.e(id = 2) C1233e[] c1233eArr, @c.e(id = 3) int i4, @c.e(id = 4) @androidx.annotation.P C1252h c1252h) {
        this.f28627E = bundle;
        this.f28628F = c1233eArr;
        this.f28629G = i4;
        this.f28630H = c1252h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.k(parcel, 1, this.f28627E, false);
        K0.b.c0(parcel, 2, this.f28628F, i4, false);
        K0.b.F(parcel, 3, this.f28629G);
        K0.b.S(parcel, 4, this.f28630H, i4, false);
        K0.b.b(parcel, a4);
    }

    public J0() {
    }
}
