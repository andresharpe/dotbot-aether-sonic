package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "ActivityTransitionEventCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1562e extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1562e> CREATOR = new R0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getActivityType", id = 1)
    private final int f29986E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTransitionType", id = 2)
    private final int f29987F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getElapsedRealTimeNanos", id = 3)
    private final long f29988G;

    @c.b
    public C1562e(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) long j4) {
        C1560d.i0(i5);
        this.f29986E = i4;
        this.f29987F = i5;
        this.f29988G = j4;
    }

    public int c0() {
        return this.f29986E;
    }

    public long e0() {
        return this.f29988G;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1562e)) {
            return false;
        }
        C1562e c1562e = (C1562e) obj;
        if (this.f29986E == c1562e.f29986E && this.f29987F == c1562e.f29987F && this.f29988G == c1562e.f29988G) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29986E), Integer.valueOf(this.f29987F), Long.valueOf(this.f29988G));
    }

    public int i0() {
        return this.f29987F;
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i4 = this.f29986E;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i4);
        sb.append(sb2.toString());
        sb.append(" ");
        int i5 = this.f29987F;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i5);
        sb.append(sb3.toString());
        sb.append(" ");
        long j4 = this.f29988G;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j4);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, c0());
        K0.b.F(parcel, 2, i0());
        K0.b.K(parcel, 3, e0());
        K0.b.b(parcel, a4);
    }
}
