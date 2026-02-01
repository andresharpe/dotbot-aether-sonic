package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class L0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        B b4 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    b4 = (B) SafeParcelReader.C(parcel, X3, B.CREATOR);
                    break;
                case 2:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 3:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 4:
                    iArr = SafeParcelReader.u(parcel, X3);
                    break;
                case 5:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.u(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1252h(b4, z3, z4, iArr, i4, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1252h[i4];
    }
}
