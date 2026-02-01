package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.D0;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC0561d
@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14540a = 1164798569;

    /* renamed from: b, reason: collision with root package name */
    private static final int f14541b = 1701669481;

    /* renamed from: c, reason: collision with root package name */
    private static final int f14542c = 1835365473;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: c, reason: collision with root package name */
        @N
        private final ByteBuffer f14543c;

        a(@N ByteBuffer byteBuffer) {
            this.f14543c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.p.d
        public int a() throws IOException {
            return this.f14543c.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public void b(int i4) throws IOException {
            ByteBuffer byteBuffer = this.f14543c;
            byteBuffer.position(byteBuffer.position() + i4);
        }

        @Override // androidx.emoji2.text.p.d
        public long c() throws IOException {
            return p.e(this.f14543c.getInt());
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.f14543c.position();
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() throws IOException {
            return p.f(this.f14543c.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: c, reason: collision with root package name */
        @N
        private final byte[] f14544c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private final ByteBuffer f14545d;

        /* renamed from: e, reason: collision with root package name */
        @N
        private final InputStream f14546e;

        /* renamed from: f, reason: collision with root package name */
        private long f14547f = 0;

        b(@N InputStream inputStream) {
            this.f14546e = inputStream;
            byte[] bArr = new byte[4];
            this.f14544c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f14545d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void d(@F(from = 0, to = 4) int i4) throws IOException {
            if (this.f14546e.read(this.f14544c, 0, i4) == i4) {
                this.f14547f += i4;
                return;
            }
            throw new IOException("read failed");
        }

        @Override // androidx.emoji2.text.p.d
        public int a() throws IOException {
            this.f14545d.position(0);
            d(4);
            return this.f14545d.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public void b(int i4) throws IOException {
            while (i4 > 0) {
                int skip = (int) this.f14546e.skip(i4);
                if (skip >= 1) {
                    i4 -= skip;
                    this.f14547f += skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        @Override // androidx.emoji2.text.p.d
        public long c() throws IOException {
            this.f14545d.position(0);
            d(4);
            return p.e(this.f14545d.getInt());
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.f14547f;
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() throws IOException {
            this.f14545d.position(0);
            d(2);
            return p.f(this.f14545d.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f14548a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14549b;

        c(long j4, long j5) {
            this.f14548a = j4;
            this.f14549b = j5;
        }

        long a() {
            return this.f14549b;
        }

        long b() {
            return this.f14548a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14550a = 2;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14551b = 4;

        int a() throws IOException;

        void b(int i4) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private p() {
    }

    private static c a(d dVar) throws IOException {
        long j4;
        dVar.b(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.b(6);
            int i4 = 0;
            while (true) {
                if (i4 < readUnsignedShort) {
                    int a4 = dVar.a();
                    dVar.b(4);
                    j4 = dVar.c();
                    dVar.b(4);
                    if (f14542c == a4) {
                        break;
                    }
                    i4++;
                } else {
                    j4 = -1;
                    break;
                }
            }
            if (j4 != -1) {
                dVar.b((int) (j4 - dVar.getPosition()));
                dVar.b(12);
                long c4 = dVar.c();
                for (int i5 = 0; i5 < c4; i5++) {
                    int a5 = dVar.a();
                    long c5 = dVar.c();
                    long c6 = dVar.c();
                    if (f14540a == a5 || f14541b == a5) {
                        return new c(c5 + j4, c6);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.emoji2.text.flatbuffer.o b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.o c4 = c(open);
            if (open != null) {
                open.close();
            }
            return c4;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.emoji2.text.flatbuffer.o c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c a4 = a(bVar);
        bVar.b((int) (a4.b() - bVar.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a4.a());
        int read = inputStream.read(allocate.array());
        if (read == a4.a()) {
            return androidx.emoji2.text.flatbuffer.o.G(allocate);
        }
        throw new IOException("Needed " + a4.a() + " bytes, got " + read);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.emoji2.text.flatbuffer.o d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).b());
        return androidx.emoji2.text.flatbuffer.o.G(duplicate);
    }

    static long e(int i4) {
        return i4 & 4294967295L;
    }

    static int f(short s4) {
        return s4 & D0.f51794H;
    }
}
