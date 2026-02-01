package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.N;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f36275a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f36276b = Byte.parseByte("00001111", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final int f36277c = 22;

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @N
    public String a() {
        byte[] c4 = c(UUID.randomUUID(), new byte[17]);
        byte b4 = c4[0];
        c4[16] = b4;
        c4[0] = (byte) ((b4 & f36276b) | f36275a);
        return b(c4);
    }
}
