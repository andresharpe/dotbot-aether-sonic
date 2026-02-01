package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f29093i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29094j = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f29093i = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel A(int i4, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29093i.transact(i4, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29093i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29094j);
        return obtain;
    }
}
