package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.V;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j implements ComponentCallbacks2, m, g<i<Drawable>> {

    /* renamed from: P, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f25752P = com.bumptech.glide.request.h.a1(Bitmap.class).o0();

    /* renamed from: Q, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f25753Q = com.bumptech.glide.request.h.a1(com.bumptech.glide.load.resource.gif.c.class).o0();

    /* renamed from: R, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f25754R = com.bumptech.glide.request.h.b1(com.bumptech.glide.load.engine.j.f26111c).C0(Priority.LOW).K0(true);

    /* renamed from: E, reason: collision with root package name */
    protected final com.bumptech.glide.b f25755E;

    /* renamed from: F, reason: collision with root package name */
    protected final Context f25756F;

    /* renamed from: G, reason: collision with root package name */
    final l f25757G;

    /* renamed from: H, reason: collision with root package name */
    @B("this")
    private final s f25758H;

    /* renamed from: I, reason: collision with root package name */
    @B("this")
    private final r f25759I;

    /* renamed from: J, reason: collision with root package name */
    @B("this")
    private final t f25760J;

    /* renamed from: K, reason: collision with root package name */
    private final Runnable f25761K;

    /* renamed from: L, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f25762L;

    /* renamed from: M, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> f25763M;

    /* renamed from: N, reason: collision with root package name */
    @B("this")
    private com.bumptech.glide.request.h f25764N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f25765O;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f25757G.a(jVar);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends com.bumptech.glide.request.target.f<View, Object> {
        b(@N View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void e(@N Object obj, @P com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@P Drawable drawable) {
        }
    }

    /* loaded from: classes.dex */
    private class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        @B("RequestManager.this")
        private final s f25767a;

        c(@N s sVar) {
            this.f25767a = sVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean z3) {
            if (z3) {
                synchronized (j.this) {
                    this.f25767a.g();
                }
            }
        }
    }

    public j(@N com.bumptech.glide.b bVar, @N l lVar, @N r rVar, @N Context context) {
        this(bVar, lVar, rVar, new s(), bVar.i(), context);
    }

    private void d0(@N p<?> pVar) {
        boolean c02 = c0(pVar);
        com.bumptech.glide.request.e q4 = pVar.q();
        if (!c02 && !this.f25755E.w(pVar) && q4 != null) {
            pVar.l(null);
            q4.clear();
        }
    }

    private synchronized void e0(@N com.bumptech.glide.request.h hVar) {
        this.f25764N = this.f25764N.a(hVar);
    }

    @N
    @InterfaceC0567j
    public i<com.bumptech.glide.load.resource.gif.c> A() {
        return w(com.bumptech.glide.load.resource.gif.c.class).a(f25753Q);
    }

    public void B(@N View view) {
        C(new b(view));
    }

    public void C(@P p<?> pVar) {
        if (pVar == null) {
            return;
        }
        d0(pVar);
    }

    @N
    @InterfaceC0567j
    public i<File> D(@P Object obj) {
        return E().n(obj);
    }

    @N
    @InterfaceC0567j
    public i<File> E() {
        return w(File.class).a(f25754R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.request.g<Object>> F() {
        return this.f25763M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized com.bumptech.glide.request.h G() {
        return this.f25764N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public <T> k<?, T> H(Class<T> cls) {
        return this.f25755E.k().e(cls);
    }

    public synchronized boolean I() {
        return this.f25758H.d();
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public i<Drawable> k(@P Bitmap bitmap) {
        return y().k(bitmap);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public i<Drawable> j(@P Drawable drawable) {
        return y().j(drawable);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public i<Drawable> g(@P Uri uri) {
        return y().g(uri);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public i<Drawable> i(@P File file) {
        return y().i(file);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public i<Drawable> o(@P @V @InterfaceC0578v Integer num) {
        return y().o(num);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public i<Drawable> n(@P Object obj) {
        return y().n(obj);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public i<Drawable> t(@P String str) {
        return y().t(str);
    }

    @Override // com.bumptech.glide.g
    @InterfaceC0567j
    @Deprecated
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public i<Drawable> f(@P URL url) {
        return y().f(url);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public i<Drawable> h(@P byte[] bArr) {
        return y().h(bArr);
    }

    public synchronized void S() {
        this.f25758H.e();
    }

    public synchronized void T() {
        S();
        Iterator<j> it = this.f25759I.a().iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    public synchronized void U() {
        this.f25758H.f();
    }

    public synchronized void V() {
        U();
        Iterator<j> it = this.f25759I.a().iterator();
        while (it.hasNext()) {
            it.next().U();
        }
    }

    public synchronized void W() {
        this.f25758H.h();
    }

    public synchronized void X() {
        n.b();
        W();
        Iterator<j> it = this.f25759I.a().iterator();
        while (it.hasNext()) {
            it.next().W();
        }
    }

    @N
    public synchronized j Y(@N com.bumptech.glide.request.h hVar) {
        a0(hVar);
        return this;
    }

    public void Z(boolean z3) {
        this.f25765O = z3;
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void a() {
        U();
        this.f25760J.a();
    }

    protected synchronized void a0(@N com.bumptech.glide.request.h hVar) {
        this.f25764N = hVar.p().b();
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void b() {
        W();
        this.f25760J.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b0(@N p<?> pVar, @N com.bumptech.glide.request.e eVar) {
        this.f25760J.h(pVar);
        this.f25758H.i(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c0(@N p<?> pVar) {
        com.bumptech.glide.request.e q4 = pVar.q();
        if (q4 == null) {
            return true;
        }
        if (this.f25758H.b(q4)) {
            this.f25760J.i(pVar);
            pVar.l(null);
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void d() {
        try {
            this.f25760J.d();
            Iterator<p<?>> it = this.f25760J.g().iterator();
            while (it.hasNext()) {
                C(it.next());
            }
            this.f25760J.f();
            this.f25758H.c();
            this.f25757G.b(this);
            this.f25757G.b(this.f25762L);
            n.y(this.f25761K);
            this.f25755E.B(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        if (i4 == 60 && this.f25765O) {
            T();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f25758H + ", treeNode=" + this.f25759I + "}";
    }

    public j u(com.bumptech.glide.request.g<Object> gVar) {
        this.f25763M.add(gVar);
        return this;
    }

    @N
    public synchronized j v(@N com.bumptech.glide.request.h hVar) {
        e0(hVar);
        return this;
    }

    @N
    @InterfaceC0567j
    public <ResourceType> i<ResourceType> w(@N Class<ResourceType> cls) {
        return new i<>(this.f25755E, this, cls, this.f25756F);
    }

    @N
    @InterfaceC0567j
    public i<Bitmap> x() {
        return w(Bitmap.class).a(f25752P);
    }

    @N
    @InterfaceC0567j
    public i<Drawable> y() {
        return w(Drawable.class);
    }

    @N
    @InterfaceC0567j
    public i<File> z() {
        return w(File.class).a(com.bumptech.glide.request.h.u1(true));
    }

    j(com.bumptech.glide.b bVar, l lVar, r rVar, s sVar, com.bumptech.glide.manager.d dVar, Context context) {
        this.f25760J = new t();
        a aVar = new a();
        this.f25761K = aVar;
        this.f25755E = bVar;
        this.f25757G = lVar;
        this.f25759I = rVar;
        this.f25758H = sVar;
        this.f25756F = context;
        com.bumptech.glide.manager.c a4 = dVar.a(context.getApplicationContext(), new c(sVar));
        this.f25762L = a4;
        if (n.t()) {
            n.x(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(a4);
        this.f25763M = new CopyOnWriteArrayList<>(bVar.k().c());
        a0(bVar.k().d());
        bVar.v(this);
    }
}
