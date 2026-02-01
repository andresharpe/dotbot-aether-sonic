package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<g0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        e0 e0Var = null;
        int i4 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            iBinder2 = SafeParcelReader.Y(parcel, X3);
                        }
                    } else {
                        iBinder = SafeParcelReader.Y(parcel, X3);
                    }
                } else {
                    e0Var = (e0) SafeParcelReader.C(parcel, X3, e0.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new g0(i4, e0Var, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g0[] newArray(int i4) {
        return new g0[i4];
    }
}
