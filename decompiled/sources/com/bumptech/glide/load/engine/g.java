package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<n.a<?>> f26041a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.c> f26042b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f26043c;

    /* renamed from: d, reason: collision with root package name */
    private Object f26044d;

    /* renamed from: e, reason: collision with root package name */
    private int f26045e;

    /* renamed from: f, reason: collision with root package name */
    private int f26046f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f26047g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f26048h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.f f26049i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.i<?>> f26050j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f26051k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26052l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26053m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.c f26054n;

    /* renamed from: o, reason: collision with root package name */
    private Priority f26055o;

    /* renamed from: p, reason: collision with root package name */
    private j f26056p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26057q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26058r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f26043c = null;
        this.f26044d = null;
        this.f26054n = null;
        this.f26047g = null;
        this.f26051k = null;
        this.f26049i = null;
        this.f26055o = null;
        this.f26050j = null;
        this.f26056p = null;
        this.f26041a.clear();
        this.f26052l = false;
        this.f26042b.clear();
        this.f26053m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f26043c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.load.c> c() {
        if (!this.f26053m) {
            this.f26053m = true;
            this.f26042b.clear();
            List<n.a<?>> g4 = g();
            int size = g4.size();
            for (int i4 = 0; i4 < size; i4++) {
                n.a<?> aVar = g4.get(i4);
                if (!this.f26042b.contains(aVar.f26326a)) {
                    this.f26042b.add(aVar.f26326a);
                }
                for (int i5 = 0; i5 < aVar.f26327b.size(); i5++) {
                    if (!this.f26042b.contains(aVar.f26327b.get(i5))) {
                        this.f26042b.add(aVar.f26327b.get(i5));
                    }
                }
            }
        }
        return this.f26042b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.engine.cache.a d() {
        return this.f26048h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        return this.f26056p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f26046f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n.a<?>> g() {
        if (!this.f26052l) {
            this.f26052l = true;
            this.f26041a.clear();
            List i4 = this.f26043c.i().i(this.f26044d);
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                n.a<?> b4 = ((com.bumptech.glide.load.model.n) i4.get(i5)).b(this.f26044d, this.f26045e, this.f26046f, this.f26049i);
                if (b4 != null) {
                    this.f26041a.add(b4);
                }
            }
        }
        return this.f26041a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f26043c.i().h(cls, this.f26047g, this.f26051k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f26044d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.load.model.n<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f26043c.i().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.f k() {
        return this.f26049i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Priority l() {
        return this.f26055o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f26043c.i().j(this.f26044d.getClass(), this.f26047g, this.f26051k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> com.bumptech.glide.load.h<Z> n(u<Z> uVar) {
        return this.f26043c.i().k(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.c o() {
        return this.f26054n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> com.bumptech.glide.load.a<X> p(X x3) throws Registry.NoSourceEncoderAvailableException {
        return this.f26043c.i().m(x3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> q() {
        return this.f26051k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> com.bumptech.glide.load.i<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.i<Z> iVar = (com.bumptech.glide.load.i) this.f26050j.get(cls);
        if (iVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.i<?>>> it = this.f26050j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.i<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    iVar = (com.bumptech.glide.load.i) next.getValue();
                    break;
                }
            }
        }
        if (iVar == null) {
            if (this.f26050j.isEmpty() && this.f26057q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return com.bumptech.glide.load.resource.m.c();
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f26045e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i4, int i5, j jVar, Class<?> cls, Class<R> cls2, Priority priority, com.bumptech.glide.load.f fVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z3, boolean z4, h.e eVar) {
        this.f26043c = dVar;
        this.f26044d = obj;
        this.f26054n = cVar;
        this.f26045e = i4;
        this.f26046f = i5;
        this.f26056p = jVar;
        this.f26047g = cls;
        this.f26048h = eVar;
        this.f26051k = cls2;
        this.f26055o = priority;
        this.f26049i = fVar;
        this.f26050j = map;
        this.f26057q = z3;
        this.f26058r = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(u<?> uVar) {
        return this.f26043c.i().n(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f26058r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(com.bumptech.glide.load.c cVar) {
        List<n.a<?>> g4 = g();
        int size = g4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (g4.get(i4).f26326a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }
}
