package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1629e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = null;
        String str2 = null;
        P4 p4 = null;
        String str3 = null;
        C1736w c1736w = null;
        C1736w c1736w2 = null;
        C1736w c1736w3 = null;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 2:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 3:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 4:
                    p4 = (P4) SafeParcelReader.C(parcel, X3, P4.CREATOR);
                    break;
                case 5:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 6:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 7:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 8:
                    c1736w = (C1736w) SafeParcelReader.C(parcel, X3, C1736w.CREATOR);
                    break;
                case 9:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 10:
                    c1736w2 = (C1736w) SafeParcelReader.C(parcel, X3, C1736w.CREATOR);
                    break;
                case 11:
                    j6 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 12:
                    c1736w3 = (C1736w) SafeParcelReader.C(parcel, X3, C1736w.CREATOR);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1623d(str, str2, p4, j4, z3, str3, c1736w, j5, c1736w2, j6, c1736w3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1623d[i4];
    }
}
