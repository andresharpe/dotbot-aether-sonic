package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243c0 implements Parcelable.Creator<C1279v> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1279v createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        int i8 = -1;
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
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 5:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 6:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 7:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 8:
                    i7 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 9:
                    i8 = SafeParcelReader.Z(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1279v(i4, i5, i6, j4, j5, str, str2, i7, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1279v[] newArray(int i4) {
        return new C1279v[i4];
    }
}
