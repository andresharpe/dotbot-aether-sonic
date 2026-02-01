package org.junit.rules;

import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final d f55668a = new d();

    /* renamed from: b, reason: collision with root package name */
    private String f55669b = "Expected test to throw %s";

    /* loaded from: classes2.dex */
    private class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        private final org.junit.runners.model.i f55670a;

        public a(org.junit.runners.model.i iVar) {
            this.f55670a = iVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            try {
                this.f55670a.a();
                if (c.this.m()) {
                    c.this.i();
                }
            } catch (Throwable th) {
                c.this.l(th);
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws AssertionError {
        org.junit.c.g0(n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Throwable th) throws Throwable {
        if (m()) {
            org.junit.c.W(th, this.f55668a.c());
            return;
        }
        throw th;
    }

    private String n() {
        return String.format(this.f55669b, org.hamcrest.n.o(this.f55668a.c()));
    }

    @Deprecated
    public static c o() {
        return new c();
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return new a(iVar);
    }

    public void d(Class<? extends Throwable> cls) {
        e(org.hamcrest.d.C(cls));
    }

    public void e(org.hamcrest.k<?> kVar) {
        this.f55668a.a(kVar);
    }

    public void f(org.hamcrest.k<?> kVar) {
        e(org.junit.internal.matchers.b.h(kVar));
    }

    public void g(String str) {
        h(org.hamcrest.d.s(str));
    }

    public void h(org.hamcrest.k<String> kVar) {
        e(org.junit.internal.matchers.c.h(kVar));
    }

    @Deprecated
    public c j() {
        return this;
    }

    @Deprecated
    public c k() {
        return this;
    }

    public final boolean m() {
        return this.f55668a.f();
    }

    public c p(String str) {
        this.f55669b = str;
        return this;
    }
}
