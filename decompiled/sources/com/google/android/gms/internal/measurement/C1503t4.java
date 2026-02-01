package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1503t4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f29790a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f29791b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f29792c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f29793d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f29794e;

    /* renamed from: f, reason: collision with root package name */
    public static final P3 f29795f;

    static {
        byte[] bArr = new byte[0];
        f29793d = bArr;
        f29794e = ByteBuffer.wrap(bArr);
        int i4 = P3.f29418b;
        N3 n32 = new N3(bArr, 0, 0, false, null);
        try {
            n32.c(0);
            f29795f = n32;
        } catch (zzko e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int a(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d4 = d(length, bArr, 0, length);
        if (d4 == 0) {
            return 1;
        }
        return d4;
    }

    public static int c(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Object obj, Object obj2) {
        return ((P4) obj).e().z((P4) obj2).v();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f29791b);
    }

    public static boolean i(byte[] bArr) {
        return H5.e(bArr);
    }
}
