package com.google.android.gms.common;

import K0.c;
import N0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;

@c.a(creator = "FeatureCreator")
@I0.a
/* renamed from: com.google.android.gms.common.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1233e extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1233e> CREATOR = new D();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getName", id = 1)
    private final String f28541E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int f28542F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long f28543G;

    @c.b
    public C1233e(@c.e(id = 1) @androidx.annotation.N String str, @c.e(id = 2) int i4, @c.e(id = 3) long j4) {
        this.f28541E = str;
        this.f28542F = i4;
        this.f28543G = j4;
    }

    @I0.a
    @androidx.annotation.N
    public String c0() {
        return this.f28541E;
    }

    @I0.a
    public long e0() {
        long j4 = this.f28543G;
        return j4 == -1 ? this.f28542F : j4;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof C1233e) {
            C1233e c1233e = (C1233e) obj;
            if (((c0() != null && c0().equals(c1233e.c0())) || (c0() == null && c1233e.c0() == null)) && e0() == c1233e.e0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(c0(), Long.valueOf(e0()));
    }

    @androidx.annotation.N
    public final String toString() {
        C1281w.a d4 = C1281w.d(this);
        d4.a(a.C0015a.f1688b, c0());
        d4.a("version", Long.valueOf(e0()));
        return d4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 1, c0(), false);
        K0.b.F(parcel, 2, this.f28542F);
        K0.b.K(parcel, 3, e0());
        K0.b.b(parcel, a4);
    }

    @I0.a
    public C1233e(@androidx.annotation.N String str, long j4) {
        this.f28541E = str;
        this.f28543G = j4;
        this.f28542F = -1;
    }
}
