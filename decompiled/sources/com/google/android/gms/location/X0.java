package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1281w;

@c.a(creator = "DeviceOrientationRequestCreator")
@com.google.android.gms.common.internal.D
/* loaded from: classes2.dex */
public final class X0 extends K0.a {
    public static final Parcelable.Creator<X0> CREATOR = new Y0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", id = 1)
    boolean f29952E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", id = 2)
    long f29953F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", id = 3)
    float f29954G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", id = 4)
    long f29955H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", id = 5)
    int f29956I;

    public X0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        if (this.f29952E == x02.f29952E && this.f29953F == x02.f29953F && Float.compare(this.f29954G, x02.f29954G) == 0 && this.f29955H == x02.f29955H && this.f29956I == x02.f29956I) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(Boolean.valueOf(this.f29952E), Long.valueOf(this.f29953F), Float.valueOf(this.f29954G), Long.valueOf(this.f29955H), Integer.valueOf(this.f29956I));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f29952E);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f29953F);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f29954G);
        long j4 = this.f29955H;
        if (j4 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j4 - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f29956I != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f29956I);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.g(parcel, 1, this.f29952E);
        K0.b.K(parcel, 2, this.f29953F);
        K0.b.w(parcel, 3, this.f29954G);
        K0.b.K(parcel, 4, this.f29955H);
        K0.b.F(parcel, 5, this.f29956I);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public X0(@c.e(id = 1) boolean z3, @c.e(id = 2) long j4, @c.e(id = 3) float f4, @c.e(id = 4) long j5, @c.e(id = 5) int i4) {
        this.f29952E = z3;
        this.f29953F = j4;
        this.f29954G = f4;
        this.f29955H = j5;
        this.f29956I = i4;
    }
}
