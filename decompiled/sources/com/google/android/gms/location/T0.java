package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class T0 implements Parcelable.Creator<C1564f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1564f createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
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
                        arrayList2 = SafeParcelReader.L(parcel, X3, C1248f.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, C1560d.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1564f(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1564f[] newArray(int i4) {
        return new C1564f[i4];
    }
}
