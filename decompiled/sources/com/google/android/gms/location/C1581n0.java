package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1581n0 implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 102;
        long j4 = 3600000;
        long j5 = 600000;
        boolean z3 = false;
        boolean z4 = false;
        long j6 = Long.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        float f4 = 0.0f;
        long j7 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 3:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 4:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 5:
                    j6 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 6:
                    i5 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 7:
                    f4 = SafeParcelReader.V(parcel, X3);
                    break;
                case 8:
                    j7 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 9:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new LocationRequest(i4, j4, j5, z3, j6, i5, f4, j7, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i4) {
        return new LocationRequest[i4];
    }
}
