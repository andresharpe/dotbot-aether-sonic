package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator<E> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ E createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 1;
        C c4 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    c4 = (C) SafeParcelReader.C(parcel, X3, C.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.Y(parcel, X3);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.C(parcel, X3, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.Y(parcel, X3);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.Y(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new E(i4, c4, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ E[] newArray(int i4) {
        return new E[i4];
    }
}
