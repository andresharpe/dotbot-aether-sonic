package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        Intent intent = null;
        int i5 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        intent = (Intent) SafeParcelReader.C(parcel, X3, Intent.CREATOR);
                    }
                } else {
                    i5 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new b(i4, i5, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i4) {
        return new b[i4];
    }
}
