package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class H implements Parcelable.Creator<G> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ G createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = null;
        int i4 = 0;
        short s4 = 0;
        int i5 = 0;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f4 = 0.0f;
        long j4 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 2:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 3:
                    s4 = SafeParcelReader.f0(parcel, X3);
                    break;
                case 4:
                    d4 = SafeParcelReader.T(parcel, X3);
                    break;
                case 5:
                    d5 = SafeParcelReader.T(parcel, X3);
                    break;
                case 6:
                    f4 = SafeParcelReader.V(parcel, X3);
                    break;
                case 7:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 8:
                    i5 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 9:
                    i6 = SafeParcelReader.Z(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new G(str, i4, s4, d4, d5, f4, j4, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ G[] newArray(int i4) {
        return new G[i4];
    }
}
