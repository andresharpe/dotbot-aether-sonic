package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;

@c.a(creator = "ClientIdentityCreator")
@I0.a
@c.g({1000})
/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1248f extends K0.a {

    @I0.a
    @androidx.annotation.N
    public static final Parcelable.Creator<C1248f> CREATOR = new K();

    /* renamed from: E, reason: collision with root package name */
    @I0.a
    @c.InterfaceC0014c(defaultValueUnchecked = com.harman.jbl.partybox.ui.effectlab.a.f43472q, id = 1)
    public final int f28727E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @I0.a
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 2)
    public final String f28728F;

    @c.b
    public C1248f(@c.e(id = 1) int i4, @c.e(id = 2) @androidx.annotation.P String str) {
        this.f28727E = i4;
        this.f28728F = str;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1248f)) {
            return false;
        }
        C1248f c1248f = (C1248f) obj;
        if (c1248f.f28727E == this.f28727E && C1281w.b(c1248f.f28728F, this.f28728F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28727E;
    }

    @androidx.annotation.N
    public final String toString() {
        int i4 = this.f28727E;
        String str = this.f28728F;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i4);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28727E);
        K0.b.Y(parcel, 2, this.f28728F, false);
        K0.b.b(parcel, a4);
    }
}
