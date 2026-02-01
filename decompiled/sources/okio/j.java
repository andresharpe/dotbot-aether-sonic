package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class j implements y {

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC2386d f55346E;

    /* renamed from: F, reason: collision with root package name */
    private final Deflater f55347F;

    /* renamed from: G, reason: collision with root package name */
    private final f f55348G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f55349H;

    /* renamed from: I, reason: collision with root package name */
    private final CRC32 f55350I = new CRC32();

    public j(y yVar) {
        if (yVar != null) {
            Deflater deflater = new Deflater(-1, true);
            this.f55347F = deflater;
            InterfaceC2386d c4 = o.c(yVar);
            this.f55346E = c4;
            this.f55348G = new f(c4, deflater);
            d();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    private void b(C2385c c2385c, long j4) {
        v vVar = c2385c.f55329E;
        while (j4 > 0) {
            int min = (int) Math.min(j4, vVar.f55413c - vVar.f55412b);
            this.f55350I.update(vVar.f55411a, vVar.f55412b, min);
            j4 -= min;
            vVar = vVar.f55416f;
        }
    }

    private void c() throws IOException {
        this.f55346E.M((int) this.f55350I.getValue());
        this.f55346E.M((int) this.f55347F.getBytesRead());
    }

    private void d() {
        C2385c g4 = this.f55346E.g();
        g4.x(8075);
        g4.O(8);
        g4.O(0);
        g4.B(0);
        g4.O(0);
        g4.O(0);
    }

    public final Deflater a() {
        return this.f55347F;
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f55349H) {
            return;
        }
        try {
            this.f55348G.b();
            c();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f55347F.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f55346E.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f55349H = true;
        if (th != null) {
            C.f(th);
        }
    }

    @Override // okio.y, java.io.Flushable
    public void flush() throws IOException {
        this.f55348G.flush();
    }

    @Override // okio.y
    public void n0(C2385c c2385c, long j4) throws IOException {
        if (j4 >= 0) {
            if (j4 == 0) {
                return;
            }
            b(c2385c, j4);
            this.f55348G.n0(c2385c, j4);
            return;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    @Override // okio.y
    public A timeout() {
        return this.f55346E.timeout();
    }
}
