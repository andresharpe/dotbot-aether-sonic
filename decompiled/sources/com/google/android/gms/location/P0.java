package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class P0 implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j4 = 0;
        long j5 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            if (O3 != 5) {
                                SafeParcelReader.h0(parcel, X3);
                            } else {
                                bundle = SafeParcelReader.g(parcel, X3);
                            }
                        } else {
                            i4 = SafeParcelReader.Z(parcel, X3);
                        }
                    } else {
                        j5 = SafeParcelReader.c0(parcel, X3);
                    }
                } else {
                    j4 = SafeParcelReader.c0(parcel, X3);
                }
            } else {
                arrayList = SafeParcelReader.L(parcel, X3, C1568h.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new ActivityRecognitionResult(arrayList, j4, j5, i4, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i4) {
        return new ActivityRecognitionResult[i4];
    }
}
