package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1404h0 extends O implements InterfaceC1420j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1404h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1420j0
    public final void o(Bundle bundle) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        G(1, v3);
    }
}
