package com.amazonaws.util;

/* renamed from: com.amazonaws.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1069b implements i {

    /* renamed from: b, reason: collision with root package name */
    private static final int f24271b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24272c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24273d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final int f24274e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24275f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f24276g = 7;

    /* renamed from: h, reason: collision with root package name */
    private static final int f24277h = 15;

    /* renamed from: i, reason: collision with root package name */
    private static final int f24278i = 31;

    /* renamed from: j, reason: collision with root package name */
    private static final byte f24279j = 61;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24280a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1069b(byte[] bArr) {
        this.f24280a = bArr;
    }

    private final void c(int i4, byte[] bArr, int i5, byte[] bArr2, int i6) {
        int i7 = i6 + 1;
        int j4 = j(bArr[i5]) << 3;
        int i8 = i5 + 2;
        int j5 = j(bArr[i5 + 1]);
        bArr2[i6] = (byte) (j4 | ((j5 >>> 2) & 7));
        if (i4 == 1) {
            CodecUtils.e(j5, 3);
            return;
        }
        int i9 = i6 + 2;
        int j6 = ((j5 & 3) << 6) | (j(bArr[i8]) << 1);
        int i10 = i5 + 4;
        int j7 = j(bArr[i5 + 3]);
        bArr2[i7] = (byte) (j6 | ((j7 >>> 4) & 1));
        if (i4 == 2) {
            CodecUtils.e(j7, 15);
            return;
        }
        int i11 = i6 + 3;
        int i12 = i5 + 5;
        int j8 = j(bArr[i10]);
        bArr2[i9] = (byte) ((15 & (j8 >>> 1)) | ((j7 & 15) << 4));
        if (i4 == 3) {
            CodecUtils.e(j8, 1);
            return;
        }
        int j9 = ((j8 & 1) << 7) | (j(bArr[i12]) << 2);
        int j10 = j(bArr[i5 + 6]);
        bArr2[i11] = (byte) (j9 | ((j10 >>> 3) & 3));
        CodecUtils.e(j10, 7);
    }

    private final void d(byte[] bArr, int i4, byte[] bArr2, int i5) {
        int j4 = j(bArr[i4]) << 3;
        int j5 = j(bArr[i4 + 1]);
        bArr2[i5] = (byte) (j4 | ((j5 >>> 2) & 7));
        int j6 = ((j5 & 3) << 6) | (j(bArr[i4 + 2]) << 1);
        int j7 = j(bArr[i4 + 3]);
        bArr2[i5 + 1] = (byte) (j6 | ((j7 >>> 4) & 1));
        int j8 = j(bArr[i4 + 4]);
        bArr2[i5 + 2] = (byte) (((j7 & 15) << 4) | ((j8 >>> 1) & 15));
        int j9 = ((j8 & 1) << 7) | (j(bArr[i4 + 5]) << 2);
        int j10 = j(bArr[i4 + 6]);
        bArr2[i5 + 3] = (byte) (j9 | ((j10 >>> 3) & 3));
        bArr2[i5 + 4] = (byte) (j(bArr[i4 + 7]) | ((j10 & 7) << 5));
    }

    private final void e(byte[] bArr, int i4, byte[] bArr2, int i5) {
        int i6 = i5 + 1;
        byte[] bArr3 = this.f24280a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 3) & 31];
        int i7 = i5 + 2;
        bArr2[i6] = bArr3[(b4 & 7) << 2];
        int i8 = 0;
        while (i8 < 6) {
            bArr2[i7] = 61;
            i8++;
            i7++;
        }
    }

    private final void f(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24280a;
        int i6 = i4 + 1;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 3) & 31];
        byte b5 = bArr[i6];
        bArr2[i5 + 1] = bArr3[((b4 & 7) << 2) | ((b5 >>> 6) & 3)];
        int i7 = i5 + 3;
        bArr2[i5 + 2] = bArr3[(b5 >>> 1) & 31];
        int i8 = i5 + 4;
        bArr2[i7] = bArr3[(b5 & 1) << 4];
        int i9 = 0;
        while (i9 < 4) {
            bArr2[i8] = 61;
            i9++;
            i8++;
        }
    }

    private final void g(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24280a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 3) & 31];
        byte b5 = bArr[i4 + 1];
        bArr2[i5 + 1] = bArr3[((b4 & 7) << 2) | ((b5 >>> 6) & 3)];
        bArr2[i5 + 2] = bArr3[(b5 >>> 1) & 31];
        int i6 = i5 + 4;
        byte b6 = bArr[i4 + 2];
        bArr2[i5 + 3] = bArr3[((b6 >>> 4) & 15) | ((b5 & 1) << 4)];
        int i7 = i5 + 5;
        bArr2[i6] = bArr3[(b6 & 15) << 1];
        int i8 = 0;
        while (i8 < 3) {
            bArr2[i7] = 61;
            i8++;
            i7++;
        }
    }

    private final void h(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24280a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 3) & 31];
        byte b5 = bArr[i4 + 1];
        bArr2[i5 + 1] = bArr3[((b4 & 7) << 2) | ((b5 >>> 6) & 3)];
        bArr2[i5 + 2] = bArr3[(b5 >>> 1) & 31];
        byte b6 = bArr[i4 + 2];
        bArr2[i5 + 3] = bArr3[((b5 & 1) << 4) | ((b6 >>> 4) & 15)];
        byte b7 = bArr[i4 + 3];
        bArr2[i5 + 4] = bArr3[((b7 >>> 7) & 1) | ((b6 & 15) << 1)];
        bArr2[i5 + 5] = bArr3[(b7 >>> 2) & 31];
        bArr2[i5 + 6] = bArr3[(b7 & 3) << 3];
        bArr2[i5 + 7] = 61;
    }

    private final void i(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.f24280a;
        byte b4 = bArr[i4];
        bArr2[i5] = bArr3[(b4 >>> 3) & 31];
        byte b5 = bArr[i4 + 1];
        bArr2[i5 + 1] = bArr3[((b4 & 7) << 2) | ((b5 >>> 6) & 3)];
        bArr2[i5 + 2] = bArr3[(b5 >>> 1) & 31];
        byte b6 = bArr[i4 + 2];
        bArr2[i5 + 3] = bArr3[((b5 & 1) << 4) | ((b6 >>> 4) & 15)];
        byte b7 = bArr[i4 + 3];
        bArr2[i5 + 4] = bArr3[((b6 & 15) << 1) | ((b7 >>> 7) & 1)];
        bArr2[i5 + 5] = bArr3[(b7 >>> 2) & 31];
        byte b8 = bArr[i4 + 4];
        bArr2[i5 + 6] = bArr3[((b8 >>> 5) & 7) | ((b7 & 3) << 3)];
        bArr2[i5 + 7] = bArr3[b8 & com.harman.sdk.utils.k.f48669h0];
    }

    @Override // com.amazonaws.util.i
    public final byte[] a(byte[] bArr) {
        int length = bArr.length / 5;
        int length2 = bArr.length % 5;
        int i4 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 8];
            int i5 = 0;
            while (i4 < bArr.length) {
                i(bArr, i4, bArr2, i5);
                i4 += 5;
                i5 += 8;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 8];
        int i6 = 0;
        while (i4 < bArr.length - length2) {
            i(bArr, i4, bArr3, i6);
            i4 += 5;
            i6 += 8;
        }
        if (length2 != 1) {
            if (length2 != 2) {
                if (length2 != 3) {
                    if (length2 == 4) {
                        h(bArr, i4, bArr3, i6);
                    }
                } else {
                    g(bArr, i4, bArr3, i6);
                }
            } else {
                f(bArr, i4, bArr3, i6);
            }
        } else {
            e(bArr, i4, bArr3, i6);
        }
        return bArr3;
    }

    @Override // com.amazonaws.util.i
    public final byte[] b(byte[] bArr, int i4) {
        int i5;
        if (i4 % 8 == 0) {
            int i6 = i4 - 1;
            int i7 = 0;
            while (i7 < 6 && i6 > -1 && bArr[i6] == 61) {
                i6--;
                i7++;
            }
            if (i7 != 0) {
                int i8 = 4;
                if (i7 != 1) {
                    i5 = 3;
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 == 6) {
                                i5 = 1;
                            } else {
                                throw new IllegalArgumentException("Invalid number of paddings " + i7);
                            }
                        } else {
                            i8 = 2;
                        }
                    }
                }
                i5 = i8;
            } else {
                i5 = 5;
            }
            int i9 = ((i4 / 8) * 5) - (5 - i5);
            byte[] bArr2 = new byte[i9];
            int i10 = 0;
            int i11 = 0;
            while (i11 < i9 - (i5 % 5)) {
                d(bArr, i10, bArr2, i11);
                i10 += 8;
                i11 += 5;
            }
            if (i5 < 5) {
                c(i5, bArr, i10, bArr2, i11);
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Input is expected to be encoded in multiple of 8 bytes but found: " + i4);
    }

    protected abstract int j(byte b4);
}
