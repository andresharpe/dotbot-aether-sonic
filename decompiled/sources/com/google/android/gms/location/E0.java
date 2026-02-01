package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class E0 implements Parcelable.Creator<E> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ E createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList arrayList = null;
        int i4 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    i4 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, F0.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new E(arrayList, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ E[] newArray(int i4) {
        return new E[i4];
    }
}
