package com.amazonaws.util;

/* loaded from: classes.dex */
class f implements i {

    /* renamed from: b, reason: collision with root package name */
    private static final int f24292b = 26;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24293c = 52;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24294d = 62;

    /* renamed from: e, reason: collision with root package name */
    private static final int f24295e = 63;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24296f = 71;

    /* renamed from: g, reason: collision with root package name */
    private static final int f24297g = -4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f24298h = -19;

    /* renamed from: i, reason: collision with root package name */
    private static final int f24299i = -16;

    /* renamed from: j, reason: collision with root package name */
    private static final int f24300j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f24301k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f24302l = 6;

    /* renamed from: m, reason: collision with root package name */
    private static final int f24303m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f24304n = 15;

    /* renamed from: o, reason: collision with root package name */
    private static final int f24305o = 63;

    /* renamed from: p, reason: collision with root package name */
    private static final byte f24306p = 61;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24307a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f24308a = b();

        private a() {
        }

        private static byte[] b() {
            byte[] bArr = new byte[123];
            for (int i4 = 0; i4 <= 122; i4++) {
                if (i4 >= 65 && i4 <= 90) {
                    bArr[i4] = (byte) (i4 - 65);
                } else if (i4 >= 48 && i4 <= 57) {
                    bArr[i4] = (byte) (i4 + 4);
                } else if (i4 == 43) {
                    bArr[i4] = (byte) (i4 + 19);
                } else if (i4 == 47) {
                    bArr[i4] = (byte) (i4 + 16);
                } else if (i4 >= 97 && i4 <= 122) {
                    bArr[i4] = (byte) (i4 - 71);
                } else {
                    bArr[i4] = -1;
                }
            }
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        this.f24307a = CodecUtils.f("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    @Override // com.amazonaws.util.i
    public byte[] a(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i4 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i5 = 0;
            while (i4 < bArr.length) {
                g(bArr, i4, bArr2, i5);
                i4 += 3;
                i5 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i6 = 0;
        while (i4 < bArr.length - length2) {
            g(bArr, i4, bArr3, i6);
            i4 += 3;
            i6 += 4;
        }
        if (length2 != 1) {
            if (length2 == 2) {
                f(bArr, i4, bArr3, i6);
            }
        } else {
            e(bArr, i4, bArr3, i6);
        }
        return bArr3;
    }

    @Override // com.amazonaws.util.i
    public byte[] b(byte[] bArr, int i4) {
        int i5;
        if (i4 % 4 == 0) {
            int i6 = i4 - 1;
            int i7 = 0;
            while (true) {
                i5 = 2;
                if (i7 >= 2 || i6 <= -1 || bArr[i6] != 61) {
                    break;
                }
                i6--;
                i7++;
            }
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        i5 = 1;
                    } else {
                        throw new Error("Impossible");
                    }
                }
            } else {
                i5 = 3;
            }
            int i8 = ((i4 / 4) * 3) - (3 - i5);
            byte[] bArr2 = new byte[i8];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i8 - (i5 % 3)) {
                d(bArr, i9, bArr2, i10);
                i9 += 4;
                i10 += 3;
            }
            if (i5 < 3) {
                c(i5, bArr, i9, bArr2, i10);
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Input is expected to be encoded in multiple of 4 bytes but found: " + i4);
    }

    void c(int i4, byte[] bArr, int i5, byte[] bArr2, int i6) {
        int i7 = i6 + 1;
        int h4 = h(bArr[i5]) << 2;
        int i8 = i5 + 2;
        int h5 = h(bArr[i5 + 1]);
        bArr2[i6] = (byte) (h4 | ((h5 >>> 4) & 3));
        if (i4 == 1) {
            CodecUtils.e(h5, 15);
            return;
        }
        int i9 = i6 + 2;
        int i10 = i5 + 3;
        int h6 = h(bArr[i8]);
        bArr2[i7] = (byte) (((h5 & 15) << 4) | (15 & (h6 >>> 2)));
        if (i4 == 2) {
            CodecUtils.e(h6, 3);
        } else {
            bArr2[i9] = (byte) (((h6 & 3) << 6) | h(bArr[i10]));
        }
    }

    void d(byte[] bArr, int i4, byte[] bArr2, int i5) {
        int h4 = h(bArr[i4]) << 2;
        int h5 = h(bArr[i4 + 1]);
        bArr2[i5] = (byte) (h4 | ((h5 >>> 4) & 3));
        int h6 = h(bArr[i4 + 2]);
        bArr2[i5 + 1] = (byte) (((h5 & 15) << 4) | ((h6 >>> 2) & 15));
        bArr2[i5 + 2] = (byte) (h(bArr[i4 + 3]) | ((h6 & 3) << 6));
    }

    void e(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24307a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 2) & 63];
        bArr2[i5 + 1] = bArr3[(b4 & 3) << 4];
        bArr2[i5 + 2] = 61;
        bArr2[i5 + 3] = 61;
    }

    void f(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24307a;
        int i6 = i4 + 1;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 2) & 63];
        byte b5 = bArr[i6];
        bArr2[i5 + 1] = bArr3[((b4 & 3) << 4) | ((b5 >>> 4) & 15)];
        bArr2[i5 + 2] = bArr3[(b5 & 15) << 2];
        bArr2[i5 + 3] = 61;
    }

    void g(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24307a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 2) & 63];
        byte b5 = bArr[i4 + 1];
        bArr2[i5 + 1] = bArr3[((b4 & 3) << 4) | ((b5 >>> 4) & 15)];
        byte b6 = bArr[i4 + 2];
        bArr2[i5 + 2] = bArr3[((b6 >>> 6) & 3) | ((b5 & 15) << 2)];
        bArr2[i5 + 3] = bArr3[b6 & 63];
    }

    protected int h(byte b4) {
        byte b5 = a.f24308a[b4];
        if (b5 > -1) {
            return b5;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b4) + "'");
    }

    protected f(byte[] bArr) {
        this.f24307a = bArr;
    }
}
