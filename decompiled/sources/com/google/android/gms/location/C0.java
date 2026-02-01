package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class C0 implements Parcelable.Creator<C> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z3 = false;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    i5 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 3:
                    i6 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 4:
                    i7 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 5:
                    i8 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 6:
                    i9 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 7:
                    i10 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 8:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 9:
                    i11 = SafeParcelReader.Z(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C(i4, i5, i6, i7, i8, i9, i10, z3, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C[] newArray(int i4) {
        return new C[i4];
    }
}
