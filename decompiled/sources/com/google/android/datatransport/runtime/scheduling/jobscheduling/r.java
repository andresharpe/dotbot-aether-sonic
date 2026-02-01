package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.i0;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1141k;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1133c;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import z0.C2447a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: j, reason: collision with root package name */
    private static final String f27570j = "Uploader";

    /* renamed from: k, reason: collision with root package name */
    private static final String f27571k = "GDT_CLIENT_METRICS";

    /* renamed from: a, reason: collision with root package name */
    private final Context f27572a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f27573b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1134d f27574c;

    /* renamed from: d, reason: collision with root package name */
    private final x f27575d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f27576e;

    /* renamed from: f, reason: collision with root package name */
    private final B0.a f27577f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27578g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27579h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1133c f27580i;

    @O2.a
    public r(Context context, com.google.android.datatransport.runtime.backends.e eVar, InterfaceC1134d interfaceC1134d, x xVar, Executor executor, B0.a aVar, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar2, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar3, InterfaceC1133c interfaceC1133c) {
        this.f27572a = context;
        this.f27573b = eVar;
        this.f27574c = interfaceC1134d;
        this.f27575d = xVar;
        this.f27576e = executor;
        this.f27577f = aVar;
        this.f27578g = aVar2;
        this.f27579h = aVar3;
        this.f27580i = interfaceC1133c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(com.google.android.datatransport.runtime.q qVar) {
        return Boolean.valueOf(this.f27574c.S0(qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(com.google.android.datatransport.runtime.q qVar) {
        return this.f27574c.C(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, com.google.android.datatransport.runtime.q qVar, long j4) {
        this.f27574c.T0(iterable);
        this.f27574c.J(qVar, this.f27578g.a() + j4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f27574c.r(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f27580i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f27580i.d(((Integer) r0.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(com.google.android.datatransport.runtime.q qVar, long j4) {
        this.f27574c.J(qVar, this.f27578g.a() + j4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(com.google.android.datatransport.runtime.q qVar, int i4) {
        this.f27575d.a(qVar, i4 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final com.google.android.datatransport.runtime.q qVar, final int i4, Runnable runnable) {
        try {
            try {
                B0.a aVar = this.f27577f;
                final InterfaceC1134d interfaceC1134d = this.f27574c;
                Objects.requireNonNull(interfaceC1134d);
                aVar.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    @Override // B0.a.InterfaceC0001a
                    public final Object a() {
                        return Integer.valueOf(InterfaceC1134d.this.o());
                    }
                });
                if (!k()) {
                    this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                        @Override // B0.a.InterfaceC0001a
                        public final Object a() {
                            Object s4;
                            s4 = r.this.s(qVar, i4);
                            return s4;
                        }
                    });
                } else {
                    u(qVar, i4);
                }
            } catch (SynchronizationException unused) {
                this.f27575d.a(qVar, i4 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    @i0
    public com.google.android.datatransport.runtime.j j(com.google.android.datatransport.runtime.backends.m mVar) {
        B0.a aVar = this.f27577f;
        final InterfaceC1133c interfaceC1133c = this.f27580i;
        Objects.requireNonNull(interfaceC1133c);
        return mVar.b(com.google.android.datatransport.runtime.j.a().i(this.f27578g.a()).k(this.f27579h.a()).j(f27571k).h(new com.google.android.datatransport.runtime.i(com.google.android.datatransport.c.b("proto"), ((com.google.android.datatransport.runtime.firebase.transport.a) aVar.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
            @Override // B0.a.InterfaceC0001a
            public final Object a() {
                return InterfaceC1133c.this.c();
            }
        })).i())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f27572a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    BackendResponse u(final com.google.android.datatransport.runtime.q qVar, int i4) {
        BackendResponse a4;
        com.google.android.datatransport.runtime.backends.m a5 = this.f27573b.a(qVar.b());
        long j4 = 0;
        BackendResponse e4 = BackendResponse.e(0L);
        while (true) {
            final long j5 = j4;
            while (((Boolean) this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                @Override // B0.a.InterfaceC0001a
                public final Object a() {
                    Boolean l4;
                    l4 = r.this.l(qVar);
                    return l4;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                    @Override // B0.a.InterfaceC0001a
                    public final Object a() {
                        Iterable m4;
                        m4 = r.this.m(qVar);
                        return m4;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e4;
                }
                if (a5 == null) {
                    C2447a.c(f27570j, "Unknown backend for %s, deleting event batch for it...", qVar);
                    a4 = BackendResponse.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1141k) it.next()).b());
                    }
                    if (qVar.e()) {
                        arrayList.add(j(a5));
                    }
                    a4 = a5.a(com.google.android.datatransport.runtime.backends.g.a().b(arrayList).c(qVar.c()).a());
                }
                e4 = a4;
                if (e4.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
                        @Override // B0.a.InterfaceC0001a
                        public final Object a() {
                            Object n4;
                            n4 = r.this.n(iterable, qVar, j5);
                            return n4;
                        }
                    });
                    this.f27575d.b(qVar, i4 + 1, true);
                    return e4;
                }
                this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                    @Override // B0.a.InterfaceC0001a
                    public final Object a() {
                        Object o4;
                        o4 = r.this.o(iterable);
                        return o4;
                    }
                });
                if (e4.c() == BackendResponse.Status.OK) {
                    j4 = Math.max(j5, e4.b());
                    if (qVar.e()) {
                        this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.p
                            @Override // B0.a.InterfaceC0001a
                            public final Object a() {
                                Object p4;
                                p4 = r.this.p();
                                return p4;
                            }
                        });
                    }
                } else if (e4.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String l4 = ((AbstractC1141k) it2.next()).b().l();
                        if (!hashMap.containsKey(l4)) {
                            hashMap.put(l4, 1);
                        } else {
                            hashMap.put(l4, Integer.valueOf(((Integer) hashMap.get(l4)).intValue() + 1));
                        }
                    }
                    this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.q
                        @Override // B0.a.InterfaceC0001a
                        public final Object a() {
                            Object q4;
                            q4 = r.this.q(hashMap);
                            return q4;
                        }
                    });
                }
            }
            this.f27577f.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                @Override // B0.a.InterfaceC0001a
                public final Object a() {
                    Object r4;
                    r4 = r.this.r(qVar, j5);
                    return r4;
                }
            });
            return e4;
        }
    }

    public void v(final com.google.android.datatransport.runtime.q qVar, final int i4, final Runnable runnable) {
        this.f27576e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(qVar, i4, runnable);
            }
        });
    }
}
