package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1604z0 implements Parcelable.Creator<C1602y0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1602y0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = "";
        ArrayList<String> arrayList = null;
        PendingIntent pendingIntent = null;
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
                    pendingIntent = (PendingIntent) SafeParcelReader.C(parcel, X3, PendingIntent.CREATOR);
                }
            } else {
                arrayList = SafeParcelReader.I(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1602y0(arrayList, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1602y0[] newArray(int i4) {
        return new C1602y0[i4];
    }
}
