package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class s extends A {

    /* renamed from: e, reason: collision with root package name */
    private A f55397e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55398f;

    /* renamed from: g, reason: collision with root package name */
    private long f55399g;

    /* renamed from: h, reason: collision with root package name */
    private long f55400h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f55397e.i(this.f55400h, TimeUnit.NANOSECONDS);
        if (this.f55398f) {
            this.f55397e.e(this.f55399g);
        } else {
            this.f55397e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(A a4) {
        long j4;
        this.f55397e = a4;
        boolean f4 = a4.f();
        this.f55398f = f4;
        if (f4) {
            j4 = a4.d();
        } else {
            j4 = -1;
        }
        this.f55399g = j4;
        long j5 = a4.j();
        this.f55400h = j5;
        a4.i(A.g(j5, j()), TimeUnit.NANOSECONDS);
        if (this.f55398f && f()) {
            a4.e(Math.min(d(), this.f55399g));
        } else if (f()) {
            a4.e(d());
        }
    }
}
