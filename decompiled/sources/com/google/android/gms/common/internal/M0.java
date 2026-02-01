package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class M0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C1258k c1258k, Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, c1258k.f28763E);
        K0.b.F(parcel, 2, c1258k.f28764F);
        K0.b.F(parcel, 3, c1258k.f28765G);
        K0.b.Y(parcel, 4, c1258k.f28766H, false);
        K0.b.B(parcel, 5, c1258k.f28767I, false);
        K0.b.c0(parcel, 6, c1258k.f28768J, i4, false);
        K0.b.k(parcel, 7, c1258k.f28769K, false);
        K0.b.S(parcel, 8, c1258k.f28770L, i4, false);
        K0.b.c0(parcel, 10, c1258k.f28771M, i4, false);
        K0.b.c0(parcel, 11, c1258k.f28772N, i4, false);
        K0.b.g(parcel, 12, c1258k.f28773O);
        K0.b.F(parcel, 13, c1258k.f28774P);
        K0.b.g(parcel, 14, c1258k.f28775Q);
        K0.b.Y(parcel, 15, c1258k.e0(), false);
        K0.b.b(parcel, a4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        Scope[] scopeArr = C1258k.f28761S;
        Bundle bundle = new Bundle();
        C1233e[] c1233eArr = C1258k.f28762T;
        C1233e[] c1233eArr2 = c1233eArr;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        boolean z4 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    i5 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 3:
                    i6 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 5:
                    iBinder = SafeParcelReader.Y(parcel, X3);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.K(parcel, X3, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, X3);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.C(parcel, X3, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
                case 10:
                    c1233eArr = (C1233e[]) SafeParcelReader.K(parcel, X3, C1233e.CREATOR);
                    break;
                case 11:
                    c1233eArr2 = (C1233e[]) SafeParcelReader.K(parcel, X3, C1233e.CREATOR);
                    break;
                case 12:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 13:
                    i7 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 14:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 15:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1258k(i4, i5, i6, str, iBinder, scopeArr, bundle, account, c1233eArr, c1233eArr2, z3, i7, z4, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1258k[i4];
    }
}
