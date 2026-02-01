package okio;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class g implements y {

    /* renamed from: E, reason: collision with root package name */
    private final y f55343E;

    public g(y yVar) {
        if (yVar != null) {
            this.f55343E = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final y a() {
        return this.f55343E;
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55343E.close();
    }

    @Override // okio.y, java.io.Flushable
    public void flush() throws IOException {
        this.f55343E.flush();
    }

    @Override // okio.y
    public void n0(C2385c c2385c, long j4) throws IOException {
        this.f55343E.n0(c2385c, j4);
    }

    @Override // okio.y
    public A timeout() {
        return this.f55343E.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f55343E.toString() + ")";
    }
}
