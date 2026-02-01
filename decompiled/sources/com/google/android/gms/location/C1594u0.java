package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1594u0 implements Parcelable.Creator<C1595v> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1595v createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Status status = null;
        C1597w c1597w = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    c1597w = (C1597w) SafeParcelReader.C(parcel, X3, C1597w.CREATOR);
                }
            } else {
                status = (Status) SafeParcelReader.C(parcel, X3, Status.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1595v(status, c1597w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1595v[] newArray(int i4) {
        return new C1595v[i4];
    }
}
