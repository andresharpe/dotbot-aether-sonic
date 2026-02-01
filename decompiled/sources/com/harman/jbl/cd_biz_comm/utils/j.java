package com.harman.jbl.cd_biz_comm.utils;

import androidx.annotation.P;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37924a = "DigitUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f37925b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f37926c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f37927d = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f37928e = "0123456789ABCDEF".toCharArray();

    public static String a(byte b4) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f37927d;
        sb.append(strArr[(b4 & 240) >> 4]);
        sb.append(strArr[b4 & 15]);
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String[] strArr = f37927d;
            sb.append(strArr[(b4 & 240) >> 4]);
            sb.append(strArr[b4 & 15]);
        }
        return sb.toString();
    }

    public static String c(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Byte b4 : bArr) {
            byte byteValue = b4.byteValue();
            String[] strArr = f37927d;
            sb.append(strArr[(byteValue & 240) >> 4]);
            sb.append(strArr[byteValue & 15]);
        }
        return sb.toString();
    }

    public static String d(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    public static String e(byte[] bArr, int i4) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length < i4) {
            i4 = bArr.length;
        }
        char[] cArr = new char[i4 * 2];
        for (int i5 = 0; i5 < i4; i5++) {
            byte b4 = bArr[i5];
            int i6 = i5 * 2;
            char[] cArr2 = f37928e;
            cArr[i6] = cArr2[(b4 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public static byte[] f(char[] cArr) {
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
        throw new RuntimeException("Decode Hex Runtime Exception");
    }

    public static String g(byte[] bArr) {
        return h(bArr, true);
    }

    public static String h(byte[] bArr, boolean z3) {
        char[] cArr;
        if (z3) {
            cArr = f37925b;
        } else {
            cArr = f37926c;
        }
        return i(bArr, cArr);
    }

    protected static String i(byte[] bArr, char[] cArr) {
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
        return new String(cArr2);
    }

    public static String j(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            bArr2[i5] = bArr[i4].byteValue();
            i4++;
            i5++;
        }
        return h(bArr2, true);
    }

    @P
    public static String k(String str) {
        if (str != null && !str.equals("")) {
            String replace = str.replace(" ", "");
            int length = replace.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                try {
                    bArr[i4] = (byte) (Integer.parseInt(replace.substring(i5, i5 + 2), 16) & 255);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            try {
                return new String(bArr);
            } catch (Exception e5) {
                e5.printStackTrace();
                return replace;
            }
        }
        return null;
    }

    public static int l(String str, String str2) {
        int i4 = 0;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.replace(str2, "");
        if (replace.contains(com.harman.sdk.impl.scan.m.f48113d)) {
            replace = replace.replace(com.harman.sdk.impl.scan.m.f48113d, "");
        }
        StringBuilder sb = new StringBuilder();
        while (i4 < replace.length()) {
            int i5 = i4 + 2;
            sb.append(Integer.parseInt(replace.substring(i4, i5), 16));
            i4 = i5;
        }
        return Integer.parseInt(sb.toString());
    }

    protected static int m(char c4, int i4) {
        int digit = Character.digit(c4, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Runtime Exception todigit() char = " + c4 + " index =" + i4);
    }
}
