package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.ReflectedParcelable;

@c.a(creator = "LocationRequestCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public final class LocationRequest extends K0.a implements ReflectedParcelable {

    @androidx.annotation.N
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C1581n0();

    /* renamed from: N, reason: collision with root package name */
    public static final int f29921N = 100;

    /* renamed from: O, reason: collision with root package name */
    public static final int f29922O = 102;

    /* renamed from: P, reason: collision with root package name */
    public static final int f29923P = 104;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f29924Q = 105;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", id = 1)
    int f29925E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long f29926F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long f29927G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", id = 4)
    boolean f29928H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", id = 5)
    long f29929I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", id = 6)
    int f29930J;

    /* renamed from: K, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", id = 7)
    float f29931K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", id = 8)
    long f29932L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.t3, id = 9)
    boolean f29933M;

    @Deprecated
    public LocationRequest() {
        this.f29925E = 102;
        this.f29926F = 3600000L;
        this.f29927G = 600000L;
        this.f29928H = false;
        this.f29929I = Long.MAX_VALUE;
        this.f29930J = Integer.MAX_VALUE;
        this.f29931K = 0.0f;
        this.f29932L = 0L;
        this.f29933M = false;
    }

    @androidx.annotation.N
    public static LocationRequest c0() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.l1(true);
        return locationRequest;
    }

    private static void m1(long j4) {
        if (j4 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString());
    }

    public float B0() {
        return this.f29931K;
    }

    public boolean E0() {
        return this.f29928H;
    }

    public boolean F0() {
        return this.f29933M;
    }

    @androidx.annotation.N
    public LocationRequest M0(long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = Long.MAX_VALUE;
        if (j4 <= Long.MAX_VALUE - elapsedRealtime) {
            j5 = j4 + elapsedRealtime;
        }
        this.f29929I = j5;
        if (j5 < 0) {
            this.f29929I = 0L;
        }
        return this;
    }

    @androidx.annotation.N
    public LocationRequest Y0(long j4) {
        this.f29929I = j4;
        if (j4 < 0) {
            this.f29929I = 0L;
        }
        return this;
    }

    @androidx.annotation.N
    public LocationRequest a1(long j4) {
        m1(j4);
        this.f29928H = true;
        this.f29927G = j4;
        return this;
    }

    public long e0() {
        return this.f29929I;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f29925E == locationRequest.f29925E && this.f29926F == locationRequest.f29926F && this.f29927G == locationRequest.f29927G && this.f29928H == locationRequest.f29928H && this.f29929I == locationRequest.f29929I && this.f29930J == locationRequest.f29930J && this.f29931K == locationRequest.f29931K && x0() == locationRequest.x0() && this.f29933M == locationRequest.f29933M) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.N
    public LocationRequest f1(long j4) {
        m1(j4);
        this.f29926F = j4;
        if (!this.f29928H) {
            this.f29927G = (long) (j4 / 6.0d);
        }
        return this;
    }

    @androidx.annotation.N
    public LocationRequest h1(long j4) {
        m1(j4);
        this.f29932L = j4;
        return this;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29925E), Long.valueOf(this.f29926F), Float.valueOf(this.f29931K), Long.valueOf(this.f29932L));
    }

    public long i0() {
        return this.f29927G;
    }

    @androidx.annotation.N
    public LocationRequest i1(int i4) {
        if (i4 > 0) {
            this.f29930J = i4;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    @androidx.annotation.N
    public LocationRequest j1(int i4) {
        if (i4 != 100 && i4 != 102 && i4 != 104 && i4 != 105) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("invalid quality: ");
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f29925E = i4;
        return this;
    }

    @androidx.annotation.N
    public LocationRequest k1(float f4) {
        if (f4 >= 0.0f) {
            this.f29931K = f4;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f4);
        throw new IllegalArgumentException(sb.toString());
    }

    @androidx.annotation.N
    public LocationRequest l1(boolean z3) {
        this.f29933M = z3;
        return this;
    }

    @androidx.annotation.N
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i4 = this.f29925E;
        if (i4 != 100) {
            if (i4 != 102) {
                if (i4 != 104) {
                    if (i4 != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb.append(str);
        if (this.f29925E != 105) {
            sb.append(" requested=");
            sb.append(this.f29926F);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f29927G);
        sb.append("ms");
        if (this.f29932L > this.f29926F) {
            sb.append(" maxWait=");
            sb.append(this.f29932L);
            sb.append("ms");
        }
        if (this.f29931K > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f29931K);
            sb.append("m");
        }
        long j4 = this.f29929I;
        if (j4 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j4 - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f29930J != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f29930J);
        }
        sb.append(']');
        return sb.toString();
    }

    public long u0() {
        return this.f29926F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29925E);
        K0.b.K(parcel, 2, this.f29926F);
        K0.b.K(parcel, 3, this.f29927G);
        K0.b.g(parcel, 4, this.f29928H);
        K0.b.K(parcel, 5, this.f29929I);
        K0.b.F(parcel, 6, this.f29930J);
        K0.b.w(parcel, 7, this.f29931K);
        K0.b.K(parcel, 8, this.f29932L);
        K0.b.g(parcel, 9, this.f29933M);
        K0.b.b(parcel, a4);
    }

    public long x0() {
        long j4 = this.f29932L;
        long j5 = this.f29926F;
        return j4 < j5 ? j5 : j4;
    }

    public int y0() {
        return this.f29930J;
    }

    public int z0() {
        return this.f29925E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public LocationRequest(@c.e(id = 1) int i4, @c.e(id = 2) long j4, @c.e(id = 3) long j5, @c.e(id = 4) boolean z3, @c.e(id = 5) long j6, @c.e(id = 6) int i5, @c.e(id = 7) float f4, @c.e(id = 8) long j7, @c.e(id = 9) boolean z4) {
        this.f29925E = i4;
        this.f29926F = j4;
        this.f29927G = j5;
        this.f29928H = z3;
        this.f29929I = j6;
        this.f29930J = i5;
        this.f29931K = f4;
        this.f29932L = j7;
        this.f29933M = z4;
    }
}
