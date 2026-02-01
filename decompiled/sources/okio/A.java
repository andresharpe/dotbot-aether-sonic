package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f55303d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f55304a;

    /* renamed from: b, reason: collision with root package name */
    private long f55305b;

    /* renamed from: c, reason: collision with root package name */
    private long f55306c;

    /* loaded from: classes2.dex */
    final class a extends A {
        a() {
        }

        @Override // okio.A
        public A e(long j4) {
            return this;
        }

        @Override // okio.A
        public void h() throws IOException {
        }

        @Override // okio.A
        public A i(long j4, TimeUnit timeUnit) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long g(long j4, long j5) {
        return j4 == 0 ? j5 : (j5 != 0 && j4 >= j5) ? j5 : j4;
    }

    public A a() {
        this.f55304a = false;
        return this;
    }

    public A b() {
        this.f55306c = 0L;
        return this;
    }

    public final A c(long j4, TimeUnit timeUnit) {
        if (j4 > 0) {
            if (timeUnit != null) {
                return e(System.nanoTime() + timeUnit.toNanos(j4));
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("duration <= 0: " + j4);
    }

    public long d() {
        if (this.f55304a) {
            return this.f55305b;
        }
        throw new IllegalStateException("No deadline");
    }

    public A e(long j4) {
        this.f55304a = true;
        this.f55305b = j4;
        return this;
    }

    public boolean f() {
        return this.f55304a;
    }

    public void h() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f55304a && this.f55305b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public A i(long j4, TimeUnit timeUnit) {
        if (j4 >= 0) {
            if (timeUnit != null) {
                this.f55306c = timeUnit.toNanos(j4);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0: " + j4);
    }

    public long j() {
        return this.f55306c;
    }

    public final void k(Object obj) throws InterruptedIOException {
        try {
            boolean f4 = f();
            long j4 = j();
            long j5 = 0;
            if (!f4 && j4 == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f4 && j4 != 0) {
                j4 = Math.min(j4, d() - nanoTime);
            } else if (f4) {
                j4 = d() - nanoTime;
            }
            if (j4 > 0) {
                long j6 = j4 / 1000000;
                obj.wait(j6, (int) (j4 - (1000000 * j6)));
                j5 = System.nanoTime() - nanoTime;
            }
            if (j5 < j4) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
