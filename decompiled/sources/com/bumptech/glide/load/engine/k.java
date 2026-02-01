package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.util.t;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k implements m, j.a, p.a {

    /* renamed from: j, reason: collision with root package name */
    private static final int f26115j = 150;

    /* renamed from: a, reason: collision with root package name */
    private final r f26117a;

    /* renamed from: b, reason: collision with root package name */
    private final o f26118b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f26119c;

    /* renamed from: d, reason: collision with root package name */
    private final b f26120d;

    /* renamed from: e, reason: collision with root package name */
    private final x f26121e;

    /* renamed from: f, reason: collision with root package name */
    private final c f26122f;

    /* renamed from: g, reason: collision with root package name */
    private final a f26123g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f26124h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f26114i = "Engine";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f26116k = Log.isLoggable(f26114i, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f26125a;

        /* renamed from: b, reason: collision with root package name */
        final t.a<h<?>> f26126b = com.bumptech.glide.util.pool.a.e(k.f26115j, new C0232a());

        /* renamed from: c, reason: collision with root package name */
        private int f26127c;

        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0232a implements a.d<h<?>> {
            C0232a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f26125a, aVar.f26126b);
            }
        }

        a(h.e eVar) {
            this.f26125a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.c cVar, int i4, int i5, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z3, boolean z4, boolean z5, com.bumptech.glide.load.f fVar, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.util.l.d(this.f26126b.b());
            int i6 = this.f26127c;
            this.f26127c = i6 + 1;
            return hVar.r(dVar, obj, nVar, cVar, i4, i5, cls, cls2, priority, jVar, map, z3, z4, z5, fVar, bVar, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f26129a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f26130b;

        /* renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f26131c;

        /* renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f26132d;

        /* renamed from: e, reason: collision with root package name */
        final m f26133e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f26134f;

        /* renamed from: g, reason: collision with root package name */
        final t.a<l<?>> f26135g = com.bumptech.glide.util.pool.a.e(k.f26115j, new a());

        /* loaded from: classes.dex */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f26129a, bVar.f26130b, bVar.f26131c, bVar.f26132d, bVar.f26133e, bVar.f26134f, bVar.f26135g);
            }
        }

        b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5) {
            this.f26129a = aVar;
            this.f26130b = aVar2;
            this.f26131c = aVar3;
            this.f26132d = aVar4;
            this.f26133e = mVar;
            this.f26134f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.c cVar, boolean z3, boolean z4, boolean z5, boolean z6) {
            return ((l) com.bumptech.glide.util.l.d(this.f26135g.b())).l(cVar, z3, z4, z5, z6);
        }

        @i0
        void b() {
            com.bumptech.glide.util.f.c(this.f26129a);
            com.bumptech.glide.util.f.c(this.f26130b);
            com.bumptech.glide.util.f.c(this.f26131c);
            com.bumptech.glide.util.f.c(this.f26132d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0226a f26137a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.cache.a f26138b;

        c(a.InterfaceC0226a interfaceC0226a) {
            this.f26137a = interfaceC0226a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.f26138b == null) {
                synchronized (this) {
                    try {
                        if (this.f26138b == null) {
                            this.f26138b = this.f26137a.a();
                        }
                        if (this.f26138b == null) {
                            this.f26138b = new com.bumptech.glide.load.engine.cache.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f26138b;
        }

        @i0
        synchronized void b() {
            if (this.f26138b == null) {
                return;
            }
            this.f26138b.clear();
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l<?> f26139a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f26140b;

        d(com.bumptech.glide.request.i iVar, l<?> lVar) {
            this.f26140b = iVar;
            this.f26139a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f26139a.s(this.f26140b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0226a interfaceC0226a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, boolean z3) {
        this(jVar, interfaceC0226a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z3);
    }

    private p<?> f(com.bumptech.glide.load.c cVar) {
        u<?> g4 = this.f26119c.g(cVar);
        if (g4 == null) {
            return null;
        }
        if (g4 instanceof p) {
            return (p) g4;
        }
        return new p<>(g4, true, true, cVar, this);
    }

    @P
    private p<?> h(com.bumptech.glide.load.c cVar) {
        p<?> e4 = this.f26124h.e(cVar);
        if (e4 != null) {
            e4.b();
        }
        return e4;
    }

    private p<?> i(com.bumptech.glide.load.c cVar) {
        p<?> f4 = f(cVar);
        if (f4 != null) {
            f4.b();
            this.f26124h.a(cVar, f4);
        }
        return f4;
    }

    @P
    private p<?> j(n nVar, boolean z3, long j4) {
        if (!z3) {
            return null;
        }
        p<?> h4 = h(nVar);
        if (h4 != null) {
            if (f26116k) {
                k("Loaded resource from active resources", j4, nVar);
            }
            return h4;
        }
        p<?> i4 = i(nVar);
        if (i4 == null) {
            return null;
        }
        if (f26116k) {
            k("Loaded resource from cache", j4, nVar);
        }
        return i4;
    }

    private static void k(String str, long j4, com.bumptech.glide.load.c cVar) {
        Log.v(f26114i, str + " in " + com.bumptech.glide.util.h.a(j4) + "ms, key: " + cVar);
    }

    private <R> d n(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i4, int i5, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z3, boolean z4, com.bumptech.glide.load.f fVar, boolean z5, boolean z6, boolean z7, boolean z8, com.bumptech.glide.request.i iVar, Executor executor, n nVar, long j4) {
        l<?> a4 = this.f26117a.a(nVar, z8);
        if (a4 != null) {
            a4.b(iVar, executor);
            if (f26116k) {
                k("Added to existing load", j4, nVar);
            }
            return new d(iVar, a4);
        }
        l<R> a5 = this.f26120d.a(nVar, z5, z6, z7, z8);
        h<R> a6 = this.f26123g.a(dVar, obj, nVar, cVar, i4, i5, cls, cls2, priority, jVar, map, z3, z4, z8, fVar, a5);
        this.f26117a.d(nVar, a5);
        a5.b(iVar, executor);
        a5.t(a6);
        if (f26116k) {
            k("Started new load", j4, nVar);
        }
        return new d(iVar, a5);
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void a(@N u<?> uVar) {
        this.f26121e.a(uVar, true);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.c cVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.f()) {
                    this.f26124h.a(cVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26117a.e(cVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.c cVar) {
        this.f26117a.e(cVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void d(com.bumptech.glide.load.c cVar, p<?> pVar) {
        this.f26124h.d(cVar);
        if (pVar.f()) {
            this.f26119c.f(cVar, pVar);
        } else {
            this.f26121e.a(pVar, false);
        }
    }

    public void e() {
        this.f26122f.a().clear();
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i4, int i5, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z3, boolean z4, com.bumptech.glide.load.f fVar, boolean z5, boolean z6, boolean z7, boolean z8, com.bumptech.glide.request.i iVar, Executor executor) {
        long b4 = f26116k ? com.bumptech.glide.util.h.b() : 0L;
        n a4 = this.f26118b.a(obj, cVar, i4, i5, map, cls, cls2, fVar);
        synchronized (this) {
            try {
                p<?> j4 = j(a4, z5, b4);
                if (j4 == null) {
                    return n(dVar, obj, cVar, i4, i5, cls, cls2, priority, jVar, map, z3, z4, fVar, z5, z6, z7, z8, iVar, executor, a4, b4);
                }
                iVar.d(j4, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(u<?> uVar) {
        if (uVar instanceof p) {
            ((p) uVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @i0
    public void m() {
        this.f26120d.b();
        this.f26122f.b();
        this.f26124h.h();
    }

    @i0
    k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0226a interfaceC0226a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, r rVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, x xVar, boolean z3) {
        this.f26119c = jVar;
        c cVar = new c(interfaceC0226a);
        this.f26122f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z3) : aVar5;
        this.f26124h = aVar7;
        aVar7.g(this);
        this.f26118b = oVar == null ? new o() : oVar;
        this.f26117a = rVar == null ? new r() : rVar;
        this.f26120d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f26123g = aVar6 == null ? new a(cVar) : aVar6;
        this.f26121e = xVar == null ? new x() : xVar;
        jVar.h(this);
    }
}
