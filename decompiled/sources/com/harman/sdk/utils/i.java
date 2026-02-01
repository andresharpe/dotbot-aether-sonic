package com.harman.sdk.utils;

import java.io.FileInputStream;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f48560a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        byte[] bArr = new byte[1024];
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return b(messageDigest.digest());
                }
            }
        } catch (Exception e4) {
            com.harman.log.f.b("error: ", e4.getLocalizedMessage());
            return null;
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            char[] cArr = f48560a;
            sb.append(cArr[(b4 & 240) >>> 4]);
            sb.append(cArr[b4 & 15]);
        }
        return sb.toString();
    }
}
