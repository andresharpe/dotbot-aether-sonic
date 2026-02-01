package com.google.android.gms.common.server.response;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.response.a;

@c.a(creator = "FieldMapPairCreator")
@D
/* loaded from: classes.dex */
public final class p extends K0.a {
    public static final Parcelable.Creator<p> CREATOR = new n();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28935E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    final String f28936F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    final a.C0271a<?, ?> f28937G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public p(@c.e(id = 1) int i4, @c.e(id = 2) String str, @c.e(id = 3) a.C0271a<?, ?> c0271a) {
        this.f28935E = i4;
        this.f28936F = str;
        this.f28937G = c0271a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28935E);
        K0.b.Y(parcel, 2, this.f28936F, false);
        K0.b.S(parcel, 3, this.f28937G, i4, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(String str, a.C0271a<?, ?> c0271a) {
        this.f28935E = 1;
        this.f28936F = str;
        this.f28937G = c0271a;
    }
}
