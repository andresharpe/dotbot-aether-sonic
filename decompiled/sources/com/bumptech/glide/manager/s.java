package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26698d = "RequestTracker";

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f26699a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.request.e> f26700b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f26701c;

    @i0
    void a(com.bumptech.glide.request.e eVar) {
        this.f26699a.add(eVar);
    }

    public boolean b(@P com.bumptech.glide.request.e eVar) {
        boolean z3 = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f26699a.remove(eVar);
        if (!this.f26700b.remove(eVar) && !remove) {
            z3 = false;
        }
        if (z3) {
            eVar.clear();
        }
        return z3;
    }

    public void c() {
        Iterator it = com.bumptech.glide.util.n.k(this.f26699a).iterator();
        while (it.hasNext()) {
            b((com.bumptech.glide.request.e) it.next());
        }
        this.f26700b.clear();
    }

    public boolean d() {
        return this.f26701c;
    }

    public void e() {
        this.f26701c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f26699a)) {
            if (eVar.isRunning() || eVar.k()) {
                eVar.clear();
                this.f26700b.add(eVar);
            }
        }
    }

    public void f() {
        this.f26701c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f26699a)) {
            if (eVar.isRunning()) {
                eVar.b();
                this.f26700b.add(eVar);
            }
        }
    }

    public void g() {
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f26699a)) {
            if (!eVar.k() && !eVar.g()) {
                eVar.clear();
                if (!this.f26701c) {
                    eVar.i();
                } else {
                    this.f26700b.add(eVar);
                }
            }
        }
    }

    public void h() {
        this.f26701c = false;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f26699a)) {
            if (!eVar.k() && !eVar.isRunning()) {
                eVar.i();
            }
        }
        this.f26700b.clear();
    }

    public void i(@N com.bumptech.glide.request.e eVar) {
        this.f26699a.add(eVar);
        if (!this.f26701c) {
            eVar.i();
            return;
        }
        eVar.clear();
        if (Log.isLoggable(f26698d, 2)) {
            Log.v(f26698d, "Paused, delaying request");
        }
        this.f26700b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f26699a.size() + ", isPaused=" + this.f26701c + "}";
    }
}
