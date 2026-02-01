package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1255i0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        C1255i0 c1255i0 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    c1255i0 = (C1255i0) SafeParcelReader.C(parcel, X3, C1255i0.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new j(i4, c1255i0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i4) {
        return new j[i4];
    }
}
