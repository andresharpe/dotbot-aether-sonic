package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24309a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static final int f24310b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24311c = 6;

    public static byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.hasArray()) {
            return Arrays.copyOfRange(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.arrayOffset() + byteBuffer.limit());
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        asReadOnlyBuffer.rewind();
        byte[] bArr = new byte[asReadOnlyBuffer.remaining()];
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.b(str);
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[(str.length() + 1) / 2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            int i6 = i4 + 2;
            bArr[i5] = (byte) Integer.parseInt(str.substring(i4, i6), 16);
            i4 = i6;
            i5++;
        }
        return bArr;
    }

    public static String d(byte[] bArr) {
        return Base64.g(bArr);
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4);
            if (hexString.length() == 1) {
                sb.append(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb.append(hexString);
        }
        return w.n(sb.toString());
    }

    public static InputStream f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteArrayInputStream(bArr);
    }
}
