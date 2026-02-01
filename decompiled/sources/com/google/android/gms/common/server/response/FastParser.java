package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.response.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlin.text.F;

@D
@I0.a
/* loaded from: classes.dex */
public class FastParser<T extends a> {

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f28894g = {'u', 'l', 'l'};

    /* renamed from: h, reason: collision with root package name */
    private static final char[] f28895h = {'r', 'u', 'e'};

    /* renamed from: i, reason: collision with root package name */
    private static final char[] f28896i = {'r', 'u', 'e', F.f52746b};

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f28897j = {'a', 'l', 's', 'e'};

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f28898k = {'a', 'l', 's', 'e', F.f52746b};

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f28899l = {'\n'};

    /* renamed from: m, reason: collision with root package name */
    private static final l<Integer> f28900m = new d();

    /* renamed from: n, reason: collision with root package name */
    private static final l<Long> f28901n = new e();

    /* renamed from: o, reason: collision with root package name */
    private static final l<Float> f28902o = new f();

    /* renamed from: p, reason: collision with root package name */
    private static final l<Double> f28903p = new g();

    /* renamed from: q, reason: collision with root package name */
    private static final l<Boolean> f28904q = new h();

    /* renamed from: r, reason: collision with root package name */
    private static final l<String> f28905r = new i();

    /* renamed from: s, reason: collision with root package name */
    private static final l<BigInteger> f28906s = new j();

    /* renamed from: t, reason: collision with root package name */
    private static final l<BigDecimal> f28907t = new k();

    /* renamed from: a, reason: collision with root package name */
    private final char[] f28908a = new char[1];

    /* renamed from: b, reason: collision with root package name */
    private final char[] f28909b = new char[32];

    /* renamed from: c, reason: collision with root package name */
    private final char[] f28910c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f28911d = new StringBuilder(32);

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f28912e = new StringBuilder(1024);

    /* renamed from: f, reason: collision with root package name */
    private final Stack<Integer> f28913f = new Stack<>();

    @D
    @I0.a
    /* loaded from: classes.dex */
    public static class ParseException extends Exception {
        public ParseException(@N String str) {
            super(str);
        }

