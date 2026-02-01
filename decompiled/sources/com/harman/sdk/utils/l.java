package com.harman.sdk.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f48736a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        if (str != null && str.length() != 0) {
            return b(str.getBytes());
        }
        return "";
    }

    private static String b(byte[] bArr) {
        return d(c(bArr, "SHA-256"));
    }

    static byte[] c(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    private static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            char[] cArr = f48736a;
            sb.append(cArr[(b4 & 240) >>> 4]);
            sb.append(cArr[b4 & 15]);
        }
        return sb.toString();
    }
}
