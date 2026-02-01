package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1579m0 implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 1000;
        int i5 = 1;
        int i6 = 1;
        long j4 = 0;
        C1598w0[] c1598w0Arr = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            if (O3 != 5) {
                                SafeParcelReader.h0(parcel, X3);
                            } else {
                                c1598w0Arr = (C1598w0[]) SafeParcelReader.K(parcel, X3, C1598w0.CREATOR);
                            }
                        } else {
                            i4 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        j4 = SafeParcelReader.c0(parcel, X3);
                    }
                } else {
                    i6 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i5 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new LocationAvailability(i4, i5, i6, j4, c1598w0Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i4) {
        return new LocationAvailability[i4];
    }
}
