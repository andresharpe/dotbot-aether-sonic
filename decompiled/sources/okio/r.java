package okio;

import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    final long f55386a;

    /* renamed from: c, reason: collision with root package name */
    boolean f55388c;

    /* renamed from: d, reason: collision with root package name */
    boolean f55389d;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private y f55392g;

    /* renamed from: b, reason: collision with root package name */
    final C2385c f55387b = new C2385c();

    /* renamed from: e, reason: collision with root package name */
    private final y f55390e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final z f55391f = new b();

    /* loaded from: classes2.dex */
    final class a implements y {

        /* renamed from: E, reason: collision with root package name */
        final s f55393E = new s();

        a() {
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            y yVar;
            synchronized (r.this.f55387b) {
                try {
                    r rVar = r.this;
                    if (rVar.f55388c) {
                        return;
                    }
                    if (rVar.f55392g != null) {
                        yVar = r.this.f55392g;
                    } else {
                        r rVar2 = r.this;
                        if (rVar2.f55389d && rVar2.f55387b.F0() > 0) {
                            throw new IOException("source is closed");
                        }
                        r rVar3 = r.this;
                        rVar3.f55388c = true;
                        rVar3.f55387b.notifyAll();
                        yVar = null;
                    }
                    if (yVar != null) {
                        this.f55393E.m(yVar.timeout());
                        try {
                            yVar.close();
                        } finally {
                            this.f55393E.l();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            y yVar;
            synchronized (r.this.f55387b) {
                try {
                    r rVar = r.this;
                    if (!rVar.f55388c) {
                        if (rVar.f55392g != null) {
                            yVar = r.this.f55392g;
                        } else {
                            r rVar2 = r.this;
                            if (rVar2.f55389d && rVar2.f55387b.F0() > 0) {
                                throw new IOException("source is closed");
                            }
                            yVar = null;
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (yVar != null) {
                this.f55393E.m(yVar.timeout());
                try {
                    yVar.flush();
                } finally {
                    this.f55393E.l();
                }
            }
        }

        @Override // okio.y
        public void n0(C2385c c2385c, long j4) throws IOException {
            y yVar;
            synchronized (r.this.f55387b) {
                try {
                    if (!r.this.f55388c) {
                        while (true) {
                            if (j4 > 0) {
                                if (r.this.f55392g != null) {
                                    yVar = r.this.f55392g;
                                    break;
                                }
                                r rVar = r.this;
                                if (!rVar.f55389d) {
                                    long F02 = rVar.f55386a - rVar.f55387b.F0();
                                    if (F02 == 0) {
                                        this.f55393E.k(r.this.f55387b);
                                    } else {
                                        long min = Math.min(F02, j4);
                                        r.this.f55387b.n0(c2385c, min);
                                        j4 -= min;
                                        r.this.f55387b.notifyAll();
                                    }
                                } else {
                                    throw new IOException("source is closed");
                                }
                            } else {
                                yVar = null;
                                break;
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (yVar != null) {
                this.f55393E.m(yVar.timeout());
                try {
                    yVar.n0(c2385c, j4);
                } finally {
                    this.f55393E.l();
                }
            }
        }

        @Override // okio.y
        public A timeout() {
            return this.f55393E;
        }
    }

    /* loaded from: classes2.dex */
    final class b implements z {

        /* renamed from: E, reason: collision with root package name */
        final A f55395E = new A();

        b() {
        }

        @Override // okio.z
        public long P0(C2385c c2385c, long j4) throws IOException {
            synchronized (r.this.f55387b) {
                try {
                    if (!r.this.f55389d) {
                        while (r.this.f55387b.F0() == 0) {
                            r rVar = r.this;
                            if (rVar.f55388c) {
                                return -1L;
                            }
                            this.f55395E.k(rVar.f55387b);
                        }
                        long P02 = r.this.f55387b.P0(c2385c, j4);
                        r.this.f55387b.notifyAll();
                        return P02;
                    }
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (r.this.f55387b) {
                r rVar = r.this;
                rVar.f55389d = true;
                rVar.f55387b.notifyAll();
            }
        }

        @Override // okio.z
        public A timeout() {
            return this.f55395E;
        }
    }

    public r(long j4) {
        if (j4 >= 1) {
            this.f55386a = j4;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j4);
    }

    public void b(y yVar) throws IOException {
        boolean z3;
        C2385c c2385c;
        while (true) {
            synchronized (this.f55387b) {
                try {
                    if (this.f55392g == null) {
                        if (this.f55387b.N()) {
                            this.f55389d = true;
                            this.f55392g = yVar;
                            return;
                        } else {
                            z3 = this.f55388c;
                            c2385c = new C2385c();
                            C2385c c2385c2 = this.f55387b;
                            c2385c.n0(c2385c2, c2385c2.f55330F);
                            this.f55387b.notifyAll();
                        }
                    } else {
                        throw new IllegalStateException("sink already folded");
                    }
                } finally {
                }
            }
            try {
                yVar.n0(c2385c, c2385c.f55330F);
                if (z3) {
                    yVar.close();
                } else {
                    yVar.flush();
                }
            } catch (Throwable th) {
                synchronized (this.f55387b) {
                    this.f55389d = true;
                    this.f55387b.notifyAll();
                    throw th;
                }
            }
        }
    }

    public final y c() {
        return this.f55390e;
    }

    public final z d() {
        return this.f55391f;
    }
}
