package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class e extends b implements f {
    public static f v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new d(iBinder);
    }
}
