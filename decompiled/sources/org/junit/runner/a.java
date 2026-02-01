package org.junit.runner;

import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: org.junit.runner.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0530a extends org.junit.runners.model.g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.g f55736b;

        C0530a(org.junit.runners.model.g gVar) {
            this.f55736b = gVar;
        }

        @Override // org.junit.runners.model.g
        public j d(Class<?> cls) throws Throwable {
            return a.this.a(this.f55736b, cls);
        }
    }

    /* loaded from: classes2.dex */
    class b extends org.junit.runners.g {
        b(org.junit.runners.model.g gVar, Class[] clsArr) {
            super(gVar, (Class<?>[]) clsArr);
        }

        @Override // org.junit.runners.e
        protected String s() {
            return "classes";
        }
    }

    public static a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j a(org.junit.runners.model.g gVar, Class<?> cls) throws Throwable {
        return gVar.d(cls);
    }

    public j b(org.junit.runners.model.g gVar, Class<?>[] clsArr) throws InitializationError {
        return new b(new C0530a(gVar), clsArr);
    }
}
