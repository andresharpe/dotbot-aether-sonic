package com.google.android.gms.measurement.internal;

import K0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

@c.a(creator = "EventParamsCreator")
@c.g({1})
/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1724u extends K0.a implements Iterable<String> {
    public static final Parcelable.Creator<C1724u> CREATOR = new C1730v();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "z", id = 2)
    private final Bundle f30988E;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1724u(@c.e(id = 2) Bundle bundle) {
        this.f30988E = bundle;
    }

    public final int c0() {
        return this.f30988E.size();
    }

    public final Bundle i0() {
        return new Bundle(this.f30988E);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C1718t(this);
    }

    public final String toString() {
        return this.f30988E.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double u0(String str) {
        return Double.valueOf(this.f30988E.getDouble("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.k(parcel, 2, i0(), false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long x0(String str) {
        return Long.valueOf(this.f30988E.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object y0(String str) {
        return this.f30988E.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String z0(String str) {
        return this.f30988E.getString(str);
    }
}
