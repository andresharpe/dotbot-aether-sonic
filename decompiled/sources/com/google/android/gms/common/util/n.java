package com.google.android.gms.common.util;

import androidx.annotation.N;

@com.google.android.gms.common.internal.D
@I0.a
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f29019a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f29020b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @I0.a
    @N
    public static String a(@N byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = f29020b;
            cArr[i4] = cArr2[(b4 & 255) >>> 4];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    @I0.a
    @N
    public static String b(@N byte[] bArr) {
        return c(bArr, false);
    }

    @I0.a
    @N
    public static String c(@N byte[] bArr, boolean z3) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i4 = 0; i4 < length && (!z3 || i4 != length - 1 || (bArr[i4] & 255) != 0); i4++) {
            char[] cArr = f29019a;
            sb.append(cArr[(bArr[i4] & 240) >>> 4]);
            sb.append(cArr[bArr[i4] & 15]);
        }
        return sb.toString();
    }

    @I0.a
    @N
    public static byte[] d(@N String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 2;
                bArr[i4 / 2] = (byte) Integer.parseInt(str.substring(i4, i5), 16);
                i4 = i5;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
