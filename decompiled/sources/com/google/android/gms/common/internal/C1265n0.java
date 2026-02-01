package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265n0 implements Parcelable.Creator<C1263m0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1263m0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        Scope[] scopeArr = null;
        int i6 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            scopeArr = (Scope[]) SafeParcelReader.K(parcel, X3, Scope.CREATOR);
                        }
                    } else {
                        i5 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    i6 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1263m0(i4, i6, i5, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1263m0[] newArray(int i4) {
        return new C1263m0[i4];
    }
}
