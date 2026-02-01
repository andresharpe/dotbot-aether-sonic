package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    arrayList = SafeParcelReader.L(parcel, X3, d.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new a(i4, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i4) {
        return new a[i4];
    }
}
