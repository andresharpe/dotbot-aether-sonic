package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.util.List;

@c.a(creator = "SleepSegmentRequestCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public class E extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<E> CREATOR = new E0();

    /* renamed from: G, reason: collision with root package name */
    public static final int f29883G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final int f29884H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f29885I = 2;

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getUserPreferredSleepWindow", id = 1)
    private final List<F0> f29886E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = com.harman.jbl.partybox.ui.effectlab.a.f43472q, getter = "getRequestedDataType", id = 2)
    private final int f29887F;

    public E(int i4) {
        this(null, i4);
    }

    @androidx.annotation.N
    public static E c0() {
        return new E(null, 0);
    }

    public int e0() {
        return this.f29887F;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        if (C1281w.b(this.f29886E, e4.f29886E) && this.f29887F == e4.f29887F) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(this.f29886E, Integer.valueOf(this.f29887F));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, this.f29886E, false);
        K0.b.F(parcel, 2, e0());
        K0.b.b(parcel, a4);
    }

    @com.google.android.gms.common.internal.D
    @c.b
    public E(@c.e(id = 1) @androidx.annotation.P List<F0> list, @c.e(id = 2) int i4) {
        this.f29886E = list;
        this.f29887F = i4;
    }
}
