package okio;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class h implements z {

    /* renamed from: E, reason: collision with root package name */
    private final z f55344E;

    public h(z zVar) {
        if (zVar != null) {
            this.f55344E = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        return this.f55344E.P0(c2385c, j4);
    }

    public final z a() {
        return this.f55344E;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55344E.close();
    }

    @Override // okio.z
    public A timeout() {
        return this.f55344E.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f55344E.toString() + ")";
    }
}
