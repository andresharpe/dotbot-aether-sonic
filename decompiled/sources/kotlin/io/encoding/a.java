package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Y;
import kotlin.collections.AbstractC2088c;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2222d;

@f
@Y(version = "1.8")
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final int f52110d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f52111e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f52112f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f52113g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f52114h = 61;

    /* renamed from: i, reason: collision with root package name */
    public static final int f52115i = 76;

    /* renamed from: j, reason: collision with root package name */
    private static final int f52116j = 19;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f52120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f52121b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final C0465a f52109c = new C0465a(null);

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private static final byte[] f52117k = {13, 10};

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private static final a f52118l = new a(true, false);

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    private static final a f52119m = new a(false, true);

    /* renamed from: kotlin.io.encoding.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0465a extends a {
        public /* synthetic */ C0465a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final a G() {
            return a.f52119m;
        }

        @l3.d
        public final byte[] H() {
            return a.f52117k;
        }

        @l3.d
        public final a I() {
            return a.f52118l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private C0465a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.a.C0465a.<init>():void");
        }
    }

    public /* synthetic */ a(boolean z3, boolean z4, C2197u c2197u) {
        this(z3, z4);
    }

    public static /* synthetic */ byte[] A(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return aVar.z(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    private final int C(byte[] bArr, int i4, int i5, int i6) {
        if (i6 != -8) {
            if (i6 != -6) {
                if (i6 != -4) {
                    if (i6 != -2) {
                        throw new IllegalStateException("Unreachable".toString());
                    }
                } else {
                    i4 = F(bArr, i4 + 1, i5);
                    if (i4 == i5 || bArr[i4] != 61) {
                        throw new IllegalArgumentException("Missing one pad character at index " + i4);
                    }
                }
            }
            return i4 + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i4);
    }

    private final int F(byte[] bArr, int i4, int i5) {
        if (!this.f52121b) {
            return i4;
        }
        while (i4 < i5) {
            if (c.a()[bArr[i4] & 255] != -1) {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    private final void f(int i4, int i5, int i6) {
        if (i5 >= 0 && i5 <= i4) {
            int i7 = i5 + i6;
            if (i7 >= 0 && i7 <= i4) {
                return;
            }
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i5 + ", destination size: " + i4 + ", capacity needed: " + i6);
        }
        throw new IndexOutOfBoundsException("destination offset: " + i5 + ", destination size: " + i4);
    }

    public static /* synthetic */ byte[] j(a aVar, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = charSequence.length();
            }
            return aVar.h(charSequence, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ byte[] k(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return aVar.i(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r7 == (-2)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        r3 = F(r19, r5, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (r3 < r23) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        return r8 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, kotlin.text.C2219a.a(8));
        kotlin.jvm.internal.F.o(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011d, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int l(byte[] r19, byte[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.a.l(byte[], byte[], int, int, int):int");
    }

    public static /* synthetic */ int o(a aVar, CharSequence charSequence, byte[] bArr, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        if (obj == null) {
            if ((i7 & 4) != 0) {
                i8 = 0;
            } else {
                i8 = i4;
            }
            if ((i7 & 8) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i7 & 16) != 0) {
                i6 = charSequence.length();
            }
            return aVar.m(charSequence, bArr, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ int p(a aVar, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        if (obj == null) {
            if ((i7 & 4) != 0) {
                i8 = 0;
            } else {
                i8 = i4;
            }
            if ((i7 & 8) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i7 & 16) != 0) {
                i6 = bArr.length;
            }
            return aVar.n(bArr, bArr2, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    private final int q(byte[] bArr, int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 == 0) {
            return 0;
        }
        if (i6 != 1) {
            if (this.f52121b) {
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    int i7 = c.a()[bArr[i4] & 255];
                    if (i7 < 0) {
                        if (i7 == -2) {
                            i6 -= i5 - i4;
                            break;
                        }
                        i6--;
                    }
                    i4++;
                }
            } else if (bArr[i5 - 1] == 61) {
                int i8 = i6 - 1;
                if (bArr[i5 - 2] == 61) {
                    i6 -= 2;
                } else {
                    i6 = i8;
                }
            }
            return (int) ((i6 * 6) / 8);
        }
        throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i4 + ", endIndex: " + i5);
    }

    public static /* synthetic */ String s(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return aVar.r(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public static /* synthetic */ int u(a aVar, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        if (obj == null) {
            if ((i7 & 4) != 0) {
                i8 = 0;
            } else {
                i8 = i4;
            }
            if ((i7 & 8) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i7 & 16) != 0) {
                i6 = bArr.length;
            }
            return aVar.t(bArr, bArr2, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    private final int w(int i4) {
        int i5;
        int i6 = (i4 + 2) / 3;
        if (this.f52121b) {
            i5 = (i6 - 1) / 19;
        } else {
            i5 = 0;
        }
        int i7 = (i6 * 4) + (i5 * 2);
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable y(a aVar, byte[] bArr, Appendable appendable, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = bArr.length;
            }
            return aVar.x(bArr, appendable, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    @l3.d
    public final byte[] B(@l3.d byte[] source, int i4, int i5) {
        F.p(source, "source");
        g(source.length, i4, i5);
        byte[] bArr = new byte[w(i5 - i4)];
        v(source, bArr, 0, i4, i5);
        return bArr;
    }

    public final boolean D() {
        return this.f52121b;
    }

    public final boolean E() {
        return this.f52120a;
    }

    @l3.d
    public final String d(@l3.d byte[] source) {
        F.p(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b4 : source) {
            sb.append((char) b4);
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    @l3.d
    public final byte[] e(@l3.d CharSequence source, int i4, int i5) {
        F.p(source, "source");
        g(source.length(), i4, i5);
        byte[] bArr = new byte[i5 - i4];
        int i6 = 0;
        while (i4 < i5) {
            char charAt = source.charAt(i4);
            if (charAt <= 255) {
                bArr[i6] = (byte) charAt;
                i6++;
            } else {
                bArr[i6] = 63;
                i6++;
            }
            i4++;
        }
        return bArr;
    }

    public final void g(int i4, int i5, int i6) {
        AbstractC2088c.f51901E.a(i5, i6, i4);
    }

    @l3.d
    public final byte[] h(@l3.d CharSequence source, int i4, int i5) {
        byte[] e4;
        F.p(source, "source");
        if (source instanceof String) {
            g(source.length(), i4, i5);
            String substring = ((String) source).substring(i4, i5);
            F.o(substring, "substring(...)");
            Charset charset = C2222d.f52797g;
            F.n(substring, "null cannot be cast to non-null type java.lang.String");
            e4 = substring.getBytes(charset);
            F.o(e4, "getBytes(...)");
        } else {
            e4 = e(source, i4, i5);
        }
        return k(this, e4, 0, 0, 6, null);
    }

    @l3.d
    public final byte[] i(@l3.d byte[] source, int i4, int i5) {
        F.p(source, "source");
        g(source.length, i4, i5);
        int q4 = q(source, i4, i5);
        byte[] bArr = new byte[q4];
        if (l(source, bArr, 0, i4, i5) == q4) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int m(@l3.d CharSequence source, @l3.d byte[] destination, int i4, int i5, int i6) {
        byte[] e4;
        F.p(source, "source");
        F.p(destination, "destination");
        if (source instanceof String) {
            g(source.length(), i5, i6);
            String substring = ((String) source).substring(i5, i6);
            F.o(substring, "substring(...)");
            Charset charset = C2222d.f52797g;
            F.n(substring, "null cannot be cast to non-null type java.lang.String");
            e4 = substring.getBytes(charset);
            F.o(e4, "getBytes(...)");
        } else {
            e4 = e(source, i5, i6);
        }
        return p(this, e4, destination, i4, 0, 0, 24, null);
    }

    public final int n(@l3.d byte[] source, @l3.d byte[] destination, int i4, int i5, int i6) {
        F.p(source, "source");
        F.p(destination, "destination");
        g(source.length, i5, i6);
        f(destination.length, i4, q(source, i5, i6));
        return l(source, destination, i4, i5, i6);
    }

    @l3.d
    public final String r(@l3.d byte[] source, int i4, int i5) {
        F.p(source, "source");
        return new String(B(source, i4, i5), C2222d.f52797g);
    }

    public final int t(@l3.d byte[] source, @l3.d byte[] destination, int i4, int i5, int i6) {
        F.p(source, "source");
        F.p(destination, "destination");
        return v(source, destination, i4, i5, i6);
    }

    public final int v(@l3.d byte[] source, @l3.d byte[] destination, int i4, int i5, int i6) {
        byte[] b4;
        int i7;
        int i8 = i5;
        F.p(source, "source");
        F.p(destination, "destination");
        g(source.length, i8, i6);
        f(destination.length, i4, w(i6 - i8));
        if (this.f52120a) {
            b4 = c.d();
        } else {
            b4 = c.b();
        }
        if (this.f52121b) {
            i7 = 19;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        int i9 = i4;
        while (i8 + 2 < i6) {
            int min = Math.min((i6 - i8) / 3, i7);
            for (int i10 = 0; i10 < min; i10++) {
                int i11 = source[i8] & 255;
                int i12 = i8 + 2;
                int i13 = source[i8 + 1] & 255;
                i8 += 3;
                int i14 = (i13 << 8) | (i11 << 16) | (source[i12] & 255);
                destination[i9] = b4[i14 >>> 18];
                destination[i9 + 1] = b4[(i14 >>> 12) & 63];
                int i15 = i9 + 3;
                destination[i9 + 2] = b4[(i14 >>> 6) & 63];
                i9 += 4;
                destination[i15] = b4[i14 & 63];
            }
            if (min == i7 && i8 != i6) {
                int i16 = i9 + 1;
                byte[] bArr = f52117k;
                destination[i9] = bArr[0];
                i9 += 2;
                destination[i16] = bArr[1];
            }
        }
        int i17 = i6 - i8;
        if (i17 != 1) {
            if (i17 == 2) {
                int i18 = i8 + 1;
                int i19 = source[i8] & 255;
                i8 += 2;
                int i20 = ((source[i18] & 255) << 2) | (i19 << 10);
                destination[i9] = b4[i20 >>> 12];
                destination[i9 + 1] = b4[(i20 >>> 6) & 63];
                int i21 = i9 + 3;
                destination[i9 + 2] = b4[i20 & 63];
                i9 += 4;
                destination[i21] = f52114h;
            }
        } else {
            int i22 = (source[i8] & 255) << 4;
            destination[i9] = b4[i22 >>> 6];
            destination[i9 + 1] = b4[i22 & 63];
            int i23 = i9 + 3;
            destination[i9 + 2] = f52114h;
            i9 += 4;
            destination[i23] = f52114h;
            i8++;
        }
        if (i8 == i6) {
            return i9 - i4;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @l3.d
    public final <A extends Appendable> A x(@l3.d byte[] source, @l3.d A destination, int i4, int i5) {
        F.p(source, "source");
        F.p(destination, "destination");
        destination.append(new String(B(source, i4, i5), C2222d.f52797g));
        return destination;
    }

    @l3.d
    public final byte[] z(@l3.d byte[] source, int i4, int i5) {
        F.p(source, "source");
        return B(source, i4, i5);
    }

    private a(boolean z3, boolean z4) {
        this.f52120a = z3;
        this.f52121b = z4;
        if (z3 && z4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
