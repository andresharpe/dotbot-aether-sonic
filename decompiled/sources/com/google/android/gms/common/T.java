package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        boolean z3 = false;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            i4 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        i5 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                z3 = SafeParcelReader.P(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new S(z3, str, i5, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new S[i4];
    }
}
