package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public class V implements Parcelable.Creator<U> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f36818a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(U u3, Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.k(parcel, 2, u3.f36787E, false);
        K0.b.b(parcel, a4);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X3) != 2) {
                SafeParcelReader.h0(parcel, X3);
            } else {
                bundle = SafeParcelReader.g(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new U(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.P
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U[] newArray(int i4) {
        return new U[i4];
    }
}
