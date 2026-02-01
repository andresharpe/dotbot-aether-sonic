package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.B;
import androidx.annotation.P;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.InterfaceC1764e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: o */
    private static final Map f34439o = new HashMap();

    /* renamed from: a */
    private final Context f34440a;

    /* renamed from: b */
    private final i f34441b;

    /* renamed from: g */
    private boolean f34446g;

    /* renamed from: h */
    private final Intent f34447h;

    /* renamed from: l */
    @P
    private ServiceConnection f34451l;

    /* renamed from: m */
    @P
    private IInterface f34452m;

    /* renamed from: n */
    private final com.google.android.play.core.review.h f34453n;

    /* renamed from: d */
    private final List f34443d = new ArrayList();

    /* renamed from: e */
    @B("attachedRemoteTasksLock")
    private final Set f34444e = new HashSet();

    /* renamed from: f */
    private final Object f34445f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f34449j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(t.this);
        }
    };

    /* renamed from: k */
    @B("attachedRemoteTasksLock")
    private final AtomicInteger f34450k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f34442c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i */
    private final WeakReference f34448i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, com.google.android.play.core.review.h hVar, @P o oVar, byte[] bArr) {
        this.f34440a = context;
        this.f34441b = iVar;
        this.f34447h = intent;
        this.f34453n = hVar;
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f34441b.d("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f34448i.get();
        if (oVar != null) {
            tVar.f34441b.d("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f34441b.d("%s : Binder has died.", tVar.f34442c);
            Iterator it = tVar.f34443d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.s());
            }
            tVar.f34443d.clear();
        }
        tVar.t();
    }

    public static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f34452m == null && !tVar.f34446g) {
            tVar.f34441b.d("Initiate binding to the service.", new Object[0]);
            tVar.f34443d.add(jVar);
            s sVar = new s(tVar, null);
            tVar.f34451l = sVar;
            tVar.f34446g = true;
            if (!tVar.f34440a.bindService(tVar.f34447h, sVar, 1)) {
                tVar.f34441b.d("Failed to bind to the service.", new Object[0]);
                tVar.f34446g = false;
                Iterator it = tVar.f34443d.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).c(new zzu());
                }
                tVar.f34443d.clear();
                return;
            }
            return;
        }
        if (tVar.f34446g) {
            tVar.f34441b.d("Waiting to bind to the service.", new Object[0]);
            tVar.f34443d.add(jVar);
        } else {
            jVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f34441b.d("linkToDeath", new Object[0]);
        try {
            tVar.f34452m.asBinder().linkToDeath(tVar.f34449j, 0);
        } catch (RemoteException e4) {
            tVar.f34441b.c(e4, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f34441b.d("unlinkToDeath", new Object[0]);
        tVar.f34452m.asBinder().unlinkToDeath(tVar.f34449j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f34442c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f34445f) {
            try {
                Iterator it = this.f34444e.iterator();
                while (it.hasNext()) {
                    ((C1771l) it.next()).d(s());
                }
                this.f34444e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f34439o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f34442c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f34442c, 10);
                    handlerThread.start();
                    map.put(this.f34442c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f34442c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    @P
    public final IInterface e() {
        return this.f34452m;
    }

    public final void p(j jVar, @P final C1771l c1771l) {
        synchronized (this.f34445f) {
            this.f34444e.add(c1771l);
            c1771l.a().e(new InterfaceC1764e() { // from class: com.google.android.play.core.review.internal.k
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    t.this.q(c1771l, abstractC1770k);
                }
            });
        }
        synchronized (this.f34445f) {
            try {
                if (this.f34450k.getAndIncrement() > 0) {
                    this.f34441b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    public final /* synthetic */ void q(C1771l c1771l, AbstractC1770k abstractC1770k) {
        synchronized (this.f34445f) {
            this.f34444e.remove(c1771l);
        }
    }

    public final void r(C1771l c1771l) {
        synchronized (this.f34445f) {
            this.f34444e.remove(c1771l);
        }
        synchronized (this.f34445f) {
            try {
                if (this.f34450k.get() > 0 && this.f34450k.decrementAndGet() > 0) {
                    this.f34441b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
