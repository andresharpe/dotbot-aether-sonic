package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1590s0 implements Parcelable.Creator<C1588r0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1588r0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 5) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        str = SafeParcelReader.G(parcel, X3);
                    }
                } else {
                    str3 = SafeParcelReader.G(parcel, X3);
                }
            } else {
                str2 = SafeParcelReader.G(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1588r0(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1588r0[] newArray(int i4) {
        return new C1588r0[i4];
    }
}
