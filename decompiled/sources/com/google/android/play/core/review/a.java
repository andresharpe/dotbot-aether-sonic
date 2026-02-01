package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new e();

    public static a c(PendingIntent pendingIntent, boolean z3) {
        return new d(pendingIntent, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract PendingIntent a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
