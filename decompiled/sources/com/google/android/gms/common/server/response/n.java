package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        String str = null;
        a.C0271a c0271a = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        c0271a = (a.C0271a) SafeParcelReader.C(parcel, X3, a.C0271a.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new p(i4, str, c0271a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i4) {
        return new p[i4];
    }
}
