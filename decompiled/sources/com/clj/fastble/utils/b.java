package com.clj.fastble.utils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f27138a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f27139b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte a(char c4) {
        return (byte) "0123456789ABCDEF".indexOf(c4);
    }

    public static byte[] b(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length >> 1];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 1;
                int m4 = (m(cArr[i4], i4) << 4) | m(cArr[i6], i6);
                i4 += 2;
                bArr[i5] = (byte) (m4 & 255);
                i5++;
            }
            return bArr;
        }
        throw new RuntimeException("Odd number of characters.");
    }

    public static char[] c(byte[] bArr) {
        return d(bArr, true);
    }

    public static char[] d(byte[] bArr, boolean z3) {
        char[] cArr;
        if (z3) {
            cArr = f27138a;
        } else {
            cArr = f27139b;
        }
        return e(bArr, cArr);
    }

    protected static char[] e(byte[] bArr, char[] cArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr2 = new char[bArr.length << 1];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b4 & 240) >>> 4];
            i4 += 2;
            cArr2[i5] = cArr[b4 & 15];
        }
        return cArr2;
    }

    public static String f(byte[] bArr) {
        return g(bArr, true);
    }

    public static String g(byte[] bArr, boolean z3) {
        char[] cArr;
        if (z3) {
            cArr = f27138a;
        } else {
            cArr = f27139b;
        }
        return h(bArr, cArr);
    }

    protected static String h(byte[] bArr, char[] cArr) {
        return new String(e(bArr, cArr));
    }

    public static String i(byte[] bArr, int i4) {
        return j(new byte[]{bArr[i4]});
    }

    public static String j(byte[] bArr) {
        return k(bArr, false);
    }

    public static String k(byte[] bArr, boolean z3) {
        if (bArr != null && bArr.length >= 1) {
            StringBuilder sb = new StringBuilder();
            for (byte b4 : bArr) {
                String hexString = Integer.toHexString(b4 & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
                if (z3) {
                    sb.append(" ");
                }
            }
            return sb.toString().trim();
        }
        return null;
    }

    public static byte[] l(String str) {
        if (str != null && !str.equals("")) {
            String upperCase = str.trim().toUpperCase();
            int length = upperCase.length() / 2;
            char[] charArray = upperCase.toCharArray();
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                bArr[i4] = (byte) (a(charArray[i5 + 1]) | (a(charArray[i5]) << 4));
            }
            return bArr;
        }
        return null;
    }

    protected static int m(char c4, int i4) {
        int digit = Character.digit(c4, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c4 + " at index " + i4);
    }
}
