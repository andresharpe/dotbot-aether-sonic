package com.google.android.gms.internal.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@c.a(creator = "LocationRequestInternalCreator")
@c.g({1000, 2, 3, 4})
/* loaded from: classes.dex */
public final class C extends K0.a {

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 1)
    final LocationRequest f29166E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", id = 5)
    final List<C1248f> f29167F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 6)
    final String f29168G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", id = 7)
    final boolean f29169H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", id = 8)
    final boolean f29170I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", id = 9)
    final boolean f29171J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 10)
    final String f29172K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = L1.a.t3, id = 11)
    final boolean f29173L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = L1.a.t3, id = 12)
    boolean f29174M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 13)
    String f29175N;

    /* renamed from: O, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_MAX_LOCATION_AGE_MILLIS", id = 14)
    long f29176O;

    /* renamed from: P, reason: collision with root package name */
    static final List<C1248f> f29165P = Collections.emptyList();
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C(@c.e(id = 1) LocationRequest locationRequest, @c.e(id = 5) List<C1248f> list, @c.e(id = 6) @androidx.annotation.P String str, @c.e(id = 7) boolean z3, @c.e(id = 8) boolean z4, @c.e(id = 9) boolean z5, @c.e(id = 10) @androidx.annotation.P String str2, @c.e(id = 11) boolean z6, @c.e(id = 12) boolean z7, @c.e(id = 13) @androidx.annotation.P String str3, @c.e(id = 14) long j4) {
        this.f29166E = locationRequest;
        this.f29167F = list;
        this.f29168G = str;
        this.f29169H = z3;
        this.f29170I = z4;
        this.f29171J = z5;
        this.f29172K = str2;
        this.f29173L = z6;
        this.f29174M = z7;
        this.f29175N = str3;
        this.f29176O = j4;
    }

    public static C c0(@androidx.annotation.P String str, LocationRequest locationRequest) {
        return new C(locationRequest, f29165P, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final C e0(long j4) {
        if (this.f29166E.x0() <= this.f29166E.u0()) {
            this.f29176O = 10000L;
            return this;
        }
        long u02 = this.f29166E.u0();
        long x02 = this.f29166E.x0();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(u02);
        sb.append("maxWaitTime=");
        sb.append(x02);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof C) {
            C c4 = (C) obj;
            if (C1281w.b(this.f29166E, c4.f29166E) && C1281w.b(this.f29167F, c4.f29167F) && C1281w.b(this.f29168G, c4.f29168G) && this.f29169H == c4.f29169H && this.f29170I == c4.f29170I && this.f29171J == c4.f29171J && C1281w.b(this.f29172K, c4.f29172K) && this.f29173L == c4.f29173L && this.f29174M == c4.f29174M && C1281w.b(this.f29175N, c4.f29175N)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29166E.hashCode();
    }

    public final C i0(@androidx.annotation.P String str) {
        this.f29175N = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29166E);
        if (this.f29168G != null) {
            sb.append(" tag=");
            sb.append(this.f29168G);
        }
        if (this.f29172K != null) {
            sb.append(" moduleId=");
            sb.append(this.f29172K);
        }
        if (this.f29175N != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f29175N);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f29169H);
        sb.append(" clients=");
        sb.append(this.f29167F);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f29170I);
        if (this.f29171J) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f29173L) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f29174M) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final C u0(boolean z3) {
        this.f29174M = true;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, this.f29166E, i4, false);
        K0.b.d0(parcel, 5, this.f29167F, false);
        K0.b.Y(parcel, 6, this.f29168G, false);
        K0.b.g(parcel, 7, this.f29169H);
        K0.b.g(parcel, 8, this.f29170I);
        K0.b.g(parcel, 9, this.f29171J);
        K0.b.Y(parcel, 10, this.f29172K, false);
        K0.b.g(parcel, 11, this.f29173L);
        K0.b.g(parcel, 12, this.f29174M);
        K0.b.Y(parcel, 13, this.f29175N, false);
        K0.b.K(parcel, 14, this.f29176O);
        K0.b.b(parcel, a4);
    }
}
