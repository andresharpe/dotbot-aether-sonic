package org.junit.runner;

import java.util.Comparator;
import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f55742a;

        a(j jVar) {
            this.f55742a = jVar;
        }

        @Override // org.junit.runner.h
        public j h() {
            return this.f55742a;
        }
    }

    public static h a(Class<?> cls) {
        return new org.junit.internal.requests.a(cls);
    }

    public static h b(Class<?> cls) {
        return new org.junit.internal.requests.a(cls, false);
    }

    public static h c(org.junit.runner.a aVar, Class<?>... clsArr) {
        try {
            return k(aVar.b(new org.junit.internal.builders.a(), clsArr));
        } catch (InitializationError e4) {
            return k(new org.junit.internal.runners.b(e4, clsArr));
        }
    }

    public static h d(Class<?>... clsArr) {
        return c(e.b(), clsArr);
    }

    public static h e(Class<?> cls, Throwable th) {
        return k(new org.junit.internal.runners.b(cls, th));
    }

    public static h i(Class<?> cls, String str) {
        return a(cls).f(Description.g(cls, str));
    }

    public static h k(j jVar) {
        return new a(jVar);
    }

    public h f(Description description) {
        return g(org.junit.runner.manipulation.b.d(description));
    }

    public h g(org.junit.runner.manipulation.b bVar) {
        return new org.junit.internal.requests.b(this, bVar);
    }

    public abstract j h();

    public h j(org.junit.runner.manipulation.f fVar) {
        return new org.junit.internal.requests.d(this, fVar);
    }

    public h l(Comparator<Description> comparator) {
        return new org.junit.internal.requests.e(this, comparator);
    }
}
