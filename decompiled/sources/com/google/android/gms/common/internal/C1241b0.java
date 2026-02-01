package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

/* renamed from: com.google.android.gms.common.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241b0 extends com.google.android.gms.internal.base.a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1241b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final com.google.android.gms.dynamic.d N1(com.google.android.gms.dynamic.d dVar, C1263m0 c1263m0) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.base.c.d(v3, dVar);
        com.google.android.gms.internal.base.c.c(v3, c1263m0);
        Parcel A3 = A(2, v3);
        com.google.android.gms.dynamic.d A4 = d.a.A(A3.readStrongBinder());
        A3.recycle();
        return A4;
    }
}
