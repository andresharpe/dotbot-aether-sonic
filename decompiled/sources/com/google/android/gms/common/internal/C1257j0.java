package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257j0 implements Parcelable.Creator<C1255i0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1255i0 createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i5 = 0;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            int O3 = SafeParcelReader.O(X3);
            if (O3 != 1) {
                if (O3 != 2) {
                    if (O3 != 3) {
                        if (O3 != 4) {
                            SafeParcelReader.h0(parcel, X3);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.C(parcel, X3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        i5 = SafeParcelReader.Z(parcel, X3);
                    }
                } else {
                    account = (Account) SafeParcelReader.C(parcel, X3, Account.CREATOR);
                }
            } else {
                i4 = SafeParcelReader.Z(parcel, X3);
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new C1255i0(i4, account, i5, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1255i0[] newArray(int i4) {
        return new C1255i0[i4];
    }
}
