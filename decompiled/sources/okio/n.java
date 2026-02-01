package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class n implements z {

    /* renamed from: E, reason: collision with root package name */
    private final e f55368E;

    /* renamed from: F, reason: collision with root package name */
    private final Inflater f55369F;

    /* renamed from: G, reason: collision with root package name */
    private int f55370G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f55371H;

    public n(z zVar, Inflater inflater) {
        this(o.d(zVar), inflater);
    }

    private void b() throws IOException {
        int i4 = this.f55370G;
        if (i4 == 0) {
            return;
        }
        int remaining = i4 - this.f55369F.getRemaining();
        this.f55370G -= remaining;
        this.f55368E.skip(remaining);
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        boolean a4;
        if (j4 >= 0) {
            if (!this.f55371H) {
                if (j4 == 0) {
                    return 0L;
                }
                do {
                    a4 = a();
                    try {
                        v a12 = c2385c.a1(1);
                        int inflate = this.f55369F.inflate(a12.f55411a, a12.f55413c, (int) Math.min(j4, 8192 - a12.f55413c));
                        if (inflate > 0) {
                            a12.f55413c += inflate;
                            long j5 = inflate;
                            c2385c.f55330F += j5;
                            return j5;
                        }
                        if (!this.f55369F.finished() && !this.f55369F.needsDictionary()) {
                        }
                        b();
                        if (a12.f55412b == a12.f55413c) {
                            c2385c.f55329E = a12.b();
                            w.a(a12);
                            return -1L;
                        }
                        return -1L;
                    } catch (DataFormatException e4) {
                        throw new IOException(e4);
                    }
                } while (!a4);
                throw new EOFException("source exhausted prematurely");
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    public final boolean a() throws IOException {
        if (!this.f55369F.needsInput()) {
            return false;
        }
        b();
        if (this.f55369F.getRemaining() == 0) {
            if (this.f55368E.N()) {
                return true;
            }
            v vVar = this.f55368E.g().f55329E;
            int i4 = vVar.f55413c;
            int i5 = vVar.f55412b;
            int i6 = i4 - i5;
            this.f55370G = i6;
            this.f55369F.setInput(vVar.f55411a, i5, i6);
            return false;
        }
        throw new IllegalStateException("?");
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f55371H) {
            return;
        }
        this.f55369F.end();
        this.f55371H = true;
        this.f55368E.close();
    }

    @Override // okio.z
    public A timeout() {
        return this.f55368E.timeout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.f55368E = eVar;
            this.f55369F = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
