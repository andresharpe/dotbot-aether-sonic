package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26425b = "DfltImageHeaderParser";

    /* renamed from: c, reason: collision with root package name */
    private static final int f26426c = 4671814;

    /* renamed from: d, reason: collision with root package name */
    private static final int f26427d = -1991225785;

    /* renamed from: e, reason: collision with root package name */
    static final int f26428e = 65496;

    /* renamed from: f, reason: collision with root package name */
    private static final int f26429f = 19789;

    /* renamed from: g, reason: collision with root package name */
    private static final int f26430g = 18761;

    /* renamed from: j, reason: collision with root package name */
    private static final int f26433j = 218;

    /* renamed from: k, reason: collision with root package name */
    private static final int f26434k = 217;

    /* renamed from: l, reason: collision with root package name */
    static final int f26435l = 255;

    /* renamed from: m, reason: collision with root package name */
    static final int f26436m = 225;

    /* renamed from: n, reason: collision with root package name */
    private static final int f26437n = 274;

    /* renamed from: p, reason: collision with root package name */
    private static final int f26439p = 1380533830;

    /* renamed from: q, reason: collision with root package name */
    private static final int f26440q = 1464156752;

    /* renamed from: r, reason: collision with root package name */
    private static final int f26441r = 1448097792;

    /* renamed from: s, reason: collision with root package name */
    private static final int f26442s = -256;

    /* renamed from: t, reason: collision with root package name */
    private static final int f26443t = 255;

    /* renamed from: u, reason: collision with root package name */
    private static final int f26444u = 88;

    /* renamed from: v, reason: collision with root package name */
    private static final int f26445v = 76;

    /* renamed from: w, reason: collision with root package name */
    private static final int f26446w = 16;

    /* renamed from: x, reason: collision with root package name */
    private static final int f26447x = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final String f26431h = "Exif\u0000\u0000";

    /* renamed from: i, reason: collision with root package name */
    static final byte[] f26432i = f26431h.getBytes(Charset.forName("UTF-8"));

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f26438o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {

            /* renamed from: E, reason: collision with root package name */
            private static final long f26448E = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i4) throws IOException;

        short c() throws IOException;

        long skip(long j4) throws IOException;
    }

    /* loaded from: classes.dex */
    private static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f26449a;

        a(ByteBuffer byteBuffer) {
            this.f26449a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i4) {
            int min = Math.min(i4, this.f26449a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f26449a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.f26449a.remaining() >= 1) {
                return (short) (this.f26449a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) {
            int min = (int) Math.min(this.f26449a.remaining(), j4);
            ByteBuffer byteBuffer = this.f26449a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f26450a;

        b(byte[] bArr, int i4) {
            this.f26450a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
        }

        private boolean c(int i4, int i5) {
            if (this.f26450a.remaining() - i4 >= i5) {
                return true;
            }
            return false;
        }

        short a(int i4) {
            if (c(i4, 2)) {
                return this.f26450a.getShort(i4);
            }
            return (short) -1;
        }

        int b(int i4) {
            if (c(i4, 4)) {
                return this.f26450a.getInt(i4);
            }
            return -1;
        }

        int d() {
            return this.f26450a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f26450a.order(byteOrder);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f26451a;

        c(InputStream inputStream) {
            this.f26451a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i4) throws IOException {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4 && (i6 = this.f26451a.read(bArr, i5, i4 - i5)) != -1) {
                i5 += i6;
            }
            if (i5 == 0 && i6 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i5;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int read = this.f26451a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) throws IOException {
            if (j4 < 0) {
                return 0L;
            }
            long j5 = j4;
            while (j5 > 0) {
                long skip = this.f26451a.skip(j5);
                if (skip <= 0) {
                    if (this.f26451a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j5 -= skip;
            }
            return j4 - j5;
        }
    }

    private static int e(int i4, int i5) {
        return i4 + 2 + (i5 * 12);
    }

    private int f(Reader reader, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        try {
            int a4 = reader.a();
            if (!h(a4)) {
                if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Parser doesn't handle magic number: " + a4);
                }
                return -1;
            }
            int j4 = j(reader);
            if (j4 == -1) {
                if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(j4, byte[].class);
            try {
                return l(reader, bArr, j4);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @androidx.annotation.N
    private ImageHeaderParser.ImageType g(Reader reader) throws IOException {
        try {
            int a4 = reader.a();
            if (a4 == f26428e) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c4 = (a4 << 8) | reader.c();
            if (c4 == f26426c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c5 = (c4 << 8) | reader.c();
            if (c5 == f26427d) {
                reader.skip(21L);
                try {
                    if (reader.c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c5 != f26439p) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != f26440q) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a5 = (reader.a() << 16) | reader.a();
            if ((a5 & (-256)) != f26441r) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i4 = a5 & 255;
            if (i4 == f26444u) {
                reader.skip(4L);
                if ((reader.c() & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (i4 == 76) {
                reader.skip(4L);
                if ((reader.c() & 8) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i4) {
        return (i4 & f26428e) == f26428e || i4 == f26429f || i4 == f26430g;
    }

    private boolean i(byte[] bArr, int i4) {
        boolean z3;
        if (bArr != null && i4 > f26432i.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int i5 = 0;
            while (true) {
                byte[] bArr2 = f26432i;
                if (i5 >= bArr2.length) {
                    break;
                }
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            }
        }
        return z3;
    }

    private int j(Reader reader) throws IOException {
        short c4;
        int a4;
        long j4;
        long skip;
        do {
            short c5 = reader.c();
            if (c5 != 255) {
                if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Unknown segmentId=" + ((int) c5));
                }
                return -1;
            }
            c4 = reader.c();
            if (c4 == f26433j) {
                return -1;
            }
            if (c4 == f26434k) {
                if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a4 = reader.a() - 2;
            if (c4 != f26436m) {
                j4 = a4;
                skip = reader.skip(j4);
            } else {
                return a4;
            }
        } while (skip == j4);
        if (Log.isLoggable(f26425b, 3)) {
            Log.d(f26425b, "Unable to skip enough data, type: " + ((int) c4) + ", wanted to skip: " + a4 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a4 = bVar.a(6);
        if (a4 != f26430g) {
            if (a4 != f26429f) {
                if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Unknown endianness = " + ((int) a4));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b4 = bVar.b(10) + 6;
        short a5 = bVar.a(b4);
        for (int i4 = 0; i4 < a5; i4++) {
            int e4 = e(b4, i4);
            short a6 = bVar.a(e4);
            if (a6 == f26437n) {
                short a7 = bVar.a(e4 + 2);
                if (a7 >= 1 && a7 <= 12) {
                    int b5 = bVar.b(e4 + 4);
                    if (b5 < 0) {
                        if (Log.isLoggable(f26425b, 3)) {
                            Log.d(f26425b, "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable(f26425b, 3)) {
                            Log.d(f26425b, "Got tagIndex=" + i4 + " tagType=" + ((int) a6) + " formatCode=" + ((int) a7) + " componentCount=" + b5);
                        }
                        int i5 = b5 + f26438o[a7];
                        if (i5 > 4) {
                            if (Log.isLoggable(f26425b, 3)) {
                                Log.d(f26425b, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a7));
                            }
                        } else {
                            int i6 = e4 + 8;
                            if (i6 >= 0 && i6 <= bVar.d()) {
                                if (i5 >= 0 && i5 + i6 <= bVar.d()) {
                                    return bVar.a(i6);
                                }
                                if (Log.isLoggable(f26425b, 3)) {
                                    Log.d(f26425b, "Illegal number of bytes for TI tag data tagType=" + ((int) a6));
                                }
                            } else if (Log.isLoggable(f26425b, 3)) {
                                Log.d(f26425b, "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) a6));
                            }
                        }
                    }
                } else if (Log.isLoggable(f26425b, 3)) {
                    Log.d(f26425b, "Got invalid format code = " + ((int) a7));
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i4) throws IOException {
        int b4 = reader.b(bArr, i4);
        if (b4 != i4) {
            if (Log.isLoggable(f26425b, 3)) {
                Log.d(f26425b, "Unable to read exif segment data, length: " + i4 + ", actually read: " + b4);
            }
            return -1;
        }
        if (i(bArr, i4)) {
            return k(new b(bArr, i4));
        }
        if (Log.isLoggable(f26425b, 3)) {
            Log.d(f26425b, "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.N
    public ImageHeaderParser.ImageType a(@androidx.annotation.N ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) com.bumptech.glide.util.l.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.N ByteBuffer byteBuffer, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new a((ByteBuffer) com.bumptech.glide.util.l.d(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.N
    public ImageHeaderParser.ImageType c(@androidx.annotation.N InputStream inputStream) throws IOException {
        return g(new c((InputStream) com.bumptech.glide.util.l.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new c((InputStream) com.bumptech.glide.util.l.d(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar));
    }
}
