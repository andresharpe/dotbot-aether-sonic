package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        int i5 = 0;
        Uri uri = null;
        int i6 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            i5 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        i6 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    uri = (Uri) SafeParcelReader.C(parcel, X3, Uri.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new b(i4, uri, i6, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i4) {
        return new b[i4];
    }
}
