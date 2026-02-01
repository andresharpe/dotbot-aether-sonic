package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class K0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        C1252h c1252h = null;
        int i4 = 0;
        C1233e[] c1233eArr = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            c1252h = (C1252h) SafeParcelReader.C(parcel, X3, C1252h.CREATOR);
                        }
                    } else {
                        i4 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    c1233eArr = (C1233e[]) SafeParcelReader.K(parcel, X3, C1233e.CREATOR);
                }
            } else {
                bundle = SafeParcelReader.g(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new J0(bundle, c1233eArr, i4, c1252h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new J0[i4];
    }
}
