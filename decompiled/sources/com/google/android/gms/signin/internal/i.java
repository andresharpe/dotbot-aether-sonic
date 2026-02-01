package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    SafeParcelReader.h0(parcel, X3);
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.I(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i4) {
        return new h[i4];
    }
}
