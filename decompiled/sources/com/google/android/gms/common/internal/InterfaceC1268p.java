package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1268p extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    /* loaded from: classes.dex */
    public static abstract class a extends com.google.android.gms.internal.common.k implements InterfaceC1268p {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @androidx.annotation.N
        public static InterfaceC1268p A(@androidx.annotation.N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC1268p) {
                return (InterfaceC1268p) queryLocalInterface;
            }
            return new W0(iBinder);
        }

        @Override // com.google.android.gms.internal.common.k
        protected final boolean v(int i4, @androidx.annotation.N Parcel parcel, @androidx.annotation.N Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 2) {
                Account zzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.common.l.e(parcel2, zzb);
                return true;
            }
            return false;
        }
    }

    @androidx.annotation.N
    Account zzb() throws RemoteException;
}
