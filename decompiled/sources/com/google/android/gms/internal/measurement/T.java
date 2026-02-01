package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class T extends P implements U {
    public static U A(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof U) {
            return (U) queryLocalInterface;
        }
        return new S(iBinder);
    }
}
