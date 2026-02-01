package com.google.android.gms.common;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

@c.a(creator = "GoogleCertificatesLookupResponseCreator")
/* loaded from: classes.dex */
public final class S extends K0.a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getResult", id = 1)
    private final boolean f27978E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getErrorMessage", id = 2)
    @Nullable
    private final String f27979F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatusValue", id = 3)
    private final int f27980G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getFirstPartyStatusValue", id = 4)
    private final int f27981H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public S(@c.e(id = 1) boolean z3, @c.e(id = 2) String str, @c.e(id = 3) int i4, @c.e(id = 4) int i5) {
        this.f27978E = z3;
        this.f27979F = str;
        this.f27980G = a0.a(i4) - 1;
        this.f27981H = E.a(i5) - 1;
    }

    @Nullable
    public final String c0() {
        return this.f27979F;
    }

    public final boolean e0() {
        return this.f27978E;
    }

    public final int i0() {
        return E.a(this.f27981H);
    }

    public final int u0() {
        return a0.a(this.f27980G);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.g(parcel, 1, this.f27978E);
        K0.b.Y(parcel, 2, this.f27979F, false);
        K0.b.F(parcel, 3, this.f27980G);
        K0.b.F(parcel, 4, this.f27981H);
        K0.b.b(parcel, a4);
    }
}
