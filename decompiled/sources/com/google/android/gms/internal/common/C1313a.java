package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.common.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1313a implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f29141i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29142j;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1313a(IBinder iBinder, String str) {
        this.f29141i = iBinder;
        this.f29142j = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29141i.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(int i4, Parcel parcel) throws RemoteException {
        try {
            this.f29141i.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel O0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29142j);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29141i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29141i.transact(i4, parcel, obtain, 0);
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
}
