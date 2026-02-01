package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1600x0 implements Parcelable.Creator<C1598w0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1598w0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 1;
        int i5 = 1;
        long j4 = -1;
        long j5 = -1;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            j5 = SafeParcelReader.c0(parcel, X3);
                        }
                    } else {
                        j4 = SafeParcelReader.c0(parcel, X3);
                    }
                } else {
                    i5 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1598w0(i4, i5, j4, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1598w0[] newArray(int i4) {
        return new C1598w0[i4];
    }
}
