package com.bumptech.glide.util.pool;

import androidx.annotation.N;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f26977a = false;

    /* loaded from: classes.dex */
    private static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile RuntimeException f26978b;

        b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean z3) {
            if (z3) {
                this.f26978b = new RuntimeException("Released");
            } else {
                this.f26978b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f26978b == null) {
            } else {
                throw new IllegalStateException("Already released", this.f26978b);
            }
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0244c extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f26979b;

        C0244c() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean z3) {
            this.f26979b = z3;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (!this.f26979b) {
            } else {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @N
    public static c a() {
        return new C0244c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(boolean z3);

    public abstract void c();

    private c() {
    }
}
