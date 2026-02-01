package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        Parcel parcel2 = null;
        q qVar = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        qVar = (q) SafeParcelReader.C(parcel, X3, q.CREATOR);
                    }
                } else {
                    parcel2 = SafeParcelReader.y(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new c(i4, parcel2, qVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i4) {
        return new c[i4];
    }
}
