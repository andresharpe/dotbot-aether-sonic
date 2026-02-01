package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.messaging.o0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class o0 implements ServiceConnection {

    /* renamed from: i, reason: collision with root package name */
    private static final int f37079i = 9000;

    /* renamed from: c, reason: collision with root package name */
    private final Context f37080c;

    /* renamed from: d, reason: collision with root package name */
    private final Intent f37081d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f37082e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<a> f37083f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    private l0 f37084g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.B("this")
    private boolean f37085h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f37086a;

        /* renamed from: b, reason: collision with root package name */
        private final C1771l<Void> f37087b = new C1771l<>();

        a(Intent intent) {
            this.f37086a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w(C1821f.f36920a, "Service took too long to process intent: " + this.f37086a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            boolean z3;
            long j4;
            if ((this.f37086a.getFlags() & 268435456) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Runnable runnable = new Runnable() { // from class: com.google.firebase.messaging.m0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a.this.f();
                }
            };
            if (z3) {
                j4 = j0.f37054b;
            } else {
                j4 = 9000;
            }
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j4, TimeUnit.MILLISECONDS);
            e().f(scheduledExecutorService, new InterfaceC1764e() { // from class: com.google.firebase.messaging.n0
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f37087b.e(null);
        }

        AbstractC1770k<Void> e() {
            return this.f37087b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.concurrent.b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @androidx.annotation.B("this")
    private void a() {
        while (!this.f37083f.isEmpty()) {
            this.f37083f.poll().d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "flush queue called");
            }
            while (!this.f37083f.isEmpty()) {
                if (Log.isLoggable(C1821f.f36920a, 3)) {
                    Log.d(C1821f.f36920a, "found intent to be delivered");
                }
                l0 l0Var = this.f37084g;
                if (l0Var != null && l0Var.isBinderAlive()) {
                    if (Log.isLoggable(C1821f.f36920a, 3)) {
                        Log.d(C1821f.f36920a, "binder is alive, sending the intent.");
                    }
                    this.f37084g.c(this.f37083f.poll());
                } else {
                    d();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @androidx.annotation.B("this")
    private void d() {
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f37085h);
            Log.d(C1821f.f36920a, sb.toString());
        }
        if (this.f37085h) {
            return;
        }
        this.f37085h = true;
        try {
        } catch (SecurityException e4) {
            Log.e(C1821f.f36920a, "Exception while binding the service", e4);
        }
        if (com.google.android.gms.common.stats.b.b().a(this.f37080c, this.f37081d, this, 65)) {
            return;
        }
        Log.e(C1821f.f36920a, "binding to the service failed");
        this.f37085h = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized AbstractC1770k<Void> c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f37082e);
            this.f37083f.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "onServiceConnected: " + componentName);
            }
            this.f37085h = false;
            if (!(iBinder instanceof l0)) {
                Log.e(C1821f.f36920a, "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.f37084g = (l0) iBinder;
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "onServiceDisconnected: " + componentName);
        }
        b();
    }

    @androidx.annotation.i0
    o0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f37083f = new ArrayDeque();
        this.f37085h = false;
        Context applicationContext = context.getApplicationContext();
        this.f37080c = applicationContext;
        this.f37081d = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f37082e = scheduledExecutorService;
    }
}