        public ParseException(@N String str, @N Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@N Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(BufferedReader bufferedReader, boolean z3) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char k4 = k(bufferedReader);
        if (k4 != '\"') {
            if (k4 != 'f') {
                if (k4 != 'n') {
                    if (k4 == 't') {
                        if (z3) {
                            cArr2 = f28896i;
                        } else {
                            cArr2 = f28895h;
                        }
                        z(bufferedReader, cArr2);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(k4);
                    throw new ParseException(sb.toString());
                }
                z(bufferedReader, f28894g);
                return false;
            }
            if (z3) {
                cArr = f28898k;
            } else {
                cArr = f28897j;
            }
            z(bufferedReader, cArr);
            return false;
        }
        if (!z3) {
            return A(bufferedReader, true);
        }
        throw new ParseException("No boolean value found in string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x027a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean B(java.io.BufferedReader r17, com.google.android.gms.common.server.response.a r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.B(java.io.BufferedReader, com.google.android.gms.common.server.response.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String b(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, @androidx.annotation.P char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = r0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = r0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L55
            if (r2 != 0) goto L53
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.r.c(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r2 = r0
            goto L5d
        L55:
            r6 = 92
            if (r5 != r6) goto L53
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.b(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char k(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.f28908a) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.f28908a[0])) {
            if (bufferedReader.read(this.f28908a) == -1) {
                return (char) 0;
            }
        }
        return this.f28908a[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double l(BufferedReader bufferedReader) throws ParseException, IOException {
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        return Double.parseDouble(new String(this.f28910c, 0, o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m(BufferedReader bufferedReader) throws ParseException, IOException {
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f28910c, 0, o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(BufferedReader bufferedReader) throws ParseException, IOException {
        int i4;
        int i5;
        int i6;
        int i7;
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return 0;
        }
        char[] cArr = this.f28910c;
        if (o4 > 0) {
            char c4 = cArr[0];
            if (c4 == '-') {
                i4 = Integer.MIN_VALUE;
            } else {
                i4 = -2147483647;
            }
            if (c4 == '-') {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 < o4) {
                i7 = i5 + 1;
                int digit = Character.digit(cArr[i5], 10);
                if (digit >= 0) {
                    i6 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i6 = 0;
                i7 = i5;
            }
            while (i7 < o4) {
                int i8 = i7 + 1;
                int digit2 = Character.digit(cArr[i7], 10);
                if (digit2 >= 0) {
                    if (i6 >= -214748364) {
                        int i9 = i6 * 10;
                        if (i9 >= i4 + digit2) {
                            i6 = i9 - digit2;
                            i7 = i8;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i5 != 0) {
                if (i7 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return i6;
            }
            return -i6;
        }
        throw new ParseException("No number to parse");
    }

    private final int o(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4;
        char k4 = k(bufferedReader);
        if (k4 != 0) {
            if (k4 != ',') {
                if (k4 == 'n') {
                    z(bufferedReader, f28894g);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (k4 == '\"') {
                    i4 = 0;
                    boolean z3 = false;
                    while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                        char c4 = cArr[i4];
                        if (!Character.isISOControl(c4)) {
                            if (c4 == '\"') {
                                if (!z3) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i4 + 1);
                                    return i4;
                                }
                            } else if (c4 == '\\') {
                                z3 = !z3;
                                i4++;
                            }
                            z3 = false;
                            i4++;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = k4;
                    i4 = 1;
                    while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                        char c5 = cArr[i4];
                        if (c5 != '}' && c5 != ',' && !Character.isWhitespace(c5) && cArr[i4] != ']') {
                            i4++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i4 - 1);
                            cArr[i4] = 0;
                            return i4;
                        }
                    }
                }
                if (i4 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long p(BufferedReader bufferedReader) throws ParseException, IOException {
        long j4;
        long j5;
        int i4;
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return 0L;
        }
        char[] cArr = this.f28910c;
        if (o4 > 0) {
            int i5 = 0;
            char c4 = cArr[0];
            if (c4 == '-') {
                j4 = Long.MIN_VALUE;
            } else {
                j4 = -9223372036854775807L;
            }
            if (c4 == '-') {
                i5 = 1;
            }
            if (i5 < o4) {
                i4 = i5 + 1;
                int digit = Character.digit(cArr[i5], 10);
                if (digit >= 0) {
                    j5 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j5 = 0;
                i4 = i5;
            }
            while (i4 < o4) {
                int i6 = i4 + 1;
                int digit2 = Character.digit(cArr[i4], 10);
                if (digit2 >= 0) {
                    if (j5 >= -922337203685477580L) {
                        long j6 = j5 * 10;
                        int i7 = o4;
                        long j7 = digit2;
                        if (j6 >= j4 + j7) {
                            j5 = j6 - j7;
                            o4 = i7;
                            i4 = i6;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i5 != 0) {
                if (i4 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return j5;
            }
            return -j5;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public final String q(BufferedReader bufferedReader) throws ParseException, IOException {
        return r(bufferedReader, this.f28909b, this.f28911d, null);
    }

    @P
    private final String r(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @P char[] cArr2) throws ParseException, IOException {
        char k4 = k(bufferedReader);
        if (k4 != '\"') {
            if (k4 == 'n') {
                z(bufferedReader, f28894g);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return b(bufferedReader, cArr, sb, cArr2);
    }

    @P
    private final String s(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f28913f.push(2);
        char k4 = k(bufferedReader);
        if (k4 != '\"') {
            if (k4 != ']') {
                if (k4 == '}') {
                    y(2);
                    return null;
                }
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(k4);
                throw new ParseException(sb.toString());
            }
            y(2);
            y(1);
            y(5);
            return null;
        }
        this.f28913f.push(3);
        String b4 = b(bufferedReader, this.f28909b, this.f28911d, null);
        y(3);
        if (k(bufferedReader) == ':') {
            return b4;
        }
        throw new ParseException("Expected key/value separator");
    }

    @P
    private final String t(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char k4 = k(bufferedReader);
        int i4 = 1;
        if (k4 != '\"') {
            if (k4 != ',') {
                if (k4 != '[') {
                    if (k4 != '{') {
                        bufferedReader.reset();
                        o(bufferedReader, this.f28910c);
                    } else {
                        this.f28913f.push(1);
                        bufferedReader.mark(32);
                        char k5 = k(bufferedReader);
                        if (k5 == '}') {
                            y(1);
                        } else if (k5 == '\"') {
                            bufferedReader.reset();
                            s(bufferedReader);
                            do {
                            } while (t(bufferedReader) != null);
                            y(1);
                        } else {
                            StringBuilder sb = new StringBuilder(18);
                            sb.append("Unexpected token ");
                            sb.append(k5);
                            throw new ParseException(sb.toString());
                        }
                    }
                } else {
                    this.f28913f.push(5);
                    bufferedReader.mark(32);
                    if (k(bufferedReader) == ']') {
                        y(5);
                    } else {
                        bufferedReader.reset();
                        boolean z3 = false;
                        boolean z4 = false;
                        while (i4 > 0) {
                            char k6 = k(bufferedReader);
                            if (k6 != 0) {
                                if (!Character.isISOControl(k6)) {
                                    if (k6 == '\"') {
                                        if (!z4) {
                                            z3 = !z3;
                                        }
                                        k6 = '\"';
                                    }
                                    if (k6 == '[') {
                                        if (!z3) {
                                            i4++;
                                        }
                                        k6 = '[';
                                    }
                                    if (k6 == ']' && !z3) {
                                        i4--;
                                    }
                                    if (k6 == '\\' && z3) {
                                        z4 = !z4;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    throw new ParseException("Unexpected control character while reading array");
                                }
                            } else {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                        }
                        y(5);
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else {
            if (bufferedReader.read(this.f28908a) != -1) {
                char c4 = this.f28908a[0];
                boolean z5 = false;
                do {
                    if (c4 == '\"') {
                        if (z5) {
                            c4 = '\"';
                            z5 = true;
                        }
                    }
                    if (c4 == '\\') {
                        z5 = !z5;
                    } else {
                        z5 = false;
                    }
                    if (bufferedReader.read(this.f28908a) != -1) {
                        c4 = this.f28908a[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                } while (!Character.isISOControl(c4));
                throw new ParseException("Unexpected control character while reading string");
            }
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char k7 = k(bufferedReader);
        if (k7 != ',') {
            if (k7 == '}') {
                y(2);
                return null;
            }
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(k7);
            throw new ParseException(sb2.toString());
        }
        y(2);
        return s(bufferedReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public final BigDecimal u(BufferedReader bufferedReader) throws ParseException, IOException {
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f28910c, 0, o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public final BigInteger v(BufferedReader bufferedReader) throws ParseException, IOException {
        int o4 = o(bufferedReader, this.f28910c);
        if (o4 == 0) {
            return null;
        }
        return new BigInteger(new String(this.f28910c, 0, o4));
    }

    @P
    private final <O> ArrayList<O> w(BufferedReader bufferedReader, l<O> lVar) throws ParseException, IOException {
        char k4 = k(bufferedReader);
        if (k4 == 'n') {
            z(bufferedReader, f28894g);
            return null;
        }
        if (k4 == '[') {
            this.f28913f.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char k5 = k(bufferedReader);
                if (k5 != 0) {
                    if (k5 != ',') {
                        if (k5 != ']') {
                            bufferedReader.reset();
                            arrayList.add(lVar.a(this, bufferedReader));
                        } else {
                            y(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    @P
    private final <T extends a> ArrayList<T> x(BufferedReader bufferedReader, a.C0271a<?, ?> c0271a) throws ParseException, IOException {
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList();
        char k4 = k(bufferedReader);
        if (k4 != ']') {
            if (k4 != 'n') {
                if (k4 == '{') {
                    this.f28913f.push(1);
                    while (true) {
                        try {
                            a j12 = c0271a.j1();
                            if (B(bufferedReader, j12)) {
                                listWithAutoConstructFlag.add(j12);
                                char k5 = k(bufferedReader);
                                if (k5 != ',') {
                                    if (k5 == ']') {
                                        y(5);
                                        return listWithAutoConstructFlag;
                                    }
                                    StringBuilder sb = new StringBuilder(19);
                                    sb.append("Unexpected token: ");
                                    sb.append(k5);
                                    throw new ParseException(sb.toString());
                                }
                                if (k(bufferedReader) == '{') {
                                    this.f28913f.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return listWithAutoConstructFlag;
                            }
                        } catch (IllegalAccessException e4) {
                            throw new ParseException("Error instantiating inner object", e4);
                        } catch (InstantiationException e5) {
                            throw new ParseException("Error instantiating inner object", e5);
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(k4);
                    throw new ParseException(sb2.toString());
                }
            } else {
                z(bufferedReader, f28894g);
                y(5);
                return null;
            }
        } else {
            y(5);
            return listWithAutoConstructFlag;
        }
    }

    private final void y(int i4) throws ParseException {
        if (!this.f28913f.isEmpty()) {
            int intValue = this.f28913f.pop().intValue();
            if (intValue == i4) {
                return;
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i4);
            sb.append(" but had ");
            sb.append(intValue);
            throw new ParseException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i4);
        sb2.append(" but had empty stack");
        throw new ParseException(sb2.toString());
    }

    private final void z(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4 = 0;
        while (true) {
            int length = cArr.length;
            if (i4 < length) {
                int read = bufferedReader.read(this.f28909b, 0, length - i4);
                if (read != -1) {
                    for (int i5 = 0; i5 < read; i5++) {
                        if (cArr[i5 + i4] != this.f28909b[i5]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i4 += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    @I0.a
    public void a(@N InputStream inputStream, @N T t3) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f28913f.push(0);
                char k4 = k(bufferedReader);
                if (k4 != 0) {
                    if (k4 != '[') {
                        if (k4 == '{') {
                            this.f28913f.push(1);
                            B(bufferedReader, t3);
                        } else {
                            StringBuilder sb = new StringBuilder(19);
                            sb.append("Unexpected token: ");
                            sb.append(k4);
                            throw new ParseException(sb.toString());
                        }
                    } else {
                        this.f28913f.push(5);
                        Map<String, a.C0271a<?, ?>> c4 = t3.c();
                        if (c4.size() == 1) {
                            a.C0271a<?, ?> value = c4.entrySet().iterator().next().getValue();
                            t3.a(value, value.f28919J, x(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    y(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e4) {
                throw new ParseException(e4);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
