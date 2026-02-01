package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

@c.a(creator = "LocationAvailabilityCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public final class LocationAvailability extends K0.a implements ReflectedParcelable {

    @androidx.annotation.N
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C1579m0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    @Deprecated
    int f29916E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    @Deprecated
    int f29917F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = com.harman.jbl.partybox.ui.effectlab.a.f43472q, id = 3)
    long f29918G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    int f29919H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(id = 5)
    C1598w0[] f29920I;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public LocationAvailability(@c.e(id = 4) int i4, @c.e(id = 1) int i5, @c.e(id = 2) int i6, @c.e(id = 3) long j4, @c.e(id = 5) C1598w0[] c1598w0Arr) {
        this.f29919H = i4;
        this.f29916E = i5;
        this.f29917F = i6;
        this.f29918G = j4;
        this.f29920I = c1598w0Arr;
    }

    @androidx.annotation.N
    public static LocationAvailability c0(@androidx.annotation.N Intent intent) {
        if (!e0(intent)) {
            return null;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return (LocationAvailability) extras.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean e0(@androidx.annotation.N Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(@androidx.annotation.N Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f29916E == locationAvailability.f29916E && this.f29917F == locationAvailability.f29917F && this.f29918G == locationAvailability.f29918G && this.f29919H == locationAvailability.f29919H && Arrays.equals(this.f29920I, locationAvailability.f29920I)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29919H), Integer.valueOf(this.f29916E), Integer.valueOf(this.f29917F), Long.valueOf(this.f29918G), this.f29920I);
    }

    public boolean i0() {
        return this.f29919H < 1000;
    }

    @androidx.annotation.N
    public String toString() {
        boolean i02 = i0();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(i02);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29916E);
        K0.b.F(parcel, 2, this.f29917F);
        K0.b.K(parcel, 3, this.f29918G);
        K0.b.F(parcel, 4, this.f29919H);
        K0.b.c0(parcel, 5, this.f29920I, i4, false);
        K0.b.b(parcel, a4);
    }
}
