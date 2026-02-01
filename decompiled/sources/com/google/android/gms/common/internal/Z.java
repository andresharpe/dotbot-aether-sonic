package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class Z implements Handler.Callback {

    /* renamed from: c, reason: collision with root package name */
    @NotOnlyInitialized
    private final Y f28671c;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f28678j;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<i.b> f28672d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final ArrayList<i.b> f28673e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<i.c> f28674f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f28675g = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f28676h = new AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    private boolean f28677i = false;

    /* renamed from: k, reason: collision with root package name */
    private final Object f28679k = new Object();

    public Z(Looper looper, Y y3) {
        this.f28671c = y3;
        this.f28678j = new com.google.android.gms.internal.base.q(looper, this);
    }

    public final void a() {
        this.f28675g = false;
        this.f28676h.incrementAndGet();
    }

    public final void b() {
        this.f28675g = true;
    }

    @com.google.android.gms.common.util.D
    public final void c(C1231c c1231c) {
        C1285y.e(this.f28678j, "onConnectionFailure must only be called on the Handler thread");
        this.f28678j.removeMessages(1);
        synchronized (this.f28679k) {
            try {
                ArrayList arrayList = new ArrayList(this.f28674f);
                int i4 = this.f28676h.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.c cVar = (i.c) it.next();
                    if (this.f28675g && this.f28676h.get() == i4) {
                        if (this.f28674f.contains(cVar)) {
                            cVar.A(c1231c);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    @com.google.android.gms.common.util.D
    public final void d(@androidx.annotation.P Bundle bundle) {
        C1285y.e(this.f28678j, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f28679k) {
            try {
                C1285y.r(!this.f28677i);
                this.f28678j.removeMessages(1);
                this.f28677i = true;
                C1285y.r(this.f28673e.isEmpty());
                ArrayList arrayList = new ArrayList(this.f28672d);
                int i4 = this.f28676h.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.b bVar = (i.b) it.next();
                    if (!this.f28675g || !this.f28671c.a() || this.f28676h.get() != i4) {
                        break;
                    } else if (!this.f28673e.contains(bVar)) {
                        bVar.G(bundle);
                    }
                }
                this.f28673e.clear();
                this.f28677i = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @com.google.android.gms.common.util.D
    public final void e(int i4) {
        C1285y.e(this.f28678j, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f28678j.removeMessages(1);
        synchronized (this.f28679k) {
            try {
                this.f28677i = true;
                ArrayList arrayList = new ArrayList(this.f28672d);
                int i5 = this.f28676h.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i.b bVar = (i.b) it.next();
                    if (!this.f28675g || this.f28676h.get() != i5) {
                        break;
                    } else if (this.f28672d.contains(bVar)) {
                        bVar.v(i4);
                    }
                }
                this.f28673e.clear();
                this.f28677i = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(i.b bVar) {
        C1285y.l(bVar);
        synchronized (this.f28679k) {
            try {
                if (this.f28672d.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.f28672d.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f28671c.a()) {
            Handler handler = this.f28678j;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(i.c cVar) {
        C1285y.l(cVar);
        synchronized (this.f28679k) {
            try {
                if (this.f28674f.contains(cVar)) {
                    String valueOf = String.valueOf(cVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                    sb.append("registerConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.f28674f.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(i.b bVar) {
        C1285y.l(bVar);
        synchronized (this.f28679k) {
            try {
                if (!this.f28672d.remove(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                    sb.append("unregisterConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                } else if (this.f28677i) {
                    this.f28673e.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            i.b bVar = (i.b) message.obj;
            synchronized (this.f28679k) {
                try {
                    if (this.f28675g && this.f28671c.a() && this.f28672d.contains(bVar)) {
                        bVar.G(null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i4);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public final void i(i.c cVar) {
        C1285y.l(cVar);
        synchronized (this.f28679k) {
            try {
                if (!this.f28674f.remove(cVar)) {
                    String valueOf = String.valueOf(cVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                    sb.append("unregisterConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(i.b bVar) {
        boolean contains;
        C1285y.l(bVar);
        synchronized (this.f28679k) {
            contains = this.f28672d.contains(bVar);
        }
        return contains;
    }

    public final boolean k(i.c cVar) {
        boolean contains;
        C1285y.l(cVar);
        synchronized (this.f28679k) {
            contains = this.f28674f.contains(cVar);
        }
        return contains;
    }
}
