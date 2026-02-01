package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import androidx.core.util.t;
import com.bumptech.glide.util.pool.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t<Z> implements u<Z>, a.f {

    /* renamed from: I, reason: collision with root package name */
    private static final t.a<t<?>> f26228I = com.bumptech.glide.util.pool.a.e(20, new a());

    /* renamed from: E, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f26229E = com.bumptech.glide.util.pool.c.a();

    /* renamed from: F, reason: collision with root package name */
    private u<Z> f26230F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f26231G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26232H;

    /* loaded from: classes.dex */
    class a implements a.d<t<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t<?> a() {
            return new t<>();
        }
    }

    t() {
    }

    private void b(u<Z> uVar) {
        this.f26232H = false;
        this.f26231G = true;
        this.f26230F = uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static <Z> t<Z> e(u<Z> uVar) {
        t<Z> tVar = (t) com.bumptech.glide.util.l.d(f26228I.b());
        tVar.b(uVar);
        return tVar;
    }

    private void f() {
        this.f26230F = null;
        f26228I.a(this);
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void a() {
        this.f26229E.c();
        this.f26232H = true;
        if (!this.f26231G) {
            this.f26230F.a();
            f();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return this.f26230F.c();
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<Z> d() {
        return this.f26230F.d();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @N
    public com.bumptech.glide.util.pool.c g() {
        return this.f26229E;
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Z get() {
        return this.f26230F.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void h() {
        this.f26229E.c();
        if (this.f26231G) {
            this.f26231G = false;
            if (this.f26232H) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
