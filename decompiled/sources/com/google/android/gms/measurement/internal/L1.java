package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class L1 implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    private final String f30296c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ M1 f30297d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(M1 m12, String str) {
        this.f30297d = m12;
        this.f30296c = str;
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.K
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.U A3 = com.google.android.gms.internal.measurement.T.A(iBinder);
                if (A3 == null) {
                    this.f30297d.f30337a.b().u().a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.f30297d.f30337a.b().t().a("Install Referrer Service connected");
                    this.f30297d.f30337a.a().x(new K1(this, A3, this));
                    return;
                }
            } catch (RuntimeException e4) {
                this.f30297d.f30337a.b().u().b("Exception occurred while calling Install Referrer API", e4);
                return;
            }
        }
        this.f30297d.f30337a.b().u().a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.K
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f30297d.f30337a.b().t().a("Install Referrer Service disconnected");
    }
}
