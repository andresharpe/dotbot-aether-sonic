package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1592t0 implements Parcelable.Creator<C1591t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1591t createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList arrayList = null;
        boolean z3 = false;
        boolean z4 = false;
        C1588r0 c1588r0 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 5) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            c1588r0 = (C1588r0) SafeParcelReader.C(parcel, X3, C1588r0.CREATOR);
                        }
                    } else {
                        z4 = SafeParcelReader.P(parcel, X3);
                    }
                } else {
                    z3 = SafeParcelReader.P(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1591t(arrayList, z3, z4, c1588r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1591t[] newArray(int i4) {
        return new C1591t[i4];
    }
}
