package okio;

import java.io.UnsupportedEncodingException;

/* renamed from: okio.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2384b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f55325a = {65, 66, 67, com.harman.sdk.utils.k.f48645b0, 69, 70, com.harman.sdk.utils.k.f48653d0, 72, 73, com.harman.sdk.utils.k.f48657e0, com.harman.sdk.utils.k.f48661f0, com.harman.sdk.utils.k.f48665g0, com.harman.sdk.utils.k.f48677j0, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, com.harman.sdk.utils.k.f48614R0, com.harman.sdk.utils.k.f48725w0, 90, 97, 98, 99, com.harman.sdk.utils.k.f48584H0, com.harman.sdk.utils.k.f48587I0, com.harman.sdk.utils.k.f48590J0, com.harman.sdk.utils.k.f48593K0, com.harman.sdk.utils.k.f48596L0, com.harman.sdk.utils.k.f48599M0, com.harman.sdk.utils.k.f48702p1, com.harman.sdk.utils.k.f48706q1, 108, 109, 110, 111, com.harman.sdk.utils.k.f48602N0, 113, 114, 115, com.harman.sdk.utils.k.f48720u1, 117, com.harman.sdk.utils.k.f48662f1, com.harman.sdk.utils.k.f48666g1, com.harman.sdk.utils.k.f48670h1, 121, 122, 48, 49, 50, 51, com.harman.sdk.utils.k.f48684l, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f55326b = {65, 66, 67, com.harman.sdk.utils.k.f48645b0, 69, 70, com.harman.sdk.utils.k.f48653d0, 72, 73, com.harman.sdk.utils.k.f48657e0, com.harman.sdk.utils.k.f48661f0, com.harman.sdk.utils.k.f48665g0, com.harman.sdk.utils.k.f48677j0, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, com.harman.sdk.utils.k.f48614R0, com.harman.sdk.utils.k.f48725w0, 90, 97, 98, 99, com.harman.sdk.utils.k.f48584H0, com.harman.sdk.utils.k.f48587I0, com.harman.sdk.utils.k.f48590J0, com.harman.sdk.utils.k.f48593K0, com.harman.sdk.utils.k.f48596L0, com.harman.sdk.utils.k.f48599M0, com.harman.sdk.utils.k.f48702p1, com.harman.sdk.utils.k.f48706q1, 108, 109, 110, 111, com.harman.sdk.utils.k.f48602N0, 113, 114, 115, com.harman.sdk.utils.k.f48720u1, 117, com.harman.sdk.utils.k.f48662f1, com.harman.sdk.utils.k.f48666g1, com.harman.sdk.utils.k.f48670h1, 121, 122, 48, 49, 50, 51, com.harman.sdk.utils.k.f48684l, 53, 54, 55, 56, 57, 45, 95};

    private C2384b() {
    }

    public static byte[] a(String str) {
        int i4;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt2 = str.charAt(i9);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i4 = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i4 = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i4 = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i4 = 63;
                }
            } else {
                i4 = 62;
            }
            i7 = (i7 << 6) | ((byte) i4);
            i6++;
            if (i6 % 4 == 0) {
                bArr[i8] = (byte) (i7 >> 16);
                int i10 = i8 + 2;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                i8 += 3;
                bArr[i10] = (byte) i7;
            }
        }
        int i11 = i6 % 4;
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            bArr[i8] = (byte) ((i7 << 12) >> 16);
            i8++;
        } else if (i11 == 3) {
            int i12 = i7 << 6;
            int i13 = i8 + 1;
            bArr[i8] = (byte) (i12 >> 16);
            i8 += 2;
            bArr[i13] = (byte) (i12 >> 8);
        }
        if (i8 == i5) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }

    public static String b(byte[] bArr) {
        return c(bArr, f55325a);
    }

    private static String c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            bArr3[i4] = bArr2[(bArr[i5] & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i4 + 1] = bArr2[((bArr[i5] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i4 + 3;
            int i8 = (bArr[i6] & 15) << 2;
            int i9 = i5 + 2;
            bArr3[i4 + 2] = bArr2[i8 | ((bArr[i9] & 255) >> 6)];
            i4 += 4;
            bArr3[i7] = bArr2[bArr[i9] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 != 1) {
            if (length2 == 2) {
                bArr3[i4] = bArr2[(bArr[length] & 255) >> 2];
                int i10 = (bArr[length] & 3) << 4;
                int i11 = length + 1;
                bArr3[i4 + 1] = bArr2[((bArr[i11] & 255) >> 4) | i10];
                bArr3[i4 + 2] = bArr2[(bArr[i11] & 15) << 2];
                bArr3[i4 + 3] = kotlin.io.encoding.a.f52114h;
            }
        } else {
            bArr3[i4] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i4 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i4 + 2] = kotlin.io.encoding.a.f52114h;
            bArr3[i4 + 3] = kotlin.io.encoding.a.f52114h;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public static String d(byte[] bArr) {
        return c(bArr, f55326b);
    }
}
