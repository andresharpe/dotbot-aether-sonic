package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = null;
        int i4 = 0;
        long j4 = -1;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        j4 = SafeParcelReader.c0(parcel, X3);
                    }
                } else {
                    i4 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                str = SafeParcelReader.G(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1233e(str, i4, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1233e[i4];
    }
}
