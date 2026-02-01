package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.X0;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        X0 x02 = e0.f29217I;
        List<C1248f> list = e0.f29216H;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        SafeParcelReader.h0(parcel, X3);
                    } else {
                        str = SafeParcelReader.G(parcel, X3);
                    }
                } else {
                    list = SafeParcelReader.L(parcel, X3, C1248f.CREATOR);
                }
            } else {
                x02 = (X0) SafeParcelReader.C(parcel, X3, X0.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new e0(x02, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e0[] newArray(int i4) {
        return new e0[i4];
    }
}
