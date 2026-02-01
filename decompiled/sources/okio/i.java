package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class i extends A {

    /* renamed from: e, reason: collision with root package name */
    private A f55345e;

    public i(A a4) {
        if (a4 != null) {
            this.f55345e = a4;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.A
    public A a() {
        return this.f55345e.a();
    }

    @Override // okio.A
    public A b() {
        return this.f55345e.b();
    }

    @Override // okio.A
    public long d() {
        return this.f55345e.d();
    }

    @Override // okio.A
    public A e(long j4) {
        return this.f55345e.e(j4);
    }

    @Override // okio.A
    public boolean f() {
        return this.f55345e.f();
    }

    @Override // okio.A
    public void h() throws IOException {
        this.f55345e.h();
    }

    @Override // okio.A
    public A i(long j4, TimeUnit timeUnit) {
        return this.f55345e.i(j4, timeUnit);
    }

    @Override // okio.A
    public long j() {
        return this.f55345e.j();
    }

    public final A l() {
        return this.f55345e;
    }

    public final i m(A a4) {
        if (a4 != null) {
            this.f55345e = a4;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
