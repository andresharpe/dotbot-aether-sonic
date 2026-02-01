package okio;

import java.io.IOException;

/* loaded from: classes2.dex */
final class q implements z {

    /* renamed from: E, reason: collision with root package name */
    private final e f55380E;

    /* renamed from: F, reason: collision with root package name */
    private final C2385c f55381F;

    /* renamed from: G, reason: collision with root package name */
    private v f55382G;

    /* renamed from: H, reason: collision with root package name */
    private int f55383H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f55384I;

    /* renamed from: J, reason: collision with root package name */
    private long f55385J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(e eVar) {
        int i4;
        this.f55380E = eVar;
        C2385c g4 = eVar.g();
        this.f55381F = g4;
        v vVar = g4.f55329E;
        this.f55382G = vVar;
        if (vVar != null) {
            i4 = vVar.f55412b;
        } else {
            i4 = -1;
        }
        this.f55383H = i4;
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        v vVar;
        v vVar2;
        if (j4 >= 0) {
            if (!this.f55384I) {
                v vVar3 = this.f55382G;
                if (vVar3 != null && (vVar3 != (vVar2 = this.f55381F.f55329E) || this.f55383H != vVar2.f55412b)) {
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (j4 == 0) {
                    return 0L;
                }
                if (!this.f55380E.v0(this.f55385J + 1)) {
                    return -1L;
                }
                if (this.f55382G == null && (vVar = this.f55381F.f55329E) != null) {
                    this.f55382G = vVar;
                    this.f55383H = vVar.f55412b;
                }
                long min = Math.min(j4, this.f55381F.f55330F - this.f55385J);
                this.f55381F.i(c2385c, this.f55385J, min);
                this.f55385J += min;
                return min;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55384I = true;
    }

    @Override // okio.z
    public A timeout() {
        return this.f55380E.timeout();
    }
}
