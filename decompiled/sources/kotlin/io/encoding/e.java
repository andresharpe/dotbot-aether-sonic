package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.C2097l;
import kotlin.jvm.internal.F;

@f
/* loaded from: classes2.dex */
final class e extends OutputStream {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final OutputStream f52135E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final a f52136F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f52137G;

    /* renamed from: H, reason: collision with root package name */
    private int f52138H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final byte[] f52139I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final byte[] f52140J;

    /* renamed from: K, reason: collision with root package name */
    private int f52141K;

    public e(@l3.d OutputStream output, @l3.d a base64) {
        int i4;
        F.p(output, "output");
        F.p(base64, "base64");
        this.f52135E = output;
        this.f52136F = base64;
        if (base64.D()) {
            i4 = 76;
        } else {
            i4 = -1;
        }
        this.f52138H = i4;
        this.f52139I = new byte[1024];
        this.f52140J = new byte[3];
    }

    private final void a() {
        if (!this.f52137G) {
        } else {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int b(byte[] bArr, int i4, int i5) {
        int min = Math.min(3 - this.f52141K, i5 - i4);
        C2097l.v0(bArr, this.f52140J, this.f52141K, i4, i4 + min);
        int i6 = this.f52141K + min;
        this.f52141K = i6;
        if (i6 == 3) {
            c();
        }
        return min;
    }

    private final void c() {
        if (d(this.f52140J, 0, this.f52141K) == 4) {
            this.f52141K = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int d(byte[] bArr, int i4, int i5) {
        int t3 = this.f52136F.t(bArr, this.f52139I, 0, i4, i5);
        if (this.f52138H == 0) {
            this.f52135E.write(a.f52109c.H());
            this.f52138H = 76;
            if (t3 > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f52135E.write(this.f52139I, 0, t3);
        this.f52138H -= t3;
        return t3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f52137G) {
            this.f52137G = true;
            if (this.f52141K != 0) {
                c();
            }
            this.f52135E.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f52135E.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) {
        a();
        byte[] bArr = this.f52140J;
        int i5 = this.f52141K;
        int i6 = i5 + 1;
        this.f52141K = i6;
        bArr[i5] = (byte) i4;
        if (i6 == 3) {
            c();
        }
    }

    @Override // java.io.OutputStream
    public void write(@l3.d byte[] source, int i4, int i5) {
        int i6;
        F.p(source, "source");
        a();
        if (i4 < 0 || i5 < 0 || (i6 = i4 + i5) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i4 + ", length: " + i5 + ", source size: " + source.length);
        }
        if (i5 == 0) {
            return;
        }
        int i7 = this.f52141K;
        if (i7 < 3) {
            if (i7 != 0) {
                i4 += b(source, i4, i6);
                if (this.f52141K != 0) {
                    return;
                }
            }
            while (i4 + 3 <= i6) {
                int min = Math.min((this.f52136F.D() ? this.f52138H : this.f52139I.length) / 4, (i6 - i4) / 3);
                int i8 = (min * 3) + i4;
                if (d(source, i4, i8) != min * 4) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i4 = i8;
            }
            C2097l.v0(source, this.f52140J, 0, i4, i6);
            this.f52141K = i6 - i4;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
