package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class U0 implements Parcelable.Creator<C1566g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1566g createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    bundle = SafeParcelReader.g(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, C1562e.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1566g(arrayList, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1566g[] newArray(int i4) {
        return new C1566g[i4];
    }
}
