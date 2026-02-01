package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class Q0 implements Parcelable.Creator<C1560d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1560d createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    i5 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1560d(i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1560d[] newArray(int i4) {
        return new C1560d[i4];
    }
}
