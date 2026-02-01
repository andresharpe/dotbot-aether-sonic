package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1476q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        long j4 = 0;
        long j5 = 0;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 2:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 3:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 5:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 6:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, X3);
                    break;
                case 8:
                    str4 = SafeParcelReader.G(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1468p0(j4, j5, z3, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1468p0[i4];
    }
}
