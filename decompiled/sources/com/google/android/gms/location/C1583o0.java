package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1583o0 implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        List<Location> list = LocationResult.f29934F;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X3) != 1) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                list = SafeParcelReader.L(parcel, X3, Location.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i4) {
        return new LocationResult[i4];
    }
}
