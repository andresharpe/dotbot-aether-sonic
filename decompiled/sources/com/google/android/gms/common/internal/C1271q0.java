package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1313a;

/* renamed from: com.google.android.gms.common.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271q0 extends C1313a implements r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1271q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.r
    public final void S0(int i4, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel O02 = O0();
        O02.writeInt(i4);
        O02.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.l.d(O02, bundle);
        A(1, O02);
    }

    @Override // com.google.android.gms.common.internal.r
    public final void Y0(int i4, IBinder iBinder, J0 j02) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.r
    public final void w0(int i4, Bundle bundle) throws RemoteException {
        throw null;
    }
}
