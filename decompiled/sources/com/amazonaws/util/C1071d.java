package com.amazonaws.util;

import com.harman.jbl.partybox.ui.effectlab.a;

/* renamed from: com.amazonaws.util.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1071d implements i {

    /* renamed from: b, reason: collision with root package name */
    private static final int f24282b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24283c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24284d = 87;

    /* renamed from: e, reason: collision with root package name */
    private static final int f24285e = 55;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24286f = 15;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24287a = CodecUtils.f("0123456789ABCDEF");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.amazonaws.util.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f24288a = b();

        private a() {
        }

        private static byte[] b() {
            byte[] bArr = new byte[a.b.f43494d];
            for (int i4 = 0; i4 <= 102; i4++) {
                if (i4 >= 48 && i4 <= 57) {
                    bArr[i4] = (byte) (i4 - 48);
                } else if (i4 >= 65 && i4 <= 70) {
                    bArr[i4] = (byte) (i4 - 55);
                } else if (i4 >= 97 && i4 <= 102) {
                    bArr[i4] = (byte) (i4 - 87);
                } else {
                    bArr[i4] = -1;
                }
            }
            return bArr;
        }
    }

    @Override // com.amazonaws.util.i
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            byte[] bArr3 = this.f24287a;
            bArr2[i4] = bArr3[(b4 >>> 4) & 15];
            i4 += 2;
            bArr2[i5] = bArr3[b4 & 15];
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.i
    public byte[] b(byte[] bArr, int i4) {
        if (i4 % 2 == 0) {
            int i5 = i4 / 2;
            byte[] bArr2 = new byte[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i6 + 1;
                int c4 = c(bArr[i6]) << 4;
                i6 += 2;
                bArr2[i7] = (byte) (c(bArr[i8]) | c4);
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i4);
    }

    protected int c(byte b4) {
        byte b5 = a.f24288a[b4];
        if (b5 > -1) {
            return b5;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b4) + "'");
    }
}
