package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1322a implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f29206i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29207j;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1322a(IBinder iBinder, String str) {
        this.f29206i = iBinder;
        this.f29207j = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel A(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29206i.transact(i4, parcel, obtain, 0);
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
            this.f29206i.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29206i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29207j);
        return obtain;
    }
}
