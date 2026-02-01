package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: i, reason: collision with root package name */
    private final IBinder f34424i;

    /* renamed from: j, reason: collision with root package name */
    private final String f34425j = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f34424i = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i4, Parcel parcel) throws RemoteException {
        try {
            this.f34424i.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34424i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34425j);
        return obtain;
    }
}
