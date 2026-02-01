package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class G0 implements Parcelable.Creator<F0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ F0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            i7 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        i6 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    i5 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new F0(i4, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ F0[] newArray(int i4) {
        return new F0[i4];
    }
}
