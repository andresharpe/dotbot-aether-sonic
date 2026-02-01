package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B1 extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    static final String f30111d = "com.google.android.gms.measurement.internal.B1";

    /* renamed from: a, reason: collision with root package name */
    private final L4 f30112a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30113b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30114c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(L4 l4) {
        C1285y.l(l4);
        this.f30112a = l4;
    }

    @androidx.annotation.j0
    public final void b() {
        this.f30112a.e();
        this.f30112a.a().f();
        if (this.f30113b) {
            return;
        }
        this.f30112a.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f30114c = this.f30112a.W().k();
        this.f30112a.b().t().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f30114c));
        this.f30113b = true;
    }

    @androidx.annotation.j0
    public final void c() {
        this.f30112a.e();
        this.f30112a.a().f();
        this.f30112a.a().f();
        if (this.f30113b) {
            this.f30112a.b().t().a("Unregistering connectivity change receiver");
            this.f30113b = false;
            this.f30114c = false;
            try {
                this.f30112a.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e4) {
                this.f30112a.b().p().b("Failed to unregister the network broadcast receiver", e4);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @androidx.annotation.K
    public final void onReceive(Context context, Intent intent) {
        this.f30112a.e();
        String action = intent.getAction();
        this.f30112a.b().t().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean k4 = this.f30112a.W().k();
            if (this.f30114c != k4) {
                this.f30114c = k4;
                this.f30112a.a().x(new A1(this, k4));
                return;
            }
            return;
        }
        this.f30112a.b().u().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
