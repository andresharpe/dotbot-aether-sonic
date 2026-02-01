package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1428k0 extends O implements InterfaceC1444m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1428k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1444m0
    public final void L(String str, String str2, Bundle bundle, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.e(v3, bundle);
        v3.writeLong(j4);
        G(1, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1444m0
    public final int zzd() throws RemoteException {
        Parcel A3 = A(2, v());
        int readInt = A3.readInt();
        A3.recycle();
        return readInt;
    }
}
