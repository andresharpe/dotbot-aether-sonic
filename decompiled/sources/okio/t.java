package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t implements InterfaceC2386d {

    /* renamed from: E, reason: collision with root package name */
    public final C2385c f55401E = new C2385c();

    /* renamed from: F, reason: collision with root package name */
    public final y f55402F;

    /* renamed from: G, reason: collision with root package name */
    boolean f55403G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(y yVar) {
        if (yVar != null) {
            this.f55402F = yVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d B(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.B(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d E(long j4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.E(j4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d J0(byte[] bArr) throws IOException {
        if (!this.f55403G) {
            this.f55401E.J0(bArr);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d L0(ByteString byteString) throws IOException {
        if (!this.f55403G) {
            this.f55401E.L0(byteString);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d M(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.M(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d O(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.O(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d U0(String str, int i4, int i5, Charset charset) throws IOException {
        if (!this.f55403G) {
            this.f55401E.U0(str, i4, i5, charset);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d W0(long j4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.W0(j4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d Y() throws IOException {
        if (!this.f55403G) {
            long d4 = this.f55401E.d();
            if (d4 > 0) {
                this.f55402F.n0(this.f55401E, d4);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d Z0(long j4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.Z0(j4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public OutputStream b1() {
        return new a();
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f55403G) {
            return;
        }
        try {
            C2385c c2385c = this.f55401E;
            long j4 = c2385c.f55330F;
            if (j4 > 0) {
                this.f55402F.n0(c2385c, j4);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f55402F.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f55403G = true;
        if (th != null) {
            C.f(th);
        }
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d d0(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.d0(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d, okio.y, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f55403G) {
            C2385c c2385c = this.f55401E;
            long j4 = c2385c.f55330F;
            if (j4 > 0) {
                this.f55402F.n0(c2385c, j4);
            }
            this.f55402F.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public C2385c g() {
        return this.f55401E;
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d g0(String str) throws IOException {
        if (!this.f55403G) {
            this.f55401E.g0(str);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f55403G;
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d l0(byte[] bArr, int i4, int i5) throws IOException {
        if (!this.f55403G) {
            this.f55401E.l0(bArr, i4, i5);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.y
    public void n0(C2385c c2385c, long j4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.n0(c2385c, j4);
            Y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d p0(String str, int i4, int i5) throws IOException {
        if (!this.f55403G) {
            this.f55401E.p0(str, i4, i5);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public long q0(z zVar) throws IOException {
        if (zVar != null) {
            long j4 = 0;
            while (true) {
                long P02 = zVar.P0(this.f55401E, PlaybackStateCompat.f4289d0);
                if (P02 != -1) {
                    j4 += P02;
                    Y();
                } else {
                    return j4;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d r0(long j4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.r0(j4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d t0(String str, Charset charset) throws IOException {
        if (!this.f55403G) {
            this.f55401E.t0(str, charset);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.y
    public A timeout() {
        return this.f55402F.timeout();
    }

    public String toString() {
        return "buffer(" + this.f55402F + ")";
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d w() throws IOException {
        if (!this.f55403G) {
            long F02 = this.f55401E.F0();
            if (F02 > 0) {
                this.f55402F.n0(this.f55401E, F02);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d w0(z zVar, long j4) throws IOException {
        while (j4 > 0) {
            long P02 = zVar.P0(this.f55401E, j4);
            if (P02 != -1) {
                j4 -= P02;
                Y();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f55403G) {
            int write = this.f55401E.write(byteBuffer);
            Y();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d x(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.x(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d y(int i4) throws IOException {
        if (!this.f55403G) {
            this.f55401E.y(i4);
            return Y();
        }
        throw new IllegalStateException("closed");
    }

    /* loaded from: classes2.dex */
    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            t.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            t tVar = t.this;
            if (!tVar.f55403G) {
                tVar.flush();
            }
        }

        public String toString() {
            return t.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i4) throws IOException {
            t tVar = t.this;
            if (!tVar.f55403G) {
                tVar.f55401E.O((byte) i4);
                t.this.Y();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            t tVar = t.this;
            if (!tVar.f55403G) {
                tVar.f55401E.l0(bArr, i4, i5);
                t.this.Y();
                return;
            }
            throw new IOException("closed");
        }
    }
}
