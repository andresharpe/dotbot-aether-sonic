package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.F;

/* loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.base.a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void N1(F f4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.base.c.c(v3, f4);
        O0(1, v3);
    }
}
