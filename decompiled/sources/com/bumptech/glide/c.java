package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.manager.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.k f25387c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.e f25388d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f25389e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.j f25390f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f25391g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f25392h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0226a f25393i;

    /* renamed from: j, reason: collision with root package name */
    private l f25394j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.manager.d f25395k;

    /* renamed from: n, reason: collision with root package name */
    @P
    private q.b f25398n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f25399o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25400p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private List<com.bumptech.glide.request.g<Object>> f25401q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, k<?, ?>> f25385a = new androidx.collection.a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f25386b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f25396l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f25397m = new a();

    /* loaded from: classes.dex */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        @N
        public com.bumptech.glide.request.h a() {
            return new com.bumptech.glide.request.h();
        }
    }

    /* loaded from: classes.dex */
    class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.h f25403a;

        b(com.bumptech.glide.request.h hVar) {
            this.f25403a = hVar;
        }

        @Override // com.bumptech.glide.b.a
        @N
        public com.bumptech.glide.request.h a() {
            com.bumptech.glide.request.h hVar = this.f25403a;
            if (hVar == null) {
                return new com.bumptech.glide.request.h();
            }
            return hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0219c implements e.b {
        C0219c() {
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements e.b {
    }

    /* loaded from: classes.dex */
    static final class e implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final int f25405a;

        e(int i4) {
            this.f25405a = i4;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements e.b {
        private f() {
        }
    }

    @N
    public c a(@N com.bumptech.glide.request.g<Object> gVar) {
        if (this.f25401q == null) {
            this.f25401q = new ArrayList();
        }
        this.f25401q.add(gVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public com.bumptech.glide.b b(@N Context context) {
        if (this.f25391g == null) {
            this.f25391g = com.bumptech.glide.load.engine.executor.a.j();
        }
        if (this.f25392h == null) {
            this.f25392h = com.bumptech.glide.load.engine.executor.a.f();
        }
        if (this.f25399o == null) {
            this.f25399o = com.bumptech.glide.load.engine.executor.a.c();
        }
        if (this.f25394j == null) {
            this.f25394j = new l.a(context).a();
        }
        if (this.f25395k == null) {
            this.f25395k = new com.bumptech.glide.manager.f();
        }
        if (this.f25388d == null) {
            int b4 = this.f25394j.b();
            if (b4 > 0) {
                this.f25388d = new com.bumptech.glide.load.engine.bitmap_recycle.l(b4);
            } else {
                this.f25388d = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f25389e == null) {
            this.f25389e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f25394j.a());
        }
        if (this.f25390f == null) {
            this.f25390f = new com.bumptech.glide.load.engine.cache.i(this.f25394j.d());
        }
        if (this.f25393i == null) {
            this.f25393i = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f25387c == null) {
            this.f25387c = new com.bumptech.glide.load.engine.k(this.f25390f, this.f25393i, this.f25392h, this.f25391g, com.bumptech.glide.load.engine.executor.a.m(), this.f25399o, this.f25400p);
        }
        List<com.bumptech.glide.request.g<Object>> list = this.f25401q;
        if (list == null) {
            this.f25401q = Collections.emptyList();
        } else {
            this.f25401q = Collections.unmodifiableList(list);
        }
        com.bumptech.glide.e c4 = this.f25386b.c();
        return new com.bumptech.glide.b(context, this.f25387c, this.f25390f, this.f25388d, this.f25389e, new q(this.f25398n, c4), this.f25395k, this.f25396l, this.f25397m, this.f25385a, this.f25401q, c4);
    }

    @N
    public c c(@P com.bumptech.glide.load.engine.executor.a aVar) {
        this.f25399o = aVar;
        return this;
    }

    @N
    public c d(@P com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f25389e = bVar;
        return this;
    }

    @N
    public c e(@P com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f25388d = eVar;
        return this;
    }

    @N
    public c f(@P com.bumptech.glide.manager.d dVar) {
        this.f25395k = dVar;
        return this;
    }

    @N
    public c g(@N b.a aVar) {
        this.f25397m = (b.a) com.bumptech.glide.util.l.d(aVar);
        return this;
    }

    @N
    public c h(@P com.bumptech.glide.request.h hVar) {
        return g(new b(hVar));
    }

    @N
    public <T> c i(@N Class<T> cls, @P k<?, T> kVar) {
        this.f25385a.put(cls, kVar);
        return this;
    }

    @N
    public c j(@P a.InterfaceC0226a interfaceC0226a) {
        this.f25393i = interfaceC0226a;
        return this;
    }

    @N
    public c k(@P com.bumptech.glide.load.engine.executor.a aVar) {
        this.f25392h = aVar;
        return this;
    }

    c l(com.bumptech.glide.load.engine.k kVar) {
        this.f25387c = kVar;
        return this;
    }

    public c m(boolean z3) {
        boolean z4;
        e.a aVar = this.f25386b;
        C0219c c0219c = new C0219c();
        if (z3 && Build.VERSION.SDK_INT >= 29) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.d(c0219c, z4);
        return this;
    }

    @N
    public c n(boolean z3) {
        this.f25400p = z3;
        return this;
    }

    @N
    public c o(int i4) {
        if (i4 >= 2 && i4 <= 6) {
            this.f25396l = i4;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }

    public c p(boolean z3) {
        this.f25386b.d(new d(), z3);
        return this;
    }

    @N
    public c q(@P com.bumptech.glide.load.engine.cache.j jVar) {
        this.f25390f = jVar;
        return this;
    }

    @N
    public c r(@N l.a aVar) {
        return s(aVar.a());
    }

    @N
    public c s(@P l lVar) {
        this.f25394j = lVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(@P q.b bVar) {
        this.f25398n = bVar;
    }

    @Deprecated
    public c u(@P com.bumptech.glide.load.engine.executor.a aVar) {
        return v(aVar);
    }

    @N
    public c v(@P com.bumptech.glide.load.engine.executor.a aVar) {
        this.f25391g = aVar;
        return this;
    }
}
