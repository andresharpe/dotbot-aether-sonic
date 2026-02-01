package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C1231c c1231c = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            if (O3 != 1000) {
                                SafeParcelReader.h0(parcel, X3);
                            } else {
                                i4 = SafeParcelReader.Z(parcel, X3);
                            }
                        } else {
                            c1231c = (C1231c) SafeParcelReader.C(parcel, X3, C1231c.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) SafeParcelReader.C(parcel, X3, PendingIntent.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X3);
                }
            } else {
                i5 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new Status(i4, i5, str, pendingIntent, c1231c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new Status[i4];
    }
}
