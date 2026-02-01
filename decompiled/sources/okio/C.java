package okio;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f55313a = Charset.forName("UTF-8");

    private C() {
    }

    public static boolean a(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j4, long j5, long j6) {
        if ((j5 | j6) >= 0 && j5 <= j4 && j4 - j5 >= j6) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)));
        }
    }

    public static int c(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static long d(long j4) {
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public static short e(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }

    public static void f(Throwable th) {
        g(th);
    }

    private static <T extends Throwable> void g(Throwable th) throws Throwable {
        throw th;
    }
}
