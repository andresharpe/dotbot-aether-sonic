package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1270q extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    /* loaded from: classes.dex */
    public static abstract class a extends com.google.android.gms.internal.common.k implements InterfaceC1270q {
        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @androidx.annotation.N
        public static InterfaceC1270q A(@androidx.annotation.N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof InterfaceC1270q) {
                return (InterfaceC1270q) queryLocalInterface;
            }
            return new X0(iBinder);
        }

        @Override // com.google.android.gms.internal.common.k
        protected final boolean v(int i4, @androidx.annotation.N Parcel parcel, @androidx.annotation.N Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 2) {
                cancel();
                return true;
            }
            return false;
        }
    }

    void cancel() throws RemoteException;
}
