package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class h implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        return new j(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i4) {
        return new j[i4];
    }
}
