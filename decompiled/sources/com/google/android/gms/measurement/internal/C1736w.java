package com.google.android.gms.measurement.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "EventParcelCreator")
@c.g({1})
/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1736w extends K0.a {
    public static final Parcelable.Creator<C1736w> CREATOR = new C1742x();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    public final String f31012E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    public final C1724u f31013F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 4)
    public final String f31014G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(id = 5)
    public final long f31015H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1736w(C1736w c1736w, long j4) {
        C1285y.l(c1736w);
        this.f31012E = c1736w.f31012E;
        this.f31013F = c1736w.f31013F;
        this.f31014G = c1736w.f31014G;
        this.f31015H = j4;
    }

    public final String toString() {
        return "origin=" + this.f31014G + ",name=" + this.f31012E + ",params=" + String.valueOf(this.f31013F);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        C1742x.a(this, parcel, i4);
    }

    @c.b
    public C1736w(@c.e(id = 2) String str, @c.e(id = 3) C1724u c1724u, @c.e(id = 4) String str2, @c.e(id = 5) long j4) {
        this.f31012E = str;
        this.f31013F = c1724u;
        this.f31014G = str2;
        this.f31015H = j4;
    }
}
