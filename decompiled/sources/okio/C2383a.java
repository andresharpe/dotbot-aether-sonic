package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okio.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2383a extends A {

    /* renamed from: h, reason: collision with root package name */
    private static final int f55314h = 65536;

    /* renamed from: i, reason: collision with root package name */
    private static final long f55315i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f55316j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    static C2383a f55317k;

    /* renamed from: e, reason: collision with root package name */
    private boolean f55318e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C2383a f55319f;

    /* renamed from: g, reason: collision with root package name */
    private long f55320g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: okio.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0512a implements y {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ y f55321E;

        C0512a(y yVar) {
            this.f55321E = yVar;
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C2383a.this.n();
            try {
                try {
                    this.f55321E.close();
                    C2383a.this.p(true);
                } catch (IOException e4) {
                    throw C2383a.this.o(e4);
                }
            } catch (Throwable th) {
                C2383a.this.p(false);
                throw th;
            }
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            C2383a.this.n();
            try {
                try {
                    this.f55321E.flush();
                    C2383a.this.p(true);
                } catch (IOException e4) {
                    throw C2383a.this.o(e4);
                }
            } catch (Throwable th) {
                C2383a.this.p(false);
                throw th;
            }
        }

        @Override // okio.y
        public void n0(C2385c c2385c, long j4) throws IOException {
            C.b(c2385c.f55330F, 0L, j4);
            while (true) {
                long j5 = 0;
                if (j4 > 0) {
                    v vVar = c2385c.f55329E;
                    while (true) {
                        if (j5 >= PlaybackStateCompat.f4292g0) {
                            break;
                        }
                        j5 += vVar.f55413c - vVar.f55412b;
                        if (j5 >= j4) {
                            j5 = j4;
                            break;
                        }
                        vVar = vVar.f55416f;
                    }
                    C2383a.this.n();
                    try {
                        try {
                            this.f55321E.n0(c2385c, j5);
                            j4 -= j5;
                            C2383a.this.p(true);
                        } catch (IOException e4) {
                            throw C2383a.this.o(e4);
                        }
                    } catch (Throwable th) {
                        C2383a.this.p(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // okio.y
        public A timeout() {
            return C2383a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f55321E + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: okio.a$b */
    /* loaded from: classes2.dex */
    public class b implements z {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ z f55323E;

        b(z zVar) {
            this.f55323E = zVar;
        }

        @Override // okio.z
        public long P0(C2385c c2385c, long j4) throws IOException {
            C2383a.this.n();
            try {
                try {
                    long P02 = this.f55323E.P0(c2385c, j4);
                    C2383a.this.p(true);
                    return P02;
                } catch (IOException e4) {
                    throw C2383a.this.o(e4);
                }
            } catch (Throwable th) {
                C2383a.this.p(false);
                throw th;
            }
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C2383a.this.n();
            try {
                try {
                    this.f55323E.close();
                    C2383a.this.p(true);
                } catch (IOException e4) {
                    throw C2383a.this.o(e4);
                }
            } catch (Throwable th) {
                C2383a.this.p(false);
                throw th;
            }
        }

        @Override // okio.z
        public A timeout() {
            return C2383a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f55323E + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: okio.a$c */
    /* loaded from: classes2.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
        
            r1.w();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<okio.a> r0 = okio.C2383a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.a r1 = okio.C2383a.l()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                okio.a r2 = okio.C2383a.f55317k     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                okio.C2383a.f55317k = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.w()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C2383a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f55315i = millis;
        f55316j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    static C2383a l() throws InterruptedException {
        C2383a c2383a = f55317k.f55319f;
        if (c2383a == null) {
            long nanoTime = System.nanoTime();
            C2383a.class.wait(f55315i);
            if (f55317k.f55319f != null || System.nanoTime() - nanoTime < f55316j) {
                return null;
            }
            return f55317k;
        }
        long s4 = c2383a.s(System.nanoTime());
        if (s4 > 0) {
            long j4 = s4 / 1000000;
            C2383a.class.wait(j4, (int) (s4 - (1000000 * j4)));
            return null;
        }
        f55317k.f55319f = c2383a.f55319f;
        c2383a.f55319f = null;
        return c2383a;
    }

    private static synchronized boolean m(C2383a c2383a) {
        synchronized (C2383a.class) {
            C2383a c2383a2 = f55317k;
            while (c2383a2 != null) {
                C2383a c2383a3 = c2383a2.f55319f;
                if (c2383a3 == c2383a) {
                    c2383a2.f55319f = c2383a.f55319f;
                    c2383a.f55319f = null;
                    return false;
                }
                c2383a2 = c2383a3;
            }
            return true;
        }
    }

    private long s(long j4) {
        return this.f55320g - j4;
    }

    private static synchronized void t(C2383a c2383a, long j4, boolean z3) {
        synchronized (C2383a.class) {
            try {
                if (f55317k == null) {
                    f55317k = new C2383a();
                    new c().start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z3) {
                    c2383a.f55320g = Math.min(j4, c2383a.d() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    c2383a.f55320g = j4 + nanoTime;
                } else if (z3) {
                    c2383a.f55320g = c2383a.d();
                } else {
                    throw new AssertionError();
                }
                long s4 = c2383a.s(nanoTime);
                C2383a c2383a2 = f55317k;
                while (true) {
                    C2383a c2383a3 = c2383a2.f55319f;
                    if (c2383a3 == null || s4 < c2383a3.s(nanoTime)) {
                        break;
                    } else {
                        c2383a2 = c2383a2.f55319f;
                    }
                }
                c2383a.f55319f = c2383a2.f55319f;
                c2383a2.f55319f = c2383a;
                if (c2383a2 == f55317k) {
                    C2383a.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (!this.f55318e) {
            long j4 = j();
            boolean f4 = f();
            if (j4 == 0 && !f4) {
                return;
            }
            this.f55318e = true;
            t(this, j4, f4);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    final IOException o(IOException iOException) throws IOException {
        if (!q()) {
            return iOException;
        }
        return r(iOException);
    }

    final void p(boolean z3) throws IOException {
        if (q() && z3) {
            throw r(null);
        }
    }

    public final boolean q() {
        if (!this.f55318e) {
            return false;
        }
        this.f55318e = false;
        return m(this);
    }

    protected IOException r(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y u(y yVar) {
        return new C0512a(yVar);
    }

    public final z v(z zVar) {
        return new b(zVar);
    }

    protected void w() {
    }
}
