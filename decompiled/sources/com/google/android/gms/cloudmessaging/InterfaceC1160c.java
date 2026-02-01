package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.N;
import androidx.annotation.P;

/* renamed from: com.google.android.gms.cloudmessaging.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
interface InterfaceC1160c extends IInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String f27901e = "com.google.android.gms.iid.IMessengerCompat";

    /* renamed from: f, reason: collision with root package name */
    public static final int f27902f = 1;

    /* renamed from: com.google.android.gms.cloudmessaging.c$a */
    /* loaded from: classes.dex */
    public static class a extends Binder implements InterfaceC1160c {
        @Override // android.os.IInterface
        @N
        public IBinder asBinder() {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.InterfaceC1160c
        public void e0(@N Message message) throws RemoteException {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, @N Parcel parcel, @P Parcel parcel2, int i5) throws RemoteException {
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.cloudmessaging.c$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC1160c {

        /* renamed from: i, reason: collision with root package name */
        private final IBinder f27903i;

        b(@N IBinder iBinder) {
            this.f27903i = iBinder;
        }

        @Override // android.os.IInterface
        @N
        public IBinder asBinder() {
            return this.f27903i;
        }

        @Override // com.google.android.gms.cloudmessaging.InterfaceC1160c
        public void e0(@N Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(InterfaceC1160c.f27901e);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f27903i.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void e0(@N Message message) throws RemoteException;
}
