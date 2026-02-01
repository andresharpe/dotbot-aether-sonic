package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261l0 implements Parcelable.Creator<C1259k0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1259k0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        IBinder iBinder = null;
        C1231c c1231c = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            if (O3 != 5) {
                                SafeParcelReader.h0(parcel, X3);
                            } else {
                                z4 = SafeParcelReader.P(parcel, X3);
                            }
                        } else {
                            z3 = SafeParcelReader.P(parcel, X3);
                        }
                    } else {
                        c1231c = (C1231c) SafeParcelReader.C(parcel, X3, C1231c.CREATOR);
                    }
                } else {
                    iBinder = SafeParcelReader.Y(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1259k0(i4, iBinder, c1231c, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1259k0[] newArray(int i4) {
        return new C1259k0[i4];
    }
}
