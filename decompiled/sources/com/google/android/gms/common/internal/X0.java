package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1313a;

/* loaded from: classes.dex */
public final class X0 extends C1313a implements InterfaceC1270q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public X0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1270q
    public final void cancel() throws RemoteException {
        G(2, O0());
    }
}
