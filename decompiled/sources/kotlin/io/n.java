package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final n f52168a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final int f52169b = 32;

    /* renamed from: c, reason: collision with root package name */
    private static CharsetDecoder f52170c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f52171d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final byte[] f52172e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final char[] f52173f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final ByteBuffer f52174g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final CharBuffer f52175h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final StringBuilder f52176i;

    static {
        byte[] bArr = new byte[32];
        f52172e = bArr;
        char[] cArr = new char[32];
        f52173f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        F.o(wrap, "wrap(...)");
        f52174g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        F.o(wrap2, "wrap(...)");
        f52175h = wrap2;
        f52176i = new StringBuilder();
    }

    private n() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f52174g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int b(boolean z3) {
        while (true) {
            CharsetDecoder charsetDecoder = f52170c;
            if (charsetDecoder == null) {
                F.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f52174g;
            CharBuffer charBuffer = f52175h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z3);
            F.o(decode, "decode(...)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f52176i;
            char[] cArr = f52173f;
            int i4 = position - 1;
            sb.append(cArr, 0, i4);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i4]);
        }
    }

    private final int c(int i4, int i5) {
        ByteBuffer byteBuffer = f52174g;
        byteBuffer.limit(i4);
        f52175h.position(i5);
        int b4 = b(true);
        CharsetDecoder charsetDecoder = f52170c;
        if (charsetDecoder == null) {
            F.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b4;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = f52170c;
        if (charsetDecoder == null) {
            F.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f52174g.position(0);
        f52176i.setLength(0);
    }

    private final void f() {
        StringBuilder sb = f52176i;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        F.o(newDecoder, "newDecoder(...)");
        f52170c = newDecoder;
        ByteBuffer byteBuffer = f52174g;
        byteBuffer.clear();
        CharBuffer charBuffer = f52175h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f52170c;
        if (charsetDecoder == null) {
            F.S("decoder");
            charsetDecoder = null;
        }
        boolean z3 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z3 = true;
        }
        f52171d = z3;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r10 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r0 = kotlin.io.n.f52173f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r0[r10 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r1 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r0[r10 - 2] != '\r') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        r0 = kotlin.io.n.f52176i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r0.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        return new java.lang.String(kotlin.io.n.f52173f, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r0.append(kotlin.io.n.f52173f, 0, r10);
        r10 = r0.toString();
        kotlin.jvm.internal.F.o(r10, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r0.length() <= 32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (kotlin.jvm.internal.F.g(r0.charset(), r11) == false) goto L11;
     */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String d(@l3.d java.io.InputStream r10, @l3.d java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.F.p(r10, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.F.p(r11, r0)     // Catch: java.lang.Throwable -> L19
            java.nio.charset.CharsetDecoder r0 = kotlin.io.n.f52170c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L26
            if (r0 != 0) goto L1c
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.F.S(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r1
            goto L1c
        L19:
            r10 = move-exception
            goto Lc5
        L1c:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L19
            boolean r0 = kotlin.jvm.internal.F.g(r0, r11)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L29
        L26:
            r9.g(r11)     // Catch: java.lang.Throwable -> L19
        L29:
            r11 = 0
            r0 = r11
            r2 = r0
        L2c:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L19
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L4a
            java.lang.StringBuilder r10 = kotlin.io.n.f52176i     // Catch: java.lang.Throwable -> L19
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L19
            if (r10 != 0) goto L45
            if (r0 != 0) goto L45
            if (r2 != 0) goto L45
            monitor-exit(r9)
            return r1
        L45:
            int r10 = r9.c(r0, r2)     // Catch: java.lang.Throwable -> L19
            goto L78
        L4a:
            byte[] r5 = kotlin.io.n.f52172e     // Catch: java.lang.Throwable -> L19
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L19
            r5[r0] = r8     // Catch: java.lang.Throwable -> L19
            if (r3 == r6) goto L5c
            if (r7 == r4) goto L5c
            boolean r0 = kotlin.io.n.f52171d     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            r0 = r7
            goto L2c
        L5c:
            java.nio.ByteBuffer r0 = kotlin.io.n.f52174g     // Catch: java.lang.Throwable -> L19
            r0.limit(r7)     // Catch: java.lang.Throwable -> L19
            java.nio.CharBuffer r3 = kotlin.io.n.f52175h     // Catch: java.lang.Throwable -> L19
            r3.position(r2)     // Catch: java.lang.Throwable -> L19
            int r2 = r9.b(r11)     // Catch: java.lang.Throwable -> L19
            if (r2 <= 0) goto Lbf
            char[] r3 = kotlin.io.n.f52173f     // Catch: java.lang.Throwable -> L19
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L19
            if (r3 != r6) goto Lbf
            r0.position(r11)     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L78:
            if (r10 <= 0) goto L92
            char[] r0 = kotlin.io.n.f52173f     // Catch: java.lang.Throwable -> L19
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L19
            if (r1 != r6) goto L92
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L91
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L19
            r2 = 13
            if (r0 != r2) goto L91
            int r10 = r10 + (-2)
            goto L92
        L91:
            r10 = r1
        L92:
            java.lang.StringBuilder r0 = kotlin.io.n.f52176i     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto La3
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L19
            char[] r1 = kotlin.io.n.f52173f     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r0
        La3:
            char[] r1 = kotlin.io.n.f52173f     // Catch: java.lang.Throwable -> L19
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.F.o(r10, r1)     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 <= r4) goto Lba
            r9.f()     // Catch: java.lang.Throwable -> L19
        Lba:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r10
        Lbf:
            int r0 = r9.a()     // Catch: java.lang.Throwable -> L19
            goto L2c
        Lc5:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.n.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
