package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1274s0 implements InterfaceC1273s {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f28801i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1274s0(IBinder iBinder) {
        this.f28801i = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28801i;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1273s
    public final void l0(r rVar, @androidx.annotation.P C1258k c1258k) throws RemoteException {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (rVar != null) {
                iBinder = rVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c1258k != null) {
                obtain.writeInt(1);
                M0.a(c1258k, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f28801i.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
