package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1596v0 implements Parcelable.Creator<C1597w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1597w createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 2:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 3:
                    z5 = SafeParcelReader.P(parcel, X3);
                    break;
                case 4:
                    z6 = SafeParcelReader.P(parcel, X3);
                    break;
                case 5:
                    z7 = SafeParcelReader.P(parcel, X3);
                    break;
                case 6:
                    z8 = SafeParcelReader.P(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1597w(z3, z4, z5, z6, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1597w[] newArray(int i4) {
        return new C1597w[i4];
    }
}
