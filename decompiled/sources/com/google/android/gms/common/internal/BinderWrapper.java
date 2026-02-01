package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@I0.a
@KeepName
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {

    @androidx.annotation.N
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new H0();

    /* renamed from: E, reason: collision with root package name */
    private IBinder f28601E;

    @I0.a
    public BinderWrapper(@androidx.annotation.N IBinder iBinder) {
        this.f28601E = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        parcel.writeStrongBinder(this.f28601E);
    }
}
