package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.C1259k0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        C1231c c1231c = null;
        C1259k0 c1259k0 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        c1259k0 = (C1259k0) SafeParcelReader.C(parcel, X3, C1259k0.CREATOR);
                    }
                } else {
                    c1231c = (C1231c) SafeParcelReader.C(parcel, X3, C1231c.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new l(i4, c1231c, c1259k0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i4) {
        return new l[i4];
    }
}
