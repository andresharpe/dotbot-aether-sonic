package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class Q4 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(P4 p4, Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, p4.f30365E);
        K0.b.Y(parcel, 2, p4.f30366F, false);
        K0.b.K(parcel, 3, p4.f30367G);
        K0.b.N(parcel, 4, p4.f30368H, false);
        K0.b.z(parcel, 5, null, false);
        K0.b.Y(parcel, 6, p4.f30369I, false);
        K0.b.Y(parcel, 7, p4.f30370J, false);
        K0.b.u(parcel, 8, p4.f30371K, false);
        K0.b.b(parcel, a4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        String str = null;
        Long l4 = null;
        Float f4 = null;
        String str2 = null;
        String str3 = null;
        Double d4 = null;
        long j4 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 3:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 4:
                    l4 = SafeParcelReader.d0(parcel, X3);
                    break;
                case 5:
                    f4 = SafeParcelReader.W(parcel, X3);
                    break;
                case 6:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 7:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 8:
                    d4 = SafeParcelReader.U(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new P4(i4, str, j4, l4, f4, str2, str3, d4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new P4[i4];
    }
}
