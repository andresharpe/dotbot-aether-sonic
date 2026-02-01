package com.airbnb.lottie.parser.moshi;

import androidx.annotation.P;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import okio.C2385c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends JsonReader {

    /* renamed from: R, reason: collision with root package name */
    private static final long f21913R = -922337203685477580L;

    /* renamed from: S, reason: collision with root package name */
    private static final ByteString f21914S = ByteString.o("'\\");

    /* renamed from: T, reason: collision with root package name */
    private static final ByteString f21915T = ByteString.o("\"\\");

    /* renamed from: U, reason: collision with root package name */
    private static final ByteString f21916U = ByteString.o("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: V, reason: collision with root package name */
    private static final ByteString f21917V = ByteString.o("\n\r");

    /* renamed from: W, reason: collision with root package name */
    private static final ByteString f21918W = ByteString.o("*/");

    /* renamed from: X, reason: collision with root package name */
    private static final int f21919X = 0;

    /* renamed from: Y, reason: collision with root package name */
    private static final int f21920Y = 1;

    /* renamed from: Z, reason: collision with root package name */
    private static final int f21921Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f21922a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f21923b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f21924c0 = 5;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f21925d0 = 6;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f21926e0 = 7;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f21927f0 = 8;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f21928g0 = 9;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f21929h0 = 10;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f21930i0 = 11;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f21931j0 = 12;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f21932k0 = 13;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f21933l0 = 14;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f21934m0 = 15;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f21935n0 = 16;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f21936o0 = 17;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f21937p0 = 18;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f21938q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f21939r0 = 1;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f21940s0 = 2;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f21941t0 = 3;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f21942u0 = 4;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f21943v0 = 5;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f21944w0 = 6;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f21945x0 = 7;

    /* renamed from: L, reason: collision with root package name */
    private final okio.e f21946L;

    /* renamed from: M, reason: collision with root package name */
    private final C2385c f21947M;

    /* renamed from: N, reason: collision with root package name */
    private int f21948N = 0;

    /* renamed from: O, reason: collision with root package name */
    private long f21949O;

    /* renamed from: P, reason: collision with root package name */
    private int f21950P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    private String f21951Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(okio.e eVar) {
        if (eVar != null) {
            this.f21946L = eVar;
            this.f21947M = eVar.g();
            z(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void B0(ByteString byteString) throws IOException {
        while (true) {
            long W3 = this.f21946L.W(byteString);
            if (W3 != -1) {
                if (this.f21947M.n(W3) == 92) {
                    this.f21947M.skip(W3 + 1);
                    z0();
                } else {
                    this.f21947M.skip(W3 + 1);
                    return;
                }
            } else {
                throw H("Unterminated string");
            }
        }
    }

    private boolean E0() throws IOException {
        boolean z3;
        long F02;
        long K3 = this.f21946L.K(f21918W);
        if (K3 != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2385c c2385c = this.f21947M;
        if (z3) {
            F02 = K3 + r1.R();
        } else {
            F02 = c2385c.F0();
        }
        c2385c.skip(F02);
        return z3;
    }

    private void F0() throws IOException {
        long F02;
        long W3 = this.f21946L.W(f21917V);
        C2385c c2385c = this.f21947M;
        if (W3 != -1) {
            F02 = W3 + 1;
        } else {
            F02 = c2385c.F0();
        }
        c2385c.skip(F02);
    }

    private void M0() throws IOException {
        long W3 = this.f21946L.W(f21916U);
        C2385c c2385c = this.f21947M;
        if (W3 == -1) {
            W3 = c2385c.F0();
        }
        c2385c.skip(W3);
    }

    private void P() throws IOException {
        if (this.f21901I) {
        } else {
            throw H("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int V() throws IOException {
        int[] iArr = this.f21898F;
        int i4 = this.f21897E;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int e02 = e0(true);
            this.f21947M.readByte();
            if (e02 != 44) {
                if (e02 != 59) {
                    if (e02 == 93) {
                        this.f21948N = 4;
                        return 4;
                    }
                    throw H("Unterminated array");
                }
                P();
            }
        } else if (i5 != 3 && i5 != 5) {
            if (i5 == 4) {
                iArr[i4 - 1] = 5;
                int e03 = e0(true);
                this.f21947M.readByte();
                if (e03 != 58) {
                    if (e03 == 61) {
                        P();
                        if (this.f21946L.v0(1L) && this.f21947M.n(0L) == 62) {
                            this.f21947M.readByte();
                        }
                    } else {
                        throw H("Expected ':'");
                    }
                }
            } else if (i5 == 6) {
                iArr[i4 - 1] = 7;
            } else if (i5 == 7) {
                if (e0(false) == -1) {
                    this.f21948N = 18;
                    return 18;
                }
                P();
            } else if (i5 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i4 - 1] = 4;
            if (i5 == 5) {
                int e04 = e0(true);
                this.f21947M.readByte();
                if (e04 != 44) {
                    if (e04 != 59) {
                        if (e04 == 125) {
                            this.f21948N = 2;
                            return 2;
                        }
                        throw H("Unterminated object");
                    }
                    P();
                }
            }
            int e05 = e0(true);
            if (e05 != 34) {
                if (e05 != 39) {
                    if (e05 != 125) {
                        P();
                        if (c0((char) e05)) {
                            this.f21948N = 14;
                            return 14;
                        }
                        throw H("Expected name");
                    }
                    if (i5 != 5) {
                        this.f21947M.readByte();
                        this.f21948N = 2;
                        return 2;
                    }
                    throw H("Expected name");
                }
                this.f21947M.readByte();
                P();
                this.f21948N = 12;
                return 12;
            }
            this.f21947M.readByte();
            this.f21948N = 13;
            return 13;
        }
        int e06 = e0(true);
        if (e06 != 34) {
            if (e06 != 39) {
                if (e06 != 44 && e06 != 59) {
                    if (e06 != 91) {
                        if (e06 != 93) {
                            if (e06 != 123) {
                                int x02 = x0();
                                if (x02 != 0) {
                                    return x02;
                                }
                                int y02 = y0();
                                if (y02 != 0) {
                                    return y02;
                                }
                                if (c0(this.f21947M.n(0L))) {
                                    P();
                                    this.f21948N = 10;
                                    return 10;
                                }
                                throw H("Expected value");
                            }
                            this.f21947M.readByte();
                            this.f21948N = 1;
                            return 1;
                        }
                        if (i5 == 1) {
                            this.f21947M.readByte();
                            this.f21948N = 4;
                            return 4;
                        }
                    } else {
                        this.f21947M.readByte();
                        this.f21948N = 3;
                        return 3;
                    }
                }
                if (i5 != 1 && i5 != 2) {
                    throw H("Unexpected value");
                }
                P();
                this.f21948N = 7;
                return 7;
            }
            P();
            this.f21947M.readByte();
            this.f21948N = 8;
            return 8;
        }
        this.f21947M.readByte();
        this.f21948N = 9;
        return 9;
    }

    private int a0(String str, JsonReader.a aVar) {
        int length = aVar.f21903a.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(aVar.f21903a[i4])) {
                this.f21948N = 0;
                this.f21899G[this.f21897E - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    private boolean c0(int i4) throws IOException {
        if (i4 != 9 && i4 != 10 && i4 != 12 && i4 != 13 && i4 != 32) {
            if (i4 != 35) {
                if (i4 != 44) {
                    if (i4 != 47 && i4 != 61) {
                        if (i4 != 123 && i4 != 125 && i4 != 58) {
                            if (i4 != 59) {
                                switch (i4) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            P();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f21947M.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        P();
        F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f21946L.v0(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        P();
        r3 = r6.f21947M.n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f21947M.readByte();
        r6.f21947M.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (E0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw H("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f21947M.readByte();
        r6.f21947M.readByte();
        F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.e r2 = r6.f21946L
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.v0(r4)
            if (r2 == 0) goto L80
            okio.c r2 = r6.f21947M
            long r4 = (long) r1
            byte r2 = r2.n(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            okio.c r3 = r6.f21947M
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            okio.e r3 = r6.f21946L
            r4 = 2
            boolean r3 = r3.v0(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.P()
            okio.c r3 = r6.f21947M
            r4 = 1
            byte r3 = r3.n(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.c r1 = r6.f21947M
            r1.readByte()
            okio.c r1 = r6.f21947M
            r1.readByte()
            r6.F0()
            goto L1
        L5a:
            okio.c r1 = r6.f21947M
            r1.readByte()
            okio.c r1 = r6.f21947M
            r1.readByte()
            boolean r1 = r6.E0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.b r7 = r6.H(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.P()
            r6.F0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.d.e0(boolean):int");
    }

    private String i0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long W3 = this.f21946L.W(byteString);
            if (W3 != -1) {
                if (this.f21947M.n(W3) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f21947M.q(W3));
                    this.f21947M.readByte();
                    sb.append(z0());
                } else {
                    if (sb == null) {
                        String q4 = this.f21947M.q(W3);
                        this.f21947M.readByte();
                        return q4;
                    }
                    sb.append(this.f21947M.q(W3));
                    this.f21947M.readByte();
                    return sb.toString();
                }
            } else {
                throw H("Unterminated string");
            }
        }
    }

    private String u0() throws IOException {
        long W3 = this.f21946L.W(f21916U);
        if (W3 != -1) {
            return this.f21947M.q(W3);
        }
        return this.f21947M.H0();
    }

    private int x0() throws IOException {
        String str;
        String str2;
        int i4;
        byte n4 = this.f21947M.n(0L);
        if (n4 != 116 && n4 != 84) {
            if (n4 != 102 && n4 != 70) {
                if (n4 != 110 && n4 != 78) {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i4 = 7;
            } else {
                str = L1.a.t3;
                str2 = "FALSE";
                i4 = 6;
            }
        } else {
            str = L1.a.f1650s3;
            str2 = "TRUE";
            i4 = 5;
        }
        int length = str.length();
        int i5 = 1;
        while (i5 < length) {
            int i6 = i5 + 1;
            if (!this.f21946L.v0(i6)) {
                return 0;
            }
            byte n5 = this.f21947M.n(i5);
            if (n5 != str.charAt(i5) && n5 != str2.charAt(i5)) {
                return 0;
            }
            i5 = i6;
        }
        if (this.f21946L.v0(length + 1) && c0(this.f21947M.n(length))) {
            return 0;
        }
        this.f21947M.skip(length);
        this.f21948N = i4;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (c0(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.f21949O = r8;
        r16.f21947M.skip(r5);
        r16.f21948N = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.f21950P = r5;
        r16.f21948N = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int y0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.d.y0():int");
    }

    private char z0() throws IOException {
        int i4;
        if (this.f21946L.v0(1L)) {
            byte readByte = this.f21947M.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f21901I) {
                                        return (char) readByte;
                                    }
                                    throw H("Invalid escape sequence: \\" + ((char) readByte));
                                }
                                if (this.f21946L.v0(4L)) {
                                    char c4 = 0;
                                    for (int i5 = 0; i5 < 4; i5++) {
                                        byte n4 = this.f21947M.n(i5);
                                        char c5 = (char) (c4 << 4);
                                        if (n4 >= 48 && n4 <= 57) {
                                            i4 = n4 - 48;
                                        } else if (n4 >= 97 && n4 <= 102) {
                                            i4 = n4 - 87;
                                        } else {
                                            if (n4 < 65 || n4 > 70) {
                                                throw H("\\u" + this.f21947M.q(4L));
                                            }
                                            i4 = n4 - 55;
                                        }
                                        c4 = (char) (c5 + i4);
                                    }
                                    this.f21947M.skip(4L);
                                    return c4;
                                }
                                throw new EOFException("Unterminated escape sequence at path " + h());
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw H("Unterminated escape sequence");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int A(JsonReader.a aVar) throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return a0(this.f21951Q, aVar);
        }
        int g12 = this.f21946L.g1(aVar.f21904b);
        if (g12 != -1) {
            this.f21948N = 0;
            this.f21899G[this.f21897E - 1] = aVar.f21903a[g12];
            return g12;
        }
        String str = this.f21899G[this.f21897E - 1];
        String n4 = n();
        int a02 = a0(n4, aVar);
        if (a02 == -1) {
            this.f21948N = 15;
            this.f21951Q = n4;
            this.f21899G[this.f21897E - 1] = str;
        }
        return a02;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void D() throws IOException {
        if (!this.f21902J) {
            int i4 = this.f21948N;
            if (i4 == 0) {
                i4 = V();
            }
            if (i4 == 14) {
                M0();
            } else if (i4 == 13) {
                B0(f21915T);
            } else if (i4 == 12) {
                B0(f21914S);
            } else if (i4 != 15) {
                throw new a("Expected a name but was " + v() + " at path " + h());
            }
            this.f21948N = 0;
            this.f21899G[this.f21897E - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + v() + " at " + h());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void F() throws IOException {
        if (!this.f21902J) {
            int i4 = 0;
            do {
                int i5 = this.f21948N;
                if (i5 == 0) {
                    i5 = V();
                }
                if (i5 == 3) {
                    z(1);
                } else if (i5 == 1) {
                    z(3);
                } else {
                    if (i5 == 4) {
                        i4--;
                        if (i4 >= 0) {
                            this.f21897E--;
                        } else {
                            throw new a("Expected a value but was " + v() + " at path " + h());
                        }
                    } else if (i5 == 2) {
                        i4--;
                        if (i4 >= 0) {
                            this.f21897E--;
                        } else {
                            throw new a("Expected a value but was " + v() + " at path " + h());
                        }
                    } else if (i5 != 14 && i5 != 10) {
                        if (i5 != 9 && i5 != 13) {
                            if (i5 != 8 && i5 != 12) {
                                if (i5 == 17) {
                                    this.f21947M.skip(this.f21950P);
                                } else if (i5 == 18) {
                                    throw new a("Expected a value but was " + v() + " at path " + h());
                                }
                            } else {
                                B0(f21914S);
                            }
                        } else {
                            B0(f21915T);
                        }
                    } else {
                        M0();
                    }
                    this.f21948N = 0;
                }
                i4++;
                this.f21948N = 0;
            } while (i4 != 0);
            int[] iArr = this.f21900H;
            int i6 = this.f21897E;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f21899G[i6 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + v() + " at " + h());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 3) {
            z(1);
            this.f21900H[this.f21897E - 1] = 0;
            this.f21948N = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + v() + " at path " + h());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 1) {
            z(3);
            this.f21948N = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + v() + " at path " + h());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21948N = 0;
        this.f21898F[0] = 8;
        this.f21897E = 1;
        this.f21947M.a();
        this.f21946L.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 4) {
            int i5 = this.f21897E;
            this.f21897E = i5 - 1;
            int[] iArr = this.f21900H;
            int i6 = i5 - 2;
            iArr[i6] = iArr[i6] + 1;
            this.f21948N = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + v() + " at path " + h());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void f() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 2) {
            int i5 = this.f21897E;
            int i6 = i5 - 1;
            this.f21897E = i6;
            this.f21899G[i6] = null;
            int[] iArr = this.f21900H;
            int i7 = i5 - 2;
            iArr[i7] = iArr[i7] + 1;
            this.f21948N = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + v() + " at path " + h());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean i() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 != 2 && i4 != 4 && i4 != 18) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean j() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 5) {
            this.f21948N = 0;
            int[] iArr = this.f21900H;
            int i5 = this.f21897E - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.f21948N = 0;
            int[] iArr2 = this.f21900H;
            int i6 = this.f21897E - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + v() + " at path " + h());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double k() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 16) {
            this.f21948N = 0;
            int[] iArr = this.f21900H;
            int i5 = this.f21897E - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f21949O;
        }
        if (i4 == 17) {
            this.f21951Q = this.f21947M.q(this.f21950P);
        } else if (i4 == 9) {
            this.f21951Q = i0(f21915T);
        } else if (i4 == 8) {
            this.f21951Q = i0(f21914S);
        } else if (i4 == 10) {
            this.f21951Q = u0();
        } else if (i4 != 11) {
            throw new a("Expected a double but was " + v() + " at path " + h());
        }
        this.f21948N = 11;
        try {
            double parseDouble = Double.parseDouble(this.f21951Q);
            if (!this.f21901I && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + h());
            }
            this.f21951Q = null;
            this.f21948N = 0;
            int[] iArr2 = this.f21900H;
            int i6 = this.f21897E - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f21951Q + " at path " + h());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int m() throws IOException {
        String i02;
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 16) {
            long j4 = this.f21949O;
            int i5 = (int) j4;
            if (j4 == i5) {
                this.f21948N = 0;
                int[] iArr = this.f21900H;
                int i6 = this.f21897E - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new a("Expected an int but was " + this.f21949O + " at path " + h());
        }
        if (i4 == 17) {
            this.f21951Q = this.f21947M.q(this.f21950P);
        } else if (i4 != 9 && i4 != 8) {
            if (i4 != 11) {
                throw new a("Expected an int but was " + v() + " at path " + h());
            }
        } else {
            if (i4 == 9) {
                i02 = i0(f21915T);
            } else {
                i02 = i0(f21914S);
            }
            this.f21951Q = i02;
            try {
                int parseInt = Integer.parseInt(i02);
                this.f21948N = 0;
                int[] iArr2 = this.f21900H;
                int i7 = this.f21897E - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21948N = 11;
        try {
            double parseDouble = Double.parseDouble(this.f21951Q);
            int i8 = (int) parseDouble;
            if (i8 == parseDouble) {
                this.f21951Q = null;
                this.f21948N = 0;
                int[] iArr3 = this.f21900H;
                int i9 = this.f21897E - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return i8;
            }
            throw new a("Expected an int but was " + this.f21951Q + " at path " + h());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f21951Q + " at path " + h());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String n() throws IOException {
        String str;
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 14) {
            str = u0();
        } else if (i4 == 13) {
            str = i0(f21915T);
        } else if (i4 == 12) {
            str = i0(f21914S);
        } else if (i4 == 15) {
            str = this.f21951Q;
        } else {
            throw new a("Expected a name but was " + v() + " at path " + h());
        }
        this.f21948N = 0;
        this.f21899G[this.f21897E - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String p() throws IOException {
        String q4;
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        if (i4 == 10) {
            q4 = u0();
        } else if (i4 == 9) {
            q4 = i0(f21915T);
        } else if (i4 == 8) {
            q4 = i0(f21914S);
        } else if (i4 == 11) {
            q4 = this.f21951Q;
            this.f21951Q = null;
        } else if (i4 == 16) {
            q4 = Long.toString(this.f21949O);
        } else if (i4 == 17) {
            q4 = this.f21947M.q(this.f21950P);
        } else {
            throw new a("Expected a string but was " + v() + " at path " + h());
        }
        this.f21948N = 0;
        int[] iArr = this.f21900H;
        int i5 = this.f21897E - 1;
        iArr[i5] = iArr[i5] + 1;
        return q4;
    }

    public String toString() {
        return "JsonReader(" + this.f21946L + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token v() throws IOException {
        int i4 = this.f21948N;
        if (i4 == 0) {
            i4 = V();
        }
        switch (i4) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
