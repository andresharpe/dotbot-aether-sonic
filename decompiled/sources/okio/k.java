package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class k implements z {

    /* renamed from: J, reason: collision with root package name */
    private static final byte f55351J = 1;

    /* renamed from: K, reason: collision with root package name */
    private static final byte f55352K = 2;

    /* renamed from: L, reason: collision with root package name */
    private static final byte f55353L = 3;

    /* renamed from: M, reason: collision with root package name */
    private static final byte f55354M = 4;

    /* renamed from: N, reason: collision with root package name */
    private static final byte f55355N = 0;

    /* renamed from: O, reason: collision with root package name */
    private static final byte f55356O = 1;

    /* renamed from: P, reason: collision with root package name */
    private static final byte f55357P = 2;

    /* renamed from: Q, reason: collision with root package name */
    private static final byte f55358Q = 3;

    /* renamed from: F, reason: collision with root package name */
    private final e f55360F;

    /* renamed from: G, reason: collision with root package name */
    private final Inflater f55361G;

    /* renamed from: H, reason: collision with root package name */
    private final n f55362H;

    /* renamed from: E, reason: collision with root package name */
    private int f55359E = 0;

    /* renamed from: I, reason: collision with root package name */
    private final CRC32 f55363I = new CRC32();

    public k(z zVar) {
        if (zVar != null) {
            Inflater inflater = new Inflater(true);
            this.f55361G = inflater;
            e d4 = o.d(zVar);
            this.f55360F = d4;
            this.f55362H = new n(d4, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i4, int i5) throws IOException {
        if (i5 == i4) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    private void b() throws IOException {
        boolean z3;
        this.f55360F.X0(10L);
        byte n4 = this.f55360F.g().n(3L);
        if (((n4 >> 1) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            d(this.f55360F.g(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f55360F.readShort());
        this.f55360F.skip(8L);
        if (((n4 >> 2) & 1) == 1) {
            this.f55360F.X0(2L);
            if (z3) {
                d(this.f55360F.g(), 0L, 2L);
            }
            long N02 = this.f55360F.g().N0();
            this.f55360F.X0(N02);
            if (z3) {
                d(this.f55360F.g(), 0L, N02);
            }
            this.f55360F.skip(N02);
        }
        if (((n4 >> 3) & 1) == 1) {
            long c12 = this.f55360F.c1((byte) 0);
            if (c12 != -1) {
                if (z3) {
                    d(this.f55360F.g(), 0L, c12 + 1);
                }
                this.f55360F.skip(c12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((n4 >> 4) & 1) == 1) {
            long c13 = this.f55360F.c1((byte) 0);
            if (c13 != -1) {
                if (z3) {
                    d(this.f55360F.g(), 0L, c13 + 1);
                }
                this.f55360F.skip(c13 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z3) {
            a("FHCRC", this.f55360F.N0(), (short) this.f55363I.getValue());
            this.f55363I.reset();
        }
    }

    private void c() throws IOException {
        a("CRC", this.f55360F.C0(), (int) this.f55363I.getValue());
        a("ISIZE", this.f55360F.C0(), (int) this.f55361G.getBytesWritten());
    }

    private void d(C2385c c2385c, long j4, long j5) {
        v vVar = c2385c.f55329E;
        while (true) {
            int i4 = vVar.f55413c;
            int i5 = vVar.f55412b;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            vVar = vVar.f55416f;
        }
        while (j5 > 0) {
            int min = (int) Math.min(vVar.f55413c - r6, j5);
            this.f55363I.update(vVar.f55411a, (int) (vVar.f55412b + j4), min);
            j5 -= min;
            vVar = vVar.f55416f;
            j4 = 0;
        }
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        if (j4 >= 0) {
            if (j4 == 0) {
                return 0L;
            }
            if (this.f55359E == 0) {
                b();
                this.f55359E = 1;
            }
            if (this.f55359E == 1) {
                long j5 = c2385c.f55330F;
                long P02 = this.f55362H.P0(c2385c, j4);
                if (P02 != -1) {
                    d(c2385c, j5, P02);
                    return P02;
                }
                this.f55359E = 2;
            }
            if (this.f55359E == 2) {
                c();
                this.f55359E = 3;
                if (!this.f55360F.N()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55362H.close();
    }

    @Override // okio.z
    public A timeout() {
        return this.f55360F.timeout();
    }
}
