package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.AbstractC1262m;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1268p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1209p implements C1164a.f, ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    private static final String f28380n = "p";

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28381c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28382d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    private final ComponentName f28383e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f28384f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1184f f28385g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f28386h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1211q f28387i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.P
    private IBinder f28388j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28389k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.P
    private String f28390l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.P
    private String f28391m;

    @I0.a
    public ServiceConnectionC1209p(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, @androidx.annotation.N ComponentName componentName, @androidx.annotation.N InterfaceC1184f interfaceC1184f, @androidx.annotation.N InterfaceC1211q interfaceC1211q) {
        this(context, looper, null, null, componentName, interfaceC1184f, interfaceC1211q);
    }

    @androidx.annotation.j0
    private final void C() {
        if (Thread.currentThread() == this.f28386h.getLooper().getThread()) {
        } else {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void D(String str) {
        String.valueOf(this.f28388j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void A(IBinder iBinder) {
        this.f28389k = false;
        this.f28388j = iBinder;
        D("Connected.");
        this.f28385g.G(new Bundle());
    }

    public final void B(@androidx.annotation.P String str) {
        this.f28391m = str;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.j0
    public final boolean a() {
        C();
        if (this.f28388j != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.j0
    public final void c() {
        C();
        D("Disconnect called.");
        try {
            this.f28384f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f28389k = false;
        this.f28388j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f28389k = false;
        this.f28388j = null;
        D("Disconnected.");
        this.f28385g.v(1);
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.j0
    public final boolean e() {
        C();
        return this.f28389k;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.N
    public final Set<Scope> h() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final void i(@androidx.annotation.P InterfaceC1268p interfaceC1268p, @androidx.annotation.P Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.j0
    public final void j(@androidx.annotation.N String str) {
        C();
        this.f28390l = str;
        c();
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.N
    public final String k() {
        String str = this.f28381c;
        if (str != null) {
            return str;
        }
        C1285y.l(this.f28383e);
        return this.f28383e.getPackageName();
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.j0
    public final void l(@androidx.annotation.N AbstractC1246e.c cVar) {
        C();
        D("Connect started.");
        if (a()) {
            try {
                j("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f28383e;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f28381c).setAction(this.f28382d);
            }
            boolean bindService = this.f28384f.bindService(intent, this, AbstractC1262m.c());
            this.f28389k = bindService;
            if (!bindService) {
                this.f28388j = null;
                this.f28387i.A(new C1231c(16));
            }
            D("Finished connect.");
        } catch (SecurityException e4) {
            this.f28389k = false;
            this.f28388j = null;
            throw e4;
        }
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final void m(@androidx.annotation.N AbstractC1246e.InterfaceC0269e interfaceC0269e) {
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.N
    public final C1233e[] o() {
        return new C1233e[0];
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@androidx.annotation.N ComponentName componentName, @androidx.annotation.N final IBinder iBinder) {
        this.f28386h.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.N0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1209p.this.A(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@androidx.annotation.N ComponentName componentName) {
        this.f28386h.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.M0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1209p.this.d();
            }
        });
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final void p(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.N
    public final C1233e[] t() {
        return new C1233e[0];
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.P
    public final String v() {
        return this.f28390l;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.N
    public final Intent w() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    public final boolean x() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @androidx.annotation.P
    public final IBinder y() {
        return null;
    }

    @androidx.annotation.P
    @I0.a
    @androidx.annotation.j0
    public IBinder z() {
        C();
        return this.f28388j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ServiceConnectionC1209p(android.content.Context r2, android.os.Looper r3, @androidx.annotation.P java.lang.String r4, @androidx.annotation.P java.lang.String r5, @androidx.annotation.P android.content.ComponentName r6, com.google.android.gms.common.api.internal.InterfaceC1184f r7, com.google.android.gms.common.api.internal.InterfaceC1211q r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f28389k = r0
            r0 = 0
            r1.f28390l = r0
            r1.f28384f = r2
            com.google.android.gms.internal.base.q r2 = new com.google.android.gms.internal.base.q
            r2.<init>(r3)
            r1.f28386h = r2
            r1.f28385g = r7
            r1.f28387i = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.f28381c = r4
            r1.f28382d = r5
            r1.f28383e = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ServiceConnectionC1209p.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.q):void");
    }

    @I0.a
    public ServiceConnectionC1209p(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, @androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N InterfaceC1184f interfaceC1184f, @androidx.annotation.N InterfaceC1211q interfaceC1211q) {
        this(context, looper, str, str2, null, interfaceC1184f, interfaceC1211q);
    }
}
