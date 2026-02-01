package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC1268p;

/* renamed from: com.google.android.gms.common.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC1238a extends InterfaceC1268p.a {
    @androidx.annotation.P
    @I0.a
    public static Account G(@androidx.annotation.N InterfaceC1268p interfaceC1268p) {
        Account account = null;
        if (interfaceC1268p != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1268p.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1268p
    @androidx.annotation.N
    public final Account zzb() {
        throw null;
    }
}
