package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<C1158a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1158a createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X3) != 1) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                intent = (Intent) SafeParcelReader.C(parcel, X3, Intent.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1158a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1158a[] newArray(int i4) {
        return new C1158a[i4];
    }
}
