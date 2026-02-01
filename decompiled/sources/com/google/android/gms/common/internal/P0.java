package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class P0 implements ServiceConnection, T0 {

    /* renamed from: c, reason: collision with root package name */
    private final Map f28638c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f28639d = 2;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28640e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.P
    private IBinder f28641f;

    /* renamed from: g, reason: collision with root package name */
    private final N0 f28642g;

    /* renamed from: h, reason: collision with root package name */
    private ComponentName f28643h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ S0 f28644i;

    public P0(S0 s02, N0 n02) {
        this.f28644i = s02;
        this.f28642g = n02;
    }

    public final int a() {
        return this.f28639d;
    }

    public final ComponentName b() {
        return this.f28643h;
    }

    @androidx.annotation.P
    public final IBinder c() {
        return this.f28641f;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f28638c.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, @androidx.annotation.P Executor executor) {
        com.google.android.gms.common.stats.b bVar;
        Context context;
        Context context2;
        com.google.android.gms.common.stats.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j4;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f28639d = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.v.r()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            S0 s02 = this.f28644i;
            bVar = s02.f28655j;
            context = s02.f28652g;
            N0 n02 = this.f28642g;
            context2 = s02.f28652g;
            boolean e4 = bVar.e(context, str, n02.c(context2), this, this.f28642g.a(), executor);
            this.f28640e = e4;
            if (e4) {
                handler = this.f28644i.f28653h;
                Message obtainMessage = handler.obtainMessage(1, this.f28642g);
                handler2 = this.f28644i.f28653h;
                j4 = this.f28644i.f28657l;
                handler2.sendMessageDelayed(obtainMessage, j4);
            } else {
                this.f28639d = 2;
                try {
                    S0 s03 = this.f28644i;
                    bVar2 = s03.f28655j;
                    context3 = s03.f28652g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f28638c.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        com.google.android.gms.common.stats.b bVar;
        Context context;
        handler = this.f28644i.f28653h;
        handler.removeMessages(1, this.f28642g);
        S0 s02 = this.f28644i;
        bVar = s02.f28655j;
        context = s02.f28652g;
        bVar.c(context, this);
        this.f28640e = false;
        this.f28639d = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f28638c.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f28638c.isEmpty();
    }

    public final boolean j() {
        return this.f28640e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f28644i.f28651f;
        synchronized (hashMap) {
            try {
                handler = this.f28644i.f28653h;
                handler.removeMessages(1, this.f28642g);
                this.f28641f = iBinder;
                this.f28643h = componentName;
                Iterator it = this.f28638c.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f28639d = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f28644i.f28651f;
        synchronized (hashMap) {
            try {
                handler = this.f28644i.f28653h;
                handler.removeMessages(1, this.f28642g);
                this.f28641f = null;
                this.f28643h = componentName;
                Iterator it = this.f28638c.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f28639d = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
