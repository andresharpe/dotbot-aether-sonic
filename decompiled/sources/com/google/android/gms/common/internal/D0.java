package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.InterfaceC0564g;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class D0 extends AbstractBinderC1272r0 {

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.P
    private AbstractC1246e f28611i;

    /* renamed from: j, reason: collision with root package name */
    private final int f28612j;

    public D0(@androidx.annotation.N AbstractC1246e abstractC1246e, int i4) {
        this.f28611i = abstractC1246e;
        this.f28612j = i4;
    }

    @Override // com.google.android.gms.common.internal.r
    @InterfaceC0564g
    public final void S0(int i4, @androidx.annotation.N IBinder iBinder, @androidx.annotation.P Bundle bundle) {
        C1285y.m(this.f28611i, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f28611i.W(i4, iBinder, bundle, this.f28612j);
        this.f28611i = null;
    }

    @Override // com.google.android.gms.common.internal.r
    @InterfaceC0564g
    public final void Y0(int i4, @androidx.annotation.N IBinder iBinder, @androidx.annotation.N J0 j02) {
        AbstractC1246e abstractC1246e = this.f28611i;
        C1285y.m(abstractC1246e, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C1285y.l(j02);
        AbstractC1246e.k0(abstractC1246e, j02);
        S0(i4, iBinder, j02.f28627E);
    }

    @Override // com.google.android.gms.common.internal.r
    @InterfaceC0564g
    public final void w0(int i4, @androidx.annotation.P Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
