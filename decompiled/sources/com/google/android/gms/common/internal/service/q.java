package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.internal.InterfaceC1184f;
import com.google.android.gms.common.api.internal.InterfaceC1211q;
import com.google.android.gms.common.internal.AbstractC1260l;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.I;

/* loaded from: classes.dex */
public final class q extends AbstractC1260l<j> {

    /* renamed from: Q, reason: collision with root package name */
    private final I f28812Q;

    public q(Context context, Looper looper, C1250g c1250g, I i4, InterfaceC1184f interfaceC1184f, InterfaceC1211q interfaceC1211q) {
        super(context, looper, 270, c1250g, interfaceC1184f, interfaceC1211q);
        this.f28812Q = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @P
    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof j) {
            return (j) queryLocalInterface;
        }
        return new j(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final C1233e[] D() {
        return com.google.android.gms.internal.base.d.f29101b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    protected final Bundle I() {
        return this.f28812Q.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    public final String N() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    protected final String O() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    protected final boolean R() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final int s() {
        return 203400000;
    }
}
