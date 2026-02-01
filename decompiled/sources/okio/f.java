package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class f implements y {

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC2386d f55340E;

    /* renamed from: F, reason: collision with root package name */
    private final Deflater f55341F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f55342G;

    public f(y yVar, Deflater deflater) {
        this(o.c(yVar), deflater);
    }

    @IgnoreJRERequirement
    private void a(boolean z3) throws IOException {
        v a12;
        int deflate;
        C2385c g4 = this.f55340E.g();
        while (true) {
            a12 = g4.a1(1);
            if (z3) {
                Deflater deflater = this.f55341F;
                byte[] bArr = a12.f55411a;
                int i4 = a12.f55413c;
                deflate = deflater.deflate(bArr, i4, 8192 - i4, 2);
            } else {
                Deflater deflater2 = this.f55341F;
                byte[] bArr2 = a12.f55411a;
                int i5 = a12.f55413c;
                deflate = deflater2.deflate(bArr2, i5, 8192 - i5);
            }
            if (deflate > 0) {
                a12.f55413c += deflate;
                g4.f55330F += deflate;
                this.f55340E.Y();
            } else if (this.f55341F.needsInput()) {
                break;
            }
        }
        if (a12.f55412b == a12.f55413c) {
            g4.f55329E = a12.b();
            w.a(a12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() throws IOException {
        this.f55341F.finish();
        a(false);
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f55342G) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f55341F.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f55340E.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f55342G = true;
        if (th != null) {
            C.f(th);
        }
    }

    @Override // okio.y, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f55340E.flush();
    }

    @Override // okio.y
    public void n0(C2385c c2385c, long j4) throws IOException {
        C.b(c2385c.f55330F, 0L, j4);
        while (j4 > 0) {
            v vVar = c2385c.f55329E;
            int min = (int) Math.min(j4, vVar.f55413c - vVar.f55412b);
            this.f55341F.setInput(vVar.f55411a, vVar.f55412b, min);
            a(false);
            long j5 = min;
            c2385c.f55330F -= j5;
            int i4 = vVar.f55412b + min;
            vVar.f55412b = i4;
            if (i4 == vVar.f55413c) {
                c2385c.f55329E = vVar.b();
                w.a(vVar);
            }
            j4 -= j5;
        }
    }

    @Override // okio.y
    public A timeout() {
        return this.f55340E.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f55340E + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(InterfaceC2386d interfaceC2386d, Deflater deflater) {
        if (interfaceC2386d == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater != null) {
            this.f55340E = interfaceC2386d;
            this.f55341F = deflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
