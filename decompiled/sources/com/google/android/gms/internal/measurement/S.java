package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class S extends O implements U {
    /* JADX INFO: Access modifiers changed from: package-private */
    public S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle o(Bundle bundle) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        Parcel A3 = A(1, v3);
        Bundle bundle2 = (Bundle) Q.a(A3, Bundle.CREATOR);
        A3.recycle();
        return bundle2;
    }
}
