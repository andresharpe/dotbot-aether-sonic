package org.junit.runner;

import org.junit.internal.k;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final org.junit.runner.notification.b f55741a = new org.junit.runner.notification.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b() {
        return new a();
    }

    public static void d(String... strArr) {
        System.exit(!new e().m(new org.junit.internal.h(), strArr).p() ? 1 : 0);
    }

    public static Result k(a aVar, Class<?>... clsArr) {
        return new e().g(aVar, clsArr);
    }

    public static Result l(Class<?>... clsArr) {
        return k(b(), clsArr);
    }

    public void a(org.junit.runner.notification.a aVar) {
        this.f55741a.d(aVar);
    }

    public String c() {
        return junit.runner.c.a();
    }

    public void e(org.junit.runner.notification.a aVar) {
        this.f55741a.p(aVar);
    }

    public Result f(junit.framework.f fVar) {
        return i(new org.junit.internal.runners.d(fVar));
    }

    public Result g(a aVar, Class<?>... clsArr) {
        return h(h.c(aVar, clsArr));
    }

    public Result h(h hVar) {
        return i(hVar.h());
    }

    public Result i(j jVar) {
        Result result = new Result();
        org.junit.runner.notification.a g4 = result.g();
        this.f55741a.c(g4);
        try {
            this.f55741a.k(jVar.a());
            jVar.b(this.f55741a);
            this.f55741a.j(result);
            return result;
        } finally {
            e(g4);
        }
    }

    public Result j(Class<?>... clsArr) {
        return g(b(), clsArr);
    }

    Result m(org.junit.internal.f fVar, String... strArr) {
        fVar.a().println("JUnit version " + junit.runner.c.a());
        JUnitCommandLineParseResult g4 = JUnitCommandLineParseResult.g(strArr);
        a(new k(fVar));
        return h(g4.c(b()));
    }
}
