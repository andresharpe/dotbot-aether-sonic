package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f29097i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29098j;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f29097i = iBinder;
        this.f29098j = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel A(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29097i.transact(2, parcel, obtain, 0);
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
            this.f29097i.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O0(int i4, Parcel parcel) throws RemoteException {
        try {
            this.f29097i.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29097i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29098j);
        return obtain;
    }
}
