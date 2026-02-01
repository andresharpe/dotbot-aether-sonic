package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X3)) {
                case 1:
                    i4 = SafeParcelReader.Z(parcel, X3);
                    break;
                case 2:
                    arrayList = SafeParcelReader.L(parcel, X3, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.C(parcel, X3, Account.CREATOR);
                    break;
                case 4:
                    z3 = SafeParcelReader.P(parcel, X3);
                    break;
                case 5:
                    z4 = SafeParcelReader.P(parcel, X3);
                    break;
                case 6:
                    z5 = SafeParcelReader.P(parcel, X3);
                    break;
                case 7:
                    str = SafeParcelReader.G(parcel, X3);
                    break;
                case 8:
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.L(parcel, X3, com.google.android.gms.auth.api.signin.internal.a.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new GoogleSignInOptions(i4, (ArrayList<Scope>) arrayList, account, z3, z4, z5, str, str2, (ArrayList<com.google.android.gms.auth.api.signin.internal.a>) arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i4) {
        return new GoogleSignInOptions[i4];
    }
}
