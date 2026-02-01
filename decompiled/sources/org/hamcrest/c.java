package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final C0514c<Object> f55423a = new C0514c<>();

    /* loaded from: classes2.dex */
    private static final class b<T> extends c<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f55424b;

        /* renamed from: c, reason: collision with root package name */
        private final g f55425c;

        @Override // org.hamcrest.c
        public <U> c<U> a(d<? super T, U> dVar) {
            return dVar.a(this.f55424b, this.f55425c);
        }

        @Override // org.hamcrest.c
        public boolean d(k<T> kVar, String str) {
            if (kVar.c(this.f55424b)) {
                return true;
            }
            this.f55425c.d(str);
            kVar.a(this.f55424b, this.f55425c);
            return false;
        }

        private b(T t3, g gVar) {
            super();
            this.f55424b = t3;
            this.f55425c = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.hamcrest.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0514c<T> extends c<T> {
        private C0514c() {
            super();
        }

        @Override // org.hamcrest.c
        public <U> c<U> a(d<? super T, U> dVar) {
            return c.e();
        }

        @Override // org.hamcrest.c
        public boolean d(k<T> kVar, String str) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface d<I, O> {
        c<O> a(I i4, g gVar);
    }

    public static <T> c<T> b(T t3, g gVar) {
        return new b(t3, gVar);
    }

    public static <T> c<T> e() {
        return f55423a;
    }

    public abstract <U> c<U> a(d<? super T, U> dVar);

    public final boolean c(k<T> kVar) {
        return d(kVar, "");
    }

    public abstract boolean d(k<T> kVar, String str);

    public final <U> c<U> f(d<? super T, U> dVar) {
        return a(dVar);
    }

    private c() {
    }
}
