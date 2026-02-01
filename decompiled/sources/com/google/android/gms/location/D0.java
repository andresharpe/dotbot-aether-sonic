package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class D0 implements Parcelable.Creator<D> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ D createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        long j4 = 0;
        long j5 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
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
                                i6 = SafeParcelReader.Z(parcel, X3);
                            }
                        } else {
                            i5 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        i4 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    j5 = SafeParcelReader.c0(parcel, X3);
                }
            } else {
                j4 = SafeParcelReader.c0(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new D(j4, j5, i4, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ D[] newArray(int i4) {
        return new D[i4];
    }
}
