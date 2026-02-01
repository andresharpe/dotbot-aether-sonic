package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class i implements l {

    /* renamed from: a, reason: collision with root package name */
    private final b f55678a;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f55679b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f55680c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {
        b() {
        }

        public long a() {
            return System.nanoTime();
        }
    }

    /* loaded from: classes2.dex */
    private class c extends m {
        private c() {
        }

        @Override // org.junit.rules.m
        protected void g(Throwable th, Description description) {
            i.this.k();
            i iVar = i.this;
            iVar.e(iVar.g(), th, description);
        }

        @Override // org.junit.rules.m
        protected void i(Description description) {
            i iVar = i.this;
            iVar.f(iVar.g(), description);
        }

        @Override // org.junit.rules.m
        protected void k(AssumptionViolatedException assumptionViolatedException, Description description) {
            i.this.k();
            i iVar = i.this;
            iVar.i(iVar.g(), assumptionViolatedException, description);
        }

        @Override // org.junit.rules.m
        protected void n(Description description) {
            i.this.j();
        }

        @Override // org.junit.rules.m
        protected void p(Description description) {
            i.this.k();
            i iVar = i.this;
            iVar.l(iVar.g(), description);
        }
    }

    public i() {
        this(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        if (this.f55679b != 0) {
            long j4 = this.f55680c;
            if (j4 == 0) {
                j4 = this.f55678a.a();
            }
            return j4 - this.f55679b;
        }
        throw new IllegalStateException("Test has not started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f55679b = this.f55678a.a();
        this.f55680c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f55680c = this.f55678a.a();
    }

    @Override // org.junit.rules.l
    public final org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return new c().a(iVar, description);
    }

    protected void e(long j4, Throwable th, Description description) {
    }

    protected void f(long j4, Description description) {
    }

    public long h(TimeUnit timeUnit) {
        return timeUnit.convert(g(), TimeUnit.NANOSECONDS);
    }

    protected void i(long j4, AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    protected void l(long j4, Description description) {
    }

    i(b bVar) {
        this.f55678a = bVar;
    }
}
