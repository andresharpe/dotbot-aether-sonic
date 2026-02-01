package org.junit.internal.requests;

import org.junit.internal.builders.h;
import org.junit.runner.j;
import org.junit.runners.model.g;

/* loaded from: classes2.dex */
public class a extends org.junit.internal.requests.c {

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f55584c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f55585d;

    /* loaded from: classes2.dex */
    private class b extends org.junit.internal.builders.a {
        private b() {
        }

        @Override // org.junit.internal.builders.a
        protected g m() {
            return new c();
        }
    }

    /* loaded from: classes2.dex */
    private class c extends h {
        private c() {
        }

        @Override // org.junit.internal.builders.h, org.junit.runners.model.g
        public j d(Class<?> cls) throws Throwable {
            if (cls == a.this.f55584c && !a.this.f55585d) {
                return null;
            }
            return super.d(cls);
        }
    }

    public a(Class<?> cls, boolean z3) {
        this.f55584c = cls;
        this.f55585d = z3;
    }

    @Override // org.junit.internal.requests.c
    protected j m() {
        return new b().h(this.f55584c);
    }

    public a(Class<?> cls) {
        this(cls, true);
    }
}
