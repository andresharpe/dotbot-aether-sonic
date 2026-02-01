package com.amazonaws.util;

/* loaded from: classes.dex */
public enum CodecUtils {
    ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char c4 = charArray[i5];
            if (c4 != '\r' && c4 != '\n' && c4 != ' ') {
                if (c4 <= 127) {
                    bArr[i4] = (byte) c4;
                    i4++;
                } else {
                    throw new IllegalArgumentException("Invalid character found at position " + i5 + " for " + str);
                }
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(int i4, int i5) {
        if ((i4 & i5) == 0) {
        } else {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }

    public static byte[] f(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            char c4 = charArray[i4];
            if (c4 <= 127) {
                bArr[i4] = (byte) c4;
            } else {
                throw new IllegalArgumentException("Invalid character found at position " + i4 + " for " + str);
            }
        }
        return bArr;
    }

    public static String g(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            cArr[i5] = (char) bArr[i4];
            i4++;
            i5++;
        }
        return new String(cArr);
    }
}
