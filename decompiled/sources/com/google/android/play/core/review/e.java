package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z3;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(a.class.getClassLoader());
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new d(pendingIntent, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new a[i4];
    }
}
