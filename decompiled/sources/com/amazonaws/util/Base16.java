package com.amazonaws.util;

/* loaded from: classes.dex */
public enum Base16 {
    ;

    private static final C1071d CODEC = new C1071d();

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        return CODEC.b(bArr, CodecUtils.b(str, bArr));
    }

    public static byte[] e(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return CODEC.b(bArr, bArr.length);
        }
        return bArr;
    }

    public static byte[] f(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return CODEC.a(bArr);
        }
        return bArr;
    }

    public static String g(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        return CodecUtils.g(CODEC.a(bArr));
    }
}
