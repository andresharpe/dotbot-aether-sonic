package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1742x implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C1736w c1736w, Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 2, c1736w.f31012E, false);
        K0.b.S(parcel, 3, c1736w.f31013F, i4, false);
        K0.b.Y(parcel, 4, c1736w.f31014G, false);
        K0.b.K(parcel, 5, c1736w.f31015H);
        K0.b.b(parcel, a4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        String str = null;
        C1724u c1724u = null;
        String str2 = null;
        long j4 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 2) {
                if (O3 != 3) {
                    if (O3 != 4) {
                        if (O3 != 5) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            j4 = SafeParcelReader.c0(parcel, X3);
                        }
                    } else {
                        str2 = SafeParcelReader.G(parcel, X3);
                    }
                } else {
                    c1724u = (C1724u) SafeParcelReader.C(parcel, X3, C1724u.CREATOR);
                }
            } else {
                str = SafeParcelReader.G(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1736w(str, c1724u, str2, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1736w[i4];
    }
}
