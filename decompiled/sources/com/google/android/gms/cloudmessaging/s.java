package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.K;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements ServiceConnection {

    /* renamed from: e, reason: collision with root package name */
    t f27933e;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ x f27936h;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    int f27931c = 0;

    /* renamed from: d, reason: collision with root package name */
    final Messenger f27932d = new Messenger(new com.google.android.gms.internal.cloudmessaging.f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.l
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            s sVar = s.this;
            int i4 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i4);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (sVar) {
                try {
                    v<?> vVar = sVar.f27935g.get(i4);
                    if (vVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i4);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    sVar.f27935g.remove(i4);
                    sVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        vVar.c(new zzq(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    vVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    final Queue<v<?>> f27934f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    final SparseArray<v<?>> f27935g = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(x xVar, r rVar) {
        this.f27936h = xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i4, @P String str) {
        b(i4, str, null);
    }

    final synchronized void b(int i4, @P String str, @P Throwable th) {
        String str2;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Disconnected: ".concat(valueOf);
                } else {
                    str2 = new String("Disconnected: ");
                }
                Log.d("MessengerIpcClient", str2);
            }
            int i5 = this.f27931c;
            if (i5 != 0) {
                if (i5 != 1 && i5 != 2) {
                    if (i5 != 3) {
                        return;
                    }
                    this.f27931c = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f27931c = 4;
                com.google.android.gms.common.stats.b.b().c(x.a(this.f27936h), this);
                zzq zzqVar = new zzq(i4, str, th);
                Iterator<v<?>> it = this.f27934f.iterator();
                while (it.hasNext()) {
                    it.next().c(zzqVar);
                }
                this.f27934f.clear();
                for (int i6 = 0; i6 < this.f27935g.size(); i6++) {
                    this.f27935g.valueAt(i6).c(zzqVar);
                }
                this.f27935g.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        x.e(this.f27936h).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.n
            @Override // java.lang.Runnable
            public final void run() {
                final v<?> poll;
                final s sVar = s.this;
                while (true) {
                    synchronized (sVar) {
                        try {
                            if (sVar.f27931c != 2) {
                                return;
                            }
                            if (sVar.f27934f.isEmpty()) {
                                sVar.f();
                                return;
                            } else {
                                poll = sVar.f27934f.poll();
                                sVar.f27935g.put(poll.f27939a, poll);
                                x.e(sVar.f27936h).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.q
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        s.this.e(poll.f27939a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a4 = x.a(sVar.f27936h);
                    Messenger messenger = sVar.f27932d;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f27941c;
                    obtain.arg1 = poll.f27939a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a4.getPackageName());
                    bundle.putBundle(C1821f.C0339f.a.f37006R, poll.f27942d);
                    obtain.setData(bundle);
                    try {
                        sVar.f27933e.a(obtain);
                    } catch (RemoteException e4) {
                        sVar.a(2, e4.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f27931c == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i4) {
        v<?> vVar = this.f27935g.get(i4);
        if (vVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i4);
            Log.w("MessengerIpcClient", sb.toString());
            this.f27935g.remove(i4);
            vVar.c(new zzq(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        try {
            if (this.f27931c == 2 && this.f27934f.isEmpty() && this.f27935g.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f27931c = 3;
                com.google.android.gms.common.stats.b.b().c(x.a(this.f27936h), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(v<?> vVar) {
        boolean z3;
        int i4 = this.f27931c;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                this.f27934f.add(vVar);
                c();
                return true;
            }
            this.f27934f.add(vVar);
            return true;
        }
        this.f27934f.add(vVar);
        if (this.f27931c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.r(z3);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f27931c = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!com.google.android.gms.common.stats.b.b().a(x.a(this.f27936h), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                x.e(this.f27936h).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e4) {
            b(0, "Unable to bind to service", e4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @K
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        x.e(this.f27936h).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.p
            @Override // java.lang.Runnable
            public final void run() {
                s sVar = s.this;
                IBinder iBinder2 = iBinder;
                synchronized (sVar) {
                    if (iBinder2 == null) {
                        sVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        sVar.f27933e = new t(iBinder2);
                        sVar.f27931c = 2;
                        sVar.c();
                    } catch (RemoteException e4) {
                        sVar.a(0, e4.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @K
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        x.e(this.f27936h).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.m
            @Override // java.lang.Runnable
            public final void run() {
                s.this.a(2, "Service disconnected");
            }
        });
    }
}
