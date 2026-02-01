package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;

@c.a(creator = "NetworkLocationStatusCreator")
@com.google.android.gms.common.internal.D
/* renamed from: com.google.android.gms.location.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1598w0 extends K0.a {
    public static final Parcelable.Creator<C1598w0> CREATOR = new C1600x0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int f30073E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int f30074F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long f30075G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long f30076H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1598w0(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) long j4, @c.e(id = 4) long j5) {
        this.f30073E = i4;
        this.f30074F = i5;
        this.f30075G = j4;
        this.f30076H = j5;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof C1598w0) {
            C1598w0 c1598w0 = (C1598w0) obj;
            if (this.f30073E == c1598w0.f30073E && this.f30074F == c1598w0.f30074F && this.f30075G == c1598w0.f30075G && this.f30076H == c1598w0.f30076H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(Integer.valueOf(this.f30074F), Integer.valueOf(this.f30073E), Long.valueOf(this.f30076H), Long.valueOf(this.f30075G));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f30073E + " Cell status: " + this.f30074F + " elapsed time NS: " + this.f30076H + " system time ms: " + this.f30075G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f30073E);
        K0.b.F(parcel, 2, this.f30074F);
        K0.b.K(parcel, 3, this.f30075G);
        K0.b.K(parcel, 4, this.f30076H);
        K0.b.b(parcel, a4);
    }
}
