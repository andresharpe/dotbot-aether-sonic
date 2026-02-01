package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class O implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f29407i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29408j;

    /* JADX INFO: Access modifiers changed from: protected */
    public O(IBinder iBinder, String str) {
        this.f29407i = iBinder;
        this.f29408j = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel A(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29407i.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29407i.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29407i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29408j);
        return obtain;
    }
}
