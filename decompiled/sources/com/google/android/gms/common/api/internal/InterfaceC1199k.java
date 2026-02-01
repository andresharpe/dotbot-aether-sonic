package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1199k extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends com.google.android.gms.internal.base.b implements InterfaceC1199k {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @androidx.annotation.N
        public static InterfaceC1199k O1(@androidx.annotation.N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof InterfaceC1199k) {
                return (InterfaceC1199k) queryLocalInterface;
            }
            return new E0(iBinder);
        }

        @Override // com.google.android.gms.internal.base.b
        protected final boolean N1(int i4, @androidx.annotation.N Parcel parcel, @androidx.annotation.N Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                v0((Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
    }

    void v0(@androidx.annotation.N Status status) throws RemoteException;
}
