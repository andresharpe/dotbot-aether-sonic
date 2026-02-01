package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            if (O3 != 1000) {
                                SafeParcelReader.h0(parcel, X3);
                            } else {
                                i4 = SafeParcelReader.Z(parcel, X3);
                            }
                        } else {
                            bundle = SafeParcelReader.g(parcel, X3);
                        }
                    } else {
                        i5 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.K(parcel, X3, CursorWindow.CREATOR);
                }
            } else {
                strArr = SafeParcelReader.H(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        DataHolder dataHolder = new DataHolder(i4, strArr, cursorWindowArr, i5, bundle);
        dataHolder.h1();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i4) {
        return new DataHolder[i4];
    }
}
