package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324c implements Parcelable.Creator<C1323b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1323b createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Status status = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X3) != 1) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                status = (Status) SafeParcelReader.C(parcel, X3, Status.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1323b(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1323b[] newArray(int i4) {
        return new C1323b[i4];
    }
}
