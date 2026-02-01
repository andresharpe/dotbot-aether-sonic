package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator<PlaceReport> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceReport createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 == 1) {
                i4 = SafeParcelReader.Z(parcel, X3);
            } else if (O3 == 2) {
                str = SafeParcelReader.G(parcel, X3);
            } else if (O3 == 3) {
                str2 = SafeParcelReader.G(parcel, X3);
            } else if (O3 != 4) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                str3 = SafeParcelReader.G(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new PlaceReport(i4, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceReport[] newArray(int i4) {
        return new PlaceReport[i4];
    }
}
