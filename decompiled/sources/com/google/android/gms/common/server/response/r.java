package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        str = SafeParcelReader.G(parcel, X3);
                    }
                } else {
                    arrayList = SafeParcelReader.L(parcel, X3, o.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new q(i4, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i4) {
        return new q[i4];
    }
}
