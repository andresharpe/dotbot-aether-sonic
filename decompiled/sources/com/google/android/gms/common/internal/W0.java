package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1313a;

/* loaded from: classes.dex */
public final class W0 extends C1313a implements InterfaceC1268p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1268p
    public final Account zzb() throws RemoteException {
        Parcel v3 = v(2, O0());
        Account account = (Account) com.google.android.gms.internal.common.l.a(v3, Account.CREATOR);
        v3.recycle();
        return account;
    }
}
