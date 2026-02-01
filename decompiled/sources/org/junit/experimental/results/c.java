package org.junit.experimental.results;

import org.hamcrest.g;
import org.hamcrest.k;
import org.hamcrest.p;

/* loaded from: classes2.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends p<org.junit.experimental.results.b> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f55516G;

        a(int i4) {
            this.f55516G = i4;
        }

        @Override // org.hamcrest.m
        public void b(g gVar) {
            gVar.d("has " + this.f55516G + " failures");
        }

        @Override // org.hamcrest.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean f(org.junit.experimental.results.b bVar) {
            if (bVar.a() == this.f55516G) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static class b extends org.hamcrest.b<Object> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f55517E;

        b(String str) {
            this.f55517E = str;
        }

        @Override // org.hamcrest.m
        public void b(g gVar) {
            gVar.d("has single failure containing " + this.f55517E);
        }

        @Override // org.hamcrest.k
        public boolean c(Object obj) {
            if (obj.toString().contains(this.f55517E) && c.a(1).c(obj)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: org.junit.experimental.results.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0520c extends p<org.junit.experimental.results.b> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ k f55518G;

        C0520c(k kVar) {
            this.f55518G = kVar;
        }

        @Override // org.hamcrest.m
        public void b(g gVar) {
            gVar.d("has failure with exception matching ");
            this.f55518G.b(gVar);
        }

        @Override // org.hamcrest.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean f(org.junit.experimental.results.b bVar) {
            if (bVar.a() != 1 || !this.f55518G.c(bVar.b().get(0).b())) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    static class d extends p<org.junit.experimental.results.b> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f55519G;

        d(String str) {
            this.f55519G = str;
        }

        @Override // org.hamcrest.m
        public void b(g gVar) {
            gVar.d("has failure containing " + this.f55519G);
        }

        @Override // org.hamcrest.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean f(org.junit.experimental.results.b bVar) {
            if (bVar.a() > 0 && bVar.toString().contains(this.f55519G)) {
                return true;
            }
            return false;
        }
    }

    @Deprecated
    public c() {
    }

    public static k<org.junit.experimental.results.b> a(int i4) {
        return new a(i4);
    }

    public static k<org.junit.experimental.results.b> b(String str) {
        return new d(str);
    }

    public static k<Object> c(String str) {
        return new b(str);
    }

    public static k<org.junit.experimental.results.b> d(k<Throwable> kVar) {
        return new C0520c(kVar);
    }

    public static k<org.junit.experimental.results.b> e() {
        return a(0);
    }
}
