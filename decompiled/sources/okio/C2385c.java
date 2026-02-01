package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.harman.sdk.message.BatteryInfo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C2191n;
import kotlin.text.F;

/* renamed from: okio.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2385c implements e, InterfaceC2386d, Cloneable, ByteChannel {

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f55327G = {48, 49, 50, 51, com.harman.sdk.utils.k.f48684l, 53, 54, 55, 56, 57, 97, 98, 99, com.harman.sdk.utils.k.f48584H0, com.harman.sdk.utils.k.f48587I0, com.harman.sdk.utils.k.f48590J0};

    /* renamed from: H, reason: collision with root package name */
    static final int f55328H = 65533;

    /* renamed from: E, reason: collision with root package name */
    @Nullable
    v f55329E;

    /* renamed from: F, reason: collision with root package name */
    long f55330F;

    /* renamed from: okio.c$a */
    /* loaded from: classes2.dex */
    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C2385c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i4) {
            C2385c.this.O((byte) i4);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) {
            C2385c.this.l0(bArr, i4, i5);
        }
    }

    /* renamed from: okio.c$b */
    /* loaded from: classes2.dex */
    class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C2385c.this.f55330F, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C2385c c2385c = C2385c.this;
            if (c2385c.f55330F > 0) {
                return c2385c.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C2385c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) {
            return C2385c.this.read(bArr, i4, i5);
        }
    }

    /* renamed from: okio.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0513c implements Closeable {

        /* renamed from: E, reason: collision with root package name */
        public C2385c f55333E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f55334F;

        /* renamed from: G, reason: collision with root package name */
        private v f55335G;

        /* renamed from: I, reason: collision with root package name */
        public byte[] f55337I;

        /* renamed from: H, reason: collision with root package name */
        public long f55336H = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f55338J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f55339K = -1;

        public final long a(int i4) {
            if (i4 > 0) {
                if (i4 <= 8192) {
                    C2385c c2385c = this.f55333E;
                    if (c2385c != null) {
                        if (this.f55334F) {
                            long j4 = c2385c.f55330F;
                            v a12 = c2385c.a1(i4);
                            int i5 = 8192 - a12.f55413c;
                            a12.f55413c = 8192;
                            long j5 = i5;
                            this.f55333E.f55330F = j4 + j5;
                            this.f55335G = a12;
                            this.f55336H = j4;
                            this.f55337I = a12.f55411a;
                            this.f55338J = 8192 - i5;
                            this.f55339K = 8192;
                            return j5;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                    }
                    throw new IllegalStateException("not attached to a buffer");
                }
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i4);
            }
            throw new IllegalArgumentException("minByteCount <= 0: " + i4);
        }

        public final int b() {
            long j4 = this.f55336H;
            if (j4 != this.f55333E.f55330F) {
                if (j4 == -1) {
                    return d(0L);
                }
                return d(j4 + (this.f55339K - this.f55338J));
            }
            throw new IllegalStateException();
        }

        public final long c(long j4) {
            C2385c c2385c = this.f55333E;
            if (c2385c != null) {
                if (this.f55334F) {
                    long j5 = c2385c.f55330F;
                    if (j4 <= j5) {
                        if (j4 >= 0) {
                            long j6 = j5 - j4;
                            while (true) {
                                if (j6 <= 0) {
                                    break;
                                }
                                C2385c c2385c2 = this.f55333E;
                                v vVar = c2385c2.f55329E.f55417g;
                                int i4 = vVar.f55413c;
                                long j7 = i4 - vVar.f55412b;
                                if (j7 <= j6) {
                                    c2385c2.f55329E = vVar.b();
                                    w.a(vVar);
                                    j6 -= j7;
                                } else {
                                    vVar.f55413c = (int) (i4 - j6);
                                    break;
                                }
                            }
                            this.f55335G = null;
                            this.f55336H = j4;
                            this.f55337I = null;
                            this.f55338J = -1;
                            this.f55339K = -1;
                        } else {
                            throw new IllegalArgumentException("newSize < 0: " + j4);
                        }
                    } else if (j4 > j5) {
                        long j8 = j4 - j5;
                        boolean z3 = true;
                        while (j8 > 0) {
                            v a12 = this.f55333E.a1(1);
                            int min = (int) Math.min(j8, 8192 - a12.f55413c);
                            int i5 = a12.f55413c + min;
                            a12.f55413c = i5;
                            j8 -= min;
                            if (z3) {
                                this.f55335G = a12;
                                this.f55336H = j5;
                                this.f55337I = a12.f55411a;
                                this.f55338J = i5 - min;
                                this.f55339K = i5;
                                z3 = false;
                            }
                        }
                    }
                    this.f55333E.f55330F = j4;
                    return j5;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55333E != null) {
                this.f55333E = null;
                this.f55335G = null;
                this.f55336H = -1L;
                this.f55337I = null;
                this.f55338J = -1;
                this.f55339K = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int d(long j4) {
            if (j4 >= -1) {
                C2385c c2385c = this.f55333E;
                long j5 = c2385c.f55330F;
                if (j4 <= j5) {
                    if (j4 != -1 && j4 != j5) {
                        v vVar = c2385c.f55329E;
                        v vVar2 = this.f55335G;
                        long j6 = 0;
                        if (vVar2 != null) {
                            long j7 = this.f55336H - (this.f55338J - vVar2.f55412b);
                            if (j7 > j4) {
                                j5 = j7;
                                vVar2 = vVar;
                                vVar = vVar2;
                            } else {
                                j6 = j7;
                            }
                        } else {
                            vVar2 = vVar;
                        }
                        if (j5 - j4 > j4 - j6) {
                            while (true) {
                                int i4 = vVar2.f55413c;
                                int i5 = vVar2.f55412b;
                                if (j4 < (i4 - i5) + j6) {
                                    break;
                                }
                                j6 += i4 - i5;
                                vVar2 = vVar2.f55416f;
                            }
                        } else {
                            while (j5 > j4) {
                                vVar = vVar.f55417g;
                                j5 -= vVar.f55413c - vVar.f55412b;
                            }
                            vVar2 = vVar;
                            j6 = j5;
                        }
                        if (this.f55334F && vVar2.f55414d) {
                            v f4 = vVar2.f();
                            C2385c c2385c2 = this.f55333E;
                            if (c2385c2.f55329E == vVar2) {
                                c2385c2.f55329E = f4;
                            }
                            vVar2 = vVar2.c(f4);
                            vVar2.f55417g.b();
                        }
                        this.f55335G = vVar2;
                        this.f55336H = j4;
                        this.f55337I = vVar2.f55411a;
                        int i6 = vVar2.f55412b + ((int) (j4 - j6));
                        this.f55338J = i6;
                        int i7 = vVar2.f55413c;
                        this.f55339K = i7;
                        return i7 - i6;
                    }
                    this.f55335G = null;
                    this.f55336H = j4;
                    this.f55337I = null;
                    this.f55338J = -1;
                    this.f55339K = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j4), Long.valueOf(this.f55333E.f55330F)));
        }
    }

    private boolean G(v vVar, int i4, ByteString byteString, int i5, int i6) {
        int i7 = vVar.f55413c;
        byte[] bArr = vVar.f55411a;
        while (i5 < i6) {
            if (i4 == i7) {
                vVar = vVar.f55416f;
                byte[] bArr2 = vVar.f55411a;
                bArr = bArr2;
                i4 = vVar.f55412b;
                i7 = vVar.f55413c;
            }
            if (bArr[i4] != byteString.r(i5)) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    private void c0(InputStream inputStream, long j4, boolean z3) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j4 <= 0 && !z3) {
                return;
            }
            v a12 = a1(1);
            int read = inputStream.read(a12.f55411a, a12.f55413c, (int) Math.min(j4, 8192 - a12.f55413c));
            if (read == -1) {
                if (z3) {
                    return;
                } else {
                    throw new EOFException();
                }
            } else {
                a12.f55413c += read;
                long j5 = read;
                this.f55330F += j5;
                j4 -= j5;
            }
        }
    }

    private ByteString j(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            v vVar = this.f55329E;
            if (vVar != null) {
                byte[] bArr = vVar.f55411a;
                int i4 = vVar.f55412b;
                messageDigest.update(bArr, i4, vVar.f55413c - i4);
                v vVar2 = this.f55329E;
                while (true) {
                    vVar2 = vVar2.f55416f;
                    if (vVar2 == this.f55329E) {
                        break;
                    }
                    byte[] bArr2 = vVar2.f55411a;
                    int i5 = vVar2.f55412b;
                    messageDigest.update(bArr2, i5, vVar2.f55413c - i5);
                }
            }
            return ByteString.I(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private ByteString p(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.Z(), str));
            v vVar = this.f55329E;
            if (vVar != null) {
                byte[] bArr = vVar.f55411a;
                int i4 = vVar.f55412b;
                mac.update(bArr, i4, vVar.f55413c - i4);
                v vVar2 = this.f55329E;
                while (true) {
                    vVar2 = vVar2.f55416f;
                    if (vVar2 == this.f55329E) {
                        break;
                    }
                    byte[] bArr2 = vVar2.f55411a;
                    int i5 = vVar2.f55412b;
                    mac.update(bArr2, i5, vVar2.f55413c - i5);
                }
            }
            return ByteString.I(mac.doFinal());
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final ByteString A(ByteString byteString) {
        return p("HmacSHA256", byteString);
    }

    @Override // okio.e
    public String A0() throws EOFException {
        return b0(Long.MAX_VALUE);
    }

    public final ByteString B0() {
        return j("SHA-256");
    }

    @Override // okio.e
    public int C0() {
        return C.c(readInt());
    }

    public final ByteString D(ByteString byteString) {
        return p("HmacSHA512", byteString);
    }

    @Override // okio.e
    public boolean D0(long j4, ByteString byteString, int i4, int i5) {
        if (j4 < 0 || i4 < 0 || i5 < 0 || this.f55330F - j4 < i5 || byteString.R() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (n(i6 + j4) != byteString.r(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public final ByteString E0() {
        return j("SHA-512");
    }

    public final ByteString F() {
        return j("MD5");
    }

    public final long F0() {
        return this.f55330F;
    }

    @Override // okio.e
    public byte[] G0(long j4) throws EOFException {
        C.b(this.f55330F, 0L, j4);
        if (j4 <= 2147483647L) {
            byte[] bArr = new byte[(int) j4];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j4);
    }

    public final C0513c H() {
        return P(new C0513c());
    }

    @Override // okio.e
    public String H0() {
        try {
            return K0(this.f55330F, C.f55313a);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // okio.e
    public byte[] I() {
        try {
            return G0(this.f55330F);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // okio.e
    public long K(ByteString byteString) throws IOException {
        return s(byteString, 0L);
    }

    @Override // okio.e
    public String K0(long j4, Charset charset) throws EOFException {
        C.b(this.f55330F, 0L, j4);
        if (charset != null) {
            if (j4 <= 2147483647L) {
                if (j4 == 0) {
                    return "";
                }
                v vVar = this.f55329E;
                int i4 = vVar.f55412b;
                if (i4 + j4 > vVar.f55413c) {
                    return new String(G0(j4), charset);
                }
                String str = new String(vVar.f55411a, i4, (int) j4, charset);
                int i5 = (int) (vVar.f55412b + j4);
                vVar.f55412b = i5;
                this.f55330F -= j4;
                if (i5 == vVar.f55413c) {
                    this.f55329E = vVar.b();
                    w.a(vVar);
                }
                return str;
            }
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j4);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.e
    public C2385c L() {
        return this;
    }

    public final ByteString M0() {
        long j4 = this.f55330F;
        if (j4 <= 2147483647L) {
            return Y0((int) j4);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f55330F);
    }

    @Override // okio.e
    public boolean N() {
        if (this.f55330F == 0) {
            return true;
        }
        return false;
    }

    @Override // okio.e
    public short N0() {
        return C.e(readShort());
    }

    public final C0513c P(C0513c c0513c) {
        if (c0513c.f55333E == null) {
            c0513c.f55333E = this;
            c0513c.f55334F = true;
            return c0513c;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // okio.z
    public long P0(C2385c c2385c, long j4) {
        if (c2385c != null) {
            if (j4 >= 0) {
                long j5 = this.f55330F;
                if (j5 == 0) {
                    return -1L;
                }
                if (j4 > j5) {
                    j4 = j5;
                }
                c2385c.n0(this, j4);
                return j4;
            }
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public long Q0() {
        return C.d(readLong());
    }

    @Override // okio.e
    public long R0(y yVar) throws IOException {
        long j4 = this.f55330F;
        if (j4 > 0) {
            yVar.n0(this, j4);
        }
        return j4;
    }

    @Override // okio.e
    public long S(byte b4, long j4) {
        return U(b4, j4, Long.MAX_VALUE);
    }

    @Override // okio.e
    public void T(C2385c c2385c, long j4) throws EOFException {
        long j5 = this.f55330F;
        if (j5 >= j4) {
            c2385c.n0(this, j4);
        } else {
            c2385c.n0(this, j5);
            throw new EOFException();
        }
    }

    @Override // okio.e
    public long U(byte b4, long j4, long j5) {
        long j6;
        v vVar;
        long j7 = 0;
        if (j4 >= 0 && j5 >= j4) {
            long j8 = this.f55330F;
            if (j5 > j8) {
                j6 = j8;
            } else {
                j6 = j5;
            }
            if (j4 == j6 || (vVar = this.f55329E) == null) {
                return -1L;
            }
            if (j8 - j4 < j4) {
                while (j8 > j4) {
                    vVar = vVar.f55417g;
                    j8 -= vVar.f55413c - vVar.f55412b;
                }
            } else {
                while (true) {
                    long j9 = (vVar.f55413c - vVar.f55412b) + j7;
                    if (j9 >= j4) {
                        break;
                    }
                    vVar = vVar.f55416f;
                    j7 = j9;
                }
                j8 = j7;
            }
            long j10 = j4;
            while (j8 < j6) {
                byte[] bArr = vVar.f55411a;
                int min = (int) Math.min(vVar.f55413c, (vVar.f55412b + j6) - j8);
                for (int i4 = (int) ((vVar.f55412b + j10) - j8); i4 < min; i4++) {
                    if (bArr[i4] == b4) {
                        return (i4 - vVar.f55412b) + j8;
                    }
                }
                j8 += vVar.f55413c - vVar.f55412b;
                vVar = vVar.f55416f;
                j10 = j8;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f55330F), Long.valueOf(j4), Long.valueOf(j5)));
    }

    public final C2385c V(InputStream inputStream) throws IOException {
        c0(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.e
    public long V0(ByteString byteString, long j4) {
        int i4;
        int i5;
        long j5 = 0;
        if (j4 >= 0) {
            v vVar = this.f55329E;
            if (vVar == null) {
                return -1L;
            }
            long j6 = this.f55330F;
            if (j6 - j4 < j4) {
                while (j6 > j4) {
                    vVar = vVar.f55417g;
                    j6 -= vVar.f55413c - vVar.f55412b;
                }
            } else {
                while (true) {
                    long j7 = (vVar.f55413c - vVar.f55412b) + j5;
                    if (j7 >= j4) {
                        break;
                    }
                    vVar = vVar.f55416f;
                    j5 = j7;
                }
                j6 = j5;
            }
            if (byteString.R() == 2) {
                byte r4 = byteString.r(0);
                byte r5 = byteString.r(1);
                while (j6 < this.f55330F) {
                    byte[] bArr = vVar.f55411a;
                    i4 = (int) ((vVar.f55412b + j4) - j6);
                    int i6 = vVar.f55413c;
                    while (i4 < i6) {
                        byte b4 = bArr[i4];
                        if (b4 != r4 && b4 != r5) {
                            i4++;
                        } else {
                            i5 = vVar.f55412b;
                            return (i4 - i5) + j6;
                        }
                    }
                    j6 += vVar.f55413c - vVar.f55412b;
                    vVar = vVar.f55416f;
                    j4 = j6;
                }
                return -1L;
            }
            byte[] B3 = byteString.B();
            while (j6 < this.f55330F) {
                byte[] bArr2 = vVar.f55411a;
                i4 = (int) ((vVar.f55412b + j4) - j6);
                int i7 = vVar.f55413c;
                while (i4 < i7) {
                    byte b5 = bArr2[i4];
                    for (byte b6 : B3) {
                        if (b5 == b6) {
                            i5 = vVar.f55412b;
                            return (i4 - i5) + j6;
                        }
                    }
                    i4++;
                }
                j6 += vVar.f55413c - vVar.f55412b;
                vVar = vVar.f55416f;
                j4 = j6;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // okio.e
    public long W(ByteString byteString) {
        return V0(byteString, 0L);
    }

    @Override // okio.e
    @Nullable
    public String X() throws EOFException {
        long c12 = c1((byte) 10);
        if (c12 == -1) {
            long j4 = this.f55330F;
            if (j4 != 0) {
                return q(j4);
            }
            return null;
        }
        return u0(c12);
    }

    @Override // okio.e
    public void X0(long j4) throws EOFException {
        if (this.f55330F >= j4) {
        } else {
            throw new EOFException();
        }
    }

    public final ByteString Y0(int i4) {
        if (i4 == 0) {
            return ByteString.f55309J;
        }
        return new x(this, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[EDGE_INSN: B:46:0x00ac->B:40:0x00ac BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long Z() {
        /*
            r15 = this;
            long r0 = r15.f55330F
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            okio.v r7 = r15.f55329E
            byte[] r8 = r7.f55411a
            int r9 = r7.f55412b
            int r10 = r7.f55413c
        L17:
            if (r9 >= r10) goto L98
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L69
            r12 = 57
            if (r11 > r12) goto L69
            int r12 = 48 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L3c
            if (r13 != 0) goto L36
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L36
            goto L3c
        L36:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L74
        L3c:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.Z0(r3)
            okio.c r0 = r0.O(r11)
            if (r1 != 0) goto L4e
            r0.readByte()
        L4e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.H0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L69:
            r12 = 45
            r13 = 1
            if (r11 != r12) goto L79
            if (r0 != 0) goto L79
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L74:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L17
        L79:
            if (r0 == 0) goto L7d
            r2 = r13
            goto L98
        L7d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            if (r9 != r10) goto La4
            okio.v r8 = r7.b()
            r15.f55329E = r8
            okio.w.a(r7)
            goto La6
        La4:
            r7.f55412b = r9
        La6:
            if (r2 != 0) goto Lac
            okio.v r7 = r15.f55329E
            if (r7 != 0) goto Lf
        Lac:
            long r5 = r15.f55330F
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.f55330F = r5
            if (r1 == 0) goto Lb5
            goto Lb6
        Lb5:
            long r3 = -r3
        Lb6:
            return r3
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C2385c.Z():long");
    }

    public final void a() {
        try {
            skip(this.f55330F);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    public final C2385c a0(InputStream inputStream, long j4) throws IOException {
        if (j4 >= 0) {
            c0(inputStream, j4, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v a1(int i4) {
        if (i4 >= 1 && i4 <= 8192) {
            v vVar = this.f55329E;
            if (vVar == null) {
                v b4 = w.b();
                this.f55329E = b4;
                b4.f55417g = b4;
                b4.f55416f = b4;
                return b4;
            }
            v vVar2 = vVar.f55417g;
            if (vVar2.f55413c + i4 > 8192 || !vVar2.f55415e) {
                return vVar2.c(w.b());
            }
            return vVar2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2385c clone() {
        C2385c c2385c = new C2385c();
        if (this.f55330F == 0) {
            return c2385c;
        }
        v d4 = this.f55329E.d();
        c2385c.f55329E = d4;
        d4.f55417g = d4;
        d4.f55416f = d4;
        v vVar = this.f55329E;
        while (true) {
            vVar = vVar.f55416f;
            if (vVar != this.f55329E) {
                c2385c.f55329E.f55417g.c(vVar.d());
            } else {
                c2385c.f55330F = this.f55330F;
                return c2385c;
            }
        }
    }

    @Override // okio.e
    public String b0(long j4) throws EOFException {
        if (j4 >= 0) {
            long j5 = Long.MAX_VALUE;
            if (j4 != Long.MAX_VALUE) {
                j5 = j4 + 1;
            }
            long U3 = U((byte) 10, 0L, j5);
            if (U3 != -1) {
                return u0(U3);
            }
            if (j5 < F0() && n(j5 - 1) == 13 && n(j5) == 10) {
                return u0(j5);
            }
            C2385c c2385c = new C2385c();
            i(c2385c, 0L, Math.min(32L, F0()));
            throw new EOFException("\\n not found: limit=" + Math.min(F0(), j4) + " content=" + c2385c.s0().s() + F.f52734F);
        }
        throw new IllegalArgumentException("limit < 0: " + j4);
    }

    @Override // okio.InterfaceC2386d
    public OutputStream b1() {
        return new a();
    }

    @Override // okio.e
    public long c1(byte b4) {
        return U(b4, 0L, Long.MAX_VALUE);
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long d() {
        long j4 = this.f55330F;
        if (j4 == 0) {
            return 0L;
        }
        v vVar = this.f55329E.f55417g;
        if (vVar.f55413c < 8192 && vVar.f55415e) {
            return j4 - (r3 - vVar.f55412b);
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d1() {
        /*
            r14 = this;
            long r0 = r14.f55330F
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.v r6 = r14.f55329E
            byte[] r7 = r6.f55411a
            int r8 = r6.f55412b
            int r9 = r6.f55413c
        L13:
            if (r8 >= r9) goto L8e
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.r0(r4)
            okio.c r0 = r0.O(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.H0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8e
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8e:
            if (r8 != r9) goto L9a
            okio.v r7 = r6.b()
            r14.f55329E = r7
            okio.w.a(r6)
            goto L9c
        L9a:
            r6.f55412b = r8
        L9c:
            if (r1 != 0) goto La2
            okio.v r6 = r14.f55329E
            if (r6 != 0) goto Lb
        La2:
            long r1 = r14.f55330F
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f55330F = r1
            return r4
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C2385c.d1():long");
    }

    public final C0513c e0() {
        return i0(new C0513c());
    }

    @Override // okio.e
    public InputStream e1() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2385c)) {
            return false;
        }
        C2385c c2385c = (C2385c) obj;
        long j4 = this.f55330F;
        if (j4 != c2385c.f55330F) {
            return false;
        }
        long j5 = 0;
        if (j4 == 0) {
            return true;
        }
        v vVar = this.f55329E;
        v vVar2 = c2385c.f55329E;
        int i4 = vVar.f55412b;
        int i5 = vVar2.f55412b;
        while (j5 < this.f55330F) {
            long min = Math.min(vVar.f55413c - i4, vVar2.f55413c - i5);
            int i6 = 0;
            while (i6 < min) {
                int i7 = i4 + 1;
                int i8 = i5 + 1;
                if (vVar.f55411a[i4] != vVar2.f55411a[i5]) {
                    return false;
                }
                i6++;
                i4 = i7;
                i5 = i8;
            }
            if (i4 == vVar.f55413c) {
                vVar = vVar.f55416f;
                i4 = vVar.f55412b;
            }
            if (i5 == vVar2.f55413c) {
                vVar2 = vVar2.f55416f;
                i5 = vVar2.f55412b;
            }
            j5 += min;
        }
        return true;
    }

    public final C2385c f(OutputStream outputStream) throws IOException {
        return h(outputStream, 0L, this.f55330F);
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C2385c L0(ByteString byteString) {
        if (byteString != null) {
            byteString.c0(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // okio.InterfaceC2386d, okio.y, java.io.Flushable
    public void flush() {
    }

    @Override // okio.e, okio.InterfaceC2386d
    public C2385c g() {
        return this;
    }

    @Override // okio.e
    public int g1(p pVar) {
        int y02 = y0(pVar, false);
        if (y02 == -1) {
            return -1;
        }
        try {
            skip(pVar.f55378E[y02].R());
            return y02;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final C2385c h(OutputStream outputStream, long j4, long j5) throws IOException {
        if (outputStream != null) {
            C.b(this.f55330F, j4, j5);
            if (j5 == 0) {
                return this;
            }
            v vVar = this.f55329E;
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
                int min = (int) Math.min(vVar.f55413c - r9, j5);
                outputStream.write(vVar.f55411a, (int) (vVar.f55412b + j4), min);
                j5 -= min;
                vVar = vVar.f55416f;
                j4 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C2385c J0(byte[] bArr) {
        if (bArr != null) {
            return l0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public int hashCode() {
        v vVar = this.f55329E;
        if (vVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = vVar.f55413c;
            for (int i6 = vVar.f55412b; i6 < i5; i6++) {
                i4 = (i4 * 31) + vVar.f55411a[i6];
            }
            vVar = vVar.f55416f;
        } while (vVar != this.f55329E);
        return i4;
    }

    public final C2385c i(C2385c c2385c, long j4, long j5) {
        if (c2385c != null) {
            C.b(this.f55330F, j4, j5);
            if (j5 == 0) {
                return this;
            }
            c2385c.f55330F += j5;
            v vVar = this.f55329E;
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
                v d4 = vVar.d();
                int i6 = (int) (d4.f55412b + j4);
                d4.f55412b = i6;
                d4.f55413c = Math.min(i6 + ((int) j5), d4.f55413c);
                v vVar2 = c2385c.f55329E;
                if (vVar2 == null) {
                    d4.f55417g = d4;
                    d4.f55416f = d4;
                    c2385c.f55329E = d4;
                } else {
                    vVar2.f55417g.c(d4);
                }
                j5 -= d4.f55413c - d4.f55412b;
                vVar = vVar.f55416f;
                j4 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final C0513c i0(C0513c c0513c) {
        if (c0513c.f55333E == null) {
            c0513c.f55333E = this;
            c0513c.f55334F = false;
            return c0513c;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C2385c l0(byte[] bArr, int i4, int i5) {
        if (bArr != null) {
            long j4 = i5;
            C.b(bArr.length, i4, j4);
            int i6 = i5 + i4;
            while (i4 < i6) {
                v a12 = a1(1);
                int min = Math.min(i6 - i4, 8192 - a12.f55413c);
                System.arraycopy(bArr, i4, a12.f55411a, a12.f55413c, min);
                i4 += min;
                a12.f55413c += min;
            }
            this.f55330F += j4;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.e
    public boolean j0(long j4, ByteString byteString) {
        return D0(j4, byteString, 0, byteString.R());
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C2385c O(int i4) {
        v a12 = a1(1);
        byte[] bArr = a12.f55411a;
        int i5 = a12.f55413c;
        a12.f55413c = i5 + 1;
        bArr[i5] = (byte) i4;
        this.f55330F++;
        return this;
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2385c Y() {
        return this;
    }

    @Override // okio.e
    public String k0(Charset charset) {
        try {
            return K0(this.f55330F, charset);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C2385c Z0(long j4) {
        boolean z3;
        if (j4 == 0) {
            return O(48);
        }
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return g0("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 < 100000000) {
            if (j4 < 10000) {
                if (j4 < 100) {
                    if (j4 >= 10) {
                        i4 = 2;
                    }
                } else if (j4 < 1000) {
                    i4 = 3;
                } else {
                    i4 = 4;
                }
            } else if (j4 < 1000000) {
                if (j4 < 100000) {
                    i4 = 5;
                } else {
                    i4 = 6;
                }
            } else if (j4 < 10000000) {
                i4 = 7;
            } else {
                i4 = 8;
            }
        } else if (j4 < 1000000000000L) {
            if (j4 < 10000000000L) {
                if (j4 < 1000000000) {
                    i4 = 9;
                } else {
                    i4 = 10;
                }
            } else if (j4 < 100000000000L) {
                i4 = 11;
            } else {
                i4 = 12;
            }
        } else if (j4 < 1000000000000000L) {
            if (j4 < 10000000000000L) {
                i4 = 13;
            } else if (j4 < 100000000000000L) {
                i4 = 14;
            } else {
                i4 = 15;
            }
        } else if (j4 < 100000000000000000L) {
            if (j4 < 10000000000000000L) {
                i4 = 16;
            } else {
                i4 = 17;
            }
        } else if (j4 < 1000000000000000000L) {
            i4 = 18;
        } else {
            i4 = 19;
        }
        if (z3) {
            i4++;
        }
        v a12 = a1(i4);
        byte[] bArr = a12.f55411a;
        int i5 = a12.f55413c + i4;
        while (j4 != 0) {
            i5--;
            bArr[i5] = f55327G[(int) (j4 % 10)];
            j4 /= 10;
        }
        if (z3) {
            bArr[i5 - 1] = 45;
        }
        a12.f55413c += i4;
        this.f55330F += i4;
        return this;
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C2385c r0(long j4) {
        if (j4 == 0) {
            return O(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j4)) / 4) + 1;
        v a12 = a1(numberOfTrailingZeros);
        byte[] bArr = a12.f55411a;
        int i4 = a12.f55413c;
        for (int i5 = (i4 + numberOfTrailingZeros) - 1; i5 >= i4; i5--) {
            bArr[i5] = f55327G[(int) (15 & j4)];
            j4 >>>= 4;
        }
        a12.f55413c += numberOfTrailingZeros;
        this.f55330F += numberOfTrailingZeros;
        return this;
    }

    @Override // okio.e
    public int m0() throws EOFException {
        int i4;
        int i5;
        int i6;
        if (this.f55330F != 0) {
            byte n4 = n(0L);
            if ((n4 & C2191n.f52349b) == 0) {
                i4 = n4 & Byte.MAX_VALUE;
                i6 = 0;
                i5 = 1;
            } else if ((n4 & 224) == 192) {
                i4 = n4 & com.harman.sdk.utils.k.f48669h0;
                i5 = 2;
                i6 = 128;
            } else if ((n4 & 240) == 224) {
                i4 = n4 & 15;
                i5 = 3;
                i6 = 2048;
            } else if ((n4 & 248) == 240) {
                i4 = n4 & 7;
                i5 = 4;
                i6 = 65536;
            } else {
                skip(1L);
                return f55328H;
            }
            long j4 = i5;
            if (this.f55330F >= j4) {
                for (int i7 = 1; i7 < i5; i7++) {
                    long j5 = i7;
                    byte n5 = n(j5);
                    if ((n5 & 192) == 128) {
                        i4 = (i4 << 6) | (n5 & 63);
                    } else {
                        skip(j5);
                        return f55328H;
                    }
                }
                skip(j4);
                if (i4 > 1114111) {
                    return f55328H;
                }
                if ((i4 >= 55296 && i4 <= 57343) || i4 < i6) {
                    return f55328H;
                }
                return i4;
            }
            throw new EOFException("size < " + i5 + ": " + this.f55330F + " (to read code point prefixed 0x" + Integer.toHexString(n4) + ")");
        }
        throw new EOFException();
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C2385c B(int i4) {
        v a12 = a1(4);
        byte[] bArr = a12.f55411a;
        int i5 = a12.f55413c;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        a12.f55413c = i5 + 4;
        this.f55330F += 4;
        return this;
    }

    public final byte n(long j4) {
        int i4;
        C.b(this.f55330F, j4, 1L);
        long j5 = this.f55330F;
        if (j5 - j4 > j4) {
            v vVar = this.f55329E;
            while (true) {
                int i5 = vVar.f55413c;
                int i6 = vVar.f55412b;
                long j6 = i5 - i6;
                if (j4 < j6) {
                    return vVar.f55411a[i6 + ((int) j4)];
                }
                j4 -= j6;
                vVar = vVar.f55416f;
            }
        } else {
            long j7 = j4 - j5;
            v vVar2 = this.f55329E;
            do {
                vVar2 = vVar2.f55417g;
                int i7 = vVar2.f55413c;
                i4 = vVar2.f55412b;
                j7 += i7 - i4;
            } while (j7 < 0);
            return vVar2.f55411a[i4 + ((int) j7)];
        }
    }

    @Override // okio.y
    public void n0(C2385c c2385c, long j4) {
        v vVar;
        int i4;
        if (c2385c != null) {
            if (c2385c != this) {
                C.b(c2385c.f55330F, 0L, j4);
                while (j4 > 0) {
                    v vVar2 = c2385c.f55329E;
                    if (j4 < vVar2.f55413c - vVar2.f55412b) {
                        v vVar3 = this.f55329E;
                        if (vVar3 != null) {
                            vVar = vVar3.f55417g;
                        } else {
                            vVar = null;
                        }
                        if (vVar != null && vVar.f55415e) {
                            long j5 = vVar.f55413c + j4;
                            if (vVar.f55414d) {
                                i4 = 0;
                            } else {
                                i4 = vVar.f55412b;
                            }
                            if (j5 - i4 <= PlaybackStateCompat.f4289d0) {
                                vVar2.g(vVar, (int) j4);
                                c2385c.f55330F -= j4;
                                this.f55330F += j4;
                                return;
                            }
                        }
                        c2385c.f55329E = vVar2.e((int) j4);
                    }
                    v vVar4 = c2385c.f55329E;
                    long j6 = vVar4.f55413c - vVar4.f55412b;
                    c2385c.f55329E = vVar4.b();
                    v vVar5 = this.f55329E;
                    if (vVar5 == null) {
                        this.f55329E = vVar4;
                        vVar4.f55417g = vVar4;
                        vVar4.f55416f = vVar4;
                    } else {
                        vVar5.f55417g.c(vVar4).a();
                    }
                    c2385c.f55330F -= j6;
                    this.f55330F += j6;
                    j4 -= j6;
                }
                return;
            }
            throw new IllegalArgumentException("source == this");
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C2385c M(int i4) {
        return B(C.c(i4));
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C2385c W0(long j4) {
        v a12 = a1(8);
        byte[] bArr = a12.f55411a;
        int i4 = a12.f55413c;
        bArr[i4] = (byte) ((j4 >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((j4 >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((j4 >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((j4 >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((j4 >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((j4 >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((j4 >>> 8) & 255);
        bArr[i4 + 7] = (byte) (j4 & 255);
        a12.f55413c = i4 + 8;
        this.f55330F += 8;
        return this;
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C2385c E(long j4) {
        return W0(C.d(j4));
    }

    @Override // okio.e
    public e peek() {
        return o.d(new q(this));
    }

    @Override // okio.e
    public String q(long j4) throws EOFException {
        return K0(j4, C.f55313a);
    }

    @Override // okio.InterfaceC2386d
    public long q0(z zVar) throws IOException {
        if (zVar != null) {
            long j4 = 0;
            while (true) {
                long P02 = zVar.P0(this, PlaybackStateCompat.f4289d0);
                if (P02 != -1) {
                    j4 += P02;
                } else {
                    return j4;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C2385c x(int i4) {
        v a12 = a1(2);
        byte[] bArr = a12.f55411a;
        int i5 = a12.f55413c;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        a12.f55413c = i5 + 2;
        this.f55330F += 2;
        return this;
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C2385c d0(int i4) {
        return x(C.e((short) i4));
    }

    @Override // okio.e
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.e
    public byte readByte() {
        long j4 = this.f55330F;
        if (j4 != 0) {
            v vVar = this.f55329E;
            int i4 = vVar.f55412b;
            int i5 = vVar.f55413c;
            int i6 = i4 + 1;
            byte b4 = vVar.f55411a[i4];
            this.f55330F = j4 - 1;
            if (i6 == i5) {
                this.f55329E = vVar.b();
                w.a(vVar);
            } else {
                vVar.f55412b = i6;
            }
            return b4;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i4 = 0;
        while (i4 < bArr.length) {
            int read = read(bArr, i4, bArr.length - i4);
            if (read != -1) {
                i4 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.e
    public int readInt() {
        long j4 = this.f55330F;
        if (j4 >= 4) {
            v vVar = this.f55329E;
            int i4 = vVar.f55412b;
            int i5 = vVar.f55413c;
            if (i5 - i4 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f55411a;
            int i6 = i4 + 3;
            int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
            int i8 = i4 + 4;
            int i9 = (bArr[i6] & 255) | i7;
            this.f55330F = j4 - 4;
            if (i8 == i5) {
                this.f55329E = vVar.b();
                w.a(vVar);
            } else {
                vVar.f55412b = i8;
            }
            return i9;
        }
        throw new IllegalStateException("size < 4: " + this.f55330F);
    }

    @Override // okio.e
    public long readLong() {
        long j4 = this.f55330F;
        if (j4 >= 8) {
            v vVar = this.f55329E;
            int i4 = vVar.f55412b;
            int i5 = vVar.f55413c;
            if (i5 - i4 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = vVar.f55411a;
            int i6 = i4 + 7;
            long j5 = ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
            int i7 = i4 + 8;
            long j6 = j5 | (bArr[i6] & 255);
            this.f55330F = j4 - 8;
            if (i7 == i5) {
                this.f55329E = vVar.b();
                w.a(vVar);
            } else {
                vVar.f55412b = i7;
            }
            return j6;
        }
        throw new IllegalStateException("size < 8: " + this.f55330F);
    }

    @Override // okio.e
    public short readShort() {
        long j4 = this.f55330F;
        if (j4 >= 2) {
            v vVar = this.f55329E;
            int i4 = vVar.f55412b;
            int i5 = vVar.f55413c;
            if (i5 - i4 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f55411a;
            int i6 = i4 + 1;
            int i7 = (bArr[i4] & 255) << 8;
            int i8 = i4 + 2;
            int i9 = (bArr[i6] & 255) | i7;
            this.f55330F = j4 - 2;
            if (i8 == i5) {
                this.f55329E = vVar.b();
                w.a(vVar);
            } else {
                vVar.f55412b = i8;
            }
            return (short) i9;
        }
        throw new IllegalStateException("size < 2: " + this.f55330F);
    }

    @Override // okio.e
    public long s(ByteString byteString, long j4) throws IOException {
        byte[] bArr;
        if (byteString.R() != 0) {
            long j5 = 0;
            if (j4 >= 0) {
                v vVar = this.f55329E;
                long j6 = -1;
                if (vVar == null) {
                    return -1L;
                }
                long j7 = this.f55330F;
                if (j7 - j4 < j4) {
                    while (j7 > j4) {
                        vVar = vVar.f55417g;
                        j7 -= vVar.f55413c - vVar.f55412b;
                    }
                } else {
                    while (true) {
                        long j8 = (vVar.f55413c - vVar.f55412b) + j5;
                        if (j8 >= j4) {
                            break;
                        }
                        vVar = vVar.f55416f;
                        j5 = j8;
                    }
                    j7 = j5;
                }
                byte r4 = byteString.r(0);
                int R3 = byteString.R();
                long j9 = 1 + (this.f55330F - R3);
                long j10 = j4;
                v vVar2 = vVar;
                long j11 = j7;
                while (j11 < j9) {
                    byte[] bArr2 = vVar2.f55411a;
                    int min = (int) Math.min(vVar2.f55413c, (vVar2.f55412b + j9) - j11);
                    int i4 = (int) ((vVar2.f55412b + j10) - j11);
                    while (i4 < min) {
                        if (bArr2[i4] == r4) {
                            bArr = bArr2;
                            if (G(vVar2, i4 + 1, byteString, 1, R3)) {
                                return (i4 - vVar2.f55412b) + j11;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i4++;
                        bArr2 = bArr;
                    }
                    j11 += vVar2.f55413c - vVar2.f55412b;
                    vVar2 = vVar2.f55416f;
                    j10 = j11;
                    j6 = -1;
                }
                return j6;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // okio.e
    public ByteString s0() {
        return new ByteString(I());
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C2385c U0(String str, int i4, int i5, Charset charset) {
        if (str != null) {
            if (i4 >= 0) {
                if (i5 >= i4) {
                    if (i5 <= str.length()) {
                        if (charset != null) {
                            if (charset.equals(C.f55313a)) {
                                return p0(str, i4, i5);
                            }
                            byte[] bytes = str.substring(i4, i5).getBytes(charset);
                            return l0(bytes, 0, bytes.length);
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i5 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i5 + " < " + i4);
            }
            throw new IllegalAccessError("beginIndex < 0: " + i4);
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // okio.e
    public void skip(long j4) throws EOFException {
        while (j4 > 0) {
            if (this.f55329E != null) {
                int min = (int) Math.min(j4, r0.f55413c - r0.f55412b);
                long j5 = min;
                this.f55330F -= j5;
                j4 -= j5;
                v vVar = this.f55329E;
                int i4 = vVar.f55412b + min;
                vVar.f55412b = i4;
                if (i4 == vVar.f55413c) {
                    this.f55329E = vVar.b();
                    w.a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final ByteString t(ByteString byteString) {
        return p("HmacSHA1", byteString);
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C2385c t0(String str, Charset charset) {
        return U0(str, 0, str.length(), charset);
    }

    @Override // okio.z
    public A timeout() {
        return A.f55303d;
    }

    public String toString() {
        return M0().toString();
    }

    @Override // okio.e
    public ByteString u(long j4) throws EOFException {
        return new ByteString(G0(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String u0(long j4) throws EOFException {
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (n(j5) == 13) {
                String q4 = q(j5);
                skip(2L);
                return q4;
            }
        }
        String q5 = q(j4);
        skip(1L);
        return q5;
    }

    public final C2385c u1(OutputStream outputStream) throws IOException {
        return v1(outputStream, this.f55330F);
    }

    @Override // okio.e
    public boolean v0(long j4) {
        if (this.f55330F >= j4) {
            return true;
        }
        return false;
    }

    public final C2385c v1(OutputStream outputStream, long j4) throws IOException {
        if (outputStream != null) {
            C.b(this.f55330F, 0L, j4);
            v vVar = this.f55329E;
            while (j4 > 0) {
                int min = (int) Math.min(j4, vVar.f55413c - vVar.f55412b);
                outputStream.write(vVar.f55411a, vVar.f55412b, min);
                int i4 = vVar.f55412b + min;
                vVar.f55412b = i4;
                long j5 = min;
                this.f55330F -= j5;
                j4 -= j5;
                if (i4 == vVar.f55413c) {
                    v b4 = vVar.b();
                    this.f55329E = b4;
                    w.a(vVar);
                    vVar = b4;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d w() {
        return this;
    }

    @Override // okio.InterfaceC2386d
    public InterfaceC2386d w0(z zVar, long j4) throws IOException {
        while (j4 > 0) {
            long P02 = zVar.P0(this, j4);
            if (P02 != -1) {
                j4 -= P02;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C2385c g0(String str) {
        return p0(str, 0, str.length());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i4 = remaining;
            while (i4 > 0) {
                v a12 = a1(1);
                int min = Math.min(i4, 8192 - a12.f55413c);
                byteBuffer.get(a12.f55411a, a12.f55413c, min);
                i4 -= min;
                a12.f55413c += min;
            }
            this.f55330F += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    List<Integer> x0() {
        if (this.f55329E == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        v vVar = this.f55329E;
        arrayList.add(Integer.valueOf(vVar.f55413c - vVar.f55412b));
        v vVar2 = this.f55329E;
        while (true) {
            vVar2 = vVar2.f55416f;
            if (vVar2 != this.f55329E) {
                arrayList.add(Integer.valueOf(vVar2.f55413c - vVar2.f55412b));
            } else {
                return arrayList;
            }
        }
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C2385c p0(String str, int i4, int i5) {
        char c4;
        if (str != null) {
            if (i4 >= 0) {
                if (i5 >= i4) {
                    if (i5 <= str.length()) {
                        while (i4 < i5) {
                            char charAt = str.charAt(i4);
                            if (charAt < 128) {
                                v a12 = a1(1);
                                byte[] bArr = a12.f55411a;
                                int i6 = a12.f55413c - i4;
                                int min = Math.min(i5, 8192 - i6);
                                int i7 = i4 + 1;
                                bArr[i4 + i6] = (byte) charAt;
                                while (i7 < min) {
                                    char charAt2 = str.charAt(i7);
                                    if (charAt2 >= 128) {
                                        break;
                                    }
                                    bArr[i7 + i6] = (byte) charAt2;
                                    i7++;
                                }
                                int i8 = a12.f55413c;
                                int i9 = (i6 + i7) - i8;
                                a12.f55413c = i8 + i9;
                                this.f55330F += i9;
                                i4 = i7;
                            } else {
                                if (charAt < 2048) {
                                    O((charAt >> 6) | 192);
                                    O((charAt & '?') | 128);
                                } else if (charAt >= 55296 && charAt <= 57343) {
                                    int i10 = i4 + 1;
                                    if (i10 < i5) {
                                        c4 = str.charAt(i10);
                                    } else {
                                        c4 = 0;
                                    }
                                    if (charAt <= 56319 && c4 >= 56320 && c4 <= 57343) {
                                        int i11 = (((charAt & 10239) << 10) | (9215 & c4)) + 65536;
                                        O((i11 >> 18) | BatteryInfo.f48169K);
                                        O(((i11 >> 12) & 63) | 128);
                                        O(((i11 >> 6) & 63) | 128);
                                        O((i11 & 63) | 128);
                                        i4 += 2;
                                    } else {
                                        O(63);
                                        i4 = i10;
                                    }
                                } else {
                                    O((charAt >> '\f') | 224);
                                    O(((charAt >> 6) & 63) | 128);
                                    O((charAt & '?') | 128);
                                }
                                i4++;
                            }
                        }
                        return this;
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i5 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i5 + " < " + i4);
            }
            throw new IllegalArgumentException("beginIndex < 0: " + i4);
        }
        throw new IllegalArgumentException("string == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y0(okio.p r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C2385c.y0(okio.p, boolean):int");
    }

    @Override // okio.InterfaceC2386d
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public C2385c y(int i4) {
        if (i4 < 128) {
            O(i4);
        } else if (i4 < 2048) {
            O((i4 >> 6) | 192);
            O((i4 & 63) | 128);
        } else if (i4 < 65536) {
            if (i4 >= 55296 && i4 <= 57343) {
                O(63);
            } else {
                O((i4 >> 12) | 224);
                O(((i4 >> 6) & 63) | 128);
                O((i4 & 63) | 128);
            }
        } else if (i4 <= 1114111) {
            O((i4 >> 18) | BatteryInfo.f48169K);
            O(((i4 >> 12) & 63) | 128);
            O(((i4 >> 6) & 63) | 128);
            O((i4 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i4));
        }
        return this;
    }

    public final ByteString z0() {
        return j("SHA-1");
    }

    @Override // okio.e
    public int read(byte[] bArr, int i4, int i5) {
        C.b(bArr.length, i4, i5);
        v vVar = this.f55329E;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i5, vVar.f55413c - vVar.f55412b);
        System.arraycopy(vVar.f55411a, vVar.f55412b, bArr, i4, min);
        int i6 = vVar.f55412b + min;
        vVar.f55412b = i6;
        this.f55330F -= min;
        if (i6 == vVar.f55413c) {
            this.f55329E = vVar.b();
            w.a(vVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        v vVar = this.f55329E;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f55413c - vVar.f55412b);
        byteBuffer.put(vVar.f55411a, vVar.f55412b, min);
        int i4 = vVar.f55412b + min;
        vVar.f55412b = i4;
        this.f55330F -= min;
        if (i4 == vVar.f55413c) {
            this.f55329E = vVar.b();
            w.a(vVar);
        }
        return min;
    }
}
