package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes.dex */
public final class D implements Parcelable.Creator<C> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        List<C1248f> list = C.f29165P;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        long j4 = Long.MAX_VALUE;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                switch (O3) {
                    case 5:
                        list = SafeParcelReader.L(parcel, X3, C1248f.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.G(parcel, X3);
                        break;
                    case 7:
                        z3 = SafeParcelReader.P(parcel, X3);
                        break;
                    case 8:
                        z4 = SafeParcelReader.P(parcel, X3);
                        break;
                    case 9:
                        z5 = SafeParcelReader.P(parcel, X3);
                        break;
                    case 10:
                        str2 = SafeParcelReader.G(parcel, X3);
                        break;
                    case 11:
                        z6 = SafeParcelReader.P(parcel, X3);
                        break;
                    case 12:
                        z7 = SafeParcelReader.P(parcel, X3);
                        break;
                    case 13:
                        str3 = SafeParcelReader.G(parcel, X3);
                        break;
                    case 14:
                        j4 = SafeParcelReader.c0(parcel, X3);
                        break;
                    default:
                        SafeParcelReader.h0(parcel, X3);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.C(parcel, X3, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C(locationRequest, list, str, z3, z4, z5, str2, z6, z7, str3, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C[] newArray(int i4) {
        return new C[i4];
    }
}
