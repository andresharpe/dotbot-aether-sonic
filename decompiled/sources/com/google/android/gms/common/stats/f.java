package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f4 = 0.0f;
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
                case 7:
                case 9:
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 5:
                    i6 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 6:
                    arrayList = SafeParcelReader.I(parcel, X3);
                    break;
                case 8:
                    j5 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 10:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 11:
                    i5 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 12:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 13:
                    str4 = SafeParcelReader.G(parcel, X3);
                    break;
                case 14:
                    i7 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 15:
                    f4 = SafeParcelReader.V(parcel, X3);
                    break;
                case 16:
                    j6 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 17:
                    str5 = SafeParcelReader.G(parcel, X3);
                    break;
                case 18:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new WakeLockEvent(i4, j4, i5, str, i6, arrayList, str2, j5, i7, str3, str4, f4, j6, str5, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new WakeLockEvent[i4];
    }
}
