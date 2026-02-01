package com.google.firebase.crashlytics.internal.log;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c implements Closeable {

    /* renamed from: K, reason: collision with root package name */
    private static final Logger f35238K = Logger.getLogger(c.class.getName());

    /* renamed from: L, reason: collision with root package name */
    private static final int f35239L = 4096;

    /* renamed from: M, reason: collision with root package name */
    static final int f35240M = 16;

    /* renamed from: E, reason: collision with root package name */
    private final RandomAccessFile f35241E;

    /* renamed from: F, reason: collision with root package name */
    int f35242F;

    /* renamed from: G, reason: collision with root package name */
    private int f35243G;

    /* renamed from: H, reason: collision with root package name */
    private b f35244H;

    /* renamed from: I, reason: collision with root package name */
    private b f35245I;

    /* renamed from: J, reason: collision with root package name */
    private final byte[] f35246J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f35247a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f35248b;

        a(StringBuilder sb) {
            this.f35248b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.log.c.d
        public void d(InputStream inputStream, int i4) throws IOException {
            if (this.f35247a) {
                this.f35247a = false;
            } else {
                this.f35248b.append(", ");
            }
            this.f35248b.append(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        static final int f35250c = 4;

        /* renamed from: d, reason: collision with root package name */
        static final b f35251d = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f35252a;

        /* renamed from: b, reason: collision with root package name */
        final int f35253b;

        b(int i4, int i5) {
            this.f35252a = i4;
            this.f35253b = i5;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f35252a + ", length = " + this.f35253b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.crashlytics.internal.log.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0313c extends InputStream {

        /* renamed from: E, reason: collision with root package name */
        private int f35254E;

        /* renamed from: F, reason: collision with root package name */
        private int f35255F;

        /* synthetic */ C0313c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            c.t(bArr, "buffer");
            if ((i4 | i5) >= 0 && i5 <= bArr.length - i4) {
                int i6 = this.f35255F;
                if (i6 <= 0) {
                    return -1;
                }
                if (i5 > i6) {
                    i5 = i6;
                }
                c.this.V(this.f35254E, bArr, i4, i5);
                this.f35254E = c.this.u0(this.f35254E + i5);
                this.f35255F -= i5;
                return i5;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private C0313c(b bVar) {
            this.f35254E = c.this.u0(bVar.f35252a + 4);
            this.f35255F = bVar.f35253b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f35255F == 0) {
                return -1;
            }
            c.this.f35241E.seek(this.f35254E);
            int read = c.this.f35241E.read();
            this.f35254E = c.this.u0(this.f35254E + 1);
            this.f35255F--;
            return read;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void d(InputStream inputStream, int i4) throws IOException;
    }

    public c(File file) throws IOException {
        this.f35246J = new byte[16];
        if (!file.exists()) {
            n(file);
        }
        this.f35241E = v(file);
        F();
    }

    private b D(int i4) throws IOException {
        if (i4 == 0) {
            return b.f35251d;
        }
        this.f35241E.seek(i4);
        return new b(i4, this.f35241E.readInt());
    }

    private void F() throws IOException {
        this.f35241E.seek(0L);
        this.f35241E.readFully(this.f35246J);
        int G3 = G(this.f35246J, 0);
        this.f35242F = G3;
        if (G3 <= this.f35241E.length()) {
            this.f35243G = G(this.f35246J, 4);
            int G4 = G(this.f35246J, 8);
            int G5 = G(this.f35246J, 12);
            this.f35244H = D(G4);
            this.f35245I = D(G5);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f35242F + ", Actual length: " + this.f35241E.length());
    }

    private static int G(byte[] bArr, int i4) {
        return ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    private int H() {
        return this.f35242F - i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int u02 = u0(i4);
        int i7 = u02 + i6;
        int i8 = this.f35242F;
        if (i7 <= i8) {
            this.f35241E.seek(u02);
            this.f35241E.readFully(bArr, i5, i6);
            return;
        }
        int i9 = i8 - u02;
        this.f35241E.seek(u02);
        this.f35241E.readFully(bArr, i5, i9);
        this.f35241E.seek(16L);
        this.f35241E.readFully(bArr, i5 + i9, i6 - i9);
    }

    private void a0(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int u02 = u0(i4);
        int i7 = u02 + i6;
        int i8 = this.f35242F;
        if (i7 <= i8) {
            this.f35241E.seek(u02);
            this.f35241E.write(bArr, i5, i6);
            return;
        }
        int i9 = i8 - u02;
        this.f35241E.seek(u02);
        this.f35241E.write(bArr, i5, i9);
        this.f35241E.seek(16L);
        this.f35241E.write(bArr, i5 + i9, i6 - i9);
    }

    private void c0(int i4) throws IOException {
        this.f35241E.setLength(i4);
        this.f35241E.getChannel().force(true);
    }

    private void j(int i4) throws IOException {
        int i5 = i4 + 4;
        int H3 = H();
        if (H3 >= i5) {
            return;
        }
        int i6 = this.f35242F;
        do {
            H3 += i6;
            i6 <<= 1;
        } while (H3 < i5);
        c0(i6);
        b bVar = this.f35245I;
        int u02 = u0(bVar.f35252a + 4 + bVar.f35253b);
        if (u02 < this.f35244H.f35252a) {
            FileChannel channel = this.f35241E.getChannel();
            channel.position(this.f35242F);
            long j4 = u02 - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i7 = this.f35245I.f35252a;
        int i8 = this.f35244H.f35252a;
        if (i7 < i8) {
            int i9 = (this.f35242F + i7) - 16;
            x0(i6, this.f35243G, i8, i9);
            this.f35245I = new b(i9, this.f35245I.f35253b);
        } else {
            x0(i6, this.f35243G, i8, i7);
        }
        this.f35242F = i6;
    }

    private static void n(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile v3 = v(file2);
        try {
            v3.setLength(PlaybackStateCompat.f4288c0);
            v3.seek(0L);
            byte[] bArr = new byte[16];
            z0(bArr, 4096, 0, 0, 0);
            v3.write(bArr);
            v3.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            v3.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T t(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0(int i4) {
        int i5 = this.f35242F;
        if (i4 >= i5) {
            return (i4 + 16) - i5;
        }
        return i4;
    }

    private static RandomAccessFile v(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private void x0(int i4, int i5, int i6, int i7) throws IOException {
        z0(this.f35246J, i4, i5, i6, i7);
        this.f35241E.seek(0L);
        this.f35241E.write(this.f35246J);
    }

    private static void y0(byte[] bArr, int i4, int i5) {
        bArr[i4] = (byte) (i5 >> 24);
        bArr[i4 + 1] = (byte) (i5 >> 16);
        bArr[i4 + 2] = (byte) (i5 >> 8);
        bArr[i4 + 3] = (byte) i5;
    }

    private static void z0(byte[] bArr, int... iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            y0(bArr, i4, i5);
            i4 += 4;
        }
    }

    public synchronized byte[] A() throws IOException {
        if (p()) {
            return null;
        }
        b bVar = this.f35244H;
        int i4 = bVar.f35253b;
        byte[] bArr = new byte[i4];
        V(bVar.f35252a + 4, bArr, 0, i4);
        return bArr;
    }

    public synchronized void P() throws IOException {
        try {
            if (!p()) {
                if (this.f35243G == 1) {
                    i();
                } else {
                    b bVar = this.f35244H;
                    int u02 = u0(bVar.f35252a + 4 + bVar.f35253b);
                    V(u02, this.f35246J, 0, 4);
                    int G3 = G(this.f35246J, 0);
                    x0(this.f35242F, this.f35243G - 1, u02, this.f35245I.f35252a);
                    this.f35243G--;
                    this.f35244H = new b(u02, G3);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f35241E.close();
    }

    public synchronized int e0() {
        return this.f35243G;
    }

    public void f(byte[] bArr) throws IOException {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i4, int i5) throws IOException {
        int u02;
        int i6;
        try {
            t(bArr, "buffer");
            if ((i4 | i5) >= 0 && i5 <= bArr.length - i4) {
                j(i5);
                boolean p4 = p();
                if (p4) {
                    u02 = 16;
                } else {
                    b bVar = this.f35245I;
                    u02 = u0(bVar.f35252a + 4 + bVar.f35253b);
                }
                b bVar2 = new b(u02, i5);
                y0(this.f35246J, 0, i5);
                a0(bVar2.f35252a, this.f35246J, 0, 4);
                a0(bVar2.f35252a + 4, bArr, i4, i5);
                if (p4) {
                    i6 = bVar2.f35252a;
                } else {
                    i6 = this.f35244H.f35252a;
                }
                x0(this.f35242F, this.f35243G + 1, i6, bVar2.f35252a);
                this.f35245I = bVar2;
                this.f35243G++;
                if (p4) {
                    this.f35244H = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void i() throws IOException {
        try {
            x0(4096, 0, 0, 0);
            this.f35243G = 0;
            b bVar = b.f35251d;
            this.f35244H = bVar;
            this.f35245I = bVar;
            if (this.f35242F > 4096) {
                c0(4096);
            }
            this.f35242F = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int i0() {
        if (this.f35243G == 0) {
            return 16;
        }
        b bVar = this.f35245I;
        int i4 = bVar.f35252a;
        int i5 = this.f35244H.f35252a;
        if (i4 >= i5) {
            return (i4 - i5) + 4 + bVar.f35253b + 16;
        }
        return (((i4 + 4) + bVar.f35253b) + this.f35242F) - i5;
    }

    public synchronized void k(d dVar) throws IOException {
        int i4 = this.f35244H.f35252a;
        for (int i5 = 0; i5 < this.f35243G; i5++) {
            b D3 = D(i4);
            dVar.d(new C0313c(this, D3, null), D3.f35253b);
            i4 = u0(D3.f35252a + 4 + D3.f35253b);
        }
    }

    public boolean m(int i4, int i5) {
        if (i0() + 4 + i4 <= i5) {
            return true;
        }
        return false;
    }

    public synchronized boolean p() {
        boolean z3;
        if (this.f35243G == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f35242F);
        sb.append(", size=");
        sb.append(this.f35243G);
        sb.append(", first=");
        sb.append(this.f35244H);
        sb.append(", last=");
        sb.append(this.f35245I);
        sb.append(", element lengths=[");
        try {
            k(new a(sb));
        } catch (IOException e4) {
            f35238K.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void z(d dVar) throws IOException {
        if (this.f35243G > 0) {
            dVar.d(new C0313c(this, this.f35244H, null), this.f35244H.f35253b);
        }
    }

    c(RandomAccessFile randomAccessFile) throws IOException {
        this.f35246J = new byte[16];
        this.f35241E = randomAccessFile;
        F();
    }
}
