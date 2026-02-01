package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import kotlin.text.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u implements e {

    /* renamed from: E, reason: collision with root package name */
    public final C2385c f55405E = new C2385c();

    /* renamed from: F, reason: collision with root package name */
    public final z f55406F;

    /* renamed from: G, reason: collision with root package name */
    boolean f55407G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(z zVar) {
        if (zVar != null) {
            this.f55406F = zVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // okio.e
    public String A0() throws IOException {
        return b0(Long.MAX_VALUE);
    }

    @Override // okio.e
    public int C0() throws IOException {
        X0(4L);
        return this.f55405E.C0();
    }

    @Override // okio.e
    public boolean D0(long j4, ByteString byteString, int i4, int i5) throws IOException {
        if (!this.f55407G) {
            if (j4 < 0 || i4 < 0 || i5 < 0 || byteString.R() - i4 < i5) {
                return false;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                long j5 = i6 + j4;
                if (!v0(1 + j5) || this.f55405E.n(j5) != byteString.r(i4 + i6)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.e
    public byte[] G0(long j4) throws IOException {
        X0(j4);
        return this.f55405E.G0(j4);
    }

    @Override // okio.e
    public String H0() throws IOException {
        this.f55405E.q0(this.f55406F);
        return this.f55405E.H0();
    }

    @Override // okio.e
    public byte[] I() throws IOException {
        this.f55405E.q0(this.f55406F);
        return this.f55405E.I();
    }

    @Override // okio.e
    public long K(ByteString byteString) throws IOException {
        return s(byteString, 0L);
    }

    @Override // okio.e
    public String K0(long j4, Charset charset) throws IOException {
        X0(j4);
        if (charset != null) {
            return this.f55405E.K0(j4, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.e
    public C2385c L() {
        return this.f55405E;
    }

    @Override // okio.e
    public boolean N() throws IOException {
        if (!this.f55407G) {
            if (this.f55405E.N() && this.f55406F.P0(this.f55405E, PlaybackStateCompat.f4289d0) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.e
    public short N0() throws IOException {
        X0(2L);
        return this.f55405E.N0();
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        if (c2385c != null) {
            if (j4 >= 0) {
                if (!this.f55407G) {
                    C2385c c2385c2 = this.f55405E;
                    if (c2385c2.f55330F == 0 && this.f55406F.P0(c2385c2, PlaybackStateCompat.f4289d0) == -1) {
                        return -1L;
                    }
                    return this.f55405E.P0(c2385c, Math.min(j4, this.f55405E.f55330F));
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public long Q0() throws IOException {
        X0(8L);
        return this.f55405E.Q0();
    }

    @Override // okio.e
    public long R0(y yVar) throws IOException {
        if (yVar != null) {
            long j4 = 0;
            while (this.f55406F.P0(this.f55405E, PlaybackStateCompat.f4289d0) != -1) {
                long d4 = this.f55405E.d();
                if (d4 > 0) {
                    j4 += d4;
                    yVar.n0(this.f55405E, d4);
                }
            }
            if (this.f55405E.F0() > 0) {
                long F02 = j4 + this.f55405E.F0();
                C2385c c2385c = this.f55405E;
                yVar.n0(c2385c, c2385c.F0());
                return F02;
            }
            return j4;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public long S(byte b4, long j4) throws IOException {
        return U(b4, j4, Long.MAX_VALUE);
    }

    @Override // okio.e
    public void T(C2385c c2385c, long j4) throws IOException {
        try {
            X0(j4);
            this.f55405E.T(c2385c, j4);
        } catch (EOFException e4) {
            c2385c.q0(this.f55405E);
            throw e4;
        }
    }

    @Override // okio.e
    public long U(byte b4, long j4, long j5) throws IOException {
        if (!this.f55407G) {
            if (j4 >= 0 && j5 >= j4) {
                while (j4 < j5) {
                    long U3 = this.f55405E.U(b4, j4, j5);
                    if (U3 != -1) {
                        return U3;
                    }
                    C2385c c2385c = this.f55405E;
                    long j6 = c2385c.f55330F;
                    if (j6 >= j5 || this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                        break;
                    }
                    j4 = Math.max(j4, j6);
                }
                return -1L;
            }
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j4), Long.valueOf(j5)));
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.e
    public long V0(ByteString byteString, long j4) throws IOException {
        if (this.f55407G) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long V02 = this.f55405E.V0(byteString, j4);
            if (V02 != -1) {
                return V02;
            }
            C2385c c2385c = this.f55405E;
            long j5 = c2385c.f55330F;
            if (this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, j5);
        }
    }

    @Override // okio.e
    public long W(ByteString byteString) throws IOException {
        return V0(byteString, 0L);
    }

    @Override // okio.e
    @Nullable
    public String X() throws IOException {
        long c12 = c1((byte) 10);
        if (c12 == -1) {
            long j4 = this.f55405E.f55330F;
            if (j4 != 0) {
                return q(j4);
            }
            return null;
        }
        return this.f55405E.u0(c12);
    }

    @Override // okio.e
    public void X0(long j4) throws IOException {
        if (v0(j4)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // okio.e
    public long Z() throws IOException {
        byte n4;
        X0(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (!v0(i5)) {
                break;
            }
            n4 = this.f55405E.n(i4);
            if ((n4 < 48 || n4 > 57) && !(i4 == 0 && n4 == 45)) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(n4)));
        }
        return this.f55405E.Z();
    }

    @Override // okio.e
    public String b0(long j4) throws IOException {
        long j5;
        if (j4 >= 0) {
            if (j4 == Long.MAX_VALUE) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = j4 + 1;
            }
            long U3 = U((byte) 10, 0L, j5);
            if (U3 != -1) {
                return this.f55405E.u0(U3);
            }
            if (j5 < Long.MAX_VALUE && v0(j5) && this.f55405E.n(j5 - 1) == 13 && v0(1 + j5) && this.f55405E.n(j5) == 10) {
                return this.f55405E.u0(j5);
            }
            C2385c c2385c = new C2385c();
            C2385c c2385c2 = this.f55405E;
            c2385c2.i(c2385c, 0L, Math.min(32L, c2385c2.F0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f55405E.F0(), j4) + " content=" + c2385c.s0().s() + F.f52734F);
        }
        throw new IllegalArgumentException("limit < 0: " + j4);
    }

    @Override // okio.e
    public long c1(byte b4) throws IOException {
        return U(b4, 0L, Long.MAX_VALUE);
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f55407G) {
            return;
        }
        this.f55407G = true;
        this.f55406F.close();
        this.f55405E.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d1() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 1
            r5.X0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.v0(r2)
            if (r2 == 0) goto L48
            okio.c r2 = r5.f55405E
            long r3 = (long) r0
            byte r2 = r2.n(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L48
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L48:
            okio.c r0 = r5.f55405E
            long r0 = r0.d1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.u.d1():long");
    }

    @Override // okio.e
    public InputStream e1() {
        return new a();
    }

    @Override // okio.e, okio.InterfaceC2386d
    public C2385c g() {
        return this.f55405E;
    }

    @Override // okio.e
    public int g1(p pVar) throws IOException {
        if (this.f55407G) {
            throw new IllegalStateException("closed");
        }
        do {
            int y02 = this.f55405E.y0(pVar, true);
            if (y02 == -1) {
                return -1;
            }
            if (y02 != -2) {
                this.f55405E.skip(pVar.f55378E[y02].R());
                return y02;
            }
        } while (this.f55406F.P0(this.f55405E, PlaybackStateCompat.f4289d0) != -1);
        return -1;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f55407G;
    }

    @Override // okio.e
    public boolean j0(long j4, ByteString byteString) throws IOException {
        return D0(j4, byteString, 0, byteString.R());
    }

    @Override // okio.e
    public String k0(Charset charset) throws IOException {
        if (charset != null) {
            this.f55405E.q0(this.f55406F);
            return this.f55405E.k0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.e
    public int m0() throws IOException {
        X0(1L);
        byte n4 = this.f55405E.n(0L);
        if ((n4 & 224) == 192) {
            X0(2L);
        } else if ((n4 & 240) == 224) {
            X0(3L);
        } else if ((n4 & 248) == 240) {
            X0(4L);
        }
        return this.f55405E.m0();
    }

    @Override // okio.e
    public e peek() {
        return o.d(new q(this));
    }

    @Override // okio.e
    public String q(long j4) throws IOException {
        X0(j4);
        return this.f55405E.q(j4);
    }

    @Override // okio.e
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.e
    public byte readByte() throws IOException {
        X0(1L);
        return this.f55405E.readByte();
    }

    @Override // okio.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            X0(bArr.length);
            this.f55405E.readFully(bArr);
        } catch (EOFException e4) {
            int i4 = 0;
            while (true) {
                C2385c c2385c = this.f55405E;
                long j4 = c2385c.f55330F;
                if (j4 > 0) {
                    int read = c2385c.read(bArr, i4, (int) j4);
                    if (read != -1) {
                        i4 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e4;
                }
            }
        }
    }

    @Override // okio.e
    public int readInt() throws IOException {
        X0(4L);
        return this.f55405E.readInt();
    }

    @Override // okio.e
    public long readLong() throws IOException {
        X0(8L);
        return this.f55405E.readLong();
    }

    @Override // okio.e
    public short readShort() throws IOException {
        X0(2L);
        return this.f55405E.readShort();
    }

    @Override // okio.e
    public long s(ByteString byteString, long j4) throws IOException {
        if (this.f55407G) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long s4 = this.f55405E.s(byteString, j4);
            if (s4 != -1) {
                return s4;
            }
            C2385c c2385c = this.f55405E;
            long j5 = c2385c.f55330F;
            if (this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, (j5 - byteString.R()) + 1);
        }
    }

    @Override // okio.e
    public ByteString s0() throws IOException {
        this.f55405E.q0(this.f55406F);
        return this.f55405E.s0();
    }

    @Override // okio.e
    public void skip(long j4) throws IOException {
        if (!this.f55407G) {
            while (j4 > 0) {
                C2385c c2385c = this.f55405E;
                if (c2385c.f55330F == 0 && this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j4, this.f55405E.F0());
                this.f55405E.skip(min);
                j4 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.z
    public A timeout() {
        return this.f55406F.timeout();
    }

    public String toString() {
        return "buffer(" + this.f55406F + ")";
    }

    @Override // okio.e
    public ByteString u(long j4) throws IOException {
        X0(j4);
        return this.f55405E.u(j4);
    }

    @Override // okio.e
    public boolean v0(long j4) throws IOException {
        C2385c c2385c;
        if (j4 >= 0) {
            if (this.f55407G) {
                throw new IllegalStateException("closed");
            }
            do {
                c2385c = this.f55405E;
                if (c2385c.f55330F >= j4) {
                    return true;
                }
            } while (this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    @Override // okio.e
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        long j4 = i5;
        C.b(bArr.length, i4, j4);
        C2385c c2385c = this.f55405E;
        if (c2385c.f55330F == 0 && this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
            return -1;
        }
        return this.f55405E.read(bArr, i4, (int) Math.min(j4, this.f55405E.f55330F));
    }

    /* loaded from: classes2.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            u uVar = u.this;
            if (!uVar.f55407G) {
                return (int) Math.min(uVar.f55405E.f55330F, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            u.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            u uVar = u.this;
            if (!uVar.f55407G) {
                C2385c c2385c = uVar.f55405E;
                if (c2385c.f55330F == 0 && uVar.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                    return -1;
                }
                return u.this.f55405E.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return u.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            if (!u.this.f55407G) {
                C.b(bArr.length, i4, i5);
                u uVar = u.this;
                C2385c c2385c = uVar.f55405E;
                if (c2385c.f55330F == 0 && uVar.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
                    return -1;
                }
                return u.this.f55405E.read(bArr, i4, i5);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C2385c c2385c = this.f55405E;
        if (c2385c.f55330F == 0 && this.f55406F.P0(c2385c, PlaybackStateCompat.f4289d0) == -1) {
            return -1;
        }
        return this.f55405E.read(byteBuffer);
    }
}
