package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int i02 = SafeParcelReader.i0(parcel);
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = SafeParcelReader.G(parcel, X3);
                    break;
                case 4:
                    str3 = SafeParcelReader.G(parcel, X3);
                    break;
                case 5:
                    str4 = SafeParcelReader.G(parcel, X3);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.C(parcel, X3, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.G(parcel, X3);
                    break;
                case 8:
                    j4 = SafeParcelReader.c0(parcel, X3);
                    break;
                case 9:
                    str6 = SafeParcelReader.G(parcel, X3);
                    break;
                case 10:
                    arrayList = SafeParcelReader.L(parcel, X3, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.G(parcel, X3);
                    break;
                case 12:
                    str8 = SafeParcelReader.G(parcel, X3);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X3);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i02);
        return new GoogleSignInAccount(i4, str, str2, str3, str4, uri, str5, j4, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i4) {
        return new GoogleSignInAccount[i4];
    }
}
