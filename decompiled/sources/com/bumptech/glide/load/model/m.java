package com.bumptech.glide.load.model;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.Queue;

/* loaded from: classes.dex */
public class m<A, B> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f26319b = 250;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.i<b<A>, B> f26320a;

    /* loaded from: classes.dex */
    class a extends com.bumptech.glide.util.i<b<A>, B> {
        a(long j4) {
            super(j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.i
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void n(@N b<A> bVar, @P B b4) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f26322d = com.bumptech.glide.util.n.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f26323a;

        /* renamed from: b, reason: collision with root package name */
        private int f26324b;

        /* renamed from: c, reason: collision with root package name */
        private A f26325c;

        private b() {
        }

        static <A> b<A> a(A a4, int i4, int i5) {
            b<A> bVar;
            Queue<b<?>> queue = f26322d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a4, i4, i5);
            return bVar;
        }

        private void b(A a4, int i4, int i5) {
            this.f26325c = a4;
            this.f26324b = i4;
            this.f26323a = i5;
        }

        public void c() {
            Queue<b<?>> queue = f26322d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26324b != bVar.f26324b || this.f26323a != bVar.f26323a || !this.f26325c.equals(bVar.f26325c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f26323a * 31) + this.f26324b) * 31) + this.f26325c.hashCode();
        }
    }

    public m() {
        this(250L);
    }

    public void a() {
        this.f26320a.b();
    }

    @P
    public B b(A a4, int i4, int i5) {
        b<A> a5 = b.a(a4, i4, i5);
        B k4 = this.f26320a.k(a5);
        a5.c();
        return k4;
    }

    public void c(A a4, int i4, int i5, B b4) {
        this.f26320a.o(b.a(a4, i4, i5), b4);
    }

    public m(long j4) {
        this.f26320a = new a(j4);
    }
}
