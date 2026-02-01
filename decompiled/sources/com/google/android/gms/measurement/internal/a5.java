package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = "";
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        long j9 = -2147483648L;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 2:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 3:
                    str4 = SafeParcelReader.G(parcel, X3);
                    break;
                case 4:
                    str5 = SafeParcelReader.G(parcel, X3);
                    break;
                case 5:
                    str6 = SafeParcelReader.G(parcel, X3);
                    break;
                case 6:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 7:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 8:
                    str7 = SafeParcelReader.G(parcel, X3);
                    break;
                case 9:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 10:
                    z5 = SafeParcelReader.P(parcel, X3);
                    break;
                case 11:
                    j9 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 12:
                    str8 = SafeParcelReader.G(parcel, X3);
                    break;
                case 13:
                    j6 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 14:
                    j7 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 15:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 16:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
                case 18:
                    z6 = SafeParcelReader.P(parcel, X3);
                    break;
                case 19:
                    str9 = SafeParcelReader.G(parcel, X3);
                    break;
                case 21:
                    bool = SafeParcelReader.Q(parcel, X3);
                    break;
                case 22:
                    j8 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 23:
                    arrayList = SafeParcelReader.I(parcel, X3);
                    break;
                case 24:
                    str10 = SafeParcelReader.G(parcel, X3);
                    break;
                case 25:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 26:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 27:
                    str11 = SafeParcelReader.G(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new Z4(str3, str4, str5, str6, j4, j5, str7, z3, z5, j9, str8, j6, j7, i4, z4, z6, str9, bool, j8, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new Z4[i4];
    }
}
