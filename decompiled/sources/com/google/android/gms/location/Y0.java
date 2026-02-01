package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class Y0 implements Parcelable.Creator<X0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ X0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        boolean z3 = true;
        long j4 = 50;
        float f4 = 0.0f;
        long j5 = Long.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
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
                                i4 = SafeParcelReader.Z(parcel, X3);
                            }
                        } else {
                            j5 = SafeParcelReader.c0(parcel, X3);
                        }
                    } else {
                        f4 = SafeParcelReader.V(parcel, X3);
                    }
                } else {
                    j4 = SafeParcelReader.c0(parcel, X3);
                }
            } else {
                z3 = SafeParcelReader.P(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new X0(z3, j4, f4, j5, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ X0[] newArray(int i4) {
        return new X0[i4];
    }
}
