package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class K implements Parcelable.Creator<C1248f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1248f createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1248f(i4, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1248f[] newArray(int i4) {
        return new C1248f[i4];
    }
}
