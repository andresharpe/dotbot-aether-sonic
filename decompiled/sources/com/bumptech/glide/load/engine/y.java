package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.n;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y implements f, f.a {

    /* renamed from: L, reason: collision with root package name */
    private static final String f26255L = "SourceGenerator";

    /* renamed from: E, reason: collision with root package name */
    private final g<?> f26256E;

    /* renamed from: F, reason: collision with root package name */
    private final f.a f26257F;

    /* renamed from: G, reason: collision with root package name */
    private int f26258G;

    /* renamed from: H, reason: collision with root package name */
    private c f26259H;

    /* renamed from: I, reason: collision with root package name */
    private Object f26260I;

    /* renamed from: J, reason: collision with root package name */
    private volatile n.a<?> f26261J;

    /* renamed from: K, reason: collision with root package name */
    private d f26262K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.a<Object> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ n.a f26263E;

        a(n.a aVar) {
            this.f26263E = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@N Exception exc) {
            if (y.this.g(this.f26263E)) {
                y.this.i(this.f26263E, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@P Object obj) {
            if (y.this.g(this.f26263E)) {
                y.this.h(this.f26263E, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(g<?> gVar, f.a aVar) {
        this.f26256E = gVar;
        this.f26257F = aVar;
    }

    private void c(Object obj) {
        long b4 = com.bumptech.glide.util.h.b();
        try {
            com.bumptech.glide.load.a<X> p4 = this.f26256E.p(obj);
            e eVar = new e(p4, obj, this.f26256E.k());
            this.f26262K = new d(this.f26261J.f26326a, this.f26256E.o());
            this.f26256E.d().a(this.f26262K, eVar);
            if (Log.isLoggable(f26255L, 2)) {
                Log.v(f26255L, "Finished encoding source to cache, key: " + this.f26262K + ", data: " + obj + ", encoder: " + p4 + ", duration: " + com.bumptech.glide.util.h.a(b4));
            }
            this.f26261J.f26328c.b();
            this.f26259H = new c(Collections.singletonList(this.f26261J.f26326a), this.f26256E, this);
        } catch (Throwable th) {
            this.f26261J.f26328c.b();
            throw th;
        }
    }

    private boolean d() {
        if (this.f26258G < this.f26256E.g().size()) {
            return true;
        }
        return false;
    }

    private void j(n.a<?> aVar) {
        this.f26261J.f26328c.e(this.f26256E.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        Object obj = this.f26260I;
        if (obj != null) {
            this.f26260I = null;
            c(obj);
        }
        c cVar = this.f26259H;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.f26259H = null;
        this.f26261J = null;
        boolean z3 = false;
        while (!z3 && d()) {
            List<n.a<?>> g4 = this.f26256E.g();
            int i4 = this.f26258G;
            this.f26258G = i4 + 1;
            this.f26261J = g4.get(i4);
            if (this.f26261J != null && (this.f26256E.e().c(this.f26261J.f26328c.d()) || this.f26256E.t(this.f26261J.f26328c.a()))) {
                j(this.f26261J);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        this.f26257F.b(cVar, exc, dVar, this.f26261J.f26328c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f26261J;
        if (aVar != null) {
            aVar.f26328c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f(com.bumptech.glide.load.c cVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2) {
        this.f26257F.f(cVar, obj, dVar, this.f26261J.f26328c.d(), cVar);
    }

    boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.f26261J;
        if (aVar2 != null && aVar2 == aVar) {
            return true;
        }
        return false;
    }

    void h(n.a<?> aVar, Object obj) {
        j e4 = this.f26256E.e();
        if (obj != null && e4.c(aVar.f26328c.d())) {
            this.f26260I = obj;
            this.f26257F.e();
        } else {
            f.a aVar2 = this.f26257F;
            com.bumptech.glide.load.c cVar = aVar.f26326a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f26328c;
            aVar2.f(cVar, obj, dVar, dVar.d(), this.f26262K);
        }
    }

    void i(n.a<?> aVar, @N Exception exc) {
        f.a aVar2 = this.f26257F;
        d dVar = this.f26262K;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f26328c;
        aVar2.b(dVar, exc, dVar2, dVar2.d());
    }
}
