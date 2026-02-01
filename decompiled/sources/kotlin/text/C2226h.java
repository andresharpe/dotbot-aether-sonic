package kotlin.text;

import java.util.Arrays;
import kotlin.Y;
import kotlin.collections.AbstractC2088c;
import kotlin.jvm.internal.U;
import kotlin.text.C2227i;
import kotlin.x0;

@U({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
/* renamed from: kotlin.text.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2226h {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f52811a = "0123456789abcdef";

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f52812b = "0123456789ABCDEF";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final int[] f52813c;

    static {
        int[] iArr = new int[128];
        int i4 = 0;
        for (int i5 = 0; i5 < 128; i5++) {
            iArr[i5] = -1;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < f52811a.length()) {
            iArr[f52811a.charAt(i6)] = i7;
            i6++;
            i7++;
        }
        int i8 = 0;
        while (i4 < f52812b.length()) {
            iArr[f52812b.charAt(i4)] = i8;
            i4++;
            i8++;
        }
        f52813c = iArr;
    }

    static /* synthetic */ short A(String str, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return y(str, i4, i5, c2227i);
    }

    public static /* synthetic */ short B(String str, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return z(str, c2227i);
    }

    public static final int C(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        long a4;
        int i11;
        int i12;
        if (i4 > 0) {
            long j4 = i9 + 2 + i10;
            long a5 = a(j4, i6, i8);
            if (i5 <= i6) {
                a4 = a(j4, i5, i8);
            } else {
                a4 = a(a5, i5 / i6, i7);
                int i13 = i5 % i6;
                if (i13 != 0) {
                    a4 = a4 + i7 + a(j4, i13, i8);
                }
            }
            long j5 = i4;
            long Q3 = Q(j5, a4, 1);
            long j6 = j5 - ((a4 + 1) * Q3);
            long Q4 = Q(j6, a5, i7);
            long j7 = j6 - ((a5 + i7) * Q4);
            long Q5 = Q(j7, j4, i8);
            if (j7 - ((j4 + i8) * Q5) > 0) {
                i12 = i5;
                i11 = 1;
            } else {
                i11 = 0;
                i12 = i5;
            }
            return (int) ((Q3 * i12) + (Q4 * i6) + Q5 + i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final String D(byte b4, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return P(b4, format, 8);
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final String E(int i4, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return P(i4, format, 32);
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final String F(long j4, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return P(j4, format, 64);
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final String G(short s4, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return P(s4, format, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[SYNTHETIC] */
    @kotlin.r
    @l3.d
    @kotlin.Y(version = "1.9")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String H(@l3.d byte[] r17, int r18, int r19, @l3.d kotlin.text.C2227i r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.F.p(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            kotlin.jvm.internal.F.p(r4, r3)
            kotlin.collections.c$a r3 = kotlin.collections.AbstractC2088c.f51901E
            int r5 = r0.length
            r3.a(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.e()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.i$b r4 = r20.c()
            int r12 = r4.g()
            int r13 = r4.f()
            java.lang.String r14 = r4.c()
            java.lang.String r15 = r4.e()
            java.lang.String r11 = r4.d()
            java.lang.String r4 = r4.h()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = f(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r11 = r0[r8]
            r7 = r11 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r7 = r7 >> 4
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r7 = r11 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L68
        La2:
            int r0 = r6.length()
            if (r5 != r0) goto Lb2
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.F.o(r0, r1)
            return r0
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C2226h.H(byte[], int, int, kotlin.text.i):java.lang.String");
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final String I(@l3.d byte[] bArr, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return H(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String J(byte b4, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return D(b4, c2227i);
    }

    public static /* synthetic */ String K(int i4, C2227i c2227i, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return E(i4, c2227i);
    }

    public static /* synthetic */ String L(long j4, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return F(j4, c2227i);
    }

    public static /* synthetic */ String M(short s4, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return G(s4, c2227i);
    }

    public static /* synthetic */ String N(byte[] bArr, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return H(bArr, i4, i5, c2227i);
    }

    public static /* synthetic */ String O(byte[] bArr, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return I(bArr, c2227i);
    }

    @kotlin.r
    private static final String P(long j4, C2227i c2227i, int i4) {
        String str;
        if ((i4 & 3) == 0) {
            if (c2227i.e()) {
                str = f52812b;
            } else {
                str = f52811a;
            }
            String c4 = c2227i.d().c();
            String e4 = c2227i.d().e();
            int length = c4.length() + (i4 >> 2) + e4.length();
            boolean d4 = c2227i.d().d();
            StringBuilder sb = new StringBuilder(length);
            sb.append(c4);
            while (i4 > 0) {
                i4 -= 4;
                int i5 = (int) ((j4 >> i4) & 15);
                if (d4 && i5 == 0 && i4 > 0) {
                    d4 = true;
                } else {
                    d4 = false;
                }
                if (!d4) {
                    sb.append(str.charAt(i5));
                }
            }
            sb.append(e4);
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long Q(long j4, long j5, int i4) {
        if (j4 <= 0 || j5 <= 0) {
            return 0L;
        }
        long j6 = i4;
        return (j4 + j6) / (j5 + j6);
    }

    private static final long a(long j4, int i4, int i5) {
        if (i4 > 0) {
            long j5 = i4;
            return (j4 * j5) + (i5 * (j5 - 1));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final int b(String str, String str2, int i4, int i5, String str3) {
        int B3;
        boolean b22;
        int length = str2.length() + i4;
        if (length <= i5) {
            b22 = z.b2(str, i4, str2, 0, str2.length(), true);
            if (b22) {
                return length;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i4);
        sb.append(", but was ");
        B3 = kotlin.ranges.u.B(length, i5);
        kotlin.jvm.internal.F.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, B3);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    private static final void c(String str, int i4, int i5, int i6, boolean z3) {
        String str2;
        int i7 = i5 - i4;
        if (z3) {
            if (i7 == i6) {
                return;
            }
        } else if (i7 <= i6) {
            return;
        }
        if (z3) {
            str2 = "exactly";
        } else {
            str2 = "at most";
        }
        kotlin.jvm.internal.F.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i6 + " hexadecimal digits at index " + i4 + ", but was " + substring + " of length " + i7);
    }

    private static final int d(String str, int i4, int i5) {
        if (str.charAt(i4) == '\r') {
            int i6 = i4 + 1;
            if (i6 < i5 && str.charAt(i6) == '\n') {
                return i4 + 2;
            }
            return i6;
        }
        if (str.charAt(i4) == '\n') {
            return i4 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i4 + ", but was " + str.charAt(i4));
    }

    private static final int e(String str, int i4) {
        int i5;
        char charAt = str.charAt(i4);
        if (charAt <= 127 && (i5 = f52813c[charAt]) >= 0) {
            return i5;
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i4 + ", but was " + str.charAt(i4));
    }

    public static final int f(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean K02;
        if (i4 > 0) {
            int i11 = (i4 - 1) / i5;
            int i12 = (i5 - 1) / i6;
            int i13 = i4 % i5;
            if (i13 != 0) {
                i5 = i13;
            }
            long j4 = i11 + (((i12 * i11) + ((i5 - 1) / i6)) * i7) + (((r0 - i11) - r2) * i8) + (i4 * (i9 + 2 + i10));
            K02 = kotlin.ranges.u.K0(new kotlin.ranges.l(0, Integer.MAX_VALUE), j4);
            if (K02) {
                return (int) j4;
            }
            throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) x0.g0(x0.l(j4))));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @kotlin.r
    private static final byte g(String str, int i4, int i5, C2227i c2227i) {
        return (byte) w(str, i4, i5, c2227i, 2);
    }

    @kotlin.r
    @Y(version = "1.9")
    public static final byte h(@l3.d String str, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return g(str, 0, str.length(), format);
    }

    static /* synthetic */ byte i(String str, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return g(str, i4, i5, c2227i);
    }

    public static /* synthetic */ byte j(String str, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return h(str, c2227i);
    }

    @kotlin.r
    private static final byte[] k(String str, int i4, int i5, C2227i c2227i) {
        int B3;
        int i6 = i4;
        AbstractC2088c.f51901E.a(i6, i5, str.length());
        if (i6 == i5) {
            return new byte[0];
        }
        C2227i.b c4 = c2227i.c();
        int g4 = c4.g();
        int f4 = c4.f();
        String c5 = c4.c();
        String e4 = c4.e();
        String d4 = c4.d();
        String h4 = c4.h();
        String str2 = d4;
        int C3 = C(i5 - i6, g4, f4, h4.length(), d4.length(), c5.length(), e4.length());
        byte[] bArr = new byte[C3];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < i5) {
            if (i8 == g4) {
                i6 = d(str, i6, i5);
                i8 = 0;
            } else if (i9 == f4) {
                i6 = b(str, h4, i6, i5, "group separator");
            } else {
                if (i9 != 0) {
                    i6 = b(str, str2, i6, i5, "byte separator");
                }
                i8++;
                i9++;
                int b4 = b(str, c5, i6, i5, "byte prefix");
                B3 = kotlin.ranges.u.B(b4 + 2, i5);
                c(str, b4, B3, 2, true);
                int e5 = e(str, b4) << 4;
                bArr[i7] = (byte) (e5 | e(str, b4 + 1));
                i6 = b(str, e4, b4 + 2, i5, "byte suffix");
                i7++;
                str2 = str2;
            }
            i9 = 0;
            i8++;
            i9++;
            int b42 = b(str, c5, i6, i5, "byte prefix");
            B3 = kotlin.ranges.u.B(b42 + 2, i5);
            c(str, b42, B3, 2, true);
            int e52 = e(str, b42) << 4;
            bArr[i7] = (byte) (e52 | e(str, b42 + 1));
            i6 = b(str, e4, b42 + 2, i5, "byte suffix");
            i7++;
            str2 = str2;
        }
        if (i7 != C3) {
            byte[] copyOf = Arrays.copyOf(bArr, i7);
            kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
            return copyOf;
        }
        return bArr;
    }

    @kotlin.r
    @l3.d
    @Y(version = "1.9")
    public static final byte[] l(@l3.d String str, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return k(str, 0, str.length(), format);
    }

    static /* synthetic */ byte[] m(String str, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return k(str, i4, i5, c2227i);
    }

    public static /* synthetic */ byte[] n(String str, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return l(str, c2227i);
    }

    @kotlin.r
    private static final int o(String str, int i4, int i5, C2227i c2227i) {
        return (int) w(str, i4, i5, c2227i, 8);
    }

    @kotlin.r
    @Y(version = "1.9")
    public static final int p(@l3.d String str, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return o(str, 0, str.length(), format);
    }

    static /* synthetic */ int q(String str, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return o(str, i4, i5, c2227i);
    }

    public static /* synthetic */ int r(String str, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return p(str, c2227i);
    }

    @kotlin.r
    private static final long s(String str, int i4, int i5, C2227i c2227i) {
        return w(str, i4, i5, c2227i, 16);
    }

    @kotlin.r
    @Y(version = "1.9")
    public static final long t(@l3.d String str, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return s(str, 0, str.length(), format);
    }

    static /* synthetic */ long u(String str, int i4, int i5, C2227i c2227i, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return s(str, i4, i5, c2227i);
    }

    public static /* synthetic */ long v(String str, C2227i c2227i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c2227i = C2227i.f52814d.a();
        }
        return t(str, c2227i);
    }

    @kotlin.r
    private static final long w(String str, int i4, int i5, C2227i c2227i, int i6) {
        AbstractC2088c.f51901E.a(i4, i5, str.length());
        String c4 = c2227i.d().c();
        String e4 = c2227i.d().e();
        if (c4.length() + e4.length() < i5 - i4) {
            int b4 = b(str, c4, i4, i5, "prefix");
            int length = i5 - e4.length();
            b(str, e4, length, i5, "suffix");
            c(str, b4, length, i6, false);
            long j4 = 0;
            while (b4 < length) {
                j4 = (j4 << 4) | e(str, b4);
                b4++;
            }
            return j4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a hexadecimal number with prefix \"");
        sb.append(c4);
        sb.append("\" and suffix \"");
        sb.append(e4);
        sb.append("\", but was ");
        kotlin.jvm.internal.F.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    static /* synthetic */ long x(String str, int i4, int i5, C2227i c2227i, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = 0;
        }
        if ((i7 & 2) != 0) {
            i5 = str.length();
        }
        return w(str, i4, i5, c2227i, i6);
    }

    @kotlin.r
    private static final short y(String str, int i4, int i5, C2227i c2227i) {
        return (short) w(str, i4, i5, c2227i, 4);
    }

    @kotlin.r
    @Y(version = "1.9")
    public static final short z(@l3.d String str, @l3.d C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return y(str, 0, str.length(), format);
    }
}
