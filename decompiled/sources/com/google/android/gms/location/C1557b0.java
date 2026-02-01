package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1557b0 implements Parcelable.Creator<C1584p> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1584p createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i4 = 0;
        String str2 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            str2 = SafeParcelReader.G(parcel, X3);
                        }
                    } else {
                        str = SafeParcelReader.G(parcel, X3);
                    }
                } else {
                    i4 = SafeParcelReader.Z(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, com.google.android.gms.internal.location.G.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1584p(arrayList, i4, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1584p[] newArray(int i4) {
        return new C1584p[i4];
    }
}
