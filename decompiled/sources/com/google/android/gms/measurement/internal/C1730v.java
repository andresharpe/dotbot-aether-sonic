package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1730v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X3) != 2) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                bundle = SafeParcelReader.g(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1724u(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1724u[i4];
    }
}
