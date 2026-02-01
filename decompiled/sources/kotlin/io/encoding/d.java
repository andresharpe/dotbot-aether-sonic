package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.C2097l;
import kotlin.jvm.internal.F;

@f
/* loaded from: classes2.dex */
final class d extends InputStream {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InputStream f52126E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final a f52127F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f52128G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f52129H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final byte[] f52130I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final byte[] f52131J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final byte[] f52132K;

    /* renamed from: L, reason: collision with root package name */
    private int f52133L;

    /* renamed from: M, reason: collision with root package name */
    private int f52134M;

    public d(@l3.d InputStream input, @l3.d a base64) {
        F.p(input, "input");
        F.p(base64, "base64");
        this.f52126E = input;
        this.f52127F = base64;
        this.f52130I = new byte[1];
        this.f52131J = new byte[1024];
        this.f52132K = new byte[1024];
    }

    private final void a(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = this.f52132K;
        int i6 = this.f52133L;
        C2097l.v0(bArr2, bArr, i4, i6, i6 + i5);
        this.f52133L += i5;
        h();
    }

    private final int b(byte[] bArr, int i4, int i5, int i6) {
        int i7 = this.f52134M;
        this.f52134M = i7 + this.f52127F.n(this.f52131J, this.f52132K, i7, 0, i6);
        int min = Math.min(c(), i5 - i4);
        a(bArr, i4, min);
        i();
        return min;
    }

    private final int c() {
        return this.f52134M - this.f52133L;
    }

    private final int d(int i4) {
        this.f52131J[i4] = a.f52114h;
        if ((i4 & 3) == 2) {
            int f4 = f();
            if (f4 >= 0) {
                this.f52131J[i4 + 1] = (byte) f4;
            }
            return i4 + 2;
        }
        return i4 + 1;
    }

    private final int f() {
        int read;
        if (!this.f52127F.D()) {
            return this.f52126E.read();
        }
        do {
            read = this.f52126E.read();
            if (read == -1) {
                break;
            }
        } while (!c.g(read));
        return read;
    }

    private final void h() {
        if (this.f52133L == this.f52134M) {
            this.f52133L = 0;
            this.f52134M = 0;
        }
    }

    private final void i() {
        byte[] bArr = this.f52132K;
        int length = bArr.length;
        int i4 = this.f52134M;
        if ((this.f52131J.length / 4) * 3 > length - i4) {
            C2097l.v0(bArr, bArr, 0, this.f52133L, i4);
            this.f52134M -= this.f52133L;
            this.f52133L = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f52128G) {
            this.f52128G = true;
            this.f52126E.close();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i4 = this.f52133L;
        if (i4 < this.f52134M) {
            int i5 = this.f52132K[i4] & 255;
            this.f52133L = i4 + 1;
            h();
            return i5;
        }
        int read = read(this.f52130I, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.f52130I[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(@l3.d byte[] destination, int i4, int i5) {
        int i6;
        boolean z3;
        boolean z4;
        F.p(destination, "destination");
        if (i4 >= 0 && i5 >= 0 && (i6 = i4 + i5) <= destination.length) {
            if (!this.f52128G) {
                if (this.f52129H) {
                    return -1;
                }
                if (i5 == 0) {
                    return 0;
                }
                if (c() >= i5) {
                    a(destination, i4, i5);
                    return i5;
                }
                int c4 = (((i5 - c()) + 2) / 3) * 4;
                int i7 = i4;
                while (true) {
                    z3 = this.f52129H;
                    if (z3 || c4 <= 0) {
                        break;
                    }
                    int min = Math.min(this.f52131J.length, c4);
                    int i8 = 0;
                    while (true) {
                        z4 = this.f52129H;
                        if (z4 || i8 >= min) {
                            break;
                        }
                        int f4 = f();
                        if (f4 == -1) {
                            this.f52129H = true;
                        } else if (f4 != 61) {
                            this.f52131J[i8] = (byte) f4;
                            i8++;
                        } else {
                            i8 = d(i8);
                            this.f52129H = true;
                        }
                    }
                    if (!z4 && i8 != min) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c4 -= i8;
                    i7 += b(destination, i7, i6, i8);
                }
                if (i7 == i4 && z3) {
                    return -1;
                }
                return i7 - i4;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i4 + ", length: " + i5 + ", buffer size: " + destination.length);
    }
}
