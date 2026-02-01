package com.bumptech.glide.manager;

import androidx.annotation.N;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: E, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.p<?>> f26702E = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.m
    public void a() {
        Iterator it = com.bumptech.glide.util.n.k(this.f26702E).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
        Iterator it = com.bumptech.glide.util.n.k(this.f26702E).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
        Iterator it = com.bumptech.glide.util.n.k(this.f26702E).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).d();
        }
    }

    public void f() {
        this.f26702E.clear();
    }

    @N
    public List<com.bumptech.glide.request.target.p<?>> g() {
        return com.bumptech.glide.util.n.k(this.f26702E);
    }

    public void h(@N com.bumptech.glide.request.target.p<?> pVar) {
        this.f26702E.add(pVar);
    }

    public void i(@N com.bumptech.glide.request.target.p<?> pVar) {
        this.f26702E.remove(pVar);
    }
}
