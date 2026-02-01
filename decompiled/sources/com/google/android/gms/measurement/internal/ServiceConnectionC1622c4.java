package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.C1285y;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC1622c4 implements ServiceConnection, AbstractC1246e.a, AbstractC1246e.b {

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f30570c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C1697p1 f30571d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30572e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC1622c4(C1628d4 c1628d4) {
        this.f30572e = c1628d4;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.b
    @androidx.annotation.K
    public final void A(@androidx.annotation.N C1231c c1231c) {
        C1285y.g("MeasurementServiceConnection.onConnectionFailed");
        C1720t1 C3 = this.f30572e.f31060a.C();
        if (C3 != null) {
            C3.u().b("Service connection failed", c1231c);
        }
        synchronized (this) {
            this.f30570c = false;
            this.f30571d = null;
        }
        this.f30572e.f31060a.a().x(new RunnableC1616b4(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.a
    @androidx.annotation.K
    public final void G(Bundle bundle) {
        C1285y.g("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C1285y.l(this.f30571d);
                this.f30572e.f31060a.a().x(new Z3(this, (InterfaceC1661j1) this.f30571d.M()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f30571d = null;
                this.f30570c = false;
            }
        }
    }

    @androidx.annotation.j0
    public final void b(Intent intent) {
        ServiceConnectionC1622c4 serviceConnectionC1622c4;
        this.f30572e.f();
        Context d4 = this.f30572e.f31060a.d();
        com.google.android.gms.common.stats.b b4 = com.google.android.gms.common.stats.b.b();
        synchronized (this) {
            try {
                if (this.f30570c) {
                    this.f30572e.f31060a.b().t().a("Connection attempt already in progress");
                    return;
                }
                this.f30572e.f31060a.b().t().a("Using local app measurement service");
                this.f30570c = true;
                serviceConnectionC1622c4 = this.f30572e.f30588c;
                b4.a(d4, intent, serviceConnectionC1622c4, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.j0
    public final void c() {
        this.f30572e.f();
        Context d4 = this.f30572e.f31060a.d();
        synchronized (this) {
            try {
                if (this.f30570c) {
                    this.f30572e.f31060a.b().t().a("Connection attempt already in progress");
                    return;
                }
                if (this.f30571d != null && (this.f30571d.e() || this.f30571d.a())) {
                    this.f30572e.f31060a.b().t().a("Already awaiting connection attempt");
                    return;
                }
                this.f30571d = new C1697p1(d4, Looper.getMainLooper(), this, this);
                this.f30572e.f31060a.b().t().a("Connecting to remote service");
                this.f30570c = true;
                C1285y.l(this.f30571d);
                this.f30571d.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.j0
    public final void d() {
        if (this.f30571d != null && (this.f30571d.a() || this.f30571d.e())) {
            this.f30571d.c();
        }
        this.f30571d = null;
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.K
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC1622c4 serviceConnectionC1622c4;
        InterfaceC1661j1 c1649h1;
        C1285y.g("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f30570c = false;
                this.f30572e.f31060a.b().p().a("Service connected with null binder");
                return;
            }
            InterfaceC1661j1 interfaceC1661j1 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC1661j1) {
                        c1649h1 = (InterfaceC1661j1) queryLocalInterface;
                    } else {
                        c1649h1 = new C1649h1(iBinder);
                    }
                    interfaceC1661j1 = c1649h1;
                    this.f30572e.f31060a.b().t().a("Bound to IMeasurementService interface");
                } else {
                    this.f30572e.f31060a.b().p().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f30572e.f31060a.b().p().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC1661j1 == null) {
                this.f30570c = false;
                try {
                    com.google.android.gms.common.stats.b b4 = com.google.android.gms.common.stats.b.b();
                    Context d4 = this.f30572e.f31060a.d();
                    serviceConnectionC1622c4 = this.f30572e.f30588c;
                    b4.c(d4, serviceConnectionC1622c4);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f30572e.f31060a.a().x(new X3(this, interfaceC1661j1));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.K
    public final void onServiceDisconnected(ComponentName componentName) {
        C1285y.g("MeasurementServiceConnection.onServiceDisconnected");
        this.f30572e.f31060a.b().o().a("Service disconnected");
        this.f30572e.f31060a.a().x(new Y3(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.a
    @androidx.annotation.K
    public final void v(int i4) {
        C1285y.g("MeasurementServiceConnection.onConnectionSuspended");
        this.f30572e.f31060a.b().o().a("Service connection suspended");
        this.f30572e.f31060a.a().x(new RunnableC1610a4(this));
    }
}
