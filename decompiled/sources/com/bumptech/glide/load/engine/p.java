package com.bumptech.glide.load.engine;

import androidx.annotation.N;

/* loaded from: classes.dex */
class p<Z> implements u<Z> {

    /* renamed from: E, reason: collision with root package name */
    private final boolean f26184E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f26185F;

    /* renamed from: G, reason: collision with root package name */
    private final u<Z> f26186G;

    /* renamed from: H, reason: collision with root package name */
    private final a f26187H;

    /* renamed from: I, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26188I;

    /* renamed from: J, reason: collision with root package name */
    private int f26189J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f26190K;

    /* loaded from: classes.dex */
    interface a {
        void d(com.bumptech.glide.load.c cVar, p<?> pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(u<Z> uVar, boolean z3, boolean z4, com.bumptech.glide.load.c cVar, a aVar) {
        this.f26186G = (u) com.bumptech.glide.util.l.d(uVar);
        this.f26184E = z3;
        this.f26185F = z4;
        this.f26188I = cVar;
        this.f26187H = (a) com.bumptech.glide.util.l.d(aVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void a() {
        if (this.f26189J <= 0) {
            if (!this.f26190K) {
                this.f26190K = true;
                if (this.f26185F) {
                    this.f26186G.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        if (!this.f26190K) {
            this.f26189J++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return this.f26186G.c();
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<Z> d() {
        return this.f26186G.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u<Z> e() {
        return this.f26186G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f26184E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        boolean z3;
        synchronized (this) {
            int i4 = this.f26189J;
            if (i4 > 0) {
                z3 = true;
                int i5 = i4 - 1;
                this.f26189J = i5;
                if (i5 != 0) {
                    z3 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z3) {
            this.f26187H.d(this.f26188I, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Z get() {
        return this.f26186G.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f26184E + ", listener=" + this.f26187H + ", key=" + this.f26188I + ", acquired=" + this.f26189J + ", isRecycled=" + this.f26190K + ", resource=" + this.f26186G + '}';
    }
}
