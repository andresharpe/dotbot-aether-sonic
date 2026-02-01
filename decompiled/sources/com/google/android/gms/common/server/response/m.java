package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<a.C0271a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a.C0271a createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        String str = null;
        String str2 = null;
        com.google.android.gms.common.server.converter.b bVar = null;
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
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 4:
                    i6 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 5:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 6:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 7:
                    i7 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 8:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 9:
                    bVar = (com.google.android.gms.common.server.converter.b) SafeParcelReader.C(parcel, X3, com.google.android.gms.common.server.converter.b.CREATOR);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new a.C0271a(i4, i5, z3, i6, z4, str, i7, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0271a[] newArray(int i4) {
        return new a.C0271a[i4];
    }
}
