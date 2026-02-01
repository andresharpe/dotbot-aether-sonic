package org.junit.experimental;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.runner.j;
import org.junit.runners.e;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.g;
import org.junit.runners.model.h;

/* loaded from: classes2.dex */
public class a extends org.junit.runner.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f55492a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55493b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.junit.experimental.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0516a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f55494a = Executors.newCachedThreadPool();

        C0516a() {
        }

        @Override // org.junit.runners.model.h
        public void a(Runnable runnable) {
            this.f55494a.submit(runnable);
        }

        @Override // org.junit.runners.model.h
        public void b() {
            try {
                this.f55494a.shutdown();
                this.f55494a.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e4) {
                e4.printStackTrace(System.err);
            }
        }
    }

    public a(boolean z3, boolean z4) {
        this.f55492a = z3;
        this.f55493b = z4;
    }

    public static org.junit.runner.a d() {
        return new a(true, false);
    }

    public static org.junit.runner.a e() {
        return new a(false, true);
    }

    private static j f(j jVar) {
        if (jVar instanceof e) {
            ((e) jVar).z(new C0516a());
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runner.a
    public j a(g gVar, Class<?> cls) throws Throwable {
        j a4 = super.a(gVar, cls);
        if (this.f55493b) {
            return f(a4);
        }
        return a4;
    }

    @Override // org.junit.runner.a
    public j b(g gVar, Class<?>[] clsArr) throws InitializationError {
        j b4 = super.b(gVar, clsArr);
        if (this.f55492a) {
            return f(b4);
        }
        return b4;
    }
}
