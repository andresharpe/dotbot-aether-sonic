package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private final long f55696a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeUnit f55697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f55698c;

    /* loaded from: classes2.dex */
    class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Exception f55699a;

        a(Exception exc) {
            this.f55699a = exc;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            throw new RuntimeException("Invalid parameters for Timeout", this.f55699a);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f55701a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f55702b = 0;

        /* renamed from: c, reason: collision with root package name */
        private TimeUnit f55703c = TimeUnit.SECONDS;

        protected b() {
        }

        public o a() {
            return new o(this);
        }

        protected boolean b() {
            return this.f55701a;
        }

        protected TimeUnit c() {
            return this.f55703c;
        }

        protected long d() {
            return this.f55702b;
        }

        public b e(boolean z3) {
            this.f55701a = z3;
            return this;
        }

        public b f(long j4, TimeUnit timeUnit) {
            this.f55702b = j4;
            this.f55703c = timeUnit;
            return this;
        }
    }

    @Deprecated
    public o(int i4) {
        this(i4, TimeUnit.MILLISECONDS);
    }

    public static b b() {
        return new b();
    }

    public static o f(long j4) {
        return new o(j4, TimeUnit.MILLISECONDS);
    }

    public static o g(long j4) {
        return new o(j4, TimeUnit.SECONDS);
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        try {
            return c(iVar);
        } catch (Exception e4) {
            return new a(e4);
        }
    }

    protected org.junit.runners.model.i c(org.junit.runners.model.i iVar) throws Exception {
        return org.junit.internal.runners.statements.c.c().f(this.f55696a, this.f55697b).e(this.f55698c).d(iVar);
    }

    protected final boolean d() {
        return this.f55698c;
    }

    protected final long e(TimeUnit timeUnit) {
        return timeUnit.convert(this.f55696a, this.f55697b);
    }

    public o(long j4, TimeUnit timeUnit) {
        this.f55696a = j4;
        this.f55697b = timeUnit;
        this.f55698c = false;
    }

    protected o(b bVar) {
        this.f55696a = bVar.d();
        this.f55697b = bVar.c();
        this.f55698c = bVar.b();
    }
}
