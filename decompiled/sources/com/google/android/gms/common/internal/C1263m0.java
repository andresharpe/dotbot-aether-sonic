package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

@c.a(creator = "SignInButtonConfigCreator")
/* renamed from: com.google.android.gms.common.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263m0 extends K0.a {
    public static final Parcelable.Creator<C1263m0> CREATOR = new C1265n0();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28791E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getButtonSize", id = 2)
    private final int f28792F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getColorScheme", id = 3)
    private final int f28793G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getScopes", id = 4)
    @Deprecated
    private final Scope[] f28794H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1263m0(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) int i6, @c.e(id = 4) @androidx.annotation.P Scope[] scopeArr) {
        this.f28791E = i4;
        this.f28792F = i5;
        this.f28793G = i6;
        this.f28794H = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28791E);
        K0.b.F(parcel, 2, this.f28792F);
        K0.b.F(parcel, 3, this.f28793G);
        K0.b.c0(parcel, 4, this.f28794H, i4, false);
        K0.b.b(parcel, a4);
    }
}
