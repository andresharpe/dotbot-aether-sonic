package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@c.a(creator = "LocationResultCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public final class LocationResult extends K0.a implements ReflectedParcelable {

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    private final List<Location> f29935E;

    /* renamed from: F, reason: collision with root package name */
    static final List<Location> f29934F = Collections.emptyList();

    @androidx.annotation.N
    public static final Parcelable.Creator<LocationResult> CREATOR = new C1583o0();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public LocationResult(@c.e(id = 1) List<Location> list) {
        this.f29935E = list;
    }

    @androidx.annotation.N
    public static LocationResult c0(@androidx.annotation.N List<Location> list) {
        if (list == null) {
            list = f29934F;
        }
        return new LocationResult(list);
    }

    @androidx.annotation.N
    public static LocationResult e0(@androidx.annotation.N Intent intent) {
        if (!x0(intent)) {
            return null;
        }
        return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public static boolean x0(@androidx.annotation.N Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public boolean equals(@androidx.annotation.N Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f29935E.size() != this.f29935E.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f29935E.iterator();
        Iterator<Location> it2 = this.f29935E.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<Location> it = this.f29935E.iterator();
        int i4 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i4 = (i4 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i4;
    }

    @androidx.annotation.N
    public Location i0() {
        int size = this.f29935E.size();
        if (size == 0) {
            return null;
        }
        return this.f29935E.get(size - 1);
    }

    @androidx.annotation.N
    public String toString() {
        String valueOf = String.valueOf(this.f29935E);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @androidx.annotation.N
    public List<Location> u0() {
        return this.f29935E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, u0(), false);
        K0.b.b(parcel, a4);
    }
}
